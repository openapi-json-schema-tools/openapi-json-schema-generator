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

public class ValidateAgainstCorrectBranchThenVsElseTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testValidThroughThenPasses() throws ValidationException {
        // valid through then
        final var schema = ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1.getInstance();
        schema.validate(
            -1,
            configuration
        );
    }

    @Test
    public void testInvalidThroughThenFails() {
        // invalid through then
        final var schema = ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1.getInstance();
        try {
            schema.validate(
                -100,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testValidThroughElsePasses() throws ValidationException {
        // valid through else
        final var schema = ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1.getInstance();
        schema.validate(
            4,
            configuration
        );
    }

    @Test
    public void testInvalidThroughElseFails() {
        // invalid through else
        final var schema = ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1.getInstance();
        try {
            schema.validate(
                3,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
