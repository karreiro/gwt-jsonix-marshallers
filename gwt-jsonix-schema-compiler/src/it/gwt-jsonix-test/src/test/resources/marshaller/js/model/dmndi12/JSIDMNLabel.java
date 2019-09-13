
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmndi12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIShape;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>DMNLabel</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "DMNLabel", isNative = true)
public class JSIDMNLabel
    extends JSIShape
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNLabel";

    @JsOverlay
    public static JSIDMNLabel newJSIDMNLabelInstance(final Class<JSIDMNLabel> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIDMNLabel(final Object instance) {
        return "DMNDI12.DMNLabel".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>text</b>
     * 
     * @return
     *      <b>text</<b>
     */
    @JsProperty(name = "text", namespace = "DMNLabel")
    public final native String getText();

    /**
     * Setter for <b>text</b>
     * 
     * @param textParam
     *      <b>text</b> to set.
     */
    @JsProperty(name = "text", namespace = "DMNLabel")
    public final native void setText(String textParam);

}
