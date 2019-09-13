
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>Bounds</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Bounds", isNative = true)
public class JSIBounds {

    @JsOverlay
    public final static String TYPE = "DC.Bounds";

    @JsOverlay
    public static JSIBounds newJSIBoundsInstance(final Class<JSIBounds> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIBounds(final Object instance) {
        return "DC.Bounds".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "Bounds")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>x</b>
     * 
     * @return
     *      <b>x</<b>
     */
    @JsProperty(name = "x", namespace = "Bounds")
    public final native double getX();

    /**
     * Setter for <b>x</b>
     * 
     * @param xParam
     *      <b>x</b> to set.
     */
    @JsProperty(name = "x", namespace = "Bounds")
    public final native void setX(double xParam);

    /**
     * Getter for <b>y</b>
     * 
     * @return
     *      <b>y</<b>
     */
    @JsProperty(name = "y", namespace = "Bounds")
    public final native double getY();

    /**
     * Setter for <b>y</b>
     * 
     * @param yParam
     *      <b>y</b> to set.
     */
    @JsProperty(name = "y", namespace = "Bounds")
    public final native void setY(double yParam);

    /**
     * Getter for <b>width</b>
     * 
     * @return
     *      <b>width</<b>
     */
    @JsProperty(name = "width", namespace = "Bounds")
    public final native double getWidth();

    /**
     * Setter for <b>width</b>
     * 
     * @param widthParam
     *      <b>width</b> to set.
     */
    @JsProperty(name = "width", namespace = "Bounds")
    public final native void setWidth(double widthParam);

    /**
     * Getter for <b>height</b>
     * 
     * @return
     *      <b>height</<b>
     */
    @JsProperty(name = "height", namespace = "Bounds")
    public final native double getHeight();

    /**
     * Setter for <b>height</b>
     * 
     * @param heightParam
     *      <b>height</b> to set.
     */
    @JsProperty(name = "height", namespace = "Bounds")
    public final native void setHeight(double heightParam);

}
