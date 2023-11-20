package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;

public class ArrayTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items extends StringJsonSchema {}
    
    
    public static class ArrayOfStringTuple extends FrozenList<Object> {
        ArrayOfStringTuple(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class ArrayOfString extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = Items.class;
        protected static ArrayOfStringTuple getListOutputInstance(FrozenList<Object> arg) {
            return new ArrayOfStringTuple(arg);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayOfString.class, arg, configuration);
        }
    }    
    
    public class Items2 extends Int64JsonSchema {}
    
    
    public static class ItemsTuple extends FrozenList<Object> {
        ItemsTuple(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Items1 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = Items2.class;
        protected static ItemsTuple getListOutputInstance(FrozenList<Object> arg) {
            return new ItemsTuple(arg);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items1.class, arg, configuration);
        }
    }    
    
    public static class ArrayArrayOfIntegerTuple extends FrozenList<Object> {
        ArrayArrayOfIntegerTuple(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class ArrayArrayOfInteger extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = Items1.class;
        protected static ArrayArrayOfIntegerTuple getListOutputInstance(FrozenList<Object> arg) {
            return new ArrayArrayOfIntegerTuple(arg);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayArrayOfInteger.class, arg, configuration);
        }
    }    
    
    public static class ItemsTuple1 extends FrozenList<Object> {
        ItemsTuple1(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Items3 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = ReadOnlyFirst.ReadOnlyFirst1.class;
        protected static ItemsTuple1 getListOutputInstance(FrozenList<Object> arg) {
            return new ItemsTuple1(arg);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items3.class, arg, configuration);
        }
    }    
    
    public static class ArrayArrayOfModelTuple extends FrozenList<Object> {
        ArrayArrayOfModelTuple(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class ArrayArrayOfModel extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = Items3.class;
        protected static ArrayArrayOfModelTuple getListOutputInstance(FrozenList<Object> arg) {
            return new ArrayArrayOfModelTuple(arg);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayArrayOfModel.class, arg, configuration);
        }
    }    
    
    public static class ArrayTestMap extends FrozenMap<String, Object> {
        ArrayTestMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ArrayTestMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ArrayTest1.validate(arg, configuration);
        }
    }    
    
    public class ArrayTest1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("array_of_string", ArrayOfString.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("array_array_of_integer", ArrayArrayOfInteger.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("array_array_of_model", ArrayArrayOfModel.class)
        ));
        protected static ArrayTestMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ArrayTestMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayTest1.class, arg, configuration);
        }
    }
}
