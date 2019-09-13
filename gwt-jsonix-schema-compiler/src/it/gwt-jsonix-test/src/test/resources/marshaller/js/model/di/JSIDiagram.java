
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>Diagram</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Diagram", isNative = true)
public class JSIDiagram
    extends JSIDiagramElement
{

    @JsOverlay
    public final static String TYPE = "DI.Diagram";

    @JsOverlay
    public static JSIDiagram newJSIDiagramInstance(final Class<JSIDiagram> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIDiagram(final Object instance) {
        return "DI.Diagram".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name", namespace = "Diagram")
    public final native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param nameParam
     *      <b>name</b> to set.
     */
    @JsProperty(name = "name", namespace = "Diagram")
    public final native void setName(String nameParam);

    /**
     * Getter for <b>documentation</b>
     * 
     * @return
     *      <b>documentation</<b>
     */
    @JsProperty(name = "documentation", namespace = "Diagram")
    public final native String getDocumentation();

    /**
     * Setter for <b>documentation</b>
     * 
     * @param documentationParam
     *      <b>documentation</b> to set.
     */
    @JsProperty(name = "documentation", namespace = "Diagram")
    public final native void setDocumentation(String documentationParam);

    /**
     * Getter for <b>resolution</b>
     * 
     * @return
     *      <b>resolution</<b>
     */
    @JsProperty(name = "resolution", namespace = "Diagram")
    public final native double getResolution();

    /**
     * Setter for <b>resolution</b>
     * 
     * @param resolutionParam
     *      <b>resolution</b> to set.
     */
    @JsProperty(name = "resolution", namespace = "Diagram")
    public final native void setResolution(double resolutionParam);

}
