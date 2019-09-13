
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TContextEntry</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TContextEntry", isNative = true)
public class JSITContextEntry
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TContextEntry";

    @JsOverlay
    public static JSITContextEntry newJSITContextEntryInstance(final Class<JSITContextEntry> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITContextEntry(final Object instance) {
        return "DMN12.TContextEntry".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>variable</b>
     * 
     * @return
     *      <b>variable</<b>
     */
    @JsProperty(name = "variable", namespace = "TContextEntry")
    public final native JSITInformationItem getVariable();

    /**
     * Setter for <b>variable</b>
     * 
     * @param variableParam
     *      <b>variable</b> to set.
     */
    @JsProperty(name = "variable", namespace = "TContextEntry")
    public final native void setVariable(JSITInformationItem variableParam);

    /**
     * Getter for <b>expression</b>
     * 
     * @return
     *      <b>expression</<b>
     */
    @JsProperty(name = "expression", namespace = "TContextEntry")
    public final native JSITExpression getExpression();

    /**
     * Setter for <b>expression</b>
     * 
     * @param expressionParam
     *      <b>expression</b> to set.
     */
    @JsProperty(name = "expression", namespace = "TContextEntry")
    public final native void setExpression(JSITExpression expressionParam);

}
