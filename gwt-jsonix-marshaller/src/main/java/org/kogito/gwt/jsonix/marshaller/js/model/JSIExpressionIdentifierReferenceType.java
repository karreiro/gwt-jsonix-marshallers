
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>ExpressionIdentifierReferenceType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "ExpressionIdentifierReferenceType", isNative = true)
public class JSIExpressionIdentifierReferenceType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ExpressionIdentifierReferenceType";

    @JsOverlay
    public static JSIExpressionIdentifierReferenceType newJSIExpressionIdentifierReferenceTypeInstance(final Class<JSIExpressionIdentifierReferenceType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIExpressionIdentifierReferenceType(final Object instance) {
        return "SCESIM.ExpressionIdentifierReferenceType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "ExpressionIdentifierReferenceType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>reference</b>
     * 
     * @return
     *      <b>reference</<b>
     */
    @JsProperty(name = "reference", namespace = "ExpressionIdentifierReferenceType")
    public final native String getReference();

    /**
     * Setter for <b>reference</b>
     * 
     * @param referenceParam
     *      <b>reference</b> to set.
     */
    @JsProperty(name = "reference", namespace = "ExpressionIdentifierReferenceType")
    public final native void setReference(String referenceParam);

}
