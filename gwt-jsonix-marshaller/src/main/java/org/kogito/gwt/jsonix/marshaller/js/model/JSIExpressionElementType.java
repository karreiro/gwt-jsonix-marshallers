
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>ExpressionElementType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "ExpressionElementType", isNative = true)
public class JSIExpressionElementType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ExpressionElementType";

    @JsOverlay
    public static JSIExpressionElementType newJSIExpressionElementTypeInstance(final Class<JSIExpressionElementType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIExpressionElementType(final Object instance) {
        return "SCESIM.ExpressionElementType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "ExpressionElementType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>step</b>
     * 
     * @return
     *      <b>step</<b>
     */
    @JsProperty(name = "step", namespace = "ExpressionElementType")
    public final native String getStep();

    /**
     * Setter for <b>step</b>
     * 
     * @param stepParam
     *      <b>step</b> to set.
     */
    @JsProperty(name = "step", namespace = "ExpressionElementType")
    public final native void setStep(String stepParam);

}
