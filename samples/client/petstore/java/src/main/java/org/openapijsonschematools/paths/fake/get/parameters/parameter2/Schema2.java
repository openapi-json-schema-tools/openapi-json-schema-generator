package org.openapijsonschematools.paths.fake.get.parameters.parameter2;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.JsonSchema;

public class Schema2 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items2 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items2.class, arg, configuration);
        }
    }    
    
    public static class SchemaList2 extends FrozenList<Object> {
        SchemaList2(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Schema21 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = Items2.class;
        protected static SchemaList2 getListOutputInstance(FrozenList<Object> arg) {
            return new SchemaList2(arg);
        }
        public static SchemaList2 validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema21.class, arg, configuration);
        }
    }}
