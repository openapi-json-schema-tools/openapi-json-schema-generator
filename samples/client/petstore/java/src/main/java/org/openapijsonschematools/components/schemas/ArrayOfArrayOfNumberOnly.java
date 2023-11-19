package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NumberJsonSchema;

public class ArrayOfArrayOfNumberOnly {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items1 extends NumberJsonSchema {}
    
    
    public class Items implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = Items1.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items.class, arg, configuration);
        }
    }    
    
    public class ArrayArrayNumber implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = Items.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayArrayNumber.class, arg, configuration);
        }
    }    
    
    class ArrayOfArrayOfNumberOnlyMap extends FrozenMap<String, Object> {
        ArrayOfArrayOfNumberOnlyMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ArrayOfArrayOfNumberOnlyMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ArrayOfArrayOfNumberOnly1.validate(arg, configuration);
        }
    }    
    
    public class ArrayOfArrayOfNumberOnly1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("ArrayArrayNumber", ArrayArrayNumber.class)
        ));
        public static ArrayOfArrayOfNumberOnlyMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ArrayOfArrayOfNumberOnlyMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayOfArrayOfNumberOnly1.class, arg, configuration);
        }
    }
}
