
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TAuthorityRequirement</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TAuthorityRequirement", isNative = true)
public class JSITAuthorityRequirement
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TAuthorityRequirement";

    @JsOverlay
    public static JSITAuthorityRequirement newJSITAuthorityRequirementInstance(final Class<JSITAuthorityRequirement> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITAuthorityRequirement(final Object instance) {
        return "DMN12.TAuthorityRequirement".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>requiredDecision</b>
     * 
     * @return
     *      <b>requiredDecision</<b>
     */
    @JsProperty(name = "requiredDecision", namespace = "TAuthorityRequirement")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getRequiredDecision();

    /**
     * Setter for <b>requiredDecision</b>
     * 
     * @param requiredDecisionParam
     *      <b>requiredDecision</b> to set.
     */
    @JsProperty(name = "requiredDecision", namespace = "TAuthorityRequirement")
    public final native void setRequiredDecision(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference requiredDecisionParam);

    /**
     * Getter for <b>requiredInput</b>
     * 
     * @return
     *      <b>requiredInput</<b>
     */
    @JsProperty(name = "requiredInput", namespace = "TAuthorityRequirement")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getRequiredInput();

    /**
     * Setter for <b>requiredInput</b>
     * 
     * @param requiredInputParam
     *      <b>requiredInput</b> to set.
     */
    @JsProperty(name = "requiredInput", namespace = "TAuthorityRequirement")
    public final native void setRequiredInput(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference requiredInputParam);

    /**
     * Getter for <b>requiredAuthority</b>
     * 
     * @return
     *      <b>requiredAuthority</<b>
     */
    @JsProperty(name = "requiredAuthority", namespace = "TAuthorityRequirement")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getRequiredAuthority();

    /**
     * Setter for <b>requiredAuthority</b>
     * 
     * @param requiredAuthorityParam
     *      <b>requiredAuthority</b> to set.
     */
    @JsProperty(name = "requiredAuthority", namespace = "TAuthorityRequirement")
    public final native void setRequiredAuthority(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference requiredAuthorityParam);

}
