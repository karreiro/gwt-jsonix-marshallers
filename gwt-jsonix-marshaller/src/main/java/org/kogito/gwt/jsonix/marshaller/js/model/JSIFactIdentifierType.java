
package org.kogito.gwt.jsonix.marshaller.js.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>FactIdentifierType</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "FactIdentifierType", isNative = true)
public class JSIFactIdentifierType {

    @JsOverlay
    public final static String TYPE = "SCESIM.FactIdentifierType";

    @JsOverlay
    public static JSIFactIdentifierType newJSIFactIdentifierTypeInstance(final Class<JSIFactIdentifierType> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIFactIdentifierType(final Object instance) {
        return "SCESIM.FactIdentifierType".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "FactIdentifierType")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name", namespace = "FactIdentifierType")
    public final native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param nameParam
     *      <b>name</b> to set.
     */
    @JsProperty(name = "name", namespace = "FactIdentifierType")
    public final native void setName(String nameParam);

    /**
     * Getter for <b>className</b>
     * 
     * @return
     *      <b>className</<b>
     */
    @JsProperty(name = "className", namespace = "FactIdentifierType")
    public final native String getClassName();

    /**
     * Setter for <b>className</b>
     * 
     * @param classNameParam
     *      <b>className</b> to set.
     */
    @JsProperty(name = "className", namespace = "FactIdentifierType")
    public final native void setClassName(String classNameParam);

}
