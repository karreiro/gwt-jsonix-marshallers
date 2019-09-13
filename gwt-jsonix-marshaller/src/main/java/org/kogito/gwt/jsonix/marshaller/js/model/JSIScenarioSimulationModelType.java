
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>ScenarioSimulationModelType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "ScenarioSimulationModelType", isNative = true)
public class JSIScenarioSimulationModelType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ScenarioSimulationModelType";

    @JsOverlay
    public static JSIScenarioSimulationModelType newJSIScenarioSimulationModelTypeInstance(final Class<JSIScenarioSimulationModelType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIScenarioSimulationModelType(final Object instance) {
        return "SCESIM.ScenarioSimulationModelType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "ScenarioSimulationModelType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>simulation</b>
     * 
     * @return
     *      <b>simulation</<b>
     */
    @JsProperty(name = "simulation", namespace = "ScenarioSimulationModelType")
    public final native JSISimulationType getSimulation();

    /**
     * Setter for <b>simulation</b>
     * 
     * @param simulationParam
     *      <b>simulation</b> to set.
     */
    @JsProperty(name = "simulation", namespace = "ScenarioSimulationModelType")
    public final native void setSimulation(JSISimulationType simulationParam);

    /**
     * Getter for <b>imports</b>
     * 
     * @return
     *      <b>imports</<b>
     */
    @JsProperty(name = "imports", namespace = "ScenarioSimulationModelType")
    public final native JSIImportsType getImports();

    /**
     * Setter for <b>imports</b>
     * 
     * @param importsParam
     *      <b>imports</b> to set.
     */
    @JsProperty(name = "imports", namespace = "ScenarioSimulationModelType")
    public final native void setImports(JSIImportsType importsParam);

    /**
     * Getter for <b>version</b>
     * 
     * @return
     *      <b>version</<b>
     */
    @JsProperty(name = "version", namespace = "ScenarioSimulationModelType")
    public final native float getVersion();

    /**
     * Setter for <b>version</b>
     * 
     * @param versionParam
     *      <b>version</b> to set.
     */
    @JsProperty(name = "version", namespace = "ScenarioSimulationModelType")
    public final native void setVersion(float versionParam);

}
