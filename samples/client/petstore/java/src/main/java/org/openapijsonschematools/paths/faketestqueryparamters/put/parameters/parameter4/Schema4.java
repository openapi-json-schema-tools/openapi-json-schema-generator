package org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter4;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.JsonSchema;

public class Schema4 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items4 extends StringJsonSchema {}
    
    
    public static class SchemaList4 extends FrozenList<Object> {
        SchemaList4(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Schema41 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = Items4.class;
        protected static SchemaList4 getListOutputInstance(FrozenList<Object> arg) {
            return new SchemaList4(arg);
        }
        public static SchemaList4 validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema41.class, arg, configuration);
        }
    }}
