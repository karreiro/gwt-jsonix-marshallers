
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TInputData</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TInputData", isNative = true)
public class JSITInputData
    extends JSITDRGElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TInputData";

    @JsOverlay
    public static JSITInputData newJSITInputDataInstance(final Class<JSITInputData> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITInputData(final Object instance) {
        return "DMN12.TInputData".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>variable</b>
     * 
     * @return
     *      <b>variable</<b>
     */
    @JsProperty(name = "variable", namespace = "TInputData")
    public final native JSITInformationItem getVariable();

    /**
     * Setter for <b>variable</b>
     * 
     * @param variableParam
     *      <b>variable</b> to set.
     */
    @JsProperty(name = "variable", namespace = "TInputData")
    public final native void setVariable(JSITInformationItem variableParam);

}
