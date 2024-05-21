package unit_test_api.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class MaxcontainsWithoutContainsIsIgnoredTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

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
