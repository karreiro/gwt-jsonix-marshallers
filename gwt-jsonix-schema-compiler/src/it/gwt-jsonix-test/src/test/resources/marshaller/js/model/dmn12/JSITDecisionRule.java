
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TDecisionRule</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TDecisionRule", isNative = true)
public class JSITDecisionRule
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDecisionRule";

    @JsOverlay
    public static JSITDecisionRule newJSITDecisionRuleInstance(final Class<JSITDecisionRule> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITDecisionRule(final Object instance) {
        return "DMN12.TDecisionRule".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>inputEntry</b>
     * 
     * @return
     *      <b>inputEntry</<b>
     */
    @JsProperty(name = "inputEntry", namespace = "TDecisionRule")
    public final native JsArrayLike<JSITUnaryTests> getNativeInputEntry();

    /**
     * Getter for <b>inputEntry</b>
     * 
     * @return
     *      <b>inputEntry</<b>
     */
    @JsOverlay
    public final List<JSITUnaryTests> getInputEntry() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeInputEntry()));
    }

    /**
     * Setter for <b>inputEntry</b>
     * 
     * @param inputEntryParam
     *      <b>inputEntry</b> to set.
     */
    @JsProperty(name = "inputEntry", namespace = "TDecisionRule")
    public final native void setInputEntry(JsArrayLike<JSITUnaryTests> inputEntryParam);

    /**
     * Getter for <b>outputEntry</b>
     * 
     * @return
     *      <b>outputEntry</<b>
     */
    @JsProperty(name = "outputEntry", namespace = "TDecisionRule")
    public final native JsArrayLike<JSITLiteralExpression> getNativeOutputEntry();

    /**
     * Getter for <b>outputEntry</b>
     * 
     * @return
     *      <b>outputEntry</<b>
     */
    @JsOverlay
    public final List<JSITLiteralExpression> getOutputEntry() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeOutputEntry()));
    }

    /**
     * Setter for <b>outputEntry</b>
     * 
     * @param outputEntryParam
     *      <b>outputEntry</b> to set.
     */
    @JsProperty(name = "outputEntry", namespace = "TDecisionRule")
    public final native void setOutputEntry(JsArrayLike<JSITLiteralExpression> outputEntryParam);

    /**
     * Getter for <b>annotationEntry</b>
     * 
     * @return
     *      <b>annotationEntry</<b>
     */
    @JsProperty(name = "annotationEntry", namespace = "TDecisionRule")
    public final native JsArrayLike<JSITRuleAnnotation> getNativeAnnotationEntry();

    /**
     * Getter for <b>annotationEntry</b>
     * 
     * @return
     *      <b>annotationEntry</<b>
     */
    @JsOverlay
    public final List<JSITRuleAnnotation> getAnnotationEntry() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeAnnotationEntry()));
    }

    /**
     * Setter for <b>annotationEntry</b>
     * 
     * @param annotationEntryParam
     *      <b>annotationEntry</b> to set.
     */
    @JsProperty(name = "annotationEntry", namespace = "TDecisionRule")
    public final native void setAnnotationEntry(JsArrayLike<JSITRuleAnnotation> annotationEntryParam);

}
