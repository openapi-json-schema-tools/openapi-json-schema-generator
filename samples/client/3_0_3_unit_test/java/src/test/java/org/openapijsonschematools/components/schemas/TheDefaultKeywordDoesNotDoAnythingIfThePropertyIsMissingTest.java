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

public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMissingPropertiesAreNotFilledInWithTheDefaultPasses() {
        // missing properties are not filled in with the default
        TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAnExplicitPropertyValueIsCheckedAgainstMaximumPassingPasses() {
        // an explicit property value is checked against maximum (passing)
        TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.validate(
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
            TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.class,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "alpha",
                    5
                )
            ),
            configuration
        ));
    }
}
