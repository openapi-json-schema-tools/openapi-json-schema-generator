package org.openapijsonschematools.codegen.model;

import org.openapijsonschematools.codegen.model.ObjectWithTypeBooleans;

public class SchemaTestCase {
    public String description;
    public ObjectWithTypeBooleans data;
    // true means the test case should pass, false means it should fail
    public boolean valid;

    public SchemaTestCase(String description, ObjectWithTypeBooleans data, boolean valid) {
        this.description = description;
        this.data = data;
        this.valid = valid;
    }
}
