
package org.kogito.gwt.jsonix.marshaller.js.model;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;


/**
 * JSInterop adapter for <code>FactMappingValuesType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "FactMappingValuesType", isNative = true)
public class JSIFactMappingValuesType {

    @JsOverlay
    public final static String TYPE = "SCESIM.FactMappingValuesType";

    @JsOverlay
    public static JSIFactMappingValuesType newJSIFactMappingValuesTypeInstance(final Class<JSIFactMappingValuesType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIFactMappingValuesType(final Object instance) {
        return "SCESIM.FactMappingValuesType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "FactMappingValuesType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>factMappingValue</b>
     * 
     * @return
     *      <b>factMappingValue</<b>
     */
    @JsProperty(name = "factMappingValue", namespace = "FactMappingValuesType")
    public final native JsArrayLike<JSIFactMappingValueType> getNativeFactMappingValue();

    /**
     * Getter for <b>factMappingValue</b>
     * 
     * @return
     *      <b>factMappingValue</<b>
     */
    @JsOverlay
    public final List<JSIFactMappingValueType> getFactMappingValue() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeFactMappingValue()));
    }

    /**
     * Setter for <b>factMappingValue</b>
     * 
     * @param factMappingValueParam
     *      <b>factMappingValue</b> to set.
     */
    @JsProperty(name = "factMappingValue", namespace = "FactMappingValuesType")
    public final native void setFactMappingValue(JsArrayLike<JSIFactMappingValueType> factMappingValueParam);

}
