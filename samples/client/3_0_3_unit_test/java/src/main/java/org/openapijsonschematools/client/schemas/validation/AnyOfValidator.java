package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AnyOfValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var anyOf = data.schema().anyOf;
        if (anyOf == null) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        List<Class<? extends JsonSchema<?>>> validatedAnyOfClasses = new ArrayList<>();
        for(Class<? extends JsonSchema<?>> anyOfClass: anyOf) {
            if (anyOfClass == data.schema().getClass()) {
                /*
                optimistically assume that schema will pass validation
                do not invoke _validate on it because that is recursive
                */
                validatedAnyOfClasses.add(anyOfClass);
                continue;
            }
            try {
                JsonSchema<?> anyOfSchema = JsonSchemaFactory.getInstance(anyOfClass);
                PathToSchemasMap otherPathToSchemas = JsonSchema.validate(anyOfSchema, data.arg(), data.validationMetadata());
                validatedAnyOfClasses.add(anyOfClass);
                pathToSchemas.update(otherPathToSchemas);
            } catch (ValidationException e) {
                // silence exceptions because the code needs to accumulate anyof_classes
            }
        }
        if (validatedAnyOfClasses.isEmpty()) {
            throw new ValidationException("Invalid inputs given to generate an instance of "+data.schema().getClass()+". None "+
                    "of the anyOf schemas matched the input data."
            );
        }
        return pathToSchemas;
    }
}
