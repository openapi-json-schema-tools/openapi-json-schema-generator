package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.BooleanJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class StringBooleanMap {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends BooleanJsonSchema {}
    
    
    public static class StringBooleanMapMap extends FrozenMap<String, Boolean> {
        StringBooleanMapMap(FrozenMap<String, Boolean> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static StringBooleanMapMap of(Map<String, Boolean> arg, SchemaConfiguration configuration) throws ValidationException {
            return StringBooleanMap1.validate(arg, configuration);
        }
        
        public boolean getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public class StringBooleanMap1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static StringBooleanMapMap getMapOutputInstance(FrozenMap<String, Boolean> arg) {
            return new StringBooleanMapMap(arg);
        }
        public static StringBooleanMapMap validate(Map<String, Boolean> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(StringBooleanMap1.class, arg, configuration);
        }
    }
}
