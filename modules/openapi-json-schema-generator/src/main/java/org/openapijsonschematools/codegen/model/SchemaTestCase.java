package org.openapijsonschematools.codegen.model;

public class SchemaTestCase {
    public final String description;
    public final EnumValue data;
    // true means the test case should pass, false means it should fail
    public final boolean valid;

    public SchemaTestCase(String description, EnumValue data, boolean valid) {
        this.description = description;
        this.data = data;
        this.valid = valid;
    }
}
