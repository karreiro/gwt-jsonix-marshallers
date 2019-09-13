
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TTextAnnotation</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TTextAnnotation", isNative = true)
public class JSITTextAnnotation
    extends JSITArtifact
{

    @JsOverlay
    public final static String TYPE = "DMN12.TTextAnnotation";

    @JsOverlay
    public static JSITTextAnnotation newJSITTextAnnotationInstance(final Class<JSITTextAnnotation> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITTextAnnotation(final Object instance) {
        return "DMN12.TTextAnnotation".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>text</b>
     * 
     * @return
     *      <b>text</<b>
     */
    @JsProperty(name = "text", namespace = "TTextAnnotation")
    public final native String getText();

    /**
     * Setter for <b>text</b>
     * 
     * @param textParam
     *      <b>text</b> to set.
     */
    @JsProperty(name = "text", namespace = "TTextAnnotation")
    public final native void setText(String textParam);

    /**
     * Getter for <b>textFormat</b>
     * 
     * @return
     *      <b>textFormat</<b>
     */
    @JsProperty(name = "textFormat", namespace = "TTextAnnotation")
    public final native String getTextFormat();

    /**
     * Setter for <b>textFormat</b>
     * 
     * @param textFormatParam
     *      <b>textFormat</b> to set.
     */
    @JsProperty(name = "textFormat", namespace = "TTextAnnotation")
    public final native void setTextFormat(String textFormatParam);

}
