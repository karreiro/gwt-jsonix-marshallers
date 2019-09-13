
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TPerformanceIndicator</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TPerformanceIndicator", isNative = true)
public class JSITPerformanceIndicator
    extends JSITBusinessContextElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TPerformanceIndicator";

    @JsOverlay
    public static JSITPerformanceIndicator newJSITPerformanceIndicatorInstance(final Class<JSITPerformanceIndicator> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITPerformanceIndicator(final Object instance) {
        return "DMN12.TPerformanceIndicator".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>impactingDecision</b>
     * 
     * @return
     *      <b>impactingDecision</<b>
     */
    @JsProperty(name = "impactingDecision", namespace = "TPerformanceIndicator")
    public final native JsArrayLike<JSITDMNElementReference> getNativeImpactingDecision();

    /**
     * Getter for <b>impactingDecision</b>
     * 
     * @return
     *      <b>impactingDecision</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getImpactingDecision() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeImpactingDecision()));
    }

    /**
     * Setter for <b>impactingDecision</b>
     * 
     * @param impactingDecisionParam
     *      <b>impactingDecision</b> to set.
     */
    @JsProperty(name = "impactingDecision", namespace = "TPerformanceIndicator")
    public final native void setImpactingDecision(JsArrayLike<JSITDMNElementReference> impactingDecisionParam);

}
