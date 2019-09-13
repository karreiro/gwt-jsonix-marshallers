
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TDecisionTable</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TDecisionTable", isNative = true)
public class JSITDecisionTable
    extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDecisionTable";

    @JsOverlay
    public static JSITDecisionTable newJSITDecisionTableInstance(final Class<JSITDecisionTable> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITDecisionTable(final Object instance) {
        return "DMN12.TDecisionTable".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>input</b>
     * 
     * @return
     *      <b>input</<b>
     */
    @JsProperty(name = "input", namespace = "TDecisionTable")
    public final native JsArrayLike<JSITInputClause> getNativeInput();

    /**
     * Getter for <b>input</b>
     * 
     * @return
     *      <b>input</<b>
     */
    @JsOverlay
    public final List<JSITInputClause> getInput() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeInput()));
    }

    /**
     * Setter for <b>input</b>
     * 
     * @param inputParam
     *      <b>input</b> to set.
     */
    @JsProperty(name = "input", namespace = "TDecisionTable")
    public final native void setInput(JsArrayLike<JSITInputClause> inputParam);

    /**
     * Getter for <b>output</b>
     * 
     * @return
     *      <b>output</<b>
     */
    @JsProperty(name = "output", namespace = "TDecisionTable")
    public final native JsArrayLike<JSITOutputClause> getNativeOutput();

    /**
     * Getter for <b>output</b>
     * 
     * @return
     *      <b>output</<b>
     */
    @JsOverlay
    public final List<JSITOutputClause> getOutput() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeOutput()));
    }

    /**
     * Setter for <b>output</b>
     * 
     * @param outputParam
     *      <b>output</b> to set.
     */
    @JsProperty(name = "output", namespace = "TDecisionTable")
    public final native void setOutput(JsArrayLike<JSITOutputClause> outputParam);

    /**
     * Getter for <b>annotation</b>
     * 
     * @return
     *      <b>annotation</<b>
     */
    @JsProperty(name = "annotation", namespace = "TDecisionTable")
    public final native JsArrayLike<JSITRuleAnnotationClause> getNativeAnnotation();

    /**
     * Getter for <b>annotation</b>
     * 
     * @return
     *      <b>annotation</<b>
     */
    @JsOverlay
    public final List<JSITRuleAnnotationClause> getAnnotation() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeAnnotation()));
    }

    /**
     * Setter for <b>annotation</b>
     * 
     * @param annotationParam
     *      <b>annotation</b> to set.
     */
    @JsProperty(name = "annotation", namespace = "TDecisionTable")
    public final native void setAnnotation(JsArrayLike<JSITRuleAnnotationClause> annotationParam);

    /**
     * Getter for <b>rule</b>
     * 
     * @return
     *      <b>rule</<b>
     */
    @JsProperty(name = "rule", namespace = "TDecisionTable")
    public final native JsArrayLike<JSITDecisionRule> getNativeRule();

    /**
     * Getter for <b>rule</b>
     * 
     * @return
     *      <b>rule</<b>
     */
    @JsOverlay
    public final List<JSITDecisionRule> getRule() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeRule()));
    }

    /**
     * Setter for <b>rule</b>
     * 
     * @param ruleParam
     *      <b>rule</b> to set.
     */
    @JsProperty(name = "rule", namespace = "TDecisionTable")
    public final native void setRule(JsArrayLike<JSITDecisionRule> ruleParam);

    /**
     * Getter for <b>hitPolicy</b>
     * 
     * @return
     *      <b>hitPolicy</<b>
     */
    @JsProperty(name = "hitPolicy", namespace = "TDecisionTable")
    public final native JSITHitPolicy getHitPolicy();

    /**
     * Setter for <b>hitPolicy</b>
     * 
     * @param hitPolicyParam
     *      <b>hitPolicy</b> to set.
     */
    @JsProperty(name = "hitPolicy", namespace = "TDecisionTable")
    public final native void setHitPolicy(JSITHitPolicy hitPolicyParam);

    /**
     * Getter for <b>aggregation</b>
     * 
     * @return
     *      <b>aggregation</<b>
     */
    @JsProperty(name = "aggregation", namespace = "TDecisionTable")
    public final native JSITBuiltinAggregator getAggregation();

    /**
     * Setter for <b>aggregation</b>
     * 
     * @param aggregationParam
     *      <b>aggregation</b> to set.
     */
    @JsProperty(name = "aggregation", namespace = "TDecisionTable")
    public final native void setAggregation(JSITBuiltinAggregator aggregationParam);

    /**
     * Getter for <b>preferredOrientation</b>
     * 
     * @return
     *      <b>preferredOrientation</<b>
     */
    @JsProperty(name = "preferredOrientation", namespace = "TDecisionTable")
    public final native JSITDecisionTableOrientation getPreferredOrientation();

    /**
     * Setter for <b>preferredOrientation</b>
     * 
     * @param preferredOrientationParam
     *      <b>preferredOrientation</b> to set.
     */
    @JsProperty(name = "preferredOrientation", namespace = "TDecisionTable")
    public final native void setPreferredOrientation(JSITDecisionTableOrientation preferredOrientationParam);

    /**
     * Getter for <b>outputLabel</b>
     * 
     * @return
     *      <b>outputLabel</<b>
     */
    @JsProperty(name = "outputLabel", namespace = "TDecisionTable")
    public final native String getOutputLabel();

    /**
     * Setter for <b>outputLabel</b>
     * 
     * @param outputLabelParam
     *      <b>outputLabel</b> to set.
     */
    @JsProperty(name = "outputLabel", namespace = "TDecisionTable")
    public final native void setOutputLabel(String outputLabelParam);

}
