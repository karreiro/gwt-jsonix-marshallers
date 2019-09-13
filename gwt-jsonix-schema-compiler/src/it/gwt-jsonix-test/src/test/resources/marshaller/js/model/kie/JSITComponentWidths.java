
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.kie;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TComponentWidths</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TComponentWidths", isNative = true)
public class JSITComponentWidths {

    @JsOverlay
    public final static String TYPE = "KIE.TComponentWidths";

    @JsOverlay
    public static JSITComponentWidths newJSITComponentWidthsInstance(final Class<JSITComponentWidths> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITComponentWidths(final Object instance) {
        return "KIE.TComponentWidths".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "TComponentWidths")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>width</b>
     * 
     * @return
     *      <b>width</<b>
     */
    @JsProperty(name = "width", namespace = "TComponentWidths")
    public final native JsArrayLike<Float> getNativeWidth();

    /**
     * Getter for <b>width</b>
     * 
     * @return
     *      <b>width</<b>
     */
    @JsOverlay
    public final List<Float> getWidth() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeWidth()));
    }

    /**
     * Setter for <b>width</b>
     * 
     * @param widthParam
     *      <b>width</b> to set.
     */
    @JsProperty(name = "width", namespace = "TComponentWidths")
    public final native void setWidth(JsArrayLike<Float> widthParam);

    /**
     * Getter for <b>dmnElementRef</b>
     * 
     * @return
     *      <b>dmnElementRef</<b>
     */
    @JsProperty(name = "dmnElementRef", namespace = "TComponentWidths")
    public final native String getDmnElementRef();

    /**
     * Setter for <b>dmnElementRef</b>
     * 
     * @param dmnElementRefParam
     *      <b>dmnElementRef</b> to set.
     */
    @JsProperty(name = "dmnElementRef", namespace = "TComponentWidths")
    public final native void setDmnElementRef(String dmnElementRefParam);

}
