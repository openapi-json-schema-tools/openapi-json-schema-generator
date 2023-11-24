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
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class MapTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties1 extends StringJsonSchema {}
    
    
    public static class AdditionalPropertiesMap extends FrozenMap<String, String> {


        AdditionalPropertiesMap(FrozenMap<String, String> m) {


            super(m);
        }
        public static AdditionalPropertiesMap of(Map<String, String> arg, SchemaConfiguration configuration) {

            return AdditionalProperties.validate(arg, configuration);
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
    
    public class AdditionalProperties extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties1.class))
        ));
        protected static AdditionalPropertiesMap getMapOutputInstance(FrozenMap<String, String> arg) {


            return new AdditionalPropertiesMap(arg);
        }
        public static AdditionalPropertiesMap validate(Map<String, String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(AdditionalProperties.class, arg, configuration);
        }
    }
    
    
    public static class MapMapOfStringMap extends FrozenMap<String, AdditionalPropertiesMap> {


        MapMapOfStringMap(FrozenMap<String, AdditionalPropertiesMap> m) {


            super(m);
        }
        public static MapMapOfStringMap of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) {


            return MapMapOfString.validate(arg, configuration);
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
    
    public class MapMapOfString extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static MapMapOfStringMap getMapOutputInstance(FrozenMap<String, AdditionalPropertiesMap> arg) {


            return new MapMapOfStringMap(arg);
        }
        public static MapMapOfStringMap validate(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) {


            return JsonSchema.validate(MapMapOfString.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties2 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
    }    
    
    public static class MapOfEnumStringMap extends FrozenMap<String, String> {


        MapOfEnumStringMap(FrozenMap<String, String> m) {


            super(m);
        }
        public static MapOfEnumStringMap of(Map<String, String> arg, SchemaConfiguration configuration) {

            return MapOfEnumString.validate(arg, configuration);
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
    
    public class MapOfEnumString extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties2.class))
        ));
        protected static MapOfEnumStringMap getMapOutputInstance(FrozenMap<String, String> arg) {


            return new MapOfEnumStringMap(arg);
        }
        public static MapOfEnumStringMap validate(Map<String, String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(MapOfEnumString.class, arg, configuration);
        }
    }
    
    
    public class AdditionalProperties3 extends BooleanJsonSchema {}
    
    
    public static class DirectMapMap extends FrozenMap<String, Boolean> {


        DirectMapMap(FrozenMap<String, Boolean> m) {


            super(m);
        }
        public static DirectMapMap of(Map<String, Boolean> arg, SchemaConfiguration configuration) {

            return DirectMap.validate(arg, configuration);
        }
        
        public boolean getAdditionalProperty(String name) {

            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            val = self.get(name, schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                boolean,

                val
            )
    }    
    
    public class DirectMap extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties3.class))
        ));
        protected static DirectMapMap getMapOutputInstance(FrozenMap<String, Boolean> arg) {


            return new DirectMapMap(arg);
        }
        public static DirectMapMap validate(Map<String, Boolean> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(DirectMap.class, arg, configuration);
        }
    }
    
    
    public static class MapTestMap extends FrozenMap<String, Object> {


        MapTestMap(FrozenMap<String, Object> m) {


            super(m);
        }
        public static MapTestMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return MapTest1.validate(arg, configuration);
        }
        
        public MapMapOfStringMap:

            val = self.get("map_map_of_string", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                MapMapOfStringMap,

                val
            )
        
        public MapOfEnumStringMap:

            val = self.get("map_of_enum_string", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                MapOfEnumStringMap,

                val
            )
        
        public DirectMapMap:

            val = self.get("direct_map", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                DirectMapMap,

                val
            )
        
        public StringBooleanMap.StringBooleanMapMap indirect_map() {

            val = self.get("indirect_map", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                StringBooleanMap.StringBooleanMapMap,

                val
            )
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
    }    
    
    public class MapTest1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("map_map_of_string", MapMapOfString.class),
                new PropertyEntry("map_of_enum_string", MapOfEnumString.class),
                new PropertyEntry("direct_map", DirectMap.class),
                new PropertyEntry("indirect_map", StringBooleanMap.StringBooleanMap1.class)
            )))
        ));
        protected static MapTestMap getMapOutputInstance(FrozenMap<String, Object> arg) {


            return new MapTestMap(arg);
        }
        public static MapTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(MapTest1.class, arg, configuration);
        }
    }
}
