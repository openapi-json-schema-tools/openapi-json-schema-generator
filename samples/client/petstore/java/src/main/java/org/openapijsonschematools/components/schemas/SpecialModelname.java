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

public class SpecialModelname {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class A extends StringJsonSchema {}
    
    
    public static class SpecialModelnameMap extends FrozenMap<String, Object> {
        SpecialModelnameMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static SpecialModelnameMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return SpecialModelname1.validate(arg, configuration);
        }
    }    
    
    public class SpecialModelname1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        model with an invalid class name for python
        */
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("a", A.class)
        ));
        protected static SpecialModelnameMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new SpecialModelnameMap(arg);
        }
        public static SpecialModelnameMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SpecialModelname1.class, arg, configuration);
        }
    }
}
