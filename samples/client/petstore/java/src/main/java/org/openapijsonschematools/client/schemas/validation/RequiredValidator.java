package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RequiredValidator implements KeywordValidator {
    public final Set<String> required;

    public RequiredValidator(Set<String> required) {
        this.required = required;
    }

    @Override
    public Object getConstraint() {
        return required;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata) {
        if (!(arg instanceof Map)) {
            return null;
        }
        Map<String, Object> castArg = (Map<String, Object>) arg;
        Set<String> missingRequiredProperties = new HashSet<>(required);
        missingRequiredProperties.removeAll(castArg.keySet());
        if (!missingRequiredProperties.isEmpty()) {
            List<String> missingReqProps = missingRequiredProperties.stream().sorted().toList();
            String pluralChar = "";
            if (missingRequiredProperties.size() > 1) {
                pluralChar = "s";
            }
            throw new ValidationException(
                schema.getClass()+" is missing "+missingRequiredProperties.size()+" required argument"+pluralChar+": "+missingReqProps
            );
        }
        return null;
    }
}
