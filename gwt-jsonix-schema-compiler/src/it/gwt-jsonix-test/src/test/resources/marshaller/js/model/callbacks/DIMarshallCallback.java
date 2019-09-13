
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.callbacks;

import jsinterop.annotations.JsFunction;


/**
 * Marshaller callback for <code>DI</code>
 * 
 */
@JsFunction
public interface DIMarshallCallback {


    void callEvent(String xmlString);

}
