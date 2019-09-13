
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TRuleAnnotationClause</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TRuleAnnotationClause", isNative = true)
public class JSITRuleAnnotationClause {

    @JsOverlay
    public final static String TYPE = "DMN12.TRuleAnnotationClause";

    @JsOverlay
    public static JSITRuleAnnotationClause newJSITRuleAnnotationClauseInstance(final Class<JSITRuleAnnotationClause> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITRuleAnnotationClause(final Object instance) {
        return "DMN12.TRuleAnnotationClause".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>TYPE_NAME</b>
     * 
     * @return
     *      <b>TYPE_NAME</<b>
     */
    @JsProperty(name = "TYPE_NAME", namespace = "TRuleAnnotationClause")
    public final native String getTYPE_NAME();

    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name", namespace = "TRuleAnnotationClause")
    public final native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param nameParam
     *      <b>name</b> to set.
     */
    @JsProperty(name = "name", namespace = "TRuleAnnotationClause")
    public final native void setName(String nameParam);

}
