
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TKnowledgeSource</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TKnowledgeSource", isNative = true)
public class JSITKnowledgeSource
    extends JSITDRGElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TKnowledgeSource";

    @JsOverlay
    public static JSITKnowledgeSource newJSITKnowledgeSourceInstance(final Class<JSITKnowledgeSource> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITKnowledgeSource(final Object instance) {
        return "DMN12.TKnowledgeSource".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>authorityRequirement</b>
     * 
     * @return
     *      <b>authorityRequirement</<b>
     */
    @JsProperty(name = "authorityRequirement", namespace = "TKnowledgeSource")
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
    @JsProperty(name = "authorityRequirement", namespace = "TKnowledgeSource")
    public final native void setAuthorityRequirement(JsArrayLike<JSITAuthorityRequirement> authorityRequirementParam);

    /**
     * Getter for <b>type</b>
     * 
     * @return
     *      <b>type</<b>
     */
    @JsProperty(name = "type", namespace = "TKnowledgeSource")
    public final native String getType();

    /**
     * Setter for <b>type</b>
     * 
     * @param typeParam
     *      <b>type</b> to set.
     */
    @JsProperty(name = "type", namespace = "TKnowledgeSource")
    public final native void setType(String typeParam);

    /**
     * Getter for <b>owner</b>
     * 
     * @return
     *      <b>owner</<b>
     */
    @JsProperty(name = "owner", namespace = "TKnowledgeSource")
    public final native JSITDMNElementReference getOwner();

    /**
     * Setter for <b>owner</b>
     * 
     * @param ownerParam
     *      <b>owner</b> to set.
     */
    @JsProperty(name = "owner", namespace = "TKnowledgeSource")
    public final native void setOwner(JSITDMNElementReference ownerParam);

    /**
     * Getter for <b>locationURI</b>
     * 
     * @return
     *      <b>locationURI</<b>
     */
    @JsProperty(name = "locationURI", namespace = "TKnowledgeSource")
    public final native String getLocationURI();

    /**
     * Setter for <b>locationURI</b>
     * 
     * @param locationURIParam
     *      <b>locationURI</b> to set.
     */
    @JsProperty(name = "locationURI", namespace = "TKnowledgeSource")
    public final native void setLocationURI(String locationURIParam);

}
