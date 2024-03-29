
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>ImportsType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "ImportsType")
public class JSIImportsType {


    /**
     * Getter for <b>imports</b>
     * 
     * @return
     *      <b>imports</<b>
     */
    @JsProperty(name = "imports")
    public final native JSIInnerImportsType getImports();

    /**
     * Setter for <b>imports</b>
     * 
     * @param imports
     *      <b>imports</<b> to set.
     */
    @JsProperty(name = "imports")
    public final native void setImports(JSIInnerImportsType imports);
    



public static native JSIImportsType newInstance() /*-{
        var json = "{\"TYPE_NAME\": \"SCESIM.ImportsType\"}";
        var retrieved = JSON.parse(json)
        return retrieved
    }-*/;
}
