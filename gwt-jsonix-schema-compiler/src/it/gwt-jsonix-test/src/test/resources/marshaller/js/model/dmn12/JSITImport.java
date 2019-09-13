
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TImport</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TImport", isNative = true)
public class JSITImport
    extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TImport";

    @JsOverlay
    public static JSITImport newJSITImportInstance(final Class<JSITImport> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITImport(final Object instance) {
        return "DMN12.TImport".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>namespace</b>
     * 
     * @return
     *      <b>namespace</<b>
     */
    @JsProperty(name = "namespace", namespace = "TImport")
    public final native String getNamespace();

    /**
     * Setter for <b>namespace</b>
     * 
     * @param namespaceParam
     *      <b>namespace</b> to set.
     */
    @JsProperty(name = "namespace", namespace = "TImport")
    public final native void setNamespace(String namespaceParam);

    /**
     * Getter for <b>locationURI</b>
     * 
     * @return
     *      <b>locationURI</<b>
     */
    @JsProperty(name = "locationURI", namespace = "TImport")
    public final native String getLocationURI();

    /**
     * Setter for <b>locationURI</b>
     * 
     * @param locationURIParam
     *      <b>locationURI</b> to set.
     */
    @JsProperty(name = "locationURI", namespace = "TImport")
    public final native void setLocationURI(String locationURIParam);

    /**
     * Getter for <b>importType</b>
     * 
     * @return
     *      <b>importType</<b>
     */
    @JsProperty(name = "importType", namespace = "TImport")
    public final native String getImportType();

    /**
     * Setter for <b>importType</b>
     * 
     * @param importTypeParam
     *      <b>importType</b> to set.
     */
    @JsProperty(name = "importType", namespace = "TImport")
    public final native void setImportType(String importTypeParam);

}
