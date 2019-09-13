
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

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
 * JSInterop adapter for <code>TDMNElement</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TDMNElement", isNative = true)
public class JSITDMNElement {

    @JsOverlay
    public final static String TYPE = "DMN12.TDMNElement";

    @JsOverlay
    public static JSITDMNElement newJSITDMNElementInstance(final Class<JSITDMNElement> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITDMNElement(final Object instance) {
        return "DMN12.TDMNElement".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "TDMNElement")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>description</b>
     * 
     * @return
     *      <b>description</<b>
     */
    @JsProperty(name = "description", namespace = "TDMNElement")
    public final native String getDescription();

    /**
     * Setter for <b>description</b>
     * 
     * @param descriptionParam
     *      <b>description</b> to set.
     */
    @JsProperty(name = "description", namespace = "TDMNElement")
    public final native void setDescription(String descriptionParam);

    /**
     * Getter for <b>extensionElements</b>
     * 
     * @return
     *      <b>extensionElements</<b>
     */
    @JsProperty(name = "extensionElements", namespace = "TDMNElement")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElement.JSIExtensionElements getExtensionElements();

    /**
     * Setter for <b>extensionElements</b>
     * 
     * @param extensionElementsParam
     *      <b>extensionElements</b> to set.
     */
    @JsProperty(name = "extensionElements", namespace = "TDMNElement")
    public final native void setExtensionElements(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElement.JSIExtensionElements extensionElementsParam);

    /**
     * Getter for <b>id</b>
     * 
     * @return
     *      <b>id</<b>
     */
    @JsProperty(name = "id", namespace = "TDMNElement")
    public final native String getId();

    /**
     * Setter for <b>id</b>
     * 
     * @param idParam
     *      <b>id</b> to set.
     */
    @JsProperty(name = "id", namespace = "TDMNElement")
    public final native void setId(String idParam);

    /**
     * Getter for <b>label</b>
     * 
     * @return
     *      <b>label</<b>
     */
    @JsProperty(name = "label", namespace = "TDMNElement")
    public final native String getLabel();

    /**
     * Setter for <b>label</b>
     * 
     * @param labelParam
     *      <b>label</b> to set.
     */
    @JsProperty(name = "label", namespace = "TDMNElement")
    public final native void setLabel(String labelParam);

    /**
     * Getter for <b>otherAttributes</b>
     * 
     * @return
     *      <b>otherAttributes</<b>
     */
    @JsProperty(name = "otherAttributes", namespace = "TDMNElement")
    public final native Map<QName, String> getOtherAttributes();

    /**
     * Setter for <b>otherAttributes</b>
     * 
     * @param otherAttributesParam
     *      <b>otherAttributes</b> to set.
     */
    @JsProperty(name = "otherAttributes", namespace = "TDMNElement")
    public final native void setOtherAttributes(Map<QName, String> otherAttributesParam);

    @JsOverlay
    public static Map<QName, String> getOtherAttributesMap(final JSITDMNElement instance) {
        return JsUtils.toAttributesMap(instance.getOtherAttributes());
    }


    /**
     * JSInterop adapter for <code>TDMNElement.ExtensionElements</code>
     * 
     */
    @JsType(namespace = "TDMNElement", name = "ExtensionElements", isNative = true)
    public static class JSIExtensionElements {

        @JsOverlay
        public final static String TYPE = "DMN12.TDMNElement.ExtensionElements";

        @JsOverlay
        public static JSITDMNElement.JSIExtensionElements newJSIExtensionElementsInstance(final Class<JSITDMNElement.JSIExtensionElements> klass) {
            return JsUtils.newInstance(klass);
        }

        @JsOverlay
        public static Boolean instanceOfJSIExtensionElements(final Object instance) {
            return "DMN12.TDMNElement.ExtensionElements".equals(JsUtils.getTypeName(instance));
        }

        /**
         * Getter for <b>TYPE_NAME</b>
         * 
         * @return
         *      <b>TYPE_NAME</<b>
         */
        @JsProperty(name = "TYPE_NAME", namespace = "TDMNElement.ExtensionElements")
        public final native String getTYPE_NAME();

        /**
         * Getter for <b>any</b>
         * 
         * @return
         *      <b>any</<b>
         */
        @JsProperty(name = "any", namespace = "TDMNElement.ExtensionElements")
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
        @JsProperty(name = "any", namespace = "TDMNElement.ExtensionElements")
        public final native void setAny(JsArrayLike<Object> anyParam);

    }

}
