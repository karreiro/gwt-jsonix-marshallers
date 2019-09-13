
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TInvocation</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TInvocation", isNative = true)
public class JSITInvocation
    extends org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TInvocation";

    @JsOverlay
    public static JSITInvocation newJSITInvocationInstance(final Class<JSITInvocation> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITInvocation(final Object instance) {
        return "DMN12.TInvocation".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>expression</b>
     * 
     * @return
     *      <b>expression</<b>
     */
    @JsProperty(name = "expression", namespace = "TInvocation")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITExpression getExpression();

    /**
     * Setter for <b>expression</b>
     * 
     * @param expressionParam
     *      <b>expression</b> to set.
     */
    @JsProperty(name = "expression", namespace = "TInvocation")
    public final native void setExpression(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITExpression expressionParam);

    /**
     * Getter for <b>binding</b>
     * 
     * @return
     *      <b>binding</<b>
     */
    @JsProperty(name = "binding", namespace = "TInvocation")
    public final native JsArrayLike<JSITBinding> getNativeBinding();

    /**
     * Getter for <b>binding</b>
     * 
     * @return
     *      <b>binding</<b>
     */
    @JsOverlay
    public final List<JSITBinding> getBinding() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeBinding()));
    }

    /**
     * Setter for <b>binding</b>
     * 
     * @param bindingParam
     *      <b>binding</b> to set.
     */
    @JsProperty(name = "binding", namespace = "TInvocation")
    public final native void setBinding(JsArrayLike<JSITBinding> bindingParam);

}
