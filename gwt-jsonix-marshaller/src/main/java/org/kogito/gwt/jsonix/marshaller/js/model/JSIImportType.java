
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>ImportType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "ImportType", isNative = true)
public class JSIImportType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ImportType";

    @JsOverlay
    public static JSIImportType newJSIImportTypeInstance(final Class<JSIImportType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIImportType(final Object instance) {
        return "SCESIM.ImportType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "ImportType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>type</b>
     * 
     * @return
     *      <b>type</<b>
     */
    @JsProperty(name = "type", namespace = "ImportType")
    public final native String getType();

    /**
     * Setter for <b>type</b>
     * 
     * @param typeParam
     *      <b>type</b> to set.
     */
    @JsProperty(name = "type", namespace = "ImportType")
    public final native void setType(String typeParam);

}
