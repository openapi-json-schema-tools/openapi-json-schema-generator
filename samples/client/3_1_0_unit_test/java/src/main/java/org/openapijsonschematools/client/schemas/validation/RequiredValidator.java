package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

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
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        if (!(data.arg() instanceof Map<?, ?> mapArg)) {
            return null;
        }
        Set<String> missingRequiredProperties = new HashSet<>(required);
        for (Object key: mapArg.keySet()) {
            if (key instanceof String) {
                missingRequiredProperties.remove(key);
            }
        }
        if (!missingRequiredProperties.isEmpty()) {
            List<String> missingReqProps = missingRequiredProperties.stream().sorted().toList();
            String pluralChar = "";
            if (missingRequiredProperties.size() > 1) {
                pluralChar = "s";
            }
            throw new ValidationException(
                data.schema().getClass()+" is missing "+missingRequiredProperties.size()+" required argument"+pluralChar+": "+missingReqProps
            );
        }
        return null;
    }
}
