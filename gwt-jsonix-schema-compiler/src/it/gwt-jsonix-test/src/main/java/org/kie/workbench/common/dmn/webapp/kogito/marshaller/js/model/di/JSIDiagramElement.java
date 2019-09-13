
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di;

import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>DiagramElement</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "DiagramElement", isNative = true)
public class JSIDiagramElement {

    @JsOverlay
    public final static String TYPE = "DI.DiagramElement";

    @JsOverlay
    public static JSIDiagramElement newJSIDiagramElementInstance(final Class<JSIDiagramElement> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIDiagramElement(final Object instance) {
        return "DI.DiagramElement".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "DiagramElement")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>extension</b>
     * 
     * @return
     *      <b>extension</<b>
     */
    @JsProperty(name = "extension", namespace = "DiagramElement")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIDiagramElement.JSIExtension getExtension();

    /**
     * Setter for <b>extension</b>
     * 
     * @param extensionParam
     *      <b>extension</b> to set.
     */
    @JsProperty(name = "extension", namespace = "DiagramElement")
    public final native void setExtension(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIDiagramElement.JSIExtension extensionParam);

    /**
     * Getter for <b>style</b>
     * 
     * @return
     *      <b>style</<b>
     */
    @JsProperty(name = "style", namespace = "DiagramElement")
    public final native JSIStyle getStyle();

    /**
     * Setter for <b>style</b>
     * 
     * @param styleParam
     *      <b>style</b> to set.
     */
    @JsProperty(name = "style", namespace = "DiagramElement")
    public final native void setStyle(JSIStyle styleParam);

    /**
     * Getter for <b>sharedStyle</b>
     * 
     * @return
     *      <b>sharedStyle</<b>
     */
    @JsProperty(name = "sharedStyle")
    public final native Object getSharedStyle();

    /**
     * Setter for <b>sharedStyle</b>
     * 
     * @param sharedStyleParam
     *      <b>sharedStyle</b> to set.
     */
    @JsProperty(name = "sharedStyle")
    public final native void setSharedStyle(Object sharedStyleParam);

    /**
     * Getter for <b>id</b>
     * 
     * @return
     *      <b>id</<b>
     */
    @JsProperty(name = "id", namespace = "DiagramElement")
    public final native String getId();

    /**
     * Setter for <b>id</b>
     * 
     * @param idParam
     *      <b>id</b> to set.
     */
    @JsProperty(name = "id", namespace = "DiagramElement")
    public final native void setId(String idParam);

    /**
     * Getter for <b>otherAttributes</b>
     * 
     * @return
     *      <b>otherAttributes</<b>
     */
    @JsProperty(name = "otherAttributes", namespace = "DiagramElement")
    public final native Map<QName, String> getOtherAttributes();

    /**
     * Setter for <b>otherAttributes</b>
     * 
     * @param otherAttributesParam
     *      <b>otherAttributes</b> to set.
     */
    @JsProperty(name = "otherAttributes", namespace = "DiagramElement")
    public final native void setOtherAttributes(Map<QName, String> otherAttributesParam);

    @JsOverlay
    public static Map<QName, String> getOtherAttributesMap(final JSIDiagramElement instance) {
        return JsUtils.toAttributesMap(instance.getOtherAttributes());
    }


    /**
     * JSInterop adapter for <code>DiagramElement.Extension</code>
     * 
     */
    @JsType(namespace = "DiagramElement", name = "Extension", isNative = true)
    public static class JSIExtension {

        @JsOverlay
        public final static String TYPE = "DI.DiagramElement.Extension";

        @JsOverlay
        public static JSIDiagramElement.JSIExtension newJSIExtensionInstance(final Class<JSIDiagramElement.JSIExtension> klass) {
            return JsUtils.newInstance(klass);
        }

        @JsOverlay
        public static Boolean instanceOfJSIExtension(final Object instance) {
            return "DI.DiagramElement.Extension".equals(JsUtils.getTypeName(instance));
        }

        /**
         * Getter for <b>TYPE_NAME</b>
         * 
         * @return
         *      <b>TYPE_NAME</<b>
         */
        @JsProperty(name = "TYPE_NAME", namespace = "DiagramElement.Extension")
        public final native String getTYPE_NAME();

        /**
         * Getter for <b>any</b>
         * 
         * @return
         *      <b>any</<b>
         */
        @JsProperty(name = "any", namespace = "DiagramElement.Extension")
        public final native JsArrayLike<Object> getNativeAny();

        /**
         * Getter for <b>any</b>
         * 
         * @return
         *      <b>any</<b>
         */
        @JsOverlay
        public final List<Object> getAny() {
            return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeAny()));
        }

        /**
         * Setter for <b>any</b>
         * 
         * @param anyParam
         *      <b>any</b> to set.
         */
        @JsProperty(name = "any", namespace = "DiagramElement.Extension")
        public final native void setAny(JsArrayLike<Object> anyParam);

    }

}
