package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class HasOnlyReadOnly {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Bar extends StringJsonSchema {}
    
    
    public class Foo extends StringJsonSchema {}
    
    
    public static class HasOnlyReadOnlyMap extends FrozenMap<String, Object> {

        HasOnlyReadOnlyMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static HasOnlyReadOnlyMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return HasOnlyReadOnly1.validate(arg, configuration);
        }
    }    
    
    public class HasOnlyReadOnly1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("bar", Bar.class),
                new PropertyEntry("foo", Foo.class)
            )))
        ));
        protected static HasOnlyReadOnlyMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new HasOnlyReadOnlyMap(arg);
        }
        public static HasOnlyReadOnlyMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(HasOnlyReadOnly1.class, arg, configuration);
        }
    }
}
