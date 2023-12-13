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

public class AdditionalpropertiesCanExistByItselfTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1 schema = JsonSchemaFactory.getInstance(
        AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1.class
    );

    @Test
    public void testAnAdditionalValidPropertyIsValidPasses() {
        // an additional valid property is valid
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    true
                )
            ),
            configuration
        );
    }

    @Test
    public void testAnAdditionalInvalidPropertyIsInvalidFails() {
        // an additional invalid property is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                )
            ),
            configuration
        ));
    }
}
