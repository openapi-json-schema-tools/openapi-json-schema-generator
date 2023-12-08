package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Banana {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class LengthCm extends NumberJsonSchema {}
    
    
    public static class BananaMap extends FrozenMap<String, Object> {
        BananaMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "lengthCm"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static BananaMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Banana1.class).validate(arg, configuration);
        }
        
        public Number lengthCm() {
            return (Number) get("lengthCm");
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class BananaMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Banana1 extends JsonSchema<BananaMap, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public Banana1() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("lengthCm", LengthCm.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "lengthCm"
                )))
            ));
        }
        
        @Override
        protected BananaMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new BananaMap((FrozenMap<String, Object>) arg);
        }
        public BananaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
