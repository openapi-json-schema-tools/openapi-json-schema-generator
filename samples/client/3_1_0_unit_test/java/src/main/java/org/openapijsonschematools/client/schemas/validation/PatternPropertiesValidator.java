package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class PatternPropertiesValidator implements KeywordValidator {
    public final Map<Pattern, Class<? extends JsonSchema>> patternProperties;

    public PatternPropertiesValidator(Map<Pattern, Class<? extends JsonSchema>> patternProperties) {
        this.patternProperties = patternProperties;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas,
        @Nullable PathToSchemasMap patternPropertiesPathToSchemas
    ) {
        if (!(arg instanceof Map<?, ?> mapArg)) {
            return null;
        }
        // todo add implementation
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        return pathToSchemas;
    }
}

