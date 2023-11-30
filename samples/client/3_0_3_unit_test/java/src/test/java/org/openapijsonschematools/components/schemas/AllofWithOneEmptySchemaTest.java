package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class AllofWithOneEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAnyDataIsValidPasses() {
        // any data is valid
        AllofWithOneEmptySchema.AllofWithOneEmptySchema1.validate(
            1,
            configuration
        );
    }
}
