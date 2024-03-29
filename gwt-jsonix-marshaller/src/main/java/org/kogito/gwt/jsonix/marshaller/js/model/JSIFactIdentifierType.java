
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>FactIdentifierType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "FactIdentifierType")
public class JSIFactIdentifierType {


    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name")
    public final native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param name
     *      <b>name</<b> to set.
     */
    @JsProperty(name = "name")
    public final native void setName(String name);

    /**
     * Getter for <b>className</b>
     * 
     * @return
     *      <b>className</<b>
     */
    @JsProperty(name = "className")
    public final native String getClassName();

    /**
     * Setter for <b>className</b>
     * 
     * @param className
     *      <b>className</<b> to set.
     */
    @JsProperty(name = "className")
    public final native void setClassName(String className);
    



public static native JSIFactIdentifierType newInstance() /*-{
        var json = "{\"TYPE_NAME\": \"SCESIM.FactIdentifierType\"}";
        var retrieved = JSON.parse(json)
        return retrieved
    }-*/;
}
