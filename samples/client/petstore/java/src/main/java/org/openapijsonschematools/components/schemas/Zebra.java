package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Zebra {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends AnyTypeJsonSchema {}
    
    
    public class Type extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Type.class, arg, configuration);
        }
    }    
    
    public class ClassName extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ClassName.class, arg, configuration);
        }
    }    
    
    public static class ZebraMap extends FrozenMap<String, Object> {
        ZebraMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ZebraMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Zebra1.validate(arg, configuration);
        }
    }    
    
    public class Zebra1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class)),
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("type", Type.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("className", ClassName.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "className"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static ZebraMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ZebraMap(arg);
        }
        public static ZebraMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Zebra1.class, arg, configuration);
        }
    }
}
