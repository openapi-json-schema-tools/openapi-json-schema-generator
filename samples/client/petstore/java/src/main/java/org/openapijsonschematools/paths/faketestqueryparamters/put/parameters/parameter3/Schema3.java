package org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter3;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.JsonSchema;

public class Schema3 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items3 extends StringJsonSchema {}
    
    
    public static class SchemaList3 extends FrozenList<Object> {
        SchemaList3(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Schema31 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = Items3.class;
        protected static SchemaList3 getListOutputInstance(FrozenList<Object> arg) {
            return new SchemaList3(arg);
        }
        public static SchemaList3 validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema31.class, arg, configuration);
        }
    }}
