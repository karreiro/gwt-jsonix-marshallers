
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>ScenariosType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "ScenariosType", isNative = true)
public class JSIScenariosType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ScenariosType";

    @JsOverlay
    public static JSIScenariosType newJSIScenariosTypeInstance(final Class<JSIScenariosType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIScenariosType(final Object instance) {
        return "SCESIM.ScenariosType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "ScenariosType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>scenario</b>
     * 
     * @return
     *      <b>scenario</<b>
     */
    @JsProperty(name = "scenario", namespace = "ScenariosType")
    public final native JSIScenarioType getScenario();

    /**
     * Setter for <b>scenario</b>
     * 
     * @param scenarioParam
     *      <b>scenario</b> to set.
     */
    @JsProperty(name = "scenario", namespace = "ScenariosType")
    public final native void setScenario(JSIScenarioType scenarioParam);

}
