
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TInvocable</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TInvocable", isNative = true)
public class JSITInvocable
    extends JSITDRGElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TInvocable";

    @JsOverlay
    public static JSITInvocable newJSITInvocableInstance(final Class<JSITInvocable> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITInvocable(final Object instance) {
        return "DMN12.TInvocable".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>variable</b>
     * 
     * @return
     *      <b>variable</<b>
     */
    @JsProperty(name = "variable", namespace = "TInvocable")
    public final native JSITInformationItem getVariable();

    /**
     * Setter for <b>variable</b>
     * 
     * @param variableParam
     *      <b>variable</b> to set.
     */
    @JsProperty(name = "variable", namespace = "TInvocable")
    public final native void setVariable(JSITInformationItem variableParam);

}
