
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TBinding</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TBinding", isNative = true)
public class JSITBinding {

    @JsOverlay
    public final static String TYPE = "DMN12.TBinding";

    @JsOverlay
    public static JSITBinding newJSITBindingInstance(final Class<JSITBinding> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITBinding(final Object instance) {
        return "DMN12.TBinding".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "TBinding")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>parameter</b>
     * 
     * @return
     *      <b>parameter</<b>
     */
    @JsProperty(name = "parameter", namespace = "TBinding")
    public final native JSITInformationItem getParameter();

    /**
     * Setter for <b>parameter</b>
     * 
     * @param parameterParam
     *      <b>parameter</b> to set.
     */
    @JsProperty(name = "parameter", namespace = "TBinding")
    public final native void setParameter(JSITInformationItem parameterParam);

    /**
     * Getter for <b>expression</b>
     * 
     * @return
     *      <b>expression</<b>
     */
    @JsProperty(name = "expression", namespace = "TBinding")
    public final native JSITExpression getExpression();

    /**
     * Setter for <b>expression</b>
     * 
     * @param expressionParam
     *      <b>expression</b> to set.
     */
    @JsProperty(name = "expression", namespace = "TBinding")
    public final native void setExpression(JSITExpression expressionParam);

}
