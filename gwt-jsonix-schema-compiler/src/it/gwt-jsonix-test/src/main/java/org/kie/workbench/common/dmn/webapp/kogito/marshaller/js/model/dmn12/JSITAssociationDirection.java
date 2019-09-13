
package org.kie.workbench.common.dmn.webapp.kogito.marshaller.js.model.dmn12;

import jsinterop.annotations.JsType;


/**
 * JSInterop adapter for <code>TAssociationDirection</code>
 * 
 */
@JsType(name = "TAssociationDirection")
public enum JSITAssociationDirection {

    NONE("None"),
    ONE("One"),
    BOTH("Both");
    private final String value;

    JSITAssociationDirection(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
