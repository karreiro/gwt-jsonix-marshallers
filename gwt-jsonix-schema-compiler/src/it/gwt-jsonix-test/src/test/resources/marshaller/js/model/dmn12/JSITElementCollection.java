
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TElementCollection</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TElementCollection", isNative = true)
public class JSITElementCollection
    extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TElementCollection";

    @JsOverlay
    public static JSITElementCollection newJSITElementCollectionInstance(final Class<JSITElementCollection> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITElementCollection(final Object instance) {
        return "DMN12.TElementCollection".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>drgElement</b>
     * 
     * @return
     *      <b>drgElement</<b>
     */
    @JsProperty(name = "drgElement", namespace = "TElementCollection")
    public final native JsArrayLike<JSITDMNElementReference> getNativeDrgElement();

    /**
     * Getter for <b>drgElement</b>
     * 
     * @return
     *      <b>drgElement</<b>
     */
    @JsOverlay
    public final List<JSITDMNElementReference> getDrgElement() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDrgElement()));
    }

    /**
     * Setter for <b>drgElement</b>
     * 
     * @param drgElementParam
     *      <b>drgElement</b> to set.
     */
    @JsProperty(name = "drgElement", namespace = "TElementCollection")
    public final native void setDrgElement(JsArrayLike<JSITDMNElementReference> drgElementParam);

}
