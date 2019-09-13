
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.callbacks;

import jsinterop.annotations.JsFunction;


/**
 * Marshaller callback for <code>DC</code>
 * 
 */
@JsFunction
public interface DCMarshallCallback {


    void callEvent(String xmlString);

}
