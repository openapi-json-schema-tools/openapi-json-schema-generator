package org.openapijsonschematools.schemas.validation;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RequiredValidator implements KeywordValidator {
    @Override
    public PathToSchemasMap validate(Class<? extends SchemaValidator> cls, Object arg, Object constraint, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof Map)) {
            return null;
        }
        Map<String, Object> castArg = (Map<String, Object>) arg;
        Set<String> requiredProperties = (Set<String>) constraint;
        Set<String> missingRequiredProperties = new HashSet<>(requiredProperties);
        missingRequiredProperties.removeAll(castArg.keySet());
        if (!missingRequiredProperties.isEmpty()) {
            List<String> missingReqProps = missingRequiredProperties.stream().sorted().toList();
            String pluralChar = "";
            if (missingRequiredProperties.size() > 1) {
                pluralChar = "s";
            }
            throw new RuntimeException(
                cls+" is missing "+missingRequiredProperties.size()+" required argument"+pluralChar+": "+missingReqProps
            );
        }
        return null;
    }
}
