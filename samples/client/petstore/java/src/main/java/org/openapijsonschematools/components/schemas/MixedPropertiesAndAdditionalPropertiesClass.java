package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.UuidJsonSchema;

public class MixedPropertiesAndAdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class UuidSchema extends UuidJsonSchema {}
    
    
    public class DateTime extends DateTimeJsonSchema {}
    
    
    class MapMap extends FrozenMap<String, Object> {
        MapMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static MapMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return MapSchema.validate(arg, configuration);
        }
    }    
    
    public class MapSchema implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = Animal.Animal1.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapSchema.class, arg, configuration);
        }
    }
    
    
    class MixedPropertiesAndAdditionalPropertiesClassMap extends FrozenMap<String, Object> {
        MixedPropertiesAndAdditionalPropertiesClassMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static MixedPropertiesAndAdditionalPropertiesClassMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return MixedPropertiesAndAdditionalPropertiesClass1.validate(arg, configuration);
        }
    }    
    
    public class MixedPropertiesAndAdditionalPropertiesClass1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("uuid", UuidSchema.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("dateTime", DateTime.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("map", MapSchema.class)
        ));
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MixedPropertiesAndAdditionalPropertiesClass1.class, arg, configuration);
        }
    }
}
