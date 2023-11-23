package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Apple {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Cultivar extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Cultivar.class, arg, configuration);
        }
    }    
    
    public class Origin extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Origin.class, arg, configuration);
        }
    }    
    
    public static class AppleMap extends FrozenMap<String, Object> {
        AppleMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static AppleMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Apple1.validate(arg, configuration);
        }
    }    
    
    public class Apple1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Void.class,
                FrozenMap.class
            ))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("cultivar", Cultivar.class),
                new PropertyEntry("origin", Origin.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "cultivar"
            )))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Apple1.class, arg, configuration);
        }
        public static AppleMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Apple1.class, arg, configuration);
        }
    }}
