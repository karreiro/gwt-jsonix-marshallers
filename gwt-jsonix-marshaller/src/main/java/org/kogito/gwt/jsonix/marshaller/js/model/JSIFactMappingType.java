
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>FactMappingType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "FactMappingType", isNative = true)
public class JSIFactMappingType {

    @JsOverlay
    public final static String TYPE = "SCESIM.FactMappingType";

    @JsOverlay
    public static JSIFactMappingType newJSIFactMappingTypeInstance(final Class<JSIFactMappingType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIFactMappingType(final Object instance) {
        return "SCESIM.FactMappingType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "FactMappingType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>expressionElements</b>
     * 
     * @return
     *      <b>expressionElements</<b>
     */
    @JsProperty(name = "expressionElements", namespace = "FactMappingType")
    public final native JSIExpressionElementsType getExpressionElements();

    /**
     * Setter for <b>expressionElements</b>
     * 
     * @param expressionElementsParam
     *      <b>expressionElements</b> to set.
     */
    @JsProperty(name = "expressionElements", namespace = "FactMappingType")
    public final native void setExpressionElements(JSIExpressionElementsType expressionElementsParam);

    /**
     * Getter for <b>expressionIdentifier</b>
     * 
     * @return
     *      <b>expressionIdentifier</<b>
     */
    @JsProperty(name = "expressionIdentifier", namespace = "FactMappingType")
    public final native JSIExpressionIdentifierType getExpressionIdentifier();

    /**
     * Setter for <b>expressionIdentifier</b>
     * 
     * @param expressionIdentifierParam
     *      <b>expressionIdentifier</b> to set.
     */
    @JsProperty(name = "expressionIdentifier", namespace = "FactMappingType")
    public final native void setExpressionIdentifier(JSIExpressionIdentifierType expressionIdentifierParam);

    /**
     * Getter for <b>factIdentifier</b>
     * 
     * @return
     *      <b>factIdentifier</<b>
     */
    @JsProperty(name = "factIdentifier", namespace = "FactMappingType")
    public final native JSIFactIdentifierType getFactIdentifier();

    /**
     * Setter for <b>factIdentifier</b>
     * 
     * @param factIdentifierParam
     *      <b>factIdentifier</b> to set.
     */
    @JsProperty(name = "factIdentifier", namespace = "FactMappingType")
    public final native void setFactIdentifier(JSIFactIdentifierType factIdentifierParam);

    /**
     * Getter for <b>className</b>
     * 
     * @return
     *      <b>className</<b>
     */
    @JsProperty(name = "className", namespace = "FactMappingType")
    public final native String getClassName();

    /**
     * Setter for <b>className</b>
     * 
     * @param classNameParam
     *      <b>className</b> to set.
     */
    @JsProperty(name = "className", namespace = "FactMappingType")
    public final native void setClassName(String classNameParam);

    /**
     * Getter for <b>factAlias</b>
     * 
     * @return
     *      <b>factAlias</<b>
     */
    @JsProperty(name = "factAlias", namespace = "FactMappingType")
    public final native String getFactAlias();

    /**
     * Setter for <b>factAlias</b>
     * 
     * @param factAliasParam
     *      <b>factAlias</b> to set.
     */
    @JsProperty(name = "factAlias", namespace = "FactMappingType")
    public final native void setFactAlias(String factAliasParam);

    /**
     * Getter for <b>expressionAlias</b>
     * 
     * @return
     *      <b>expressionAlias</<b>
     */
    @JsProperty(name = "expressionAlias", namespace = "FactMappingType")
    public final native String getExpressionAlias();

    /**
     * Setter for <b>expressionAlias</b>
     * 
     * @param expressionAliasParam
     *      <b>expressionAlias</b> to set.
     */
    @JsProperty(name = "expressionAlias", namespace = "FactMappingType")
    public final native void setExpressionAlias(String expressionAliasParam);

}
