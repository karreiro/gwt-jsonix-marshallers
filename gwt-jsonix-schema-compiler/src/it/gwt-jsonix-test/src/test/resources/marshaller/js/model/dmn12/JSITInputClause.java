
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TInputClause</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TInputClause", isNative = true)
public class JSITInputClause
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TInputClause";

    @JsOverlay
    public static JSITInputClause newJSITInputClauseInstance(final Class<JSITInputClause> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITInputClause(final Object instance) {
        return "DMN12.TInputClause".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>inputExpression</b>
     * 
     * @return
     *      <b>inputExpression</<b>
     */
    @JsProperty(name = "inputExpression", namespace = "TInputClause")
    public final native JSITLiteralExpression getInputExpression();

    /**
     * Setter for <b>inputExpression</b>
     * 
     * @param inputExpressionParam
     *      <b>inputExpression</b> to set.
     */
    @JsProperty(name = "inputExpression", namespace = "TInputClause")
    public final native void setInputExpression(JSITLiteralExpression inputExpressionParam);

    /**
     * Getter for <b>inputValues</b>
     * 
     * @return
     *      <b>inputValues</<b>
     */
    @JsProperty(name = "inputValues", namespace = "TInputClause")
    public final native JSITUnaryTests getInputValues();

    /**
     * Setter for <b>inputValues</b>
     * 
     * @param inputValuesParam
     *      <b>inputValues</b> to set.
     */
    @JsProperty(name = "inputValues", namespace = "TInputClause")
    public final native void setInputValues(JSITUnaryTests inputValuesParam);

}
