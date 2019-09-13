
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.kie;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TComponentsWidthsExtension</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TComponentsWidthsExtension", isNative = true)
public class JSITComponentsWidthsExtension {

    @JsOverlay
    public final static String TYPE = "KIE.TComponentsWidthsExtension";

    @JsOverlay
    public static JSITComponentsWidthsExtension newJSITComponentsWidthsExtensionInstance(final Class<JSITComponentsWidthsExtension> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITComponentsWidthsExtension(final Object instance) {
        return "KIE.TComponentsWidthsExtension".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "TComponentsWidthsExtension")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>componentWidths</b>
     * 
     * @return
     *      <b>componentWidths</<b>
     */
    @JsProperty(name = "componentWidths", namespace = "TComponentsWidthsExtension")
    public final native JsArrayLike<JSITComponentWidths> getNativeComponentWidths();

    /**
     * Getter for <b>componentWidths</b>
     * 
     * @return
     *      <b>componentWidths</<b>
     */
    @JsOverlay
    public final List<JSITComponentWidths> getComponentWidths() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeComponentWidths()));
    }

    /**
     * Setter for <b>componentWidths</b>
     * 
     * @param componentWidthsParam
     *      <b>componentWidths</b> to set.
     */
    @JsProperty(name = "componentWidths", namespace = "TComponentsWidthsExtension")
    public final native void setComponentWidths(JsArrayLike<JSITComponentWidths> componentWidthsParam);

}
