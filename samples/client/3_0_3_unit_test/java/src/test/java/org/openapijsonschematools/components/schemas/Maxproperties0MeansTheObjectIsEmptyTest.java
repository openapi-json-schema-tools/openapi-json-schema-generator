package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class Maxproperties0MeansTheObjectIsEmptyTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testOnePropertyIsInvalidFails() {
        // one property is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1.class,
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                )
            ),
            configuration
        ));
    }

    @Test
    public void testNoPropertiesIsValidPasses() {
        // no properties is valid
        Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1.validate(
            Map.ofEntries(
            ),
            configuration
        );
    }
}
