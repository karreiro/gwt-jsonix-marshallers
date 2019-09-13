
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>Color</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Color", isNative = true)
public class JSIColor {

    @JsOverlay
    public final static String TYPE = "DC.Color";

    @JsOverlay
    public static JSIColor newJSIColorInstance(final Class<JSIColor> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIColor(final Object instance) {
        return "DC.Color".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "Color")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>red</b>
     * 
     * @return
     *      <b>red</<b>
     */
    @JsProperty(name = "red", namespace = "Color")
    public final native int getRed();

    /**
     * Setter for <b>red</b>
     * 
     * @param redParam
     *      <b>red</b> to set.
     */
    @JsProperty(name = "red", namespace = "Color")
    public final native void setRed(int redParam);

    /**
     * Getter for <b>green</b>
     * 
     * @return
     *      <b>green</<b>
     */
    @JsProperty(name = "green", namespace = "Color")
    public final native int getGreen();

    /**
     * Setter for <b>green</b>
     * 
     * @param greenParam
     *      <b>green</b> to set.
     */
    @JsProperty(name = "green", namespace = "Color")
    public final native void setGreen(int greenParam);

    /**
     * Getter for <b>blue</b>
     * 
     * @return
     *      <b>blue</<b>
     */
    @JsProperty(name = "blue", namespace = "Color")
    public final native int getBlue();

    /**
     * Setter for <b>blue</b>
     * 
     * @param blueParam
     *      <b>blue</b> to set.
     */
    @JsProperty(name = "blue", namespace = "Color")
    public final native void setBlue(int blueParam);

}
