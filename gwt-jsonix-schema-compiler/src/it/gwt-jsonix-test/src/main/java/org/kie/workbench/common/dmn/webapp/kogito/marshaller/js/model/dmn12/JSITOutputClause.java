
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TOutputClause</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TOutputClause", isNative = true)
public class JSITOutputClause
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TOutputClause";

    @JsOverlay
    public static JSITOutputClause newJSITOutputClauseInstance(final Class<JSITOutputClause> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITOutputClause(final Object instance) {
        return "DMN12.TOutputClause".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>outputValues</b>
     * 
     * @return
     *      <b>outputValues</<b>
     */
    @JsProperty(name = "outputValues", namespace = "TOutputClause")
    public final native JSITUnaryTests getOutputValues();

    /**
     * Setter for <b>outputValues</b>
     * 
     * @param outputValuesParam
     *      <b>outputValues</b> to set.
     */
    @JsProperty(name = "outputValues", namespace = "TOutputClause")
    public final native void setOutputValues(JSITUnaryTests outputValuesParam);

    /**
     * Getter for <b>defaultOutputEntry</b>
     * 
     * @return
     *      <b>defaultOutputEntry</<b>
     */
    @JsProperty(name = "defaultOutputEntry", namespace = "TOutputClause")
    public final native JSITLiteralExpression getDefaultOutputEntry();

    /**
     * Setter for <b>defaultOutputEntry</b>
     * 
     * @param defaultOutputEntryParam
     *      <b>defaultOutputEntry</b> to set.
     */
    @JsProperty(name = "defaultOutputEntry", namespace = "TOutputClause")
    public final native void setDefaultOutputEntry(JSITLiteralExpression defaultOutputEntryParam);

    /**
     * Getter for <b>name</b>
     * 
     * @return
     *      <b>name</<b>
     */
    @JsProperty(name = "name", namespace = "TOutputClause")
    public final native String getName();

    /**
     * Setter for <b>name</b>
     * 
     * @param nameParam
     *      <b>name</b> to set.
     */
    @JsProperty(name = "name", namespace = "TOutputClause")
    public final native void setName(String nameParam);

    /**
     * Getter for <b>typeRef</b>
     * 
     * @return
     *      <b>typeRef</<b>
     */
    @JsProperty(name = "typeRef", namespace = "TOutputClause")
    public final native String getTypeRef();

    /**
     * Setter for <b>typeRef</b>
     * 
     * @param typeRefParam
     *      <b>typeRef</b> to set.
     */
    @JsProperty(name = "typeRef", namespace = "TOutputClause")
    public final native void setTypeRef(String typeRefParam);

}
