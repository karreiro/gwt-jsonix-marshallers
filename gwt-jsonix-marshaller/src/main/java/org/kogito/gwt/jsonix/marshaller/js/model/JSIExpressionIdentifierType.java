
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>ExpressionIdentifierType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "ExpressionIdentifierType", isNative = true)
public class JSIExpressionIdentifierType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ExpressionIdentifierType";

    @JsOverlay
    public static JSIExpressionIdentifierType newJSIExpressionIdentifierTypeInstance(final Class<JSIExpressionIdentifierType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIExpressionIdentifierType(final Object instance) {
        return "SCESIM.ExpressionIdentifierType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "ExpressionIdentifierType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name", namespace = "ExpressionIdentifierType")
    public final native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param nameParam
     *      <b>name</b> to set.
     */
    @JsProperty(name = "name", namespace = "ExpressionIdentifierType")
    public final native void setName(String nameParam);

    /**
     * Getter for <b>type</b>
     * 
     * @return
     *      <b>type</<b>
     */
    @JsProperty(name = "type", namespace = "ExpressionIdentifierType")
    public final native String getType();

    /**
     * Setter for <b>type</b>
     * 
     * @param typeParam
     *      <b>type</b> to set.
     */
    @JsProperty(name = "type", namespace = "ExpressionIdentifierType")
    public final native void setType(String typeParam);

}
