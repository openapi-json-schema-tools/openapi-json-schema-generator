package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;

public class PatternPropertiesValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        var patternProperties = data.schema().patternProperties;
        if (patternProperties == null) {
            return null;
        }
        if (!(data.arg() instanceof Map<?, ?>)) {
            return null;
        }
        return data.patternPropertiesPathToSchemas();
    }
}
