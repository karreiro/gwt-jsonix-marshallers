
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmndi12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIDimension;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIDiagram;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIDiagramElement;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>DMNDiagram</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "DMNDiagram", isNative = true)
public class JSIDMNDiagram
    extends JSIDiagram
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNDiagram";

    @JsOverlay
    public static JSIDMNDiagram newJSIDMNDiagramInstance(final Class<JSIDMNDiagram> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIDMNDiagram(final Object instance) {
        return "DMNDI12.DMNDiagram".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>size</b>
     * 
     * @return
     *      <b>size</<b>
     */
    @JsProperty(name = "size", namespace = "DMNDiagram")
    public final native JSIDimension getSize();

    /**
     * Setter for <b>size</b>
     * 
     * @param sizeParam
     *      <b>size</b> to set.
     */
    @JsProperty(name = "size", namespace = "DMNDiagram")
    public final native void setSize(JSIDimension sizeParam);

    /**
     * Getter for <b>dmnDiagramElement</b>
     * 
     * @return
     *      <b>dmnDiagramElement</<b>
     */
    @JsProperty(name = "dmnDiagramElement", namespace = "DMNDiagram")
    public final native JsArrayLike<JSIDiagramElement> getNativeDMNDiagramElement();

    /**
     * Getter for <b>dmnDiagramElement</b>
     * 
     * @return
     *      <b>dmnDiagramElement</<b>
     */
    @JsOverlay
    public final List<JSIDiagramElement> getDMNDiagramElement() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDMNDiagramElement()));
    }

    /**
     * Setter for <b>dmnDiagramElement</b>
     * 
     * @param dmnDiagramElementParam
     *      <b>dmnDiagramElement</b> to set.
     */
    @JsProperty(name = "dmnDiagramElement", namespace = "DMNDiagram")
    public final native void setDMNDiagramElement(JsArrayLike<JSIDiagramElement> dmnDiagramElementParam);

}
