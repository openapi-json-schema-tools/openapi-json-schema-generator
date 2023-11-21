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
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Animal {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class ClassName extends StringJsonSchema {}
    
    
    public class Color extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Color.class, arg, configuration);
        }
    }    
    
    public static class AnimalMap extends FrozenMap<String, Object> {
        AnimalMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static AnimalMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Animal1.validate(arg, configuration);
        }
    }    
    
    public class Animal1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class)),
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("className", ClassName.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("color", Color.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "className"
        ));
        protected static AnimalMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new AnimalMap(arg);
        }
        public static AnimalMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Animal1.class, arg, configuration);
        }
    }
}
