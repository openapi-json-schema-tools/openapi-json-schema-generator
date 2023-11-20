package org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter1;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.JsonSchema;

public class Schema1 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items1 extends StringJsonSchema {}
    
    
    public static class SchemaList1 extends FrozenList<Object> {
        SchemaList1(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Schema11 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = Items1.class;
        protected static SchemaList1 getListOutputInstance(FrozenList<Object> arg) {
            return new SchemaList1(arg);
        }
        public static SchemaList1 validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema11.class, arg, configuration);
        }
    }}
