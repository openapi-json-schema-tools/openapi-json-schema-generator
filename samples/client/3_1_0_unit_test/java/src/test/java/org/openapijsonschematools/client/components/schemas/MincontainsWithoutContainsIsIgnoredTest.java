package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class MincontainsWithoutContainsIsIgnoredTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testOneItemValidAgainstLoneMincontainsPasses() {
        // one item valid against lone minContains
        final var schema = MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1.getInstance();
        schema.validate(
            Arrays.asList(
                1
            ),
            configuration
        );
    }

    @Test
    public void testZeroItemsStillValidAgainstLoneMincontainsPasses() {
        // zero items still valid against lone minContains
        final var schema = MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }
}
