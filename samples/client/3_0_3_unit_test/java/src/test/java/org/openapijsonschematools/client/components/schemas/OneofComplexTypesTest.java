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

public class OneofComplexTypesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final OneofComplexTypes.OneofComplexTypes1 schema = JsonSchemaFactory.getInstance(
        OneofComplexTypes.OneofComplexTypes1.class
    );

    @Test
    public void testSecondOneofValidComplexPasses() {
        // second oneOf valid (complex)
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "baz"
                )
            ),
            configuration
        );
    }

    @Test
    public void testBothOneofValidComplexFails() {
        // both oneOf valid (complex)
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "baz"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        ));
    }

    @Test
    public void testFirstOneofValidComplexPasses() {
        // first oneOf valid (complex)
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testNeitherOneofValidComplexFails() {
        // neither oneOf valid (complex)
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    2
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "quux"
                )
            ),
            configuration
        ));
    }
}
