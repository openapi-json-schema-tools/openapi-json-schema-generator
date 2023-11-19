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
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.UuidJsonSchema;

public class MyObjectDto {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public class Id extends UuidJsonSchema {}
    
    
    public static class MyObjectDtoMap extends FrozenMap<String, Object> {
        MyObjectDtoMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static MyObjectDtoMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return MyObjectDto1.validate(arg, configuration);
        }
    }    
    
    public class MyObjectDto1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("id", Id.class)
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        static MyObjectDtoMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new MyObjectDtoMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MyObjectDto1.class, arg, configuration);
        }
    }
}
