
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.callbacks;

import jsinterop.annotations.JsFunction;
import org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.di.DI;


/**
 * Unmarshaller callback for <code>DI</code>
 * 
 */
@JsFunction
public interface DIUnmarshallCallback {


    void callEvent(DI dI);

}
