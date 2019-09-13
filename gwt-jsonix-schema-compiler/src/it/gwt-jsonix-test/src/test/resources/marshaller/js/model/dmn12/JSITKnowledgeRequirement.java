
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TKnowledgeRequirement</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TKnowledgeRequirement", isNative = true)
public class JSITKnowledgeRequirement
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TKnowledgeRequirement";

    @JsOverlay
    public static JSITKnowledgeRequirement newJSITKnowledgeRequirementInstance(final Class<JSITKnowledgeRequirement> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITKnowledgeRequirement(final Object instance) {
        return "DMN12.TKnowledgeRequirement".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>requiredKnowledge</b>
     * 
     * @return
     *      <b>requiredKnowledge</<b>
     */
    @JsProperty(name = "requiredKnowledge", namespace = "TKnowledgeRequirement")
    public final native JSITDMNElementReference getRequiredKnowledge();

    /**
     * Setter for <b>requiredKnowledge</b>
     * 
     * @param requiredKnowledgeParam
     *      <b>requiredKnowledge</b> to set.
     */
    @JsProperty(name = "requiredKnowledge", namespace = "TKnowledgeRequirement")
    public final native void setRequiredKnowledge(JSITDMNElementReference requiredKnowledgeParam);

}
