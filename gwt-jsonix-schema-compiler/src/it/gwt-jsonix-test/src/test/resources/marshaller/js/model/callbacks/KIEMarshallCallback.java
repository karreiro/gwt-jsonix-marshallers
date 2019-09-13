
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.callbacks;

import jsinterop.annotations.JsFunction;


/**
 * Marshaller callback for <code>KIE</code>
 * 
 */
@JsFunction
public interface KIEMarshallCallback {


    void callEvent(String xmlString);

}
