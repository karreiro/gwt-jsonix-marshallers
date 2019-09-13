
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TFunctionDefinition</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TFunctionDefinition", isNative = true)
public class JSITFunctionDefinition
    extends org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TFunctionDefinition";

    @JsOverlay
    public static JSITFunctionDefinition newJSITFunctionDefinitionInstance(final Class<JSITFunctionDefinition> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITFunctionDefinition(final Object instance) {
        return "DMN12.TFunctionDefinition".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>formalParameter</b>
     * 
     * @return
     *      <b>formalParameter</<b>
     */
    @JsProperty(name = "formalParameter", namespace = "TFunctionDefinition")
    public final native JsArrayLike<JSITInformationItem> getNativeFormalParameter();

    /**
     * Getter for <b>formalParameter</b>
     * 
     * @return
     *      <b>formalParameter</<b>
     */
    @JsOverlay
    public final List<JSITInformationItem> getFormalParameter() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeFormalParameter()));
    }

    /**
     * Setter for <b>formalParameter</b>
     * 
     * @param formalParameterParam
     *      <b>formalParameter</b> to set.
     */
    @JsProperty(name = "formalParameter", namespace = "TFunctionDefinition")
    public final native void setFormalParameter(JsArrayLike<JSITInformationItem> formalParameterParam);

    /**
     * Getter for <b>expression</b>
     * 
     * @return
     *      <b>expression</<b>
     */
    @JsProperty(name = "expression", namespace = "TFunctionDefinition")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITExpression getExpression();

    /**
     * Setter for <b>expression</b>
     * 
     * @param expressionParam
     *      <b>expression</b> to set.
     */
    @JsProperty(name = "expression", namespace = "TFunctionDefinition")
    public final native void setExpression(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITExpression expressionParam);

    /**
     * Getter for <b>kind</b>
     * 
     * @return
     *      <b>kind</<b>
     */
    @JsProperty(name = "kind", namespace = "TFunctionDefinition")
    public final native JSITFunctionKind getKind();

    /**
     * Setter for <b>kind</b>
     * 
     * @param kindParam
     *      <b>kind</b> to set.
     */
    @JsProperty(name = "kind", namespace = "TFunctionDefinition")
    public final native void setKind(JSITFunctionKind kindParam);

}
