
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TInformationRequirement</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TInformationRequirement", isNative = true)
public class JSITInformationRequirement
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TInformationRequirement";

    @JsOverlay
    public static JSITInformationRequirement newJSITInformationRequirementInstance(final Class<JSITInformationRequirement> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITInformationRequirement(final Object instance) {
        return "DMN12.TInformationRequirement".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>requiredDecision</b>
     * 
     * @return
     *      <b>requiredDecision</<b>
     */
    @JsProperty(name = "requiredDecision", namespace = "TInformationRequirement")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getRequiredDecision();

    /**
     * Setter for <b>requiredDecision</b>
     * 
     * @param requiredDecisionParam
     *      <b>requiredDecision</b> to set.
     */
    @JsProperty(name = "requiredDecision", namespace = "TInformationRequirement")
    public final native void setRequiredDecision(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference requiredDecisionParam);

    /**
     * Getter for <b>requiredInput</b>
     * 
     * @return
     *      <b>requiredInput</<b>
     */
    @JsProperty(name = "requiredInput", namespace = "TInformationRequirement")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getRequiredInput();

    /**
     * Setter for <b>requiredInput</b>
     * 
     * @param requiredInputParam
     *      <b>requiredInput</b> to set.
     */
    @JsProperty(name = "requiredInput", namespace = "TInformationRequirement")
    public final native void setRequiredInput(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference requiredInputParam);

}
