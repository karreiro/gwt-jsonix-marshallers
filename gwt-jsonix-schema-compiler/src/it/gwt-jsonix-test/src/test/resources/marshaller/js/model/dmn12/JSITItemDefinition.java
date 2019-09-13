
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TItemDefinition</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TItemDefinition", isNative = true)
public class JSITItemDefinition
    extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TItemDefinition";

    @JsOverlay
    public static JSITItemDefinition newJSITItemDefinitionInstance(final Class<JSITItemDefinition> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITItemDefinition(final Object instance) {
        return "DMN12.TItemDefinition".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>typeRef</b>
     * 
     * @return
     *      <b>typeRef</<b>
     */
    @JsProperty(name = "typeRef", namespace = "TItemDefinition")
    public final native String getTypeRef();

    /**
     * Setter for <b>typeRef</b>
     * 
     * @param typeRefParam
     *      <b>typeRef</b> to set.
     */
    @JsProperty(name = "typeRef", namespace = "TItemDefinition")
    public final native void setTypeRef(String typeRefParam);

    /**
     * Getter for <b>allowedValues</b>
     * 
     * @return
     *      <b>allowedValues</<b>
     */
    @JsProperty(name = "allowedValues", namespace = "TItemDefinition")
    public final native JSITUnaryTests getAllowedValues();

    /**
     * Setter for <b>allowedValues</b>
     * 
     * @param allowedValuesParam
     *      <b>allowedValues</b> to set.
     */
    @JsProperty(name = "allowedValues", namespace = "TItemDefinition")
    public final native void setAllowedValues(JSITUnaryTests allowedValuesParam);

    /**
     * Getter for <b>itemComponent</b>
     * 
     * @return
     *      <b>itemComponent</<b>
     */
    @JsProperty(name = "itemComponent", namespace = "TItemDefinition")
    public final native JsArrayLike<JSITItemDefinition> getNativeItemComponent();

    /**
     * Getter for <b>itemComponent</b>
     * 
     * @return
     *      <b>itemComponent</<b>
     */
    @JsOverlay
    public final List<JSITItemDefinition> getItemComponent() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeItemComponent()));
    }

    /**
     * Setter for <b>itemComponent</b>
     * 
     * @param itemComponentParam
     *      <b>itemComponent</b> to set.
     */
    @JsProperty(name = "itemComponent", namespace = "TItemDefinition")
    public final native void setItemComponent(JsArrayLike<JSITItemDefinition> itemComponentParam);

    /**
     * Getter for <b>typeLanguage</b>
     * 
     * @return
     *      <b>typeLanguage</<b>
     */
    @JsProperty(name = "typeLanguage", namespace = "TItemDefinition")
    public final native String getTypeLanguage();

    /**
     * Setter for <b>typeLanguage</b>
     * 
     * @param typeLanguageParam
     *      <b>typeLanguage</b> to set.
     */
    @JsProperty(name = "typeLanguage", namespace = "TItemDefinition")
    public final native void setTypeLanguage(String typeLanguageParam);

    /**
     * Getter for <b>isCollection</b>
     * 
     * @return
     *      <b>isCollection</<b>
     */
    @JsProperty(name = "isCollection", namespace = "TItemDefinition")
    public final native boolean getIsCollection();

    /**
     * Setter for <b>isCollection</b>
     * 
     * @param isCollectionParam
     *      <b>isCollection</b> to set.
     */
    @JsProperty(name = "isCollection", namespace = "TItemDefinition")
    public final native void setIsCollection(boolean isCollectionParam);

}
