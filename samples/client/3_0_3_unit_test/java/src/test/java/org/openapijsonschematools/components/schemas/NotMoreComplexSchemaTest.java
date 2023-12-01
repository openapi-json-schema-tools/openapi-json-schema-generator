package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class NotMoreComplexSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testOtherMatchPasses() {
        // other match
        NotMoreComplexSchema.NotMoreComplexSchema1.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testMismatchFails() {
        // mismatch
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NotMoreComplexSchema.NotMoreComplexSchema1.class,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "bar"
                )
            ),
            configuration
        ));
    }

    @Test
    public void testMatchPasses() {
        // match
        NotMoreComplexSchema.NotMoreComplexSchema1.validate(
            1,
            configuration
        );
    }
}
