
package org.kogito.gwt.jsonix.marshaller.js.model;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;


/**
 * JSInterop adapter for <code>FactMappingsType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "FactMappingsType", isNative = true)
public class JSIFactMappingsType {

    @JsOverlay
    public final static String TYPE = "SCESIM.FactMappingsType";

    @JsOverlay
    public static JSIFactMappingsType newJSIFactMappingsTypeInstance(final Class<JSIFactMappingsType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIFactMappingsType(final Object instance) {
        return "SCESIM.FactMappingsType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "FactMappingsType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>factMapping</b>
     * 
     * @return
     *      <b>factMapping</<b>
     */
    @JsProperty(name = "factMapping", namespace = "FactMappingsType")
    public final native JsArrayLike<JSIFactMappingType> getNativeFactMapping();

    /**
     * Getter for <b>factMapping</b>
     * 
     * @return
     *      <b>factMapping</<b>
     */
    @JsOverlay
    public final List<JSIFactMappingType> getFactMapping() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeFactMapping()));
    }

    /**
     * Setter for <b>factMapping</b>
     * 
     * @param factMappingParam
     *      <b>factMapping</b> to set.
     */
    @JsProperty(name = "factMapping", namespace = "FactMappingsType")
    public final native void setFactMapping(JsArrayLike<JSIFactMappingType> factMappingParam);

}
