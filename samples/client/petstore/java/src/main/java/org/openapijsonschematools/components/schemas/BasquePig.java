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

public class BasquePig {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class ClassName extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ClassName.class, arg, configuration);
        }
    }    
    
    public static class BasquePigMap extends FrozenMap<String, Object> {


        BasquePigMap(FrozenMap<String, Object> m) {


            super(m);
        }
        public static BasquePigMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return BasquePig1.validate(arg, configuration);
        }
        
        public String:

            return typing.cast(
                String,

                self.__getitem__("className")
            )
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
    }    
    
    public class BasquePig1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("className", ClassName.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "className"
            )))
        ));
        protected static BasquePigMap getMapOutputInstance(FrozenMap<String, Object> arg) {


            return new BasquePigMap(arg);
        }
        public static BasquePigMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(BasquePig1.class, arg, configuration);
        }
    }
}
