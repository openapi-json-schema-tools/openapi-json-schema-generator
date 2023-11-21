package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.BooleanJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class MapTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties1 extends StringJsonSchema {}
    
    
    public static class AdditionalPropertiesMap extends FrozenMap<String, Object> {
        AdditionalPropertiesMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static AdditionalPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return AdditionalProperties.validate(arg, configuration);
        }
    }    
    
    public class AdditionalProperties extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties1.class;
        protected static AdditionalPropertiesMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new AdditionalPropertiesMap(arg);
        }
        public static AdditionalPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties.class, arg, configuration);
        }
    }
    
    
    public static class MapMapOfStringMap extends FrozenMap<String, Object> {
        MapMapOfStringMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static MapMapOfStringMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return MapMapOfString.validate(arg, configuration);
        }
    }    
    
    public class MapMapOfString extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static MapMapOfStringMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new MapMapOfStringMap(arg);
        }
        public static MapMapOfStringMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapMapOfString.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties2 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
    }    
    
    public static class MapOfEnumStringMap extends FrozenMap<String, Object> {
        MapOfEnumStringMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static MapOfEnumStringMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return MapOfEnumString.validate(arg, configuration);
        }
    }    
    
    public class MapOfEnumString extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties2.class;
        protected static MapOfEnumStringMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new MapOfEnumStringMap(arg);
        }
        public static MapOfEnumStringMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapOfEnumString.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties3 extends BooleanJsonSchema {}
    
    
    public static class DirectMapMap extends FrozenMap<String, Object> {
        DirectMapMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static DirectMapMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return DirectMap.validate(arg, configuration);
        }
    }    
    
    public class DirectMap extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties3.class;
        protected static DirectMapMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new DirectMapMap(arg);
        }
        public static DirectMapMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DirectMap.class, arg, configuration);
        }
    }
    
    
    public static class MapTestMap extends FrozenMap<String, Object> {
        MapTestMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static MapTestMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return MapTest1.validate(arg, configuration);
        }
    }    
    
    public class MapTest1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("map_map_of_string", MapMapOfString.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("map_of_enum_string", MapOfEnumString.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("direct_map", DirectMap.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("indirect_map", StringBooleanMap.StringBooleanMap1.class)
        ));
        protected static MapTestMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new MapTestMap(arg);
        }
        public static MapTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapTest1.class, arg, configuration);
        }
    }
}
