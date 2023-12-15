package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class AnyOfValidator implements KeywordValidator {
    public final List<Class<? extends JsonSchema>> anyOf;

    public AnyOfValidator(List<Class<? extends JsonSchema>> anyOf) {
        this.anyOf = anyOf;
    }

    @Override
    public Object getConstraint() {
        return anyOf;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        List<Class<? extends JsonSchema>> validatedAnyOfClasses = new ArrayList<>();
        for(Class<? extends JsonSchema> anyOfClass: anyOf) {
            if (anyOfClass == cls.getClass()) {
                /*
                optimistically assume that cls schema will pass validation
                do not invoke _validate on it because that is recursive
                */
                validatedAnyOfClasses.add(anyOfClass);
                continue;
            }
            try {
                JsonSchema anyOfSchema = JsonSchemaFactory.getInstance(anyOfClass);
                PathToSchemasMap otherPathToSchemas = JsonSchema.validate(anyOfSchema, arg, validationMetadata);
                validatedAnyOfClasses.add(anyOfClass);
                pathToSchemas.update(otherPathToSchemas);
            } catch (ValidationException e) {
                // silence exceptions because the code needs to accumulate anyof_classes
            }
        }
        if (validatedAnyOfClasses.isEmpty()) {
            throw new ValidationException("Invalid inputs given to generate an instance of "+cls+". None "+
                    "of the anyOf schemas matched the input data."
            );
        }
        return pathToSchemas;
    }
}
