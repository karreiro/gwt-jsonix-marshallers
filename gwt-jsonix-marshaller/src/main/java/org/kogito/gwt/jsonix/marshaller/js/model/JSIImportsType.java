
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>ImportsType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "ImportsType", isNative = true)
public class JSIImportsType {

    @JsOverlay
    public final static String TYPE = "SCESIM.ImportsType";

    @JsOverlay
    public static JSIImportsType newJSIImportsTypeInstance(final Class<JSIImportsType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIImportsType(final Object instance) {
        return "SCESIM.ImportsType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "ImportsType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>imports</b>
     * 
     * @return
     *      <b>imports</<b>
     */
    @JsProperty(name = "imports", namespace = "ImportsType")
    public final native JSIInnerImportsType getImports();

    /**
     * Setter for <b>imports</b>
     * 
     * @param importsParam
     *      <b>imports</b> to set.
     */
    @JsProperty(name = "imports", namespace = "ImportsType")
    public final native void setImports(JSIInnerImportsType importsParam);

}
