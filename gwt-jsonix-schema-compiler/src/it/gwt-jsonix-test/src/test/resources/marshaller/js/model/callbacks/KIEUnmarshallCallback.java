
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.callbacks;

import jsinterop.annotations.JsFunction;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.kie.KIE;


/**
 * Unmarshaller callback for <code>KIE</code>
 * 
 */
@JsFunction
public interface KIEUnmarshallCallback {


    void callEvent(KIE kIE);

}
