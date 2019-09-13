
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIBounds;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>Shape</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Shape", isNative = true)
public class JSIShape
    extends JSIDiagramElement
{

    @JsOverlay
    public final static String TYPE = "DI.Shape";

    @JsOverlay
    public static JSIShape newJSIShapeInstance(final Class<JSIShape> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIShape(final Object instance) {
        return "DI.Shape".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>bounds</b>
     * 
     * @return
     *      <b>bounds</<b>
     */
    @JsProperty(name = "bounds", namespace = "Shape")
    public final native JSIBounds getBounds();

    /**
     * Setter for <b>bounds</b>
     * 
     * @param boundsParam
     *      <b>bounds</b> to set.
     */
    @JsProperty(name = "bounds", namespace = "Shape")
    public final native void setBounds(JSIBounds boundsParam);

}
