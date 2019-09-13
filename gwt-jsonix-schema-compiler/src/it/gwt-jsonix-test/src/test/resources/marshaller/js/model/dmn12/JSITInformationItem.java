
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TInformationItem</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TInformationItem", isNative = true)
public class JSITInformationItem
    extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TInformationItem";

    @JsOverlay
    public static JSITInformationItem newJSITInformationItemInstance(final Class<JSITInformationItem> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITInformationItem(final Object instance) {
        return "DMN12.TInformationItem".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>typeRef</b>
     * 
     * @return
     *      <b>typeRef</<b>
     */
    @JsProperty(name = "typeRef", namespace = "TInformationItem")
    public final native String getTypeRef();

    /**
     * Setter for <b>typeRef</b>
     * 
     * @param typeRefParam
     *      <b>typeRef</b> to set.
     */
    @JsProperty(name = "typeRef", namespace = "TInformationItem")
    public final native void setTypeRef(String typeRefParam);

}
