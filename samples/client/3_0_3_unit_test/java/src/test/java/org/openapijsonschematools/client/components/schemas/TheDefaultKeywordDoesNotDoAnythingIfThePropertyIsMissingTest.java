package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testMissingPropertiesAreNotFilledInWithTheDefaultPasses() throws ValidationException {
        // missing properties are not filled in with the default
        final var schema = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAnExplicitPropertyValueIsCheckedAgainstMaximumPassingPasses() throws ValidationException {
        // an explicit property value is checked against maximum (passing)
        final var schema = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
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
        final var schema = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "alpha",
                        5
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
