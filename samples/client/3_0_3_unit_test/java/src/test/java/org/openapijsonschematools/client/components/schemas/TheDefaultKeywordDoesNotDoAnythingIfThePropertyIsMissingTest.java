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

public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1 schema = (
        TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testMissingPropertiesAreNotFilledInWithTheDefaultPasses() {
        // missing properties are not filled in with the default
        schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAnExplicitPropertyValueIsCheckedAgainstMaximumPassingPasses() {
        // an explicit property value is checked against maximum (passing)
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "alpha",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testAnExplicitPropertyValueIsCheckedAgainstMaximumFailingFails() {
        // an explicit property value is checked against maximum (failing)
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "alpha",
                    5
                )
            ),
            validationMetadata
        ));
    }
}
