package org.openapijsonschematools.paths.fake.get.parameters.parameter4;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.EnumValidator;
import org.openapijsonschematools.schemas.validation.FormatValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema4 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema41 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("int32")),
            new KeywordEntry("enum", new EnumValidator(Set.of(
                1,
                -2
            )))
        ));
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Schema41.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Schema41.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Schema41.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Schema41.class, arg, configuration);
        }
    }}
