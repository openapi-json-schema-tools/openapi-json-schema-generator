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

public class MaxcontainsWithoutContainsIsIgnoredTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testTwoItemsStillValidAgainstLoneMaxcontainsPasses() throws ValidationException {
        // two items still valid against lone maxContains
        final var schema = MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                2
            ),
            configuration
        );
    }

    @Test
    public void testOneItemValidAgainstLoneMaxcontainsPasses() throws ValidationException {
        // one item valid against lone maxContains
        final var schema = MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1.getInstance();
        schema.validate(
            Arrays.asList(
                1
            ),
            configuration
        );
    }
}
