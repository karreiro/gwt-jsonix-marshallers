
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmndi12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>DMNDI</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "DMNDI", isNative = true)
public class JSIDMNDI {

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNDI";

    @JsOverlay
    public static JSIDMNDI newJSIDMNDIInstance(final Class<JSIDMNDI> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIDMNDI(final Object instance) {
        return "DMNDI12.DMNDI".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "DMNDI")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>dmnDiagram</b>
     * 
     * @return
     *      <b>dmnDiagram</<b>
     */
    @JsProperty(name = "dmnDiagram", namespace = "DMNDI")
    public final native JsArrayLike<JSIDMNDiagram> getNativeDMNDiagram();

    /**
     * Getter for <b>dmnDiagram</b>
     * 
     * @return
     *      <b>dmnDiagram</<b>
     */
    @JsOverlay
    public final List<JSIDMNDiagram> getDMNDiagram() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDMNDiagram()));
    }

    /**
     * Setter for <b>dmnDiagram</b>
     * 
     * @param dmnDiagramParam
     *      <b>dmnDiagram</b> to set.
     */
    @JsProperty(name = "dmnDiagram", namespace = "DMNDI")
    public final native void setDMNDiagram(JsArrayLike<JSIDMNDiagram> dmnDiagramParam);

    /**
     * Getter for <b>dmnStyle</b>
     * 
     * @return
     *      <b>dmnStyle</<b>
     */
    @JsProperty(name = "dmnStyle", namespace = "DMNDI")
    public final native JsArrayLike<JSIDMNStyle> getNativeDMNStyle();

    /**
     * Getter for <b>dmnStyle</b>
     * 
     * @return
     *      <b>dmnStyle</<b>
     */
    @JsOverlay
    public final List<JSIDMNStyle> getDMNStyle() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDMNStyle()));
    }

    /**
     * Setter for <b>dmnStyle</b>
     * 
     * @param dmnStyleParam
     *      <b>dmnStyle</b> to set.
     */
    @JsProperty(name = "dmnStyle", namespace = "DMNDI")
    public final native void setDMNStyle(JsArrayLike<JSIDMNStyle> dmnStyleParam);

}
