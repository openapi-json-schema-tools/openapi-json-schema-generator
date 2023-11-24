package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.BooleanJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NumberJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class BananaReq {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public class LengthCm extends NumberJsonSchema {}
    
    
    public class Sweet extends BooleanJsonSchema {}
    
    
    public static class BananaReqMap extends FrozenMap<String, Object> {

        BananaReqMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static BananaReqMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return BananaReq1.validate(arg, configuration);
        }
        
        public Number lengthCm() {

            String key = "lengthCm";
            return Number get(key);

        }
        
        public boolean sweet() {

            String key = "sweet";
            if (!containsKey(key)) {
                throw new RuntimeException("sweet is unset");
            }
            return boolean get(key);

        }
    }    
    
    public class BananaReq1 extends JsonSchema {
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
        public static BananaReqMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(BananaReq1.class, arg, configuration);
        }
    }
}
