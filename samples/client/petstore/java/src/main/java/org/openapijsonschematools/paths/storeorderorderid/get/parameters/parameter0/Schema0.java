package org.openapijsonschematools.paths.storeorderorderid.get.parameters.parameter0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.FormatValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.MaximumValidator;
import org.openapijsonschematools.schemas.validation.MinimumValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema01 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("int64")),
            new KeywordEntry("maximum", new MaximumValidator(5)),
            new KeywordEntry("minimum", new MinimumValidator(1))
        ));
        public static long validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema01.class, Long.valueOf(arg), configuration);
        }
        
        public static long validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema01.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema01.class, arg, configuration);
        }
        
        public static long validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema01.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
    }}
