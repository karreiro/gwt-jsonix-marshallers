
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>Point</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Point", isNative = true)
public class JSIPoint {

    @JsOverlay
    public final static String TYPE = "DC.Point";

    @JsOverlay
    public static JSIPoint newJSIPointInstance(final Class<JSIPoint> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIPoint(final Object instance) {
        return "DC.Point".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "Point")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>x</b>
     * 
     * @return
     *      <b>x</<b>
     */
    @JsProperty(name = "x", namespace = "Point")
    public final native double getX();

    /**
     * Setter for <b>x</b>
     * 
     * @param xParam
     *      <b>x</b> to set.
     */
    @JsProperty(name = "x", namespace = "Point")
    public final native void setX(double xParam);

    /**
     * Getter for <b>y</b>
     * 
     * @return
     *      <b>y</<b>
     */
    @JsProperty(name = "y", namespace = "Point")
    public final native double getY();

    /**
     * Setter for <b>y</b>
     * 
     * @param yParam
     *      <b>y</b> to set.
     */
    @JsProperty(name = "y", namespace = "Point")
    public final native void setY(double yParam);

}
