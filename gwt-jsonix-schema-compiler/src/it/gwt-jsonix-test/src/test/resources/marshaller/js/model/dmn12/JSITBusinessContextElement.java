
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TBusinessContextElement</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TBusinessContextElement", isNative = true)
public class JSITBusinessContextElement
    extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TBusinessContextElement";

    @JsOverlay
    public static JSITBusinessContextElement newJSITBusinessContextElementInstance(final Class<JSITBusinessContextElement> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITBusinessContextElement(final Object instance) {
        return "DMN12.TBusinessContextElement".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>uri</b>
     * 
     * @return
     *      <b>uri</<b>
     */
    @JsProperty(name = "uri", namespace = "TBusinessContextElement")
    public final native String getURI();

    /**
     * Setter for <b>uri</b>
     * 
     * @param uriParam
     *      <b>uri</b> to set.
     */
    @JsProperty(name = "uri", namespace = "TBusinessContextElement")
    public final native void setURI(String uriParam);

}
