
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmndi12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIEdge;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>DMNDecisionServiceDividerLine</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "DMNDecisionServiceDividerLine", isNative = true)
public class JSIDMNDecisionServiceDividerLine
    extends JSIEdge
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNDecisionServiceDividerLine";

    @JsOverlay
    public static JSIDMNDecisionServiceDividerLine newJSIDMNDecisionServiceDividerLineInstance(final Class<JSIDMNDecisionServiceDividerLine> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIDMNDecisionServiceDividerLine(final Object instance) {
        return "DMNDI12.DMNDecisionServiceDividerLine".equals(JsUtils.getTypeName(instance));
    }

}
