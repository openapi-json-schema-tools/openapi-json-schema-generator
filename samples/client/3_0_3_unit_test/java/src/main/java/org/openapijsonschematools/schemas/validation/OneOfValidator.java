package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class OneOfValidator implements KeywordValidator {
    public final List<Class<? extends JsonSchema>> oneOf;

    public OneOfValidator(List<Class<? extends JsonSchema>> oneOf) {
        this.oneOf = oneOf;
    }

    @Override
    public Object getConstraint() {
        return oneOf;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        List<Class<? extends JsonSchema>> validatedOneOfClasses = new ArrayList<>();
        for(Class<? extends JsonSchema> oneOfClass: oneOf) {
            if (oneOfClass == cls) {
                /*
                optimistically assume that cls schema will pass validation
                do not invoke validate on it because that is recursive
                */
                validatedOneOfClasses.add(oneOfClass);
                continue;
            }
            try {
                PathToSchemasMap otherPathToSchemas = JsonSchema.validate(oneOfClass, arg, validationMetadata);
                validatedOneOfClasses.add(oneOfClass);
                pathToSchemas.update(otherPathToSchemas);
            } catch (ValidationException e) {
                // silence exceptions because the code needs to accumulate validatedOneOfClasses
            }
        }
        if (validatedOneOfClasses.isEmpty()) {
            throw new ValidationException("Invalid inputs given to generate an instance of "+cls+". None "+
                    "of the oneOf schemas matched the input data."
            );
        }
        if (validatedOneOfClasses.size() > 1) {
            throw new ValidationException("Invalid inputs given to generate an instance of "+cls+". Multiple "+
                    "oneOf schemas validated the data, but a max of one is allowed."
            );
        }
        return pathToSchemas;
    }
}
