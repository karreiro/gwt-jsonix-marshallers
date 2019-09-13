
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TLiteralExpression</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TLiteralExpression", isNative = true)
public class JSITLiteralExpression
    extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TLiteralExpression";

    @JsOverlay
    public static JSITLiteralExpression newJSITLiteralExpressionInstance(final Class<JSITLiteralExpression> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITLiteralExpression(final Object instance) {
        return "DMN12.TLiteralExpression".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>text</b>
     * 
     * @return
     *      <b>text</<b>
     */
    @JsProperty(name = "text", namespace = "TLiteralExpression")
    public final native String getText();

    /**
     * Setter for <b>text</b>
     * 
     * @param textParam
     *      <b>text</b> to set.
     */
    @JsProperty(name = "text", namespace = "TLiteralExpression")
    public final native void setText(String textParam);

    /**
     * Getter for <b>importedValues</b>
     * 
     * @return
     *      <b>importedValues</<b>
     */
    @JsProperty(name = "importedValues", namespace = "TLiteralExpression")
    public final native JSITImportedValues getImportedValues();

    /**
     * Setter for <b>importedValues</b>
     * 
     * @param importedValuesParam
     *      <b>importedValues</b> to set.
     */
    @JsProperty(name = "importedValues", namespace = "TLiteralExpression")
    public final native void setImportedValues(JSITImportedValues importedValuesParam);

    /**
     * Getter for <b>expressionLanguage</b>
     * 
     * @return
     *      <b>expressionLanguage</<b>
     */
    @JsProperty(name = "expressionLanguage", namespace = "TLiteralExpression")
    public final native String getExpressionLanguage();

    /**
     * Setter for <b>expressionLanguage</b>
     * 
     * @param expressionLanguageParam
     *      <b>expressionLanguage</b> to set.
     */
    @JsProperty(name = "expressionLanguage", namespace = "TLiteralExpression")
    public final native void setExpressionLanguage(String expressionLanguageParam);

}
