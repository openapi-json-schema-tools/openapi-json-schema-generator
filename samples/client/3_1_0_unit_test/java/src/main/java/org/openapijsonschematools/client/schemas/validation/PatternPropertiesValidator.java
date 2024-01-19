package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;
import java.util.regex.Pattern;

public class PatternPropertiesValidator implements KeywordValidator {
    public final Map<Pattern, Class<? extends JsonSchema>> patternProperties;

    public PatternPropertiesValidator(Map<Pattern, Class<? extends JsonSchema>> patternProperties) {
        this.patternProperties = patternProperties;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        if (!(data.arg() instanceof Map<?, ?>)) {
            return null;
        }
        return data.patternPropertiesPathToSchemas();
    }
}

