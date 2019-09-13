
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmndi12.JSIDMNDI;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TDefinitions</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TDefinitions", isNative = true)
public class JSITDefinitions
    extends JSITNamedElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TDefinitions";

    @JsOverlay
    public static JSITDefinitions newJSITDefinitionsInstance(final Class<JSITDefinitions> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITDefinitions(final Object instance) {
        return "DMN12.TDefinitions".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>_import</b>
     * 
     * @return
     *      <b>_import</<b>
     */
    @JsProperty(name = "_import", namespace = "TDefinitions")
    public final native JsArrayLike<JSITImport> getNativeImport();

    /**
     * Getter for <b>_import</b>
     * 
     * @return
     *      <b>_import</<b>
     */
    @JsOverlay
    public final List<JSITImport> getImport() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeImport()));
    }

    /**
     * Setter for <b>_import</b>
     * 
     * @param _importParam
     *      <b>_import</b> to set.
     */
    @JsProperty(name = "_import", namespace = "TDefinitions")
    public final native void setImport(JsArrayLike<JSITImport> _importParam);

    /**
     * Getter for <b>itemDefinition</b>
     * 
     * @return
     *      <b>itemDefinition</<b>
     */
    @JsProperty(name = "itemDefinition", namespace = "TDefinitions")
    public final native JsArrayLike<JSITItemDefinition> getNativeItemDefinition();

    /**
     * Getter for <b>itemDefinition</b>
     * 
     * @return
     *      <b>itemDefinition</<b>
     */
    @JsOverlay
    public final List<JSITItemDefinition> getItemDefinition() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeItemDefinition()));
    }

    /**
     * Setter for <b>itemDefinition</b>
     * 
     * @param itemDefinitionParam
     *      <b>itemDefinition</b> to set.
     */
    @JsProperty(name = "itemDefinition", namespace = "TDefinitions")
    public final native void setItemDefinition(JsArrayLike<JSITItemDefinition> itemDefinitionParam);

    /**
     * Getter for <b>drgElement</b>
     * 
     * @return
     *      <b>drgElement</<b>
     */
    @JsProperty(name = "drgElement", namespace = "TDefinitions")
    public final native JsArrayLike<JSITDRGElement> getNativeDrgElement();

    /**
     * Getter for <b>drgElement</b>
     * 
     * @return
     *      <b>drgElement</<b>
     */
    @JsOverlay
    public final List<JSITDRGElement> getDrgElement() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeDrgElement()));
    }

    /**
     * Setter for <b>drgElement</b>
     * 
     * @param drgElementParam
     *      <b>drgElement</b> to set.
     */
    @JsProperty(name = "drgElement", namespace = "TDefinitions")
    public final native void setDrgElement(JsArrayLike<JSITDRGElement> drgElementParam);

    /**
     * Getter for <b>artifact</b>
     * 
     * @return
     *      <b>artifact</<b>
     */
    @JsProperty(name = "artifact", namespace = "TDefinitions")
    public final native JsArrayLike<JSITArtifact> getNativeArtifact();

    /**
     * Getter for <b>artifact</b>
     * 
     * @return
     *      <b>artifact</<b>
     */
    @JsOverlay
    public final List<JSITArtifact> getArtifact() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeArtifact()));
    }

    /**
     * Setter for <b>artifact</b>
     * 
     * @param artifactParam
     *      <b>artifact</b> to set.
     */
    @JsProperty(name = "artifact", namespace = "TDefinitions")
    public final native void setArtifact(JsArrayLike<JSITArtifact> artifactParam);

    /**
     * Getter for <b>elementCollection</b>
     * 
     * @return
     *      <b>elementCollection</<b>
     */
    @JsProperty(name = "elementCollection", namespace = "TDefinitions")
    public final native JsArrayLike<JSITElementCollection> getNativeElementCollection();

    /**
     * Getter for <b>elementCollection</b>
     * 
     * @return
     *      <b>elementCollection</<b>
     */
    @JsOverlay
    public final List<JSITElementCollection> getElementCollection() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeElementCollection()));
    }

    /**
     * Setter for <b>elementCollection</b>
     * 
     * @param elementCollectionParam
     *      <b>elementCollection</b> to set.
     */
    @JsProperty(name = "elementCollection", namespace = "TDefinitions")
    public final native void setElementCollection(JsArrayLike<JSITElementCollection> elementCollectionParam);

    /**
     * Getter for <b>businessContextElement</b>
     * 
     * @return
     *      <b>businessContextElement</<b>
     */
    @JsProperty(name = "businessContextElement", namespace = "TDefinitions")
    public final native JsArrayLike<JSITBusinessContextElement> getNativeBusinessContextElement();

    /**
     * Getter for <b>businessContextElement</b>
     * 
     * @return
     *      <b>businessContextElement</<b>
     */
    @JsOverlay
    public final List<JSITBusinessContextElement> getBusinessContextElement() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeBusinessContextElement()));
    }

    /**
     * Setter for <b>businessContextElement</b>
     * 
     * @param businessContextElementParam
     *      <b>businessContextElement</b> to set.
     */
    @JsProperty(name = "businessContextElement", namespace = "TDefinitions")
    public final native void setBusinessContextElement(JsArrayLike<JSITBusinessContextElement> businessContextElementParam);

    /**
     * Getter for <b>dmndi</b>
     * 
     * @return
     *      <b>dmndi</<b>
     */
    @JsProperty(name = "dmndi", namespace = "TDefinitions")
    public final native JSIDMNDI getDMNDI();

    /**
     * Setter for <b>dmndi</b>
     * 
     * @param dmndiParam
     *      <b>dmndi</b> to set.
     */
    @JsProperty(name = "dmndi", namespace = "TDefinitions")
    public final native void setDMNDI(JSIDMNDI dmndiParam);

    /**
     * Getter for <b>expressionLanguage</b>
     * 
     * @return
     *      <b>expressionLanguage</<b>
     */
    @JsProperty(name = "expressionLanguage", namespace = "TDefinitions")
    public final native String getExpressionLanguage();

    /**
     * Setter for <b>expressionLanguage</b>
     * 
     * @param expressionLanguageParam
     *      <b>expressionLanguage</b> to set.
     */
    @JsProperty(name = "expressionLanguage", namespace = "TDefinitions")
    public final native void setExpressionLanguage(String expressionLanguageParam);

    /**
     * Getter for <b>typeLanguage</b>
     * 
     * @return
     *      <b>typeLanguage</<b>
     */
    @JsProperty(name = "typeLanguage", namespace = "TDefinitions")
    public final native String getTypeLanguage();

    /**
     * Setter for <b>typeLanguage</b>
     * 
     * @param typeLanguageParam
     *      <b>typeLanguage</b> to set.
     */
    @JsProperty(name = "typeLanguage", namespace = "TDefinitions")
    public final native void setTypeLanguage(String typeLanguageParam);

    /**
     * Getter for <b>namespace</b>
     * 
     * @return
     *      <b>namespace</<b>
     */
    @JsProperty(name = "namespace", namespace = "TDefinitions")
    public final native String getNamespace();

    /**
     * Setter for <b>namespace</b>
     * 
     * @param namespaceParam
     *      <b>namespace</b> to set.
     */
    @JsProperty(name = "namespace", namespace = "TDefinitions")
    public final native void setNamespace(String namespaceParam);

    /**
     * Getter for <b>exporter</b>
     * 
     * @return
     *      <b>exporter</<b>
     */
    @JsProperty(name = "exporter", namespace = "TDefinitions")
    public final native String getExporter();

    /**
     * Setter for <b>exporter</b>
     * 
     * @param exporterParam
     *      <b>exporter</b> to set.
     */
    @JsProperty(name = "exporter", namespace = "TDefinitions")
    public final native void setExporter(String exporterParam);

    /**
     * Getter for <b>exporterVersion</b>
     * 
     * @return
     *      <b>exporterVersion</<b>
     */
    @JsProperty(name = "exporterVersion", namespace = "TDefinitions")
    public final native String getExporterVersion();

    /**
     * Setter for <b>exporterVersion</b>
     * 
     * @param exporterVersionParam
     *      <b>exporterVersion</b> to set.
     */
    @JsProperty(name = "exporterVersion", namespace = "TDefinitions")
    public final native void setExporterVersion(String exporterVersionParam);

}
