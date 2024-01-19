package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NotValidator implements KeywordValidator {
    public final Class<? extends JsonSchema> not;

    public NotValidator(Class<? extends JsonSchema> not) {
        this.not = not;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas,
        @Nullable PathToSchemasMap patternPropertiesPathToSchemas,
        @Nullable PathToSchemasMap ifPathToSchemas
    ) {
        PathToSchemasMap pathToSchemas;
        try {
            JsonSchema notSchema = JsonSchemaFactory.getInstance(not);
            pathToSchemas = JsonSchema.validate(notSchema, arg, validationMetadata);
        } catch (ValidationException e) {
            return null;
        }
        if (!pathToSchemas.isEmpty()) {
            throw new ValidationException(
                    "Invalid value "+arg+" was passed in to "+schema.getClass()+". "+
                            "Value is invalid because it is disallowed by not "+not
            );
        }
        return null;
    }
}
