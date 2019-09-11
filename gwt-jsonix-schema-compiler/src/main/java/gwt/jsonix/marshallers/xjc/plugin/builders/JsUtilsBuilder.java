/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gwt.jsonix.marshallers.xjc.plugin.builders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.xml.namespace.QName;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JCommentPart;
import com.sun.codemodel.JConditional;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JForEach;
import com.sun.codemodel.JForLoop;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JVar;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;
import org.hisrc.jsonix.settings.LogLevelSetting;

import static gwt.jsonix.marshallers.xjc.plugin.builders.BuilderUtils.log;

public class JsUtilsBuilder {

    private static final String GENERIC_TYPE_NAME = "D";
    private static final String ELEMENT = "element";
    private static final int PUBLIC_STATIC_MODS = JMod.PUBLIC + JMod.STATIC;
    private static final int PUBLIC_STATIC_NATIVE_MODS = PUBLIC_STATIC_MODS + JMod.NATIVE;
    private static final int PRIVATE_STATIC_MODS = JMod.PRIVATE + JMod.STATIC;

    private static final String GET_UNWRAPPED_ELEMENTS_ARRAY_METHOD = "\r\n    public static native <D> JsArrayLike<D> getUnwrappedElementsArray(final JsArrayLike<D> original) /*-{\n" +
            "        var toReturn = [];\n" +
            "        if(original != null) {\n" +
            "            toReturn = original.map(function (arrayItem) {\n" +
            "                var retrieved = arrayItem.value\n" +
            "                var toSet = retrieved == null ? arrayItem : retrieved\n" +
            "                console.log(toSet);\n" +
            "                return toSet;\n" +
            "            });\n" +
            "        }\n" +
            "        return toReturn;\n" +
            "    }-*/;\n";

    private static final String GET_UNWRAPPED_ELEMENT_METHOD = "\r\n    public static native Object getUnwrappedElement(final Object original) /*-{\n" +
            "        var toReturn = original.value;\n" +
            "        var toSet = toReturn == null ? original : toReturn;\n" +
            "        console.log(toSet);\n" +
            "        return toSet;\n" +
            "    }-*/;\n";

    private static final String TO_ATTRIBUTES_MAP_METHOD = "\r\n    private static native void toAttributesMap(final Map<QName, String> toReturn,\n" +
            "                                               final Object original) /*-{\n" +
            "        var keys = Object.keys(original);\n" +
            "        for (var i = 0; i < keys.length; i++) {\n" +
            "            var key = keys[i];\n" +
            "            var value = original[key];\n" +
            "            @%1$s.JsUtils::putToAttributesMap(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)(toReturn, key, value);\n" +
            "        }\n" +
            "    }-*/;\n";

    private static final String NEW_INSTANCE_TEMPLATE = "\r\n    public static native <D> D newInstance(final Class<D> klass) /*-{\n" +
            "        return {\"TYPE_NAME\": klass.TYPE}\n" +
            "    }-*/;\n";

    private static final String GET_TYPE_NAME = "\r\n    public static native String getTypeName(final Object instance) /*-{\n" +
            "        return instance.TYPE_NAME\n" +
            "    }-*/;\n";

    private JsUtilsBuilder() {
    }

    public static JDefinedClass generateJsUtilsClass(JCodeModel jCodeModel, String jsMainPackage) throws JClassAlreadyExistsException {
        final JDefinedClass toReturn = getJsUtilsClass(jCodeModel, jsMainPackage);
        populateJsUtilClass(jCodeModel, toReturn, jsMainPackage);
        return toReturn;
    }

    protected static void populateJsUtilClass(JCodeModel jCodeModel, JDefinedClass toPopulate, String jsMainPackage) {
        addEmptyConstructor(toPopulate);
        JMethod addMethod = addAddMethod(jCodeModel, toPopulate);
        addAddAllMethod(jCodeModel, toPopulate, addMethod);
        addRemoveMethod(jCodeModel, toPopulate);
        addToListMethod(jCodeModel, toPopulate);
        addGetUnwrappedElementsArrayMethod(toPopulate);
        addGetUnwrappedElementMethod(toPopulate);
        addJavaToAttributesMapMethod(jCodeModel, toPopulate);
        addNativeToAttributesMapMethod(toPopulate, jsMainPackage);
        addPutToAttributesMap(jCodeModel, toPopulate);
        addNewInstance(toPopulate);
        addGetTypeName(toPopulate);
    }

    protected static void addNewInstance(final JDefinedClass jDefinedClass) {
        jDefinedClass.direct(NEW_INSTANCE_TEMPLATE);
    }

    protected static void addGetTypeName(final JDefinedClass jDefinedClass) {
        jDefinedClass.direct(GET_TYPE_NAME);
    }

    protected static JDefinedClass getJsUtilsClass(JCodeModel jCodeModel, String jsMainPackage) throws JClassAlreadyExistsException {
        log(LogLevelSetting.DEBUG, "Creating  JsUtils class");
        if (!jsMainPackage.isEmpty() && !jsMainPackage.endsWith(".")) {
            jsMainPackage += ".";
        }
        final JDefinedClass toReturn = jCodeModel._class(jsMainPackage + "JsUtils");
        JDocComment comment = toReturn.javadoc();
        comment.append("Utility class to provide generic methods used by all specific JSInterop classes");
        return toReturn;
    }

    protected static void addEmptyConstructor(JDefinedClass jsUtils) {
        log(LogLevelSetting.DEBUG, "Add empty constructor...");
        jsUtils.constructor(JMod.PRIVATE).body().directStatement(" //Private constructor to prevent instantiation");
    }

    protected static JMethod addAddMethod(JCodeModel jCodeModel, JDefinedClass jsUtils) {
        log(LogLevelSetting.DEBUG, "Add 'add' method...");
        JClass genericT = getGenericT(jCodeModel);
        final JMethod toReturn = getGenerifiedJMethod(jsUtils, Void.TYPE, "add");
        final JVar jsArrayLikeParameter = getJSArrayNarrowedJVar(jCodeModel, toReturn);
        final JVar elementParam = toReturn.param(JMod.FINAL, genericT, ELEMENT);
        final JBlock block = toReturn.body();
        final JVar length = block.decl(jCodeModel.INT, "length");
        length.init(JExpr.invoke(jsArrayLikeParameter, "getLength"));
        block.add(jsArrayLikeParameter.invoke("setLength").arg(length.plus(JExpr.lit(1))));
        block.add(jsArrayLikeParameter.invoke("setAt").arg(length).arg(elementParam));
        return toReturn;
    }

    protected static JMethod addAddAllMethod(JCodeModel jCodeModel, JDefinedClass jsUtils, JMethod addMethod) {
        log(LogLevelSetting.DEBUG, "Add 'addAll' method...");
        JClass genericT = getGenericT(jCodeModel);
        final JMethod toReturn = getGenerifiedJMethod(jsUtils, Void.TYPE, "addAll");
        final JVar jsArrayLikeParameter = getJSArrayNarrowedJVar(jCodeModel, toReturn);
        final JVar elementParam = toReturn.varParam(genericT, "elements");
        elementParam.mods().setFinal(true);
        final JBlock block = toReturn.body();
        final JInvocation addInvocation = jsUtils.staticInvoke(addMethod).arg(jsArrayLikeParameter).arg(JExpr.ref(ELEMENT));
        final JForEach forEachElement = block.forEach(genericT, ELEMENT, elementParam);
        forEachElement.body().add(addInvocation);
        return toReturn;
    }

    protected static JMethod addRemoveMethod(JCodeModel jCodeModel, JDefinedClass jsUtils) {
        log(LogLevelSetting.DEBUG, "Add 'remove' method...");
        final JMethod toReturn = getGenerifiedJMethod(jsUtils, Void.TYPE, "remove");
        final JVar jsArrayLikeParameter = getJSArrayNarrowedJVar(jCodeModel, toReturn);
        final JVar indexParam = toReturn.param(JMod.FINAL, jCodeModel.INT, "index");
        final JBlock block = toReturn.body();
        final JVar targetIndex = block.decl(jCodeModel.INT, "targetIndex", JExpr.lit(0));
        final JForLoop jForLoop = block._for();
        final JVar sourceIndex = jForLoop.init(jCodeModel.INT, "sourceIndex", JExpr.lit(0));
        jForLoop.test(sourceIndex.lt(jsArrayLikeParameter.invoke("getLength")));
        jForLoop.update(sourceIndex.incr());
        final JConditional jConditional = jForLoop.body()._if(sourceIndex.ne(indexParam));
        jConditional._then()
                .add(jsArrayLikeParameter.invoke("setAt")
                             .arg(targetIndex.incr())
                             .arg(jsArrayLikeParameter.invoke("getAt").arg(sourceIndex)));
        block.add(jsArrayLikeParameter.invoke("setLength").arg(targetIndex));
        return toReturn;
    }

    protected static JMethod addToListMethod(JCodeModel jCodeModel, JDefinedClass jsUtils) {
        log(LogLevelSetting.DEBUG, "Add 'toList' method...");
        JClass rawListClass = jCodeModel.ref(List.class);
        final JClass genericT = getGenericT(jCodeModel);
        JClass narrowedList = rawListClass.narrow(genericT);
        JClass rawArrayListClass = jCodeModel.ref(ArrayList.class);
        JClass arrayListField = rawArrayListClass.narrow(genericT);

        final JMethod toReturn = getGenerifiedJMethod(jsUtils, narrowedList, "toList");
        final JVar jsArrayLikeParameter = getJSArrayNarrowedJVar(jCodeModel, toReturn);
        final JBlock block = toReturn.body();
        final JVar listToReturn = block.decl(JMod.FINAL, narrowedList, "toReturn", JExpr._new(arrayListField));
        final JConditional nonNull = block._if(jCodeModel.ref(Objects.class).staticInvoke("nonNull").arg(jsArrayLikeParameter));
        final JForLoop jForLoop = nonNull._then()._for();
        final JVar i = jForLoop.init(jCodeModel.INT, "i", JExpr.lit(0));
        jForLoop.test(i.lt(jsArrayLikeParameter.invoke("getLength")));
        jForLoop.update(i.incr());
        final JBlock forLoopBody = jForLoop.body();
        final JVar toAdd = forLoopBody.decl(JMod.FINAL, genericT, "toAdd", jCodeModel.ref(Js.class).staticInvoke("uncheckedCast").arg(jsArrayLikeParameter.invoke("getAt").arg(i)));
        forLoopBody.add(listToReturn.invoke("add").arg(toAdd));
        block._return(listToReturn);
        return toReturn;
    }

    protected static void addGetUnwrappedElementsArrayMethod(JDefinedClass jsUtils) {
        log(LogLevelSetting.DEBUG, "Add 'getUnwrappedElementsArray' method...");
        jsUtils.direct(GET_UNWRAPPED_ELEMENTS_ARRAY_METHOD);
    }

    protected static void addGetUnwrappedElementMethod(JDefinedClass jsUtils) {
        log(LogLevelSetting.DEBUG, "Add 'getUnwrappedElement' method...");
        jsUtils.direct(GET_UNWRAPPED_ELEMENT_METHOD);
    }

    /**
     * @param jCodeModel
     * @param jsUtils
     * @return
     */
    protected static JMethod addJavaToAttributesMapMethod(JCodeModel jCodeModel, JDefinedClass jsUtils) {
        log(LogLevelSetting.DEBUG, "Add java 'toAttributesMap' method...");
        final JClass qName = jCodeModel.ref(QName.class);
        JClass narrowedMap = getQNameStringNarrowedMapClass(jCodeModel);
        JClass rawHashMapClass = jCodeModel.ref(HashMap.class);
        JClass hashMapField = rawHashMapClass.narrow(qName, jCodeModel.ref(String.class));
        final JMethod toReturn = getJMethod(jsUtils, narrowedMap, "toAttributesMap");
        final JVar originalParameter = toReturn.param(JMod.FINAL, jCodeModel.ref(Object.class), "original");
        final JBlock block = toReturn.body();
        final JVar mapToReturn = block.decl(JMod.FINAL, narrowedMap, "toReturn", JExpr._new(hashMapField));
        block.invoke("toAttributesMap").arg(mapToReturn).arg(originalParameter);
        block._return(mapToReturn);
        final JDocComment javadoc = toReturn.javadoc();
        String commentString = "Extracts the <b>otherAttributes</b> property from a JavaScriptObject to a <i>regular</i> Java Map.";
        javadoc.append(commentString);
        JCommentPart setterPart = javadoc.addParam("original");
        commentString = " <b>js object</b> to transform.";
        setterPart.add(commentString);
        JCommentPart returnPart = javadoc.addReturn();
        commentString = "the populated <code>Map&lt;QName, String&gt;</code>";
        returnPart.add(commentString);
        return toReturn;
    }

    protected static JMethod addPutToAttributesMap(JCodeModel jCodeModel, JDefinedClass jsUtils) {
        log(LogLevelSetting.DEBUG, "Add 'putToAttributesMap' method...");
        final JClass qName = jCodeModel.ref(QName.class);
        JClass narrowedMap = getQNameStringNarrowedMapClass(jCodeModel);
        final JMethod toReturn = jsUtils.method(PRIVATE_STATIC_MODS, Void.TYPE, "putToAttributesMap");
        final JVar mapParameter = toReturn.param(JMod.FINAL, narrowedMap, "destination");
        final JVar qNameAsStringParameter = toReturn.param(JMod.FINAL, jCodeModel.ref(String.class), "qNameAsString");
        final JVar valueParameter = toReturn.param(JMod.FINAL, jCodeModel.ref(String.class), "value");
        final JBlock block = toReturn.body();
        block.add(mapParameter.invoke("put").arg(qName.staticInvoke("valueOf").arg(qNameAsStringParameter)).arg(valueParameter));
        final JDocComment javadoc = toReturn.javadoc();
        String commentString = "Create a <code>QName</code> instance from the given <b>qNameAsString</b>, and the use it as key for a new entry on <b>destination</b> Map.";
        javadoc.append(commentString);
        JCommentPart setterPart = javadoc.addParam("destination");
        commentString = " the <code>Map</code> to populate.";
        setterPart.add(commentString);
        setterPart = javadoc.addParam("qNameAsString");
        commentString = " the <code>String</code> to transform to <code>QName</code> instance used as key.";
        setterPart.add(commentString);
        setterPart = javadoc.addParam("value");
        commentString = " the <b>value</b> to be used in the new entry.";
        setterPart.add(commentString);
        return toReturn;
    }

    protected static void addNativeToAttributesMapMethod(JDefinedClass jsUtils, String jsMainPackage) {
        log(LogLevelSetting.DEBUG, "Add native 'toAttributesMap' method...");
        jsUtils.direct(String.format(TO_ATTRIBUTES_MAP_METHOD, jsMainPackage));
    }

    private static JMethod getGenerifiedJMethod(JDefinedClass jsUtils, Class<?> returnType, String methodName) {
        JMethod toReturn = getJMethod(jsUtils, returnType, methodName);
        toReturn.generify(GENERIC_TYPE_NAME);
        return toReturn;
    }

    private static JMethod getGenerifiedJMethod(JDefinedClass jsUtils, JClass returnType, String methodName) {
        JMethod toReturn = getJMethod(jsUtils, returnType, methodName);
        toReturn.generify(GENERIC_TYPE_NAME);
        return toReturn;
    }

    private static JMethod getGenerifiedNativeJMethod(JDefinedClass jsUtils, Class<?> returnType, String methodName) {
        JMethod toReturn = getNativeJMethod(jsUtils, returnType, methodName);
        toReturn.generify(GENERIC_TYPE_NAME);
        return toReturn;
    }

    private static JMethod getGenerifiedNativeJMethod(JDefinedClass jsUtils, JClass returnType, String methodName) {
        JMethod toReturn = getNativeJMethod(jsUtils, returnType, methodName);
        toReturn.generify(GENERIC_TYPE_NAME);
        return toReturn;
    }

    private static JMethod getJMethod(JDefinedClass jsUtils, Class<?> returnType, String methodName) {
        return jsUtils.method(PUBLIC_STATIC_MODS, returnType, methodName);
    }

    private static JMethod getJMethod(JDefinedClass jsUtils, JClass returnType, String methodName) {
        return jsUtils.method(PUBLIC_STATIC_MODS, returnType, methodName);
    }

    private static JMethod getNativeJMethod(JDefinedClass jsUtils, Class<?> returnType, String methodName) {
        return jsUtils.method(PUBLIC_STATIC_NATIVE_MODS, returnType, methodName);
    }

    private static JMethod getNativeJMethod(JDefinedClass jsUtils, JClass returnType, String methodName) {
        return jsUtils.method(PUBLIC_STATIC_NATIVE_MODS, returnType, methodName);
    }

    private static JVar getJSArrayNarrowedJVar(JCodeModel jCodeModel, JMethod jmethod) {
        return jmethod.param(JMod.FINAL, getJsArrayNarrowedClass(jCodeModel), "jsArrayLike");
    }

    private static JClass getGenericT(JCodeModel jCodeModel) {
        return jCodeModel.ref(GENERIC_TYPE_NAME);
    }

    private static JClass getJsArrayNarrowedClass(JCodeModel jCodeModel) {
        JClass jsArrayLikeClass = jCodeModel.ref(JsArrayLike.class);
        return jsArrayLikeClass.narrow(getGenericT(jCodeModel));
    }

    private static JClass getQNameStringNarrowedMapClass(JCodeModel jCodeModel) {
        JClass rawMapClass = jCodeModel.ref(Map.class);
        final JClass qName = jCodeModel.ref(QName.class);
        return rawMapClass.narrow(qName, jCodeModel.ref(String.class));
    }
}
