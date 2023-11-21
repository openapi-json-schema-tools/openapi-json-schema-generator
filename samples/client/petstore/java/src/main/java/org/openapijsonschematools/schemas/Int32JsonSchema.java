package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;
import org.openapijsonschematools.schemas.validation.FormatValidator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class Int32JsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(
            Integer.class,
            Float.class
        ))),
        new KeywordEntry("format", new FormatValidator("int32"))
    ));

    public static Integer validate(Integer arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(Int32JsonSchema.class, arg, configuration);
    }

    public static Integer validate(Float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(Int32JsonSchema.class, Integer.parseInt(arg.toString()), configuration);
    }
}
