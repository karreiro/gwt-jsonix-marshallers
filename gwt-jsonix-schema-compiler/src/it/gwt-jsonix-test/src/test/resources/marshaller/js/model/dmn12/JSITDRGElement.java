
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TDRGElement</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TDRGElement", isNative = true)
public class JSITDRGElement
    extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDRGElement";

    @JsOverlay
    public static JSITDRGElement newJSITDRGElementInstance(final Class<JSITDRGElement> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITDRGElement(final Object instance) {
        return "DMN12.TDRGElement".equals(JsUtils.getTypeName(instance));
    }

}
