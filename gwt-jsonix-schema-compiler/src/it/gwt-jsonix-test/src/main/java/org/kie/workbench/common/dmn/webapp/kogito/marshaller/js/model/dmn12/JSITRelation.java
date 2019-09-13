
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import java.util.List;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsArrayLike;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TRelation</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TRelation", isNative = true)
public class JSITRelation
    extends JSITExpression
{

    @JsOverlay
    public final static String TYPE = "DMN12.TRelation";

    @JsOverlay
    public static JSITRelation newJSITRelationInstance(final Class<JSITRelation> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITRelation(final Object instance) {
        return "DMN12.TRelation".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>column</b>
     * 
     * @return
     *      <b>column</<b>
     */
    @JsProperty(name = "column", namespace = "TRelation")
    public final native JsArrayLike<JSITInformationItem> getNativeColumn();

    /**
     * Getter for <b>column</b>
     * 
     * @return
     *      <b>column</<b>
     */
    @JsOverlay
    public final List<JSITInformationItem> getColumn() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeColumn()));
    }

    /**
     * Setter for <b>column</b>
     * 
     * @param columnParam
     *      <b>column</b> to set.
     */
    @JsProperty(name = "column", namespace = "TRelation")
    public final native void setColumn(JsArrayLike<JSITInformationItem> columnParam);

    /**
     * Getter for <b>row</b>
     * 
     * @return
     *      <b>row</<b>
     */
    @JsProperty(name = "row", namespace = "TRelation")
    public final native JsArrayLike<JSITList> getNativeRow();

    /**
     * Getter for <b>row</b>
     * 
     * @return
     *      <b>row</<b>
     */
    @JsOverlay
    public final List<JSITList> getRow() {
        return JsUtils.toList(JsUtils.getUnwrappedElementsArray(getNativeRow()));
    }

    /**
     * Setter for <b>row</b>
     * 
     * @param rowParam
     *      <b>row</b> to set.
     */
    @JsProperty(name = "row", namespace = "TRelation")
    public final native void setRow(JsArrayLike<JSITList> rowParam);

}
