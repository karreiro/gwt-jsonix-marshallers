
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>SimulationDescriptorType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "SimulationDescriptorType")
public class JSISimulationDescriptorType {


    /**
     * Getter for <b>factMappings</b>
     * 
     * @return
     *      <b>factMappings</<b>
     */
    @JsProperty(name = "factMappings")
    public final native JSIFactMappingsType getFactMappings();

    /**
     * Setter for <b>factMappings</b>
     * 
     * @param factMappings
     *      <b>factMappings</<b> to set.
     */
    @JsProperty(name = "factMappings")
    public final native void setFactMappings(JSIFactMappingsType factMappings);

    /**
     * Getter for <b>dmoSession</b>
     * 
     * @return
     *      <b>dmoSession</<b>
     */
    @JsProperty(name = "dmoSession")
    public final native String getDmoSession();

    /**
     * Setter for <b>dmoSession</b>
     * 
     * @param dmoSession
     *      <b>dmoSession</<b> to set.
     */
    @JsProperty(name = "dmoSession")
    public final native void setDmoSession(String dmoSession);

    /**
     * Getter for <b>type</b>
     * 
     * @return
     *      <b>type</<b>
     */
    @JsProperty(name = "type")
    public final native String getType();

    /**
     * Setter for <b>type</b>
     * 
     * @param type
     *      <b>type</<b> to set.
     */
    @JsProperty(name = "type")
    public final native void setType(String type);

    /**
     * Getter for <b>fileName</b>
     * 
     * @return
     *      <b>fileName</<b>
     */
    @JsProperty(name = "fileName")
    public final native String getFileName();

    /**
     * Setter for <b>fileName</b>
     * 
     * @param fileName
     *      <b>fileName</<b> to set.
     */
    @JsProperty(name = "fileName")
    public final native void setFileName(String fileName);

    /**
     * Getter for <b>kieSession</b>
     * 
     * @return
     *      <b>kieSession</<b>
     */
    @JsProperty(name = "kieSession")
    public final native String getKieSession();

    /**
     * Setter for <b>kieSession</b>
     * 
     * @param kieSession
     *      <b>kieSession</<b> to set.
     */
    @JsProperty(name = "kieSession")
    public final native void setKieSession(String kieSession);

    /**
     * Getter for <b>kieBase</b>
     * 
     * @return
     *      <b>kieBase</<b>
     */
    @JsProperty(name = "kieBase")
    public final native String getKieBase();

    /**
     * Setter for <b>kieBase</b>
     * 
     * @param kieBase
     *      <b>kieBase</<b> to set.
     */
    @JsProperty(name = "kieBase")
    public final native void setKieBase(String kieBase);

    /**
     * Getter for <b>ruleFlowGroup</b>
     * 
     * @return
     *      <b>ruleFlowGroup</<b>
     */
    @JsProperty(name = "ruleFlowGroup")
    public final native String getRuleFlowGroup();

    /**
     * Setter for <b>ruleFlowGroup</b>
     * 
     * @param ruleFlowGroup
     *      <b>ruleFlowGroup</<b> to set.
     */
    @JsProperty(name = "ruleFlowGroup")
    public final native void setRuleFlowGroup(String ruleFlowGroup);
    



public static native JSISimulationDescriptorType newInstance() /*-{
        var json = "{\"TYPE_NAME\": \"SCESIM.SimulationDescriptorType\"}";
        var retrieved = JSON.parse(json)
        return retrieved
    }-*/;
}
