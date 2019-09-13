
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>SimulationType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "SimulationType", isNative = true)
public class JSISimulationType {

    @JsOverlay
    public final static String TYPE = "SCESIM.SimulationType";

    @JsOverlay
    public static JSISimulationType newJSISimulationTypeInstance(final Class<JSISimulationType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSISimulationType(final Object instance) {
        return "SCESIM.SimulationType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "SimulationType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>simulationDescriptor</b>
     * 
     * @return
     *      <b>simulationDescriptor</<b>
     */
    @JsProperty(name = "simulationDescriptor", namespace = "SimulationType")
    public final native JSISimulationDescriptorType getSimulationDescriptor();

    /**
     * Setter for <b>simulationDescriptor</b>
     * 
     * @param simulationDescriptorParam
     *      <b>simulationDescriptor</b> to set.
     */
    @JsProperty(name = "simulationDescriptor", namespace = "SimulationType")
    public final native void setSimulationDescriptor(JSISimulationDescriptorType simulationDescriptorParam);

    /**
     * Getter for <b>scenarios</b>
     * 
     * @return
     *      <b>scenarios</<b>
     */
    @JsProperty(name = "scenarios", namespace = "SimulationType")
    public final native JSIScenariosType getScenarios();

    /**
     * Setter for <b>scenarios</b>
     * 
     * @param scenariosParam
     *      <b>scenarios</b> to set.
     */
    @JsProperty(name = "scenarios", namespace = "SimulationType")
    public final native void setScenarios(JSIScenariosType scenariosParam);

}
