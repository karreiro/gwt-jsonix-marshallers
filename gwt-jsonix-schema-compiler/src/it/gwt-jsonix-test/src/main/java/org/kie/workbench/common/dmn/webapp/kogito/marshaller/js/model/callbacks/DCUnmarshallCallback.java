
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.callbacks;

import jsinterop.annotations.JsFunction;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dc.DC;


/**
 * Unmarshaller callback for <code>DC</code>
 * 
 */
@JsFunction
public interface DCUnmarshallCallback {


    void callEvent(DC dC);

}
