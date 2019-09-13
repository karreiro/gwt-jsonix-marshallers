
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>ScenarioType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "ScenarioType", isNative = true)
public class JSIScenarioType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ScenarioType";

    @JsOverlay
    public static JSIScenarioType newJSIScenarioTypeInstance(final Class<JSIScenarioType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIScenarioType(final Object instance) {
        return "SCESIM.ScenarioType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "ScenarioType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>factMappingValues</b>
     * 
     * @return
     *      <b>factMappingValues</<b>
     */
    @JsProperty(name = "factMappingValues", namespace = "ScenarioType")
    public final native JSIFactMappingValuesType getFactMappingValues();

    /**
     * Setter for <b>factMappingValues</b>
     * 
     * @param factMappingValuesParam
     *      <b>factMappingValues</b> to set.
     */
    @JsProperty(name = "factMappingValues", namespace = "ScenarioType")
    public final native void setFactMappingValues(JSIFactMappingValuesType factMappingValuesParam);

    /**
     * Getter for <b>simulationDescriptor</b>
     * 
     * @return
     *      <b>simulationDescriptor</<b>
     */
    @JsProperty(name = "simulationDescriptor", namespace = "ScenarioType")
    public final native JSISimulationDescriptorType getSimulationDescriptor();

    /**
     * Setter for <b>simulationDescriptor</b>
     * 
     * @param simulationDescriptorParam
     *      <b>simulationDescriptor</b> to set.
     */
    @JsProperty(name = "simulationDescriptor", namespace = "ScenarioType")
    public final native void setSimulationDescriptor(JSISimulationDescriptorType simulationDescriptorParam);

}
