
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TDecision</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TDecision", isNative = true)
public class JSITDecision
    extends JSITDRGElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDecision";

    @JsOverlay
    public static JSITDecision newJSITDecisionInstance(final Class<JSITDecision> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITDecision(final Object instance) {
        return "DMN12.TDecision".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>question</b>
     * 
     * @return
     *      <b>question</<b>
     */
    @JsProperty(name = "question", namespace = "TDecision")
    public final native String getQuestion();

    /**
     * Setter for <b>question</b>
     * 
     * @param questionParam
     *      <b>question</b> to set.
     */
    @JsProperty(name = "question", namespace = "TDecision")
    public final native void setQuestion(String questionParam);

    /**
     * Getter for <b>allowedAnswers</b>
     * 
     * @return
     *      <b>allowedAnswers</<b>
     */
    @JsProperty(name = "allowedAnswers", namespace = "TDecision")
    public final native String getAllowedAnswers();

    /**
     * Setter for <b>allowedAnswers</b>
     * 
     * @param allowedAnswersParam
     *      <b>allowedAnswers</b> to set.
     */
    @JsProperty(name = "allowedAnswers", namespace = "TDecision")
    public final native void setAllowedAnswers(String allowedAnswersParam);

    /**
     * Getter for <b>variable</b>
     * 
     * @return
     *      <b>variable</<b>
     */
    @JsProperty(name = "variable", namespace = "TDecision")
    public final native JSITInformationItem getVariable();

    /**
     * Setter for <b>variable</b>
     * 
     * @param variableParam
     *      <b>variable</b> to set.
     */
    @JsProperty(name = "variable", namespace = "TDecision")
    public final native void setVariable(JSITInformationItem variableParam);

    /**
     * Getter for <b>informationRequirement</b>
     * 
     * @return
     *      <b>informationRequirement</<b>
     */
    @JsProperty(name = "informationRequirement", namespace = "TDecision")
    public final native JsArrayLike<JSITInformationRequirement> getNativeInformationRequirement();

    /**
     * Getter for <b>informationRequirement</b>
     * 
     * @return
     *      <b>informationRequirement</<b>
     */
    @JsOverlay
    public final List<JSITInformationRequirement> getInformationRequirement() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeInformationRequirement()));
    }

    /**
     * Setter for <b>informationRequirement</b>
     * 
     * @param informationRequirementParam
     *      <b>informationRequirement</b> to set.
     */
    @JsProperty(name = "informationRequirement", namespace = "TDecision")
    public final native void setInformationRequirement(JsArrayLike<JSITInformationRequirement> informationRequirementParam);

    /**
     * Getter for <b>knowledgeRequirement</b>
     * 
     * @return
     *      <b>knowledgeRequirement</<b>
     */
    @JsProperty(name = "knowledgeRequirement", namespace = "TDecision")
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
    @JsProperty(name = "knowledgeRequirement", namespace = "TDecision")
    public final native void setKnowledgeRequirement(JsArrayLike<JSITKnowledgeRequirement> knowledgeRequirementParam);

    /**
     * Getter for <b>authorityRequirement</b>
     * 
     * @return
     *      <b>authorityRequirement</<b>
     */
    @JsProperty(name = "authorityRequirement", namespace = "TDecision")
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
    @JsProperty(name = "authorityRequirement", namespace = "TDecision")
    public final native void setAuthorityRequirement(JsArrayLike<JSITAuthorityRequirement> authorityRequirementParam);

    /**
     * Getter for <b>supportedObjective</b>
     * 
     * @return
     *      <b>supportedObjective</<b>
     */
    @JsProperty(name = "supportedObjective", namespace = "TDecision")
    public final native JsArrayLike<JSITDMNElementReference> getNativeSupportedObjective();

    /**
     * Getter for <b>supportedObjective</b>
     * 
     * @return
     *      <b>supportedObjective</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getSupportedObjective() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeSupportedObjective()));
    }

    /**
     * Setter for <b>supportedObjective</b>
     * 
     * @param supportedObjectiveParam
     *      <b>supportedObjective</b> to set.
     */
    @JsProperty(name = "supportedObjective", namespace = "TDecision")
    public final native void setSupportedObjective(JsArrayLike<JSITDMNElementReference> supportedObjectiveParam);

    /**
     * Getter for <b>impactedPerformanceIndicator</b>
     * 
     * @return
     *      <b>impactedPerformanceIndicator</<b>
     */
    @JsProperty(name = "impactedPerformanceIndicator", namespace = "TDecision")
    public final native JsArrayLike<JSITDMNElementReference> getNativeImpactedPerformanceIndicator();

    /**
     * Getter for <b>impactedPerformanceIndicator</b>
     * 
     * @return
     *      <b>impactedPerformanceIndicator</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getImpactedPerformanceIndicator() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeImpactedPerformanceIndicator()));
    }

    /**
     * Setter for <b>impactedPerformanceIndicator</b>
     * 
     * @param impactedPerformanceIndicatorParam
     *      <b>impactedPerformanceIndicator</b> to set.
     */
    @JsProperty(name = "impactedPerformanceIndicator", namespace = "TDecision")
    public final native void setImpactedPerformanceIndicator(JsArrayLike<JSITDMNElementReference> impactedPerformanceIndicatorParam);

    /**
     * Getter for <b>decisionMaker</b>
     * 
     * @return
     *      <b>decisionMaker</<b>
     */
    @JsProperty(name = "decisionMaker", namespace = "TDecision")
    public final native JsArrayLike<JSITDMNElementReference> getNativeDecisionMaker();

    /**
     * Getter for <b>decisionMaker</b>
     * 
     * @return
     *      <b>decisionMaker</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getDecisionMaker() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDecisionMaker()));
    }

    /**
     * Setter for <b>decisionMaker</b>
     * 
     * @param decisionMakerParam
     *      <b>decisionMaker</b> to set.
     */
    @JsProperty(name = "decisionMaker", namespace = "TDecision")
    public final native void setDecisionMaker(JsArrayLike<JSITDMNElementReference> decisionMakerParam);

    /**
     * Getter for <b>decisionOwner</b>
     * 
     * @return
     *      <b>decisionOwner</<b>
     */
    @JsProperty(name = "decisionOwner", namespace = "TDecision")
    public final native JsArrayLike<JSITDMNElementReference> getNativeDecisionOwner();

    /**
     * Getter for <b>decisionOwner</b>
     * 
     * @return
     *      <b>decisionOwner</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getDecisionOwner() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDecisionOwner()));
    }

    /**
     * Setter for <b>decisionOwner</b>
     * 
     * @param decisionOwnerParam
     *      <b>decisionOwner</b> to set.
     */
    @JsProperty(name = "decisionOwner", namespace = "TDecision")
    public final native void setDecisionOwner(JsArrayLike<JSITDMNElementReference> decisionOwnerParam);

    /**
     * Getter for <b>usingProcess</b>
     * 
     * @return
     *      <b>usingProcess</<b>
     */
    @JsProperty(name = "usingProcess", namespace = "TDecision")
    public final native JsArrayLike<JSITDMNElementReference> getNativeUsingProcess();

    /**
     * Getter for <b>usingProcess</b>
     * 
     * @return
     *      <b>usingProcess</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getUsingProcess() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeUsingProcess()));
    }

    /**
     * Setter for <b>usingProcess</b>
     * 
     * @param usingProcessParam
     *      <b>usingProcess</b> to set.
     */
    @JsProperty(name = "usingProcess", namespace = "TDecision")
    public final native void setUsingProcess(JsArrayLike<JSITDMNElementReference> usingProcessParam);

    /**
     * Getter for <b>usingTask</b>
     * 
     * @return
     *      <b>usingTask</<b>
     */
    @JsProperty(name = "usingTask", namespace = "TDecision")
    public final native JsArrayLike<JSITDMNElementReference> getNativeUsingTask();

    /**
     * Getter for <b>usingTask</b>
     * 
     * @return
     *      <b>usingTask</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getUsingTask() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeUsingTask()));
    }

    /**
     * Setter for <b>usingTask</b>
     * 
     * @param usingTaskParam
     *      <b>usingTask</b> to set.
     */
    @JsProperty(name = "usingTask", namespace = "TDecision")
    public final native void setUsingTask(JsArrayLike<JSITDMNElementReference> usingTaskParam);

    /**
     * Getter for <b>expression</b>
     * 
     * @return
     *      <b>expression</<b>
     */
    @JsProperty(name = "expression", namespace = "TDecision")
    public final native JSITExpression getExpression();

    /**
     * Setter for <b>expression</b>
     * 
     * @param expressionParam
     *      <b>expression</b> to set.
     */
    @JsProperty(name = "expression", namespace = "TDecision")
    public final native void setExpression(JSITExpression expressionParam);

}
