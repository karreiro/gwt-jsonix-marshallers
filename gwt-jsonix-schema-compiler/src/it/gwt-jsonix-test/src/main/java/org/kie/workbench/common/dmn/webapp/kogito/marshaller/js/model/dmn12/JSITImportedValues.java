
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TImportedValues</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TImportedValues", isNative = true)
public class JSITImportedValues
    extends JSITImport
{

    @JsOverlay
    public final static String TYPE = "DMN12.TImportedValues";

    @JsOverlay
    public static JSITImportedValues newJSITImportedValuesInstance(final Class<JSITImportedValues> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITImportedValues(final Object instance) {
        return "DMN12.TImportedValues".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>importedElement</b>
     * 
     * @return
     *      <b>importedElement</<b>
     */
    @JsProperty(name = "importedElement", namespace = "TImportedValues")
    public final native String getImportedElement();

    /**
     * Setter for <b>importedElement</b>
     * 
     * @param importedElementParam
     *      <b>importedElement</b> to set.
     */
    @JsProperty(name = "importedElement", namespace = "TImportedValues")
    public final native void setImportedElement(String importedElementParam);

    /**
     * Getter for <b>expressionLanguage</b>
     * 
     * @return
     *      <b>expressionLanguage</<b>
     */
    @JsProperty(name = "expressionLanguage", namespace = "TImportedValues")
    public final native String getExpressionLanguage();

    /**
     * Setter for <b>expressionLanguage</b>
     * 
     * @param expressionLanguageParam
     *      <b>expressionLanguage</b> to set.
     */
    @JsProperty(name = "expressionLanguage", namespace = "TImportedValues")
    public final native void setExpressionLanguage(String expressionLanguageParam);

}
