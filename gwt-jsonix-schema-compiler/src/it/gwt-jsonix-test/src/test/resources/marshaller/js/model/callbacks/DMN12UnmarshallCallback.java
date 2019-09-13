
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.callbacks;

import jsinterop.annotations.JsFunction;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12.DMN12;


/**
 * Unmarshaller callback for <code>DMN12</code>
 * 
 */
@JsFunction
public interface DMN12UnmarshallCallback {


    void callEvent(DMN12 dMN12);

}
