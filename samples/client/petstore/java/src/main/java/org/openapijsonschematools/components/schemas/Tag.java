package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Tag {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Id extends Int64JsonSchema {}
    
    
    public class Name extends StringJsonSchema {}
    
    
    public static class TagMap extends FrozenMap<String, Object> {


        TagMap(FrozenMap<String, Object> m) {


            super(m);
        }
        public static TagMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Tag1.validate(arg, configuration);
        }
        
        public long:

            val = self.get("id", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                long,

                val
            )
        
        public String:

            val = self.get("name", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                String,

                val
            )
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
    }    
    
    public class Tag1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("id", Id.class),
                new PropertyEntry("name", Name.class)
            )))
        ));
        protected static TagMap getMapOutputInstance(FrozenMap<String, Object> arg) {


            return new TagMap(arg);
        }
        public static TagMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Tag1.class, arg, configuration);
        }
    }
}
