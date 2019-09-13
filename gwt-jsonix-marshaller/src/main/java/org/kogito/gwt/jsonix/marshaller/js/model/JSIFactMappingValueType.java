
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>FactMappingValueType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "FactMappingValueType", isNative = true)
public class JSIFactMappingValueType {

    @JsOverlay
    public final static String TYPE = "SCESIM.FactMappingValueType";

    @JsOverlay
    public static JSIFactMappingValueType newJSIFactMappingValueTypeInstance(final Class<JSIFactMappingValueType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIFactMappingValueType(final Object instance) {
        return "SCESIM.FactMappingValueType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "FactMappingValueType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>factIdentifier</b>
     * 
     * @return
     *      <b>factIdentifier</<b>
     */
    @JsProperty(name = "factIdentifier", namespace = "FactMappingValueType")
    public final native JSIFactIdentifierReferenceType getFactIdentifier();

    /**
     * Setter for <b>factIdentifier</b>
     * 
     * @param factIdentifierParam
     *      <b>factIdentifier</b> to set.
     */
    @JsProperty(name = "factIdentifier", namespace = "FactMappingValueType")
    public final native void setFactIdentifier(JSIFactIdentifierReferenceType factIdentifierParam);

    /**
     * Getter for <b>expressionIdentifier</b>
     * 
     * @return
     *      <b>expressionIdentifier</<b>
     */
    @JsProperty(name = "expressionIdentifier", namespace = "FactMappingValueType")
    public final native JSIExpressionIdentifierReferenceType getExpressionIdentifier();

    /**
     * Setter for <b>expressionIdentifier</b>
     * 
     * @param expressionIdentifierParam
     *      <b>expressionIdentifier</b> to set.
     */
    @JsProperty(name = "expressionIdentifier", namespace = "FactMappingValueType")
    public final native void setExpressionIdentifier(JSIExpressionIdentifierReferenceType expressionIdentifierParam);

    /**
     * Getter for <b>rawValue</b>
     * 
     * @return
     *      <b>rawValue</<b>
     */
    @JsProperty(name = "rawValue")
    public final native Object getRawValue();

    /**
     * Setter for <b>rawValue</b>
     * 
     * @param rawValueParam
     *      <b>rawValue</b> to set.
     */
    @JsProperty(name = "rawValue")
    public final native void setRawValue(Object rawValueParam);

}
