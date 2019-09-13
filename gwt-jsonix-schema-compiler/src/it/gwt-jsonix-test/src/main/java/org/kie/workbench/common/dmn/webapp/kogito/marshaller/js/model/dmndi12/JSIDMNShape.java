
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmndi12;

import javax.xml.namespace.QName;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIShape;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>DMNShape</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "DMNShape", isNative = true)
public class JSIDMNShape
    extends JSIShape
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNShape";

    @JsOverlay
    public static JSIDMNShape newJSIDMNShapeInstance(final Class<JSIDMNShape> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIDMNShape(final Object instance) {
        return "DMNDI12.DMNShape".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>dmnLabel</b>
     * 
     * @return
     *      <b>dmnLabel</<b>
     */
    @JsProperty(name = "dmnLabel", namespace = "DMNShape")
    public final native JSIDMNLabel getDMNLabel();

    /**
     * Setter for <b>dmnLabel</b>
     * 
     * @param dmnLabelParam
     *      <b>dmnLabel</b> to set.
     */
    @JsProperty(name = "dmnLabel", namespace = "DMNShape")
    public final native void setDMNLabel(JSIDMNLabel dmnLabelParam);

    /**
     * Getter for <b>dmnDecisionServiceDividerLine</b>
     * 
     * @return
     *      <b>dmnDecisionServiceDividerLine</<b>
     */
    @JsProperty(name = "dmnDecisionServiceDividerLine", namespace = "DMNShape")
    public final native JSIDMNDecisionServiceDividerLine getDMNDecisionServiceDividerLine();

    /**
     * Setter for <b>dmnDecisionServiceDividerLine</b>
     * 
     * @param dmnDecisionServiceDividerLineParam
     *      <b>dmnDecisionServiceDividerLine</b> to set.
     */
    @JsProperty(name = "dmnDecisionServiceDividerLine", namespace = "DMNShape")
    public final native void setDMNDecisionServiceDividerLine(JSIDMNDecisionServiceDividerLine dmnDecisionServiceDividerLineParam);

    /**
     * Getter for <b>dmnElementRef</b>
     * 
     * @return
     *      <b>dmnElementRef</<b>
     */
    @JsProperty(name = "dmnElementRef", namespace = "DMNShape")
    public final native QName getDmnElementRef();

    /**
     * Setter for <b>dmnElementRef</b>
     * 
     * @param dmnElementRefParam
     *      <b>dmnElementRef</b> to set.
     */
    @JsProperty(name = "dmnElementRef", namespace = "DMNShape")
    public final native void setDmnElementRef(QName dmnElementRefParam);

    /**
     * Getter for <b>isListedInputData</b>
     * 
     * @return
     *      <b>isListedInputData</<b>
     */
    @JsProperty(name = "isListedInputData", namespace = "DMNShape")
    public final native boolean getIsListedInputData();

    /**
     * Setter for <b>isListedInputData</b>
     * 
     * @param isListedInputDataParam
     *      <b>isListedInputData</b> to set.
     */
    @JsProperty(name = "isListedInputData", namespace = "DMNShape")
    public final native void setIsListedInputData(boolean isListedInputDataParam);

    /**
     * Getter for <b>isCollapsed</b>
     * 
     * @return
     *      <b>isCollapsed</<b>
     */
    @JsProperty(name = "isCollapsed", namespace = "DMNShape")
    public final native boolean getIsCollapsed();

    /**
     * Setter for <b>isCollapsed</b>
     * 
     * @param isCollapsedParam
     *      <b>isCollapsed</b> to set.
     */
    @JsProperty(name = "isCollapsed", namespace = "DMNShape")
    public final native void setIsCollapsed(boolean isCollapsedParam);

}
