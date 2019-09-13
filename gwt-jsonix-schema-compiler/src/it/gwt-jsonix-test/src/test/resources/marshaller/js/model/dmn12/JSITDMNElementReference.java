
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TDMNElementReference</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TDMNElementReference", isNative = true)
public class JSITDMNElementReference {

    @JsOverlay
    public final static String TYPE = "DMN12.TDMNElementReference";

    @JsOverlay
    public static JSITDMNElementReference newJSITDMNElementReferenceInstance(final Class<JSITDMNElementReference> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITDMNElementReference(final Object instance) {
        return "DMN12.TDMNElementReference".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "TDMNElementReference")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>href</b>
     * 
     * @return
     *      <b>href</<b>
     */
    @JsProperty(name = "href", namespace = "TDMNElementReference")
    public final native String getHref();

    /**
     * Setter for <b>href</b>
     * 
     * @param hrefParam
     *      <b>href</b> to set.
     */
    @JsProperty(name = "href", namespace = "TDMNElementReference")
    public final native void setHref(String hrefParam);

}
