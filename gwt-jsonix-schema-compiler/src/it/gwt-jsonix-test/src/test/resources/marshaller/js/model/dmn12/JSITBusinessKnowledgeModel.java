
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TBusinessKnowledgeModel</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TBusinessKnowledgeModel", isNative = true)
public class JSITBusinessKnowledgeModel
    extends JSITInvocable
{

    @JsOverlay
    public final static String TYPE = "DMN12.TBusinessKnowledgeModel";

    @JsOverlay
    public static JSITBusinessKnowledgeModel newJSITBusinessKnowledgeModelInstance(final Class<JSITBusinessKnowledgeModel> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITBusinessKnowledgeModel(final Object instance) {
        return "DMN12.TBusinessKnowledgeModel".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>encapsulatedLogic</b>
     * 
     * @return
     *      <b>encapsulatedLogic</<b>
     */
    @JsProperty(name = "encapsulatedLogic", namespace = "TBusinessKnowledgeModel")
    public final native JSITFunctionDefinition getEncapsulatedLogic();

    /**
     * Setter for <b>encapsulatedLogic</b>
     * 
     * @param encapsulatedLogicParam
     *      <b>encapsulatedLogic</b> to set.
     */
    @JsProperty(name = "encapsulatedLogic", namespace = "TBusinessKnowledgeModel")
    public final native void setEncapsulatedLogic(JSITFunctionDefinition encapsulatedLogicParam);

    /**
     * Getter for <b>knowledgeRequirement</b>
     * 
     * @return
     *      <b>knowledgeRequirement</<b>
     */
    @JsProperty(name = "knowledgeRequirement", namespace = "TBusinessKnowledgeModel")
    public final native JsArrayLike<JSITKnowledgeRequirement> getNativeKnowledgeRequirement();

    /**
     * Getter for <b>knowledgeRequirement</b>
     * 
     * @return
     *      <b>knowledgeRequirement</<b>
     */
    @JsOverlay
    public final List<JSITKnowledgeRequirement> getKnowledgeRequirement() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeKnowledgeRequirement()));
    }

    /**
     * Setter for <b>knowledgeRequirement</b>
     * 
     * @param knowledgeRequirementParam
     *      <b>knowledgeRequirement</b> to set.
     */
    @JsProperty(name = "knowledgeRequirement", namespace = "TBusinessKnowledgeModel")
    public final native void setKnowledgeRequirement(JsArrayLike<JSITKnowledgeRequirement> knowledgeRequirementParam);

    /**
     * Getter for <b>authorityRequirement</b>
     * 
     * @return
     *      <b>authorityRequirement</<b>
     */
    @JsProperty(name = "authorityRequirement", namespace = "TBusinessKnowledgeModel")
    public final native JsArrayLike<JSITAuthorityRequirement> getNativeAuthorityRequirement();

    /**
     * Getter for <b>authorityRequirement</b>
     * 
     * @return
     *      <b>authorityRequirement</<b>
     */
    @JsOverlay
    public final List<JSITAuthorityRequirement> getAuthorityRequirement() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeAuthorityRequirement()));
    }

    /**
     * Setter for <b>authorityRequirement</b>
     * 
     * @param authorityRequirementParam
     *      <b>authorityRequirement</b> to set.
     */
    @JsProperty(name = "authorityRequirement", namespace = "TBusinessKnowledgeModel")
    public final native void setAuthorityRequirement(JsArrayLike<JSITAuthorityRequirement> authorityRequirementParam);

}
