package org.openapijsonschematools.client.schemas.validation;

import java.util.List;

public class AllOfValidator implements KeywordValidator {
    public final List<Class<? extends JsonSchema>> allOf;

    public AllOfValidator(List<Class<? extends JsonSchema>> allOf) {
        this.allOf = allOf;
    }

    @Override
    public Object getConstraint() {
        return allOf;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        for(Class<? extends JsonSchema> allOfClass: allOf) {
            JsonSchema allOfSchema = JsonSchemaFactory.getInstance(allOfClass);
            PathToSchemasMap otherPathToSchemas = allOfSchema.validate(arg, validationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }


}
