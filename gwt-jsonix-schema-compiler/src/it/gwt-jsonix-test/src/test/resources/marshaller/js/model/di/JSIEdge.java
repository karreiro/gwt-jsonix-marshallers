
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIPoint;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>Edge</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Edge", isNative = true)
public class JSIEdge
    extends JSIDiagramElement
{

    @JsOverlay
    public final static String TYPE = "DI.Edge";

    @JsOverlay
    public static JSIEdge newJSIEdgeInstance(final Class<JSIEdge> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIEdge(final Object instance) {
        return "DI.Edge".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>waypoint</b>
     * 
     * @return
     *      <b>waypoint</<b>
     */
    @JsProperty(name = "waypoint", namespace = "Edge")
    public final native JsArrayLike<JSIPoint> getNativeWaypoint();

    /**
     * Getter for <b>waypoint</b>
     * 
     * @return
     *      <b>waypoint</<b>
     */
    @JsOverlay
    public final List<JSIPoint> getWaypoint() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeWaypoint()));
    }

    /**
     * Setter for <b>waypoint</b>
     * 
     * @param waypointParam
     *      <b>waypoint</b> to set.
     */
    @JsProperty(name = "waypoint", namespace = "Edge")
    public final native void setWaypoint(JsArrayLike<JSIPoint> waypointParam);

}
