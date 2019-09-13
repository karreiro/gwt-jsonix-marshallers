
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop container for <code>org.kogito.gwt.jsonix.marshaller.js.model</code>
 * 
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class SCESIM {


    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name")
    public final native String getname();

    /**
     * Getter for <b>ScenarioSimulationModel</b>
     * 
     * @return
     *      <b>ScenarioSimulationModel</<b>
     */
    @JsProperty(name = "ScenarioSimulationModel")
    public final native JSIScenarioSimulationModelType getScenarioSimulationModel();

    /**
     * Setter for <b>ScenarioSimulationModel</b>
     * 
     * @param ScenarioSimulationModelParam
     *      <b>ScenarioSimulationModel</b> to set.
     */
    @JsProperty(name = "ScenarioSimulationModel")
    public final native void setScenarioSimulationModel(JSIScenarioSimulationModelType ScenarioSimulationModelParam);

}
