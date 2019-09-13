
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>SimulationDescriptorType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "SimulationDescriptorType", isNative = true)
public class JSISimulationDescriptorType {

    @JsOverlay
    public final static String TYPE = "SCESIM.SimulationDescriptorType";

    @JsOverlay
    public static JSISimulationDescriptorType newJSISimulationDescriptorTypeInstance(final Class<JSISimulationDescriptorType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSISimulationDescriptorType(final Object instance) {
        return "SCESIM.SimulationDescriptorType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "SimulationDescriptorType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>factMappings</b>
     * 
     * @return
     *      <b>factMappings</<b>
     */
    @JsProperty(name = "factMappings", namespace = "SimulationDescriptorType")
    public final native JSIFactMappingsType getFactMappings();

    /**
     * Setter for <b>factMappings</b>
     * 
     * @param factMappingsParam
     *      <b>factMappings</b> to set.
     */
    @JsProperty(name = "factMappings", namespace = "SimulationDescriptorType")
    public final native void setFactMappings(JSIFactMappingsType factMappingsParam);

    /**
     * Getter for <b>dmoSession</b>
     * 
     * @return
     *      <b>dmoSession</<b>
     */
    @JsProperty(name = "dmoSession", namespace = "SimulationDescriptorType")
    public final native String getDmoSession();

    /**
     * Setter for <b>dmoSession</b>
     * 
     * @param dmoSessionParam
     *      <b>dmoSession</b> to set.
     */
    @JsProperty(name = "dmoSession", namespace = "SimulationDescriptorType")
    public final native void setDmoSession(String dmoSessionParam);

    /**
     * Getter for <b>type</b>
     * 
     * @return
     *      <b>type</<b>
     */
    @JsProperty(name = "type", namespace = "SimulationDescriptorType")
    public final native String getType();

    /**
     * Setter for <b>type</b>
     * 
     * @param typeParam
     *      <b>type</b> to set.
     */
    @JsProperty(name = "type", namespace = "SimulationDescriptorType")
    public final native void setType(String typeParam);

    /**
     * Getter for <b>fileName</b>
     * 
     * @return
     *      <b>fileName</<b>
     */
    @JsProperty(name = "fileName", namespace = "SimulationDescriptorType")
    public final native String getFileName();

    /**
     * Setter for <b>fileName</b>
     * 
     * @param fileNameParam
     *      <b>fileName</b> to set.
     */
    @JsProperty(name = "fileName", namespace = "SimulationDescriptorType")
    public final native void setFileName(String fileNameParam);

    /**
     * Getter for <b>kieSession</b>
     * 
     * @return
     *      <b>kieSession</<b>
     */
    @JsProperty(name = "kieSession", namespace = "SimulationDescriptorType")
    public final native String getKieSession();

    /**
     * Setter for <b>kieSession</b>
     * 
     * @param kieSessionParam
     *      <b>kieSession</b> to set.
     */
    @JsProperty(name = "kieSession", namespace = "SimulationDescriptorType")
    public final native void setKieSession(String kieSessionParam);

    /**
     * Getter for <b>kieBase</b>
     * 
     * @return
     *      <b>kieBase</<b>
     */
    @JsProperty(name = "kieBase", namespace = "SimulationDescriptorType")
    public final native String getKieBase();

    /**
     * Setter for <b>kieBase</b>
     * 
     * @param kieBaseParam
     *      <b>kieBase</b> to set.
     */
    @JsProperty(name = "kieBase", namespace = "SimulationDescriptorType")
    public final native void setKieBase(String kieBaseParam);

    /**
     * Getter for <b>ruleFlowGroup</b>
     * 
     * @return
     *      <b>ruleFlowGroup</<b>
     */
    @JsProperty(name = "ruleFlowGroup", namespace = "SimulationDescriptorType")
    public final native String getRuleFlowGroup();

    /**
     * Setter for <b>ruleFlowGroup</b>
     * 
     * @param ruleFlowGroupParam
     *      <b>ruleFlowGroup</b> to set.
     */
    @JsProperty(name = "ruleFlowGroup", namespace = "SimulationDescriptorType")
    public final native void setRuleFlowGroup(String ruleFlowGroupParam);

}
