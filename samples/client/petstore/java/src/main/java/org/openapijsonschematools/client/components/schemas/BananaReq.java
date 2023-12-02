package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class BananaReq {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class LengthCm extends NumberJsonSchema {}
    
    
    public static class Sweet extends BooleanJsonSchema {}
    
    
    public static class BananaReqMap extends FrozenMap<String, Object> {
        BananaReqMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "lengthCm"
        );
        public static final Set<String> optionalKeys = Set.of(
            "sweet"
        );
        public static BananaReqMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return BananaReq1.validate(arg, configuration);
        }
        
        public Number lengthCm() {
            return (Number) get("lengthCm");
        }
        
        public boolean sweet() {
            String key = "sweet";
            throwIfKeyNotPresent(key);
            return (boolean) get(key);
        }
    }    
    
    public static class BananaReq1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("lengthCm", LengthCm.class),
                new PropertyEntry("sweet", Sweet.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "lengthCm"
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        
        protected static BananaReqMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new BananaReqMap(arg);
        }
        public static BananaReqMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(BananaReq1.class, arg, configuration);
        }
    }
}