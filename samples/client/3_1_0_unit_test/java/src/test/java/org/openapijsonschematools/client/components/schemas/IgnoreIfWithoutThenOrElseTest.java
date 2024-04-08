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

public class IgnoreIfWithoutThenOrElseTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testValidWhenInvalidAgainstLoneIfPasses() throws ValidationException {
        // valid when invalid against lone if
        final var schema = IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1.getInstance();
        schema.validate(
            "hello",
            configuration
        );
    }

    @Test
    public void testValidWhenValidAgainstLoneIfPasses() throws ValidationException {
        // valid when valid against lone if
        final var schema = IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1.getInstance();
        schema.validate(
            0,
            configuration
        );
    }
}
