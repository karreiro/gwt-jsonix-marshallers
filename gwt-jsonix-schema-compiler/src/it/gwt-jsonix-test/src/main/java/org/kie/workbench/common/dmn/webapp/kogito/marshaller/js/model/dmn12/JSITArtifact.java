
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.mapper.JsUtils;


/**
 * JSInterop adapter for <code>TArtifact</code>
 * 
 */
@JsType(namespace = JsPackage.GLOBAL, name = "TArtifact", isNative = true)
public class JSITArtifact
    extends JSITDMNElement
{

    @JsOverlay
    public final static String TYPE = "DMN12.TArtifact";

    @JsOverlay
    public static JSITArtifact newJSITArtifactInstance(final Class<JSITArtifact> klass) {
        return JsUtils.newInstance(klass);
    }

    @JsOverlay
    public static Boolean instanceOfJSITArtifact(final Object instance) {
        return "DMN12.TArtifact".equals(JsUtils.getTypeName(instance));
    }

}
