
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TNamedElement</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TNamedElement", isNative = true)
public class JSITNamedElement
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TNamedElement";

    @JsOverlay
    public static JSITNamedElement newJSITNamedElementInstance(final Class<JSITNamedElement> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITNamedElement(final Object instance) {
        return "DMN12.TNamedElement".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name", namespace = "TNamedElement")
    public final native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param nameParam
     *      <b>name</b> to set.
     */
    @JsProperty(name = "name", namespace = "TNamedElement")
    public final native void setName(String nameParam);

}
