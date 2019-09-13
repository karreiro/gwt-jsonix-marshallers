
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.kie;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop container for <code>org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.kie</code>
 * 
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class KIE {


    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name")
    public final native String getname();

    /**
     * Getter for <b>attachment</b>
     * 
     * @return
     *      <b>attachment</<b>
     */
    @JsProperty(name = "attachment")
    public final native JSITAttachment getAttachment();

    /**
     * Setter for <b>attachment</b>
     * 
     * @param attachmentParam
     *      <b>attachment</b> to set.
     */
    @JsProperty(name = "attachment")
    public final native void setAttachment(JSITAttachment attachmentParam);

    /**
     * Getter for <b>ComponentWidths</b>
     * 
     * @return
     *      <b>ComponentWidths</<b>
     */
    @JsProperty(name = "ComponentWidths")
    public final native JSITComponentWidths getComponentWidths();

    /**
     * Setter for <b>ComponentWidths</b>
     * 
     * @param ComponentWidthsParam
     *      <b>ComponentWidths</b> to set.
     */
    @JsProperty(name = "ComponentWidths")
    public final native void setComponentWidths(JSITComponentWidths ComponentWidthsParam);

    /**
     * Getter for <b>ComponentsWidthsExtension</b>
     * 
     * @return
     *      <b>ComponentsWidthsExtension</<b>
     */
    @JsProperty(name = "ComponentsWidthsExtension")
    public final native JSITComponentsWidthsExtension getComponentsWidthsExtension();

    /**
     * Setter for <b>ComponentsWidthsExtension</b>
     * 
     * @param ComponentsWidthsExtensionParam
     *      <b>ComponentsWidthsExtension</b> to set.
     */
    @JsProperty(name = "ComponentsWidthsExtension")
    public final native void setComponentsWidthsExtension(JSITComponentsWidthsExtension ComponentsWidthsExtensionParam);

}
