
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.kie;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TAttachment</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TAttachment", isNative = true)
public class JSITAttachment {

    @JsOverlay
    public final static String TYPE = "KIE.TAttachment";

    @JsOverlay
    public static JSITAttachment newJSITAttachmentInstance(final Class<JSITAttachment> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITAttachment(final Object instance) {
        return "KIE.TAttachment".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "TAttachment")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>value</b>
     * 
     * @return
     *      <b>value</<b>
     */
    @JsProperty(name = "value", namespace = "TAttachment")
    public final native String getValue();

    /**
     * Setter for <b>value</b>
     * 
     * @param valueParam
     *      <b>value</b> to set.
     */
    @JsProperty(name = "value", namespace = "TAttachment")
    public final native void setValue(String valueParam);

    /**
     * Getter for <b>url</b>
     * 
     * @return
     *      <b>url</<b>
     */
    @JsProperty(name = "url", namespace = "TAttachment")
    public final native String getUrl();

    /**
     * Setter for <b>url</b>
     * 
     * @param urlParam
     *      <b>url</b> to set.
     */
    @JsProperty(name = "url", namespace = "TAttachment")
    public final native void setUrl(String urlParam);

    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name", namespace = "TAttachment")
    public final native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param nameParam
     *      <b>name</b> to set.
     */
    @JsProperty(name = "name", namespace = "TAttachment")
    public final native void setName(String nameParam);

}
