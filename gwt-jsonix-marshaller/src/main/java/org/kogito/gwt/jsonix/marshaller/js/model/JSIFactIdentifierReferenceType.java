
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>FactIdentifierReferenceType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "FactIdentifierReferenceType", isNative = true)
public class JSIFactIdentifierReferenceType {

    @JsOverlay
    public final static String TYPE = "SCESIM.FactIdentifierReferenceType";

    @JsOverlay
    public static JSIFactIdentifierReferenceType newJSIFactIdentifierReferenceTypeInstance(final Class<JSIFactIdentifierReferenceType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIFactIdentifierReferenceType(final Object instance) {
        return "SCESIM.FactIdentifierReferenceType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "FactIdentifierReferenceType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>reference</b>
     * 
     * @return
     *      <b>reference</<b>
     */
    @JsProperty(name = "reference", namespace = "FactIdentifierReferenceType")
    public final native String getReference();

    /**
     * Setter for <b>reference</b>
     * 
     * @param referenceParam
     *      <b>reference</b> to set.
     */
    @JsProperty(name = "reference", namespace = "FactIdentifierReferenceType")
    public final native void setReference(String referenceParam);

}
