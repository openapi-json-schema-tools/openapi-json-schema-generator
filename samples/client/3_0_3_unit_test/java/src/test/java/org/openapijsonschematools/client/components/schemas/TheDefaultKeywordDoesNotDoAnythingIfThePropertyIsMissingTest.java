package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1 schema = JsonSchemaFactory.getInstance(
        TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.class
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
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
