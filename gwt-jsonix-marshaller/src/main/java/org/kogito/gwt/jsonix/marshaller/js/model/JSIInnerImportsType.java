
package org.kogito.gwt.jsonix.marshaller.js.model;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;


/**
 * JSInterop adapter for <code>InnerImportsType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "InnerImportsType", isNative = true)
public class JSIInnerImportsType {

    @JsOverlay
    public final static String TYPE = "SCESIM.InnerImportsType";

    @JsOverlay
    public static JSIInnerImportsType newJSIInnerImportsTypeInstance(final Class<JSIInnerImportsType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIInnerImportsType(final Object instance) {
        return "SCESIM.InnerImportsType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "InnerImportsType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>_import</b>
     * 
     * @return
     *      <b>_import</<b>
     */
    @JsProperty(name = "_import", namespace = "InnerImportsType")
    public final native JsArrayLike<JSIImportType> getNativeImport();

    /**
     * Getter for <b>_import</b>
     * 
     * @return
     *      <b>_import</<b>
     */
    @JsOverlay
    public final List<JSIImportType> getImport() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeImport()));
    }

    /**
     * Setter for <b>_import</b>
     * 
     * @param _importParam
     *      <b>_import</b> to set.
     */
    @JsProperty(name = "_import", namespace = "InnerImportsType")
    public final native void setImport(JsArrayLike<JSIImportType> _importParam);

}
