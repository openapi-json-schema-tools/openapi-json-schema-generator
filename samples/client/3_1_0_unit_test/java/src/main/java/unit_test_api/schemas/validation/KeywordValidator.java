package unit_test_api.schemas.validation;

import unit_test_api.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

@FunctionalInterface
public interface KeywordValidator {
    @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException;
}