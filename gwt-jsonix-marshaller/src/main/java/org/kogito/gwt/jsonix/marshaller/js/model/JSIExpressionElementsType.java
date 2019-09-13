
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>ExpressionElementsType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "ExpressionElementsType", isNative = true)
public class JSIExpressionElementsType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ExpressionElementsType";

    @JsOverlay
    public static JSIExpressionElementsType newJSIExpressionElementsTypeInstance(final Class<JSIExpressionElementsType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIExpressionElementsType(final Object instance) {
        return "SCESIM.ExpressionElementsType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "ExpressionElementsType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>expressionElement</b>
     * 
     * @return
     *      <b>expressionElement</<b>
     */
    @JsProperty(name = "expressionElement", namespace = "ExpressionElementsType")
    public final native JSIExpressionElementType getExpressionElement();

    /**
     * Setter for <b>expressionElement</b>
     * 
     * @param expressionElementParam
     *      <b>expressionElement</b> to set.
     */
    @JsProperty(name = "expressionElement", namespace = "ExpressionElementsType")
    public final native void setExpressionElement(JSIExpressionElementType expressionElementParam);

}
