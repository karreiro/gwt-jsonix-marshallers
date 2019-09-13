
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TUnaryTests</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TUnaryTests", isNative = true)
public class JSITUnaryTests
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TUnaryTests";

    @JsOverlay
    public static JSITUnaryTests newJSITUnaryTestsInstance(final Class<JSITUnaryTests> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITUnaryTests(final Object instance) {
        return "DMN12.TUnaryTests".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>text</b>
     * 
     * @return
     *      <b>text</<b>
     */
    @JsProperty(name = "text", namespace = "TUnaryTests")
    public final native String getText();

    /**
     * Setter for <b>text</b>
     * 
     * @param textParam
     *      <b>text</b> to set.
     */
    @JsProperty(name = "text", namespace = "TUnaryTests")
    public final native void setText(String textParam);

    /**
     * Getter for <b>expressionLanguage</b>
     * 
     * @return
     *      <b>expressionLanguage</<b>
     */
    @JsProperty(name = "expressionLanguage", namespace = "TUnaryTests")
    public final native String getExpressionLanguage();

    /**
     * Setter for <b>expressionLanguage</b>
     * 
     * @param expressionLanguageParam
     *      <b>expressionLanguage</b> to set.
     */
    @JsProperty(name = "expressionLanguage", namespace = "TUnaryTests")
    public final native void setExpressionLanguage(String expressionLanguageParam);

}
