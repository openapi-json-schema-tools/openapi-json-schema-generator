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

public class MincontainsWithoutContainsIsIgnoredTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testOneItemValidAgainstLoneMincontainsPasses() throws ValidationException {
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
    public void testZeroItemsStillValidAgainstLoneMincontainsPasses() throws ValidationException {
        // zero items still valid against lone minContains
        final var schema = MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }
}
