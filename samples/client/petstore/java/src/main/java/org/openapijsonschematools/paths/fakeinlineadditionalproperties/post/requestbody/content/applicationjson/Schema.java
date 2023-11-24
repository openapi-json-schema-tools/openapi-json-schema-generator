package org.openapijsonschematools.paths.fakeinlineadditionalproperties.post.requestbody.content.applicationjson;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends StringJsonSchema {}
    
    
    public static class SchemaMap extends FrozenMap<String, String> {


        SchemaMap(FrozenMap<String, String> m) {


            super(m);
        }
        public static SchemaMap of(Map<String, String> arg, SchemaConfiguration configuration) {

            return Schema1.validate(arg, configuration);
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
    
    public class Schema1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static SchemaMap getMapOutputInstance(FrozenMap<String, String> arg) {


            return new SchemaMap(arg);
        }
        public static SchemaMap validate(Map<String, String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
}
