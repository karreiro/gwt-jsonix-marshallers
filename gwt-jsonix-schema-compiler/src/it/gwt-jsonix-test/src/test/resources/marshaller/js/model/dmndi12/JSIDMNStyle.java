
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmndi12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.JSIStyle;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>DMNStyle</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "DMNStyle", isNative = true)
public class JSIDMNStyle
    extends JSIStyle
{

    @JsOverlay
    public final static String TYPE = "DMNDI12.DMNStyle";

    @JsOverlay
    public static JSIDMNStyle newJSIDMNStyleInstance(final Class<JSIDMNStyle> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSIDMNStyle(final Object instance) {
        return "DMNDI12.DMNStyle".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>fillColor</b>
     * 
     * @return
     *      <b>fillColor</<b>
     */
    @JsProperty(name = "fillColor", namespace = "DMNStyle")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIColor getFillColor();

    /**
     * Setter for <b>fillColor</b>
     * 
     * @param fillColorParam
     *      <b>fillColor</b> to set.
     */
    @JsProperty(name = "fillColor", namespace = "DMNStyle")
    public final native void setFillColor(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIColor fillColorParam);

    /**
     * Getter for <b>strokeColor</b>
     * 
     * @return
     *      <b>strokeColor</<b>
     */
    @JsProperty(name = "strokeColor", namespace = "DMNStyle")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIColor getStrokeColor();

    /**
     * Setter for <b>strokeColor</b>
     * 
     * @param strokeColorParam
     *      <b>strokeColor</b> to set.
     */
    @JsProperty(name = "strokeColor", namespace = "DMNStyle")
    public final native void setStrokeColor(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIColor strokeColorParam);

    /**
     * Getter for <b>fontColor</b>
     * 
     * @return
     *      <b>fontColor</<b>
     */
    @JsProperty(name = "fontColor", namespace = "DMNStyle")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIColor getFontColor();

    /**
     * Setter for <b>fontColor</b>
     * 
     * @param fontColorParam
     *      <b>fontColor</b> to set.
     */
    @JsProperty(name = "fontColor", namespace = "DMNStyle")
    public final native void setFontColor(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIColor fontColorParam);

    /**
     * Getter for <b>fontFamily</b>
     * 
     * @return
     *      <b>fontFamily</<b>
     */
    @JsProperty(name = "fontFamily", namespace = "DMNStyle")
    public final native String getFontFamily();

    /**
     * Setter for <b>fontFamily</b>
     * 
     * @param fontFamilyParam
     *      <b>fontFamily</b> to set.
     */
    @JsProperty(name = "fontFamily", namespace = "DMNStyle")
    public final native void setFontFamily(String fontFamilyParam);

    /**
     * Getter for <b>fontSize</b>
     * 
     * @return
     *      <b>fontSize</<b>
     */
    @JsProperty(name = "fontSize", namespace = "DMNStyle")
    public final native double getFontSize();

    /**
     * Setter for <b>fontSize</b>
     * 
     * @param fontSizeParam
     *      <b>fontSize</b> to set.
     */
    @JsProperty(name = "fontSize", namespace = "DMNStyle")
    public final native void setFontSize(double fontSizeParam);

    /**
     * Getter for <b>fontItalic</b>
     * 
     * @return
     *      <b>fontItalic</<b>
     */
    @JsProperty(name = "fontItalic", namespace = "DMNStyle")
    public final native boolean getFontItalic();

    /**
     * Setter for <b>fontItalic</b>
     * 
     * @param fontItalicParam
     *      <b>fontItalic</b> to set.
     */
    @JsProperty(name = "fontItalic", namespace = "DMNStyle")
    public final native void setFontItalic(boolean fontItalicParam);

    /**
     * Getter for <b>fontBold</b>
     * 
     * @return
     *      <b>fontBold</<b>
     */
    @JsProperty(name = "fontBold", namespace = "DMNStyle")
    public final native boolean getFontBold();

    /**
     * Setter for <b>fontBold</b>
     * 
     * @param fontBoldParam
     *      <b>fontBold</b> to set.
     */
    @JsProperty(name = "fontBold", namespace = "DMNStyle")
    public final native void setFontBold(boolean fontBoldParam);

    /**
     * Getter for <b>fontUnderline</b>
     * 
     * @return
     *      <b>fontUnderline</<b>
     */
    @JsProperty(name = "fontUnderline", namespace = "DMNStyle")
    public final native boolean getFontUnderline();

    /**
     * Setter for <b>fontUnderline</b>
     * 
     * @param fontUnderlineParam
     *      <b>fontUnderline</b> to set.
     */
    @JsProperty(name = "fontUnderline", namespace = "DMNStyle")
    public final native void setFontUnderline(boolean fontUnderlineParam);

    /**
     * Getter for <b>fontStrikeThrough</b>
     * 
     * @return
     *      <b>fontStrikeThrough</<b>
     */
    @JsProperty(name = "fontStrikeThrough", namespace = "DMNStyle")
    public final native boolean getFontStrikeThrough();

    /**
     * Setter for <b>fontStrikeThrough</b>
     * 
     * @param fontStrikeThroughParam
     *      <b>fontStrikeThrough</b> to set.
     */
    @JsProperty(name = "fontStrikeThrough", namespace = "DMNStyle")
    public final native void setFontStrikeThrough(boolean fontStrikeThroughParam);

    /**
     * Getter for <b>labelHorizontalAlignement</b>
     * 
     * @return
     *      <b>labelHorizontalAlignement</<b>
     */
    @JsProperty(name = "labelHorizontalAlignement", namespace = "DMNStyle")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIAlignmentKind getLabelHorizontalAlignement();

    /**
     * Setter for <b>labelHorizontalAlignement</b>
     * 
     * @param labelHorizontalAlignementParam
     *      <b>labelHorizontalAlignement</b> to set.
     */
    @JsProperty(name = "labelHorizontalAlignement", namespace = "DMNStyle")
    public final native void setLabelHorizontalAlignement(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIAlignmentKind labelHorizontalAlignementParam);

    /**
     * Getter for <b>labelVerticalAlignment</b>
     * 
     * @return
     *      <b>labelVerticalAlignment</<b>
     */
    @JsProperty(name = "labelVerticalAlignment", namespace = "DMNStyle")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIAlignmentKind getLabelVerticalAlignment();

    /**
     * Setter for <b>labelVerticalAlignment</b>
     * 
     * @param labelVerticalAlignmentParam
     *      <b>labelVerticalAlignment</b> to set.
     */
    @JsProperty(name = "labelVerticalAlignment", namespace = "DMNStyle")
    public final native void setLabelVerticalAlignment(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.JSIAlignmentKind labelVerticalAlignmentParam);

}
