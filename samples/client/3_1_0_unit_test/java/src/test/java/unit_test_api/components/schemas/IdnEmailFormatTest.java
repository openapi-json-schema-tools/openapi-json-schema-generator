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

public class IdnEmailFormatTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testAllStringFormatsIgnoreIntegersPasses() throws ValidationException {
        // all string formats ignore integers
        final var schema = IdnEmailFormat.IdnEmailFormat1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreNullsPasses() throws ValidationException {
        // all string formats ignore nulls
        final var schema = IdnEmailFormat.IdnEmailFormat1.getInstance();
        schema.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreObjectsPasses() throws ValidationException {
        // all string formats ignore objects
        final var schema = IdnEmailFormat.IdnEmailFormat1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreFloatsPasses() throws ValidationException {
        // all string formats ignore floats
        final var schema = IdnEmailFormat.IdnEmailFormat1.getInstance();
        schema.validate(
            13.7d,
            configuration
        );
    }

    @Test
    public void testInvalidIdnEmailStringIsOnlyAnAnnotationByDefaultPasses() throws ValidationException {
        // invalid idn-email string is only an annotation by default
        final var schema = IdnEmailFormat.IdnEmailFormat1.getInstance();
        schema.validate(
            "2962",
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreArraysPasses() throws ValidationException {
        // all string formats ignore arrays
        final var schema = IdnEmailFormat.IdnEmailFormat1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreBooleansPasses() throws ValidationException {
        // all string formats ignore booleans
        final var schema = IdnEmailFormat.IdnEmailFormat1.getInstance();
        schema.validate(
            false,
            configuration
        );
    }
}
