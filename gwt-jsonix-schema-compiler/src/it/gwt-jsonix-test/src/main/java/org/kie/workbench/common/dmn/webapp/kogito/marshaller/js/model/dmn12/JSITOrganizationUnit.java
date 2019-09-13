
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TOrganizationUnit</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TOrganizationUnit", isNative = true)
public class JSITOrganizationUnit
    extends JSITBusinessContextElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TOrganizationUnit";

    @JsOverlay
    public static JSITOrganizationUnit newJSITOrganizationUnitInstance(final Class<JSITOrganizationUnit> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITOrganizationUnit(final Object instance) {
        return "DMN12.TOrganizationUnit".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>decisionMade</b>
     * 
     * @return
     *      <b>decisionMade</<b>
     */
    @JsProperty(name = "decisionMade", namespace = "TOrganizationUnit")
    public final native JsArrayLike<JSITDMNElementReference> getNativeDecisionMade();

    /**
     * Getter for <b>decisionMade</b>
     * 
     * @return
     *      <b>decisionMade</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getDecisionMade() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDecisionMade()));
    }

    /**
     * Setter for <b>decisionMade</b>
     * 
     * @param decisionMadeParam
     *      <b>decisionMade</b> to set.
     */
    @JsProperty(name = "decisionMade", namespace = "TOrganizationUnit")
    public final native void setDecisionMade(JsArrayLike<JSITDMNElementReference> decisionMadeParam);

    /**
     * Getter for <b>decisionOwned</b>
     * 
     * @return
     *      <b>decisionOwned</<b>
     */
    @JsProperty(name = "decisionOwned", namespace = "TOrganizationUnit")
    public final native JsArrayLike<JSITDMNElementReference> getNativeDecisionOwned();

    /**
     * Getter for <b>decisionOwned</b>
     * 
     * @return
     *      <b>decisionOwned</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getDecisionOwned() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDecisionOwned()));
    }

    /**
     * Setter for <b>decisionOwned</b>
     * 
     * @param decisionOwnedParam
     *      <b>decisionOwned</b> to set.
     */
    @JsProperty(name = "decisionOwned", namespace = "TOrganizationUnit")
    public final native void setDecisionOwned(JsArrayLike<JSITDMNElementReference> decisionOwnedParam);

}
