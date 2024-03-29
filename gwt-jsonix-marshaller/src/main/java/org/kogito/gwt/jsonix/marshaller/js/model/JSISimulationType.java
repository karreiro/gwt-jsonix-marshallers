
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>SimulationType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "SimulationType")
public class JSISimulationType {


    /**
     * Getter for <b>simulationDescriptor</b>
     * 
     * @return
     *      <b>simulationDescriptor</<b>
     */
    @JsProperty(name = "simulationDescriptor")
    public final native JSISimulationDescriptorType getSimulationDescriptor();

    /**
     * Setter for <b>simulationDescriptor</b>
     * 
     * @param simulationDescriptor
     *      <b>simulationDescriptor</<b> to set.
     */
    @JsProperty(name = "simulationDescriptor")
    public final native void setSimulationDescriptor(JSISimulationDescriptorType simulationDescriptor);

    /**
     * Getter for <b>scenarios</b>
     * 
     * @return
     *      <b>scenarios</<b>
     */
    @JsProperty(name = "scenarios")
    public final native JSIScenariosType getScenarios();

    /**
     * Setter for <b>scenarios</b>
     * 
     * @param scenarios
     *      <b>scenarios</<b> to set.
     */
    @JsProperty(name = "scenarios")
    public final native void setScenarios(JSIScenariosType scenarios);
    



public static native JSISimulationType newInstance() /*-{
        var json = "{\"TYPE_NAME\": \"SCESIM.SimulationType\"}";
        var retrieved = JSON.parse(json)
        return retrieved
    }-*/;
}
