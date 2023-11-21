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
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ReadOnlyFirst {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Bar extends StringJsonSchema {}
    
    
    public class Baz extends StringJsonSchema {}
    
    
    public static class ReadOnlyFirstMap extends FrozenMap<String, Object> {
        ReadOnlyFirstMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ReadOnlyFirstMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ReadOnlyFirst1.validate(arg, configuration);
        }
    }    
    
    public class ReadOnlyFirst1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("bar", Bar.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("baz", Baz.class)
        ));
        protected static ReadOnlyFirstMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ReadOnlyFirstMap(arg);
        }
        public static ReadOnlyFirstMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ReadOnlyFirst1.class, arg, configuration);
        }
    }
}
