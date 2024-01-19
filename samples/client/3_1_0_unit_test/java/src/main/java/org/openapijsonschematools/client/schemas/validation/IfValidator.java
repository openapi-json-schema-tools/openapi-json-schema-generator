package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class IfValidator implements KeywordValidator {
    public final Class<? extends JsonSchema> ifSchema;

    public IfValidator(Class<? extends JsonSchema> ifSchema) {
        this.ifSchema = ifSchema;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        if (data.ifPathToSchemas() == null) {
            throw new ValidationException("Invalid type for ifPathToSchemas");
        }
        /*
        if is false use case
        ifPathToSchemas == {}
        no need to add any data to pathToSchemas

        if true, then true -> true for whole schema
        so validate_then will add ifPathToSchemas data to pathToSchemas
        */
        return null;
    }

    public PathToSchemasMap getIfPathToSchemas(
        @Nullable Object arg,
        ValidationMetadata validationMetadata
    ) {
        JsonSchema ifSchemaInstance = JsonSchemaFactory.getInstance(ifSchema);
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        try {
            var otherPathToSchemas = JsonSchema.validate(ifSchemaInstance, arg, validationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        } catch (ValidationException | InvalidTypeException ignored) {}
        return pathToSchemas;
    }
}
