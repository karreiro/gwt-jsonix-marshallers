
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TList</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TList", isNative = true)
public class JSITList
    extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TList";

    @JsOverlay
    public static JSITList newJSITListInstance(final Class<JSITList> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITList(final Object instance) {
        return "DMN12.TList".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>expression</b>
     * 
     * @return
     *      <b>expression</<b>
     */
    @JsProperty(name = "expression", namespace = "TList")
    public final native JsArrayLike<JSITExpression> getNativeExpression();

    /**
     * Getter for <b>expression</b>
     * 
     * @return
     *      <b>expression</<b>
     */
    @JsOverlay
    public final List<JSITExpression> getExpression() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeExpression()));
    }

    /**
     * Setter for <b>expression</b>
     * 
     * @param expressionParam
     *      <b>expression</b> to set.
     */
    @JsProperty(name = "expression", namespace = "TList")
    public final native void setExpression(JsArrayLike<JSITExpression> expressionParam);

}
