package unit_test_api.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.exceptions.ValidationException;

public class AllOfValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var allOf = data.schema().allOf;
        if (allOf == null) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        for(Class<? extends JsonSchema<?>> allOfClass: allOf) {
            JsonSchema<?> allOfSchema = JsonSchemaFactory.getInstance(allOfClass);
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(allOfSchema, data.arg(), data.validationMetadata());
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}
