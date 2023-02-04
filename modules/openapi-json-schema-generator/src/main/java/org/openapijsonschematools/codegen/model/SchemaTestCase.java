package org.openapijsonschematools.codegen.model;

public class SchemaTestCase {
    public String description;
    public ObjectWithType data;
    // true means the test case should pass, false means it should fail
    public boolean valid;

    public SchemaTestCase(String description, ObjectWithType data, boolean valid) {
        this.description = description;
        this.data = data;
        this.valid = valid;
    }
}
