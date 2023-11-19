package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.MapJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class AdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends StringJsonSchema {}
    
    
    class MapPropertyMap extends FrozenMap<String, Object> {
        MapPropertyMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static MapPropertyMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return MapProperty.validate(arg, configuration);
        }
    }    
    
    public class MapProperty implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapProperty.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties2 extends StringJsonSchema {}
    
    
    class AdditionalPropertiesMap extends FrozenMap<String, Object> {
        AdditionalPropertiesMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static AdditionalPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return AdditionalProperties1.validate(arg, configuration);
        }
    }    
    
    public class AdditionalProperties1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties2.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
    }
    
    
    class MapOfMapPropertyMap extends FrozenMap<String, Object> {
        MapOfMapPropertyMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static MapOfMapPropertyMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return MapOfMapProperty.validate(arg, configuration);
        }
    }    
    
    public class MapOfMapProperty implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties1.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapOfMapProperty.class, arg, configuration);
        }
    }
    
    
    public class Anytype1 extends AnyTypeJsonSchema {}
    
    
    public class MapWithUndeclaredPropertiesAnytype1 extends MapJsonSchema {}
    
    
    public class MapWithUndeclaredPropertiesAnytype2 extends MapJsonSchema {}
    
    
    public class AdditionalProperties3 extends AnyTypeJsonSchema {}
    
    
    class MapWithUndeclaredPropertiesAnytype3Map extends FrozenMap<String, Object> {
        MapWithUndeclaredPropertiesAnytype3Map(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static MapWithUndeclaredPropertiesAnytype3Map of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return MapWithUndeclaredPropertiesAnytype3.validate(arg, configuration);
        }
    }    
    
    public class MapWithUndeclaredPropertiesAnytype3 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties3.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapWithUndeclaredPropertiesAnytype3.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties4 extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    class EmptyMapMap extends FrozenMap<String, Object> {
        EmptyMapMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        // map with no key value pairs
        public static EmptyMapMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return EmptyMap.validate(arg, configuration);
        }
    }    
    
    public class EmptyMap implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties4.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EmptyMap.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties5 extends StringJsonSchema {}
    
    
    class MapWithUndeclaredPropertiesStringMap extends FrozenMap<String, Object> {
        MapWithUndeclaredPropertiesStringMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static MapWithUndeclaredPropertiesStringMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return MapWithUndeclaredPropertiesString.validate(arg, configuration);
        }
    }    
    
    public class MapWithUndeclaredPropertiesString implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties5.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapWithUndeclaredPropertiesString.class, arg, configuration);
        }
    }
    
    
    class AdditionalPropertiesClassMap extends FrozenMap<String, Object> {
        AdditionalPropertiesClassMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static AdditionalPropertiesClassMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return AdditionalPropertiesClass1.validate(arg, configuration);
        }
    }    
    
    public class AdditionalPropertiesClass1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("map_property", MapProperty.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("map_of_map_property", MapOfMapProperty.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("anytype_1", Anytype1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("map_with_undeclared_properties_anytype_1", MapWithUndeclaredPropertiesAnytype1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("map_with_undeclared_properties_anytype_2", MapWithUndeclaredPropertiesAnytype2.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("map_with_undeclared_properties_anytype_3", MapWithUndeclaredPropertiesAnytype3.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("empty_map", EmptyMap.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("map_with_undeclared_properties_string", MapWithUndeclaredPropertiesString.class)
        ));
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalPropertiesClass1.class, arg, configuration);
        }
    }
}
