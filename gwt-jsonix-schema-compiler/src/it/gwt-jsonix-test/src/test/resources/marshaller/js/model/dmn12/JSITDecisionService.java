
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TDecisionService</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TDecisionService", isNative = true)
public class JSITDecisionService
    extends JSITInvocable
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDecisionService";

    @JsOverlay
    public static JSITDecisionService newJSITDecisionServiceInstance(final Class<JSITDecisionService> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITDecisionService(final Object instance) {
        return "DMN12.TDecisionService".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>outputDecision</b>
     * 
     * @return
     *      <b>outputDecision</<b>
     */
    @JsProperty(name = "outputDecision", namespace = "TDecisionService")
    public final native JsArrayLike<JSITDMNElementReference> getNativeOutputDecision();

    /**
     * Getter for <b>outputDecision</b>
     * 
     * @return
     *      <b>outputDecision</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getOutputDecision() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeOutputDecision()));
    }

    /**
     * Setter for <b>outputDecision</b>
     * 
     * @param outputDecisionParam
     *      <b>outputDecision</b> to set.
     */
    @JsProperty(name = "outputDecision", namespace = "TDecisionService")
    public final native void setOutputDecision(JsArrayLike<JSITDMNElementReference> outputDecisionParam);

    /**
     * Getter for <b>encapsulatedDecision</b>
     * 
     * @return
     *      <b>encapsulatedDecision</<b>
     */
    @JsProperty(name = "encapsulatedDecision", namespace = "TDecisionService")
    public final native JsArrayLike<JSITDMNElementReference> getNativeEncapsulatedDecision();

    /**
     * Getter for <b>encapsulatedDecision</b>
     * 
     * @return
     *      <b>encapsulatedDecision</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getEncapsulatedDecision() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeEncapsulatedDecision()));
    }

    /**
     * Setter for <b>encapsulatedDecision</b>
     * 
     * @param encapsulatedDecisionParam
     *      <b>encapsulatedDecision</b> to set.
     */
    @JsProperty(name = "encapsulatedDecision", namespace = "TDecisionService")
    public final native void setEncapsulatedDecision(JsArrayLike<JSITDMNElementReference> encapsulatedDecisionParam);

    /**
     * Getter for <b>inputDecision</b>
     * 
     * @return
     *      <b>inputDecision</<b>
     */
    @JsProperty(name = "inputDecision", namespace = "TDecisionService")
    public final native JsArrayLike<JSITDMNElementReference> getNativeInputDecision();

    /**
     * Getter for <b>inputDecision</b>
     * 
     * @return
     *      <b>inputDecision</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getInputDecision() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeInputDecision()));
    }

    /**
     * Setter for <b>inputDecision</b>
     * 
     * @param inputDecisionParam
     *      <b>inputDecision</b> to set.
     */
    @JsProperty(name = "inputDecision", namespace = "TDecisionService")
    public final native void setInputDecision(JsArrayLike<JSITDMNElementReference> inputDecisionParam);

    /**
     * Getter for <b>inputData</b>
     * 
     * @return
     *      <b>inputData</<b>
     */
    @JsProperty(name = "inputData", namespace = "TDecisionService")
    public final native JsArrayLike<JSITDMNElementReference> getNativeInputData();

    /**
     * Getter for <b>inputData</b>
     * 
     * @return
     *      <b>inputData</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getInputData() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeInputData()));
    }

    /**
     * Setter for <b>inputData</b>
     * 
     * @param inputDataParam
     *      <b>inputData</b> to set.
     */
    @JsProperty(name = "inputData", namespace = "TDecisionService")
    public final native void setInputData(JsArrayLike<JSITDMNElementReference> inputDataParam);

}
