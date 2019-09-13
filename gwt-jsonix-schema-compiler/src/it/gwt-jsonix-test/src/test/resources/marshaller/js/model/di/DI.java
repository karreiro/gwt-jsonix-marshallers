
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * JSInterop container for <code>org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di</code>
 * 
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class DI {


    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name")
    public final native String getname();

    /**
     * Getter for <b>Style</b>
     * 
     * @return
     *      <b>Style</<b>
     */
    @JsProperty(name = "Style")
    public final native JSIStyle getStyle();

    /**
     * Setter for <b>Style</b>
     * 
     * @param StyleParam
     *      <b>Style</b> to set.
     */
    @JsProperty(name = "Style")
    public final native void setStyle(JSIStyle StyleParam);

}
