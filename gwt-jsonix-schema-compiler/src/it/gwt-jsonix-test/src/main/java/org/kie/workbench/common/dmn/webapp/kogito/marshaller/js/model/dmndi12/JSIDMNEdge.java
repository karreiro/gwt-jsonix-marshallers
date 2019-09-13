
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmndi12;

import javax.xml.namespace.QName;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIEdge;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>DMNEdge</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "DMNEdge", isNative = true)
public class JSIDMNEdge
    extends JSIEdge
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNEdge";

    @JsOverlay
    public static JSIDMNEdge newJSIDMNEdgeInstance(final Class<JSIDMNEdge> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIDMNEdge(final Object instance) {
        return "DMNDI12.DMNEdge".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>dmnLabel</b>
     * 
     * @return
     *      <b>dmnLabel</<b>
     */
    @JsProperty(name = "dmnLabel", namespace = "DMNEdge")
    public final native JSIDMNLabel getDMNLabel();

    /**
     * Setter for <b>dmnLabel</b>
     * 
     * @param dmnLabelParam
     *      <b>dmnLabel</b> to set.
     */
    @JsProperty(name = "dmnLabel", namespace = "DMNEdge")
    public final native void setDMNLabel(JSIDMNLabel dmnLabelParam);

    /**
     * Getter for <b>dmnElementRef</b>
     * 
     * @return
     *      <b>dmnElementRef</<b>
     */
    @JsProperty(name = "dmnElementRef", namespace = "DMNEdge")
    public final native QName getDmnElementRef();

    /**
     * Setter for <b>dmnElementRef</b>
     * 
     * @param dmnElementRefParam
     *      <b>dmnElementRef</b> to set.
     */
    @JsProperty(name = "dmnElementRef", namespace = "DMNEdge")
    public final native void setDmnElementRef(QName dmnElementRefParam);

}
