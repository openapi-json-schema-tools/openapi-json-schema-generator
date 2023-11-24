package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.MapJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class AdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends StringJsonSchema {}
    
    
    public static class MapPropertyMap extends FrozenMap<String, String> {


        MapPropertyMap(FrozenMap<String, String> m) {


            super(m);
        }
        public static MapPropertyMap of(Map<String, String> arg, SchemaConfiguration configuration) {

            return MapProperty.validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) {

            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            val = self.get(name, schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                String,

                val
            )
    }    
    
    public class MapProperty extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static MapPropertyMap getMapOutputInstance(FrozenMap<String, String> arg) {


            return new MapPropertyMap(arg);
        }
        public static MapPropertyMap validate(Map<String, String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(MapProperty.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties2 extends StringJsonSchema {}
    
    
    public static class AdditionalPropertiesMap extends FrozenMap<String, String> {


        AdditionalPropertiesMap(FrozenMap<String, String> m) {


            super(m);
        }
        public static AdditionalPropertiesMap of(Map<String, String> arg, SchemaConfiguration configuration) {

            return AdditionalProperties1.validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) {

            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            val = self.get(name, schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                String,

                val
            )
    }    
    
    public class AdditionalProperties1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties2.class))
        ));
        protected static AdditionalPropertiesMap getMapOutputInstance(FrozenMap<String, String> arg) {


            return new AdditionalPropertiesMap(arg);
        }
        public static AdditionalPropertiesMap validate(Map<String, String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
    }
    
    
    public static class MapOfMapPropertyMap extends FrozenMap<String, AdditionalPropertiesMap> {


        MapOfMapPropertyMap(FrozenMap<String, AdditionalPropertiesMap> m) {


            super(m);
        }
        public static MapOfMapPropertyMap of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) {


            return MapOfMapProperty.validate(arg, configuration);
        }
        
        public AdditionalPropertiesMap getAdditionalProperty(String name) {

            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            val = self.get(name, schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                AdditionalPropertiesMap,

                val
            )
    }    
    
    public class MapOfMapProperty extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties1.class))
        ));
        protected static MapOfMapPropertyMap getMapOutputInstance(FrozenMap<String, AdditionalPropertiesMap> arg) {


            return new MapOfMapPropertyMap(arg);
        }
        public static MapOfMapPropertyMap validate(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) {


            return JsonSchema.validate(MapOfMapProperty.class, arg, configuration);
        }
    }
    
    
    public class Anytype1 extends AnyTypeJsonSchema {}
    
    
    public class MapWithUndeclaredPropertiesAnytype1 extends MapJsonSchema {}
    
    
    public class MapWithUndeclaredPropertiesAnytype2 extends MapJsonSchema {}
    
    
    public class AdditionalProperties3 extends AnyTypeJsonSchema {}
    
    
    public static class MapWithUndeclaredPropertiesAnytype3Map extends FrozenMap<String, Object> {


        MapWithUndeclaredPropertiesAnytype3Map(FrozenMap<String, Object> m) {


            super(m);
        }
        public static MapWithUndeclaredPropertiesAnytype3Map of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return MapWithUndeclaredPropertiesAnytype3.validate(arg, configuration);
        }
        
        public Object getAdditionalProperty(String name) {

            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            val = self.get(name, schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                Object,

                val
            )
    }    
    
    public class MapWithUndeclaredPropertiesAnytype3 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties3.class))
        ));
        protected static MapWithUndeclaredPropertiesAnytype3Map getMapOutputInstance(FrozenMap<String, Object> arg) {


            return new MapWithUndeclaredPropertiesAnytype3Map(arg);
        }
        public static MapWithUndeclaredPropertiesAnytype3Map validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(MapWithUndeclaredPropertiesAnytype3.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties4 extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class EmptyMapMap extends FrozenMap<String, Object> {
        EmptyMapMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        // map with no key value pairs
        public static EmptyMapMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return EmptyMap.validate(arg, configuration);
        }
    }    
    
    public class EmptyMap extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties4.class))
        ));
        protected static EmptyMapMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new EmptyMapMap(arg);
        }
        public static EmptyMapMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EmptyMap.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties5 extends StringJsonSchema {}
    
    
    public static class MapWithUndeclaredPropertiesStringMap extends FrozenMap<String, String> {


        MapWithUndeclaredPropertiesStringMap(FrozenMap<String, String> m) {


            super(m);
        }
        public static MapWithUndeclaredPropertiesStringMap of(Map<String, String> arg, SchemaConfiguration configuration) {

            return MapWithUndeclaredPropertiesString.validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) {

            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            val = self.get(name, schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                String,

                val
            )
    }    
    
    public class MapWithUndeclaredPropertiesString extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties5.class))
        ));
        protected static MapWithUndeclaredPropertiesStringMap getMapOutputInstance(FrozenMap<String, String> arg) {


            return new MapWithUndeclaredPropertiesStringMap(arg);
        }
        public static MapWithUndeclaredPropertiesStringMap validate(Map<String, String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(MapWithUndeclaredPropertiesString.class, arg, configuration);
        }
    }
    
    
    public static class AdditionalPropertiesClassMap extends FrozenMap<String, Object> {


        AdditionalPropertiesClassMap(FrozenMap<String, Object> m) {


            super(m);
        }
        public static AdditionalPropertiesClassMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return AdditionalPropertiesClass1.validate(arg, configuration);
        }
        
        public MapPropertyMap:

            val = self.get("map_property", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                MapPropertyMap,

                val
            )
        
        public MapOfMapPropertyMap:

            val = self.get("map_of_map_property", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                MapOfMapPropertyMap,

                val
            )
        
        public Object:

            val = self.get("anytype_1", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return val
        
        public FrozenMap<String, Object>:

            val = self.get("map_with_undeclared_properties_anytype_1", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                FrozenMap<String, Object>,

                val
            )
        
        public FrozenMap<String, Object>:

            val = self.get("map_with_undeclared_properties_anytype_2", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                FrozenMap<String, Object>,

                val
            )
        
        public MapWithUndeclaredPropertiesAnytype3Map:

            val = self.get("map_with_undeclared_properties_anytype_3", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                MapWithUndeclaredPropertiesAnytype3Map,

                val
            )
        
        public EmptyMapMap:

            val = self.get("empty_map", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                EmptyMapMap,

                val
            )
        
        public MapWithUndeclaredPropertiesStringMap:

            val = self.get("map_with_undeclared_properties_string", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                MapWithUndeclaredPropertiesStringMap,

                val
            )
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
    }    
    
    public class AdditionalPropertiesClass1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("map_property", MapProperty.class),
                new PropertyEntry("map_of_map_property", MapOfMapProperty.class),
                new PropertyEntry("anytype_1", Anytype1.class),
                new PropertyEntry("map_with_undeclared_properties_anytype_1", MapWithUndeclaredPropertiesAnytype1.class),
                new PropertyEntry("map_with_undeclared_properties_anytype_2", MapWithUndeclaredPropertiesAnytype2.class),
                new PropertyEntry("map_with_undeclared_properties_anytype_3", MapWithUndeclaredPropertiesAnytype3.class),
                new PropertyEntry("empty_map", EmptyMap.class),
                new PropertyEntry("map_with_undeclared_properties_string", MapWithUndeclaredPropertiesString.class)
            )))
        ));
        protected static AdditionalPropertiesClassMap getMapOutputInstance(FrozenMap<String, Object> arg) {


            return new AdditionalPropertiesClassMap(arg);
        }
        public static AdditionalPropertiesClassMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(AdditionalPropertiesClass1.class, arg, configuration);
        }
    }
}
