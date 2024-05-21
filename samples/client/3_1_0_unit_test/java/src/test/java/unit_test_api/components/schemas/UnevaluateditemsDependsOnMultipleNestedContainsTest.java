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

public class UnevaluateditemsDependsOnMultipleNestedContainsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void test7NotEvaluatedFailsUnevaluateditemsFails() {
        // 7 not evaluated, fails unevaluatedItems
        final var schema = UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    2,
                    3,
                    4,
                    7,
                    8
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void test5NotEvaluatedPassesUnevaluateditemsPasses() throws ValidationException {
        // 5 not evaluated, passes unevaluatedItems
        final var schema = UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1.getInstance();
        schema.validate(
            Arrays.asList(
                2,
                3,
                4,
                5,
                6
            ),
            configuration
        );
    }
}
