package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapBuilder;

import java.util.Arrays;
import java.util.AbstractMap;

public class ForbiddenPropertyTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testPropertyPresentFails() {
        // property present
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ForbiddenProperty.ForbiddenProperty1.class,
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            )),
            configuration
        ));
    }

    @Test
    public void testPropertyAbsentPasses() {
        // property absent
        ForbiddenProperty.ForbiddenProperty1.validate(
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "baz",
                    2
                )
            )),
            configuration
        );
    }
}
