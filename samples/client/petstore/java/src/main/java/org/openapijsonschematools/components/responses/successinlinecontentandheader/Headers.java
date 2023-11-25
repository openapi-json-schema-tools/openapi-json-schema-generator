package org.openapijsonschematools.components.responses.successinlinecontentandheader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.components.responses.successinlinecontentandheader.headers.someheader.SomeHeaderSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Headers {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class HeadersMap extends FrozenMap<String, String> {
        HeadersMap(FrozenMap<String, String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "someHeader"
        );
        public static HeadersMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return Headers1.validate(arg, configuration);
        }
        
        public String someHeader() {
            String key = "someHeader";
            throwIfKeyNotPresent(key);
            return get(key);
        }
    }    
    
    public class Headers1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("someHeader", SomeHeaderSchema.SomeHeaderSchema1.class)
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static HeadersMap getMapOutputInstance(FrozenMap<String, String> arg) {
            return new HeadersMap(arg);
        }
        public static HeadersMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Headers1.class, arg, configuration);
        }
    }
}
