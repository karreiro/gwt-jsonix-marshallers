
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TAssociation</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TAssociation", isNative = true)
public class JSITAssociation
    extends JSITArtifact
{

    @JsOverlay
    public final static String TYPE = "DMN12.TAssociation";

    @JsOverlay
    public static JSITAssociation newJSITAssociationInstance(final Class<JSITAssociation> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITAssociation(final Object instance) {
        return "DMN12.TAssociation".equals(JsUtils.getTypeName(instance));
    }

    /**
     * Getter for <b>sourceRef</b>
     * 
     * @return
     *      <b>sourceRef</<b>
     */
    @JsProperty(name = "sourceRef", namespace = "TAssociation")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getSourceRef();

    /**
     * Setter for <b>sourceRef</b>
     * 
     * @param sourceRefParam
     *      <b>sourceRef</b> to set.
     */
    @JsProperty(name = "sourceRef", namespace = "TAssociation")
    public final native void setSourceRef(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference sourceRefParam);

    /**
     * Getter for <b>targetRef</b>
     * 
     * @return
     *      <b>targetRef</<b>
     */
    @JsProperty(name = "targetRef", namespace = "TAssociation")
    public final native org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference getTargetRef();

    /**
     * Setter for <b>targetRef</b>
     * 
     * @param targetRefParam
     *      <b>targetRef</b> to set.
     */
    @JsProperty(name = "targetRef", namespace = "TAssociation")
    public final native void setTargetRef(org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.JSITDMNElementReference targetRefParam);

    /**
     * Getter for <b>associationDirection</b>
     * 
     * @return
     *      <b>associationDirection</<b>
     */
    @JsProperty(name = "associationDirection", namespace = "TAssociation")
    public final native JSITAssociationDirection getAssociationDirection();

    /**
     * Setter for <b>associationDirection</b>
     * 
     * @param associationDirectionParam
     *      <b>associationDirection</b> to set.
     */
    @JsProperty(name = "associationDirection", namespace = "TAssociation")
    public final native void setAssociationDirection(JSITAssociationDirection associationDirectionParam);

}
