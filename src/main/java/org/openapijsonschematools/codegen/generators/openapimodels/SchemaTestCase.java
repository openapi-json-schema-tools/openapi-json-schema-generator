package org.openapijsonschematools.codegen.generators.openapimodels;

public class SchemaTestCase {
    public final CodegenText description;
    public final EnumValue data;
    // true means the test case should pass, false means it should fail
    public final boolean valid;

    public SchemaTestCase(CodegenText description, EnumValue data, boolean valid) {
        this.description = description;
        this.data = data;
        this.valid = valid;
    }
}
