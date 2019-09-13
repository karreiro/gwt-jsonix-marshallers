
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.callbacks;

import jsinterop.annotations.JsFunction;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmndi12.DMNDI12;


/**
 * Unmarshaller callback for <code>DMNDI12</code>
 * 
 */
@JsFunction
public interface DMNDI12UnmarshallCallback {


    void callEvent(DMNDI12 dMNDI12);

}
