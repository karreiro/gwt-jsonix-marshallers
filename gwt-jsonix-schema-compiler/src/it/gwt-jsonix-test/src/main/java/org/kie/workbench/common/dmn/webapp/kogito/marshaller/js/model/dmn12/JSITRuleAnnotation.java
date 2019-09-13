
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TRuleAnnotation</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TRuleAnnotation", isNative = true)
public class JSITRuleAnnotation {

    @JsOverlay
    public final static String TYPE = "DMN12.TRuleAnnotation";

    @JsOverlay
    public static JSITRuleAnnotation newJSITRuleAnnotationInstance(final Class<JSITRuleAnnotation> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITRuleAnnotation(final Object instance) {
        return "DMN12.TRuleAnnotation".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "TRuleAnnotation")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>text</b>
     * 
     * @return
     *      <b>text</<b>
     */
    @JsProperty(name = "text", namespace = "TRuleAnnotation")
    public final native String getText();

    /**
     * Setter for <b>text</b>
     * 
     * @param textParam
     *      <b>text</b> to set.
     */
    @JsProperty(name = "text", namespace = "TRuleAnnotation")
    public final native void setText(String textParam);

}
