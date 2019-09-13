
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TExpression</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TExpression", isNative = true)
public class JSITExpression
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TExpression";

    @JsOverlay
    public static JSITExpression newJSITExpressionInstance(final Class<JSITExpression> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITExpression(final Object instance) {
        return "DMN12.TExpression".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>typeRef</b>
     * 
     * @return
     *      <b>typeRef</<b>
     */
    @JsProperty(name = "typeRef", namespace = "TExpression")
    public final native String getTypeRef();

    /**
     * Setter for <b>typeRef</b>
     * 
     * @param typeRefParam
     *      <b>typeRef</b> to set.
     */
    @JsProperty(name = "typeRef", namespace = "TExpression")
    public final native void setTypeRef(String typeRefParam);

}
