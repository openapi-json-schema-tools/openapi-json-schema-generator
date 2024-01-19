package org.openapijsonschematools.client.schemas.validation;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public class AllOfValidator implements KeywordValidator {
    public final List<Class<? extends JsonSchema>> allOf;

    public AllOfValidator(List<Class<? extends JsonSchema>> allOf) {
        this.allOf = allOf;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        for(Class<? extends JsonSchema> allOfClass: allOf) {
            JsonSchema allOfSchema = JsonSchemaFactory.getInstance(allOfClass);
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(allOfSchema, data.arg(), data.validationMetadata());
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}
