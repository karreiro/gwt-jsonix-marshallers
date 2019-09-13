
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TContext</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TContext", isNative = true)
public class JSITContext
    extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TContext";

    @JsOverlay
    public static JSITContext newJSITContextInstance(final Class<JSITContext> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITContext(final Object instance) {
        return "DMN12.TContext".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>contextEntry</b>
     * 
     * @return
     *      <b>contextEntry</<b>
     */
    @JsProperty(name = "contextEntry", namespace = "TContext")
    public final native JsArrayLike<JSITContextEntry> getNativeContextEntry();

    /**
     * Getter for <b>contextEntry</b>
     * 
     * @return
     *      <b>contextEntry</<b>
     */
    @JsOverlay
    public final List<JSITContextEntry> getContextEntry() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeContextEntry()));
    }

    /**
     * Setter for <b>contextEntry</b>
     * 
     * @param contextEntryParam
     *      <b>contextEntry</b> to set.
     */
    @JsProperty(name = "contextEntry", namespace = "TContext")
    public final native void setContextEntry(JsArrayLike<JSITContextEntry> contextEntryParam);

}
