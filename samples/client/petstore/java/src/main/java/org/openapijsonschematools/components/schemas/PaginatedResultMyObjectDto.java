package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.IntJsonSchema;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;

public class PaginatedResultMyObjectDto {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public class Count extends IntJsonSchema {}
    
    
    public class Results implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = MyObjectDto.MyObjectDto1.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Results.class, arg, configuration);
        }
    }    
    
    class PaginatedResultMyObjectDtoMap extends FrozenMap<String, Object> {
        PaginatedResultMyObjectDtoMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static PaginatedResultMyObjectDtoMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return PaginatedResultMyObjectDto1.validate(arg, configuration);
        }
    }    
    
    public class PaginatedResultMyObjectDto1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("count", Count.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("results", Results.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "count",
            "results"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        public static PaginatedResultMyObjectDtoMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new PaginatedResultMyObjectDtoMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PaginatedResultMyObjectDto1.class, arg, configuration);
        }
    }
}
