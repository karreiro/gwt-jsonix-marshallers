
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
 * JSInterop adapter for <code>Style</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Style", isNative = true)
public class JSIStyle {

    @JsOverlay
    public final static String TYPE = "DI.Style";

    @JsOverlay
    public static JSIStyle newJSIStyleInstance(final Class<JSIStyle> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIStyle(final Object instance) {
        return "DI.Style".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "Style")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>extension</b>
     * 
     * @return
     *      <b>extension</<b>
     */
    @JsProperty(name = "extension", namespace = "Style")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIStyle.JSIExtension getExtension();

    /**
     * Setter for <b>extension</b>
     * 
     * @param extensionParam
     *      <b>extension</b> to set.
     */
    @JsProperty(name = "extension", namespace = "Style")
    public final native void setExtension(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIStyle.JSIExtension extensionParam);

    /**
     * Getter for <b>id</b>
     * 
     * @return
     *      <b>id</<b>
     */
    @JsProperty(name = "id", namespace = "Style")
    public final native String getId();

    /**
     * Setter for <b>id</b>
     * 
     * @param idParam
     *      <b>id</b> to set.
     */
    @JsProperty(name = "id", namespace = "Style")
    public final native void setId(String idParam);

    /**
     * Getter for <b>otherAttributes</b>
     * 
     * @return
     *      <b>otherAttributes</<b>
     */
    @JsProperty(name = "otherAttributes", namespace = "Style")
    public final native Map<QName, String> getOtherAttributes();

    /**
     * Setter for <b>otherAttributes</b>
     * 
     * @param otherAttributesParam
     *      <b>otherAttributes</b> to set.
     */
    @JsProperty(name = "otherAttributes", namespace = "Style")
    public final native void setOtherAttributes(Map<QName, String> otherAttributesParam);

    @JsOverlay
    public static Map<QName, String> getOtherAttributesMap(final JSIStyle instance) {
        return JsUtils.toAttributesMap(instance.getOtherAttributes());
    }


    /**
     * JSInterop adapter for <code>Style.Extension</code>
     * 
     */
    @JsType(namespace = "Style", name = "Extension", isNative = true)
    public static class JSIExtension {

        @JsOverlay
        public final static String TYPE = "DI.Style.Extension";

        @JsOverlay
        public static JSIStyle.JSIExtension newJSIExtensionInstance(final Class<JSIStyle.JSIExtension> klass) {
            return JsUtils.newInstance(klass);
        }

        @JsOverlay
        public static Boolean instanceOfJSIExtension(final Object instance) {
            return "DI.Style.Extension".equals(JsUtils.getTypeName(instance));
        }

        /**
         * Getter for <b>TYPE_NAME</b>
         * 
         * @return
         *      <b>TYPE_NAME</<b>
         */
        @JsProperty(name = "TYPE_NAME", namespace = "Style.Extension")
        public final native String getTYPE_NAME();

        /**
         * Getter for <b>any</b>
         * 
         * @return
         *      <b>any</<b>
         */
        @JsProperty(name = "any", namespace = "Style.Extension")
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
        @JsProperty(name = "any", namespace = "Style.Extension")
        public final native void setAny(JsArrayLike<Object> anyParam);

    }

}
