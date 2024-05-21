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

public class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequenceTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testInvalidRedirectsToElseAndFailsFails() {
        // invalid redirects to else and fails
        final var schema = IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1.getInstance();
        try {
            schema.validate(
                "invalid",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testYesRedirectsToThenAndPassesPasses() throws ValidationException {
        // yes redirects to then and passes
        final var schema = IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1.getInstance();
        schema.validate(
            "yes",
            configuration
        );
    }

    @Test
    public void testOtherRedirectsToElseAndPassesPasses() throws ValidationException {
        // other redirects to else and passes
        final var schema = IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1.getInstance();
        schema.validate(
            "other",
            configuration
        );
    }

    @Test
    public void testNoRedirectsToThenAndFailsFails() {
        // no redirects to then and fails
        final var schema = IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1.getInstance();
        try {
            schema.validate(
                "no",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
