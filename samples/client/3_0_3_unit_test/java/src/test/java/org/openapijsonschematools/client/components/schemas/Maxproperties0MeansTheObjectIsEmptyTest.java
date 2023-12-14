package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class Maxproperties0MeansTheObjectIsEmptyTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1 schema = (
        Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testOnePropertyIsInvalidFails() {
        // one property is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                )
            ),
            validationMetadata
        ));
    }

    @Test
    public void testNoPropertiesIsValidPasses() {
        // no properties is valid
        schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }
}
