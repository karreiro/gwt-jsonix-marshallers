
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>Dimension</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Dimension", isNative = true)
public class JSIDimension {

    @JsOverlay
    public final static String TYPE = "DC.Dimension";

    @JsOverlay
    public static JSIDimension newJSIDimensionInstance(final Class<JSIDimension> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIDimension(final Object instance) {
        return "DC.Dimension".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "Dimension")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>width</b>
     * 
     * @return
     *      <b>width</<b>
     */
    @JsProperty(name = "width", namespace = "Dimension")
    public final native double getWidth();

    /**
     * Setter for <b>width</b>
     * 
     * @param widthParam
     *      <b>width</b> to set.
     */
    @JsProperty(name = "width", namespace = "Dimension")
    public final native void setWidth(double widthParam);

    /**
     * Getter for <b>height</b>
     * 
     * @return
     *      <b>height</<b>
     */
    @JsProperty(name = "height", namespace = "Dimension")
    public final native double getHeight();

    /**
     * Setter for <b>height</b>
     * 
     * @param heightParam
     *      <b>height</b> to set.
     */
    @JsProperty(name = "height", namespace = "Dimension")
    public final native void setHeight(double heightParam);

}
