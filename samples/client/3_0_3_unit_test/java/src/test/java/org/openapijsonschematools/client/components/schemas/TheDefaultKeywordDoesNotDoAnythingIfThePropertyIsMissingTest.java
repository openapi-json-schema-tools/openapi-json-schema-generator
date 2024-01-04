package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapMaker;

import java.util.AbstractMap;

public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMissingPropertiesAreNotFilledInWithTheDefaultPasses() {
        // missing properties are not filled in with the default
        final var schema = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance();
        schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAnExplicitPropertyValueIsCheckedAgainstMaximumPassingPasses() {
        // an explicit property value is checked against maximum (passing)
        final var schema = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance();
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
        final var schema = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance();
        try {
            schema.validate(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "alpha",
                        5
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
