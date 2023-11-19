package org.openapijsonschematools.paths.fake.get.requestbody.content.applicationxwwwformurlencoded;
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

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items.class, arg, configuration);
        }
    }    
    
    public static class EnumFormStringArrayTuple extends FrozenList<Object> {
        EnumFormStringArrayTuple(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class EnumFormStringArray implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = Items.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumFormStringArray.class, arg, configuration);
        }
    }    
    
    public class EnumFormString implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumFormString.class, arg, configuration);
        }
    }    
    
    public static class SchemaMap extends FrozenMap<String, Object> {
        SchemaMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static SchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Schema1.validate(arg, configuration);
        }
    }    
    
    public class Schema1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("enum_form_string_array", EnumFormStringArray.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("enum_form_string", EnumFormString.class)
        ));
        protected static SchemaMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new SchemaMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
}
