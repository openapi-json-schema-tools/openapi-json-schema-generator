package org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter1;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class Schema1 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items1 extends StringJsonSchema {}
    
    
    public static class SchemaTuple1 extends FrozenList<Object> {
        SchemaTuple1(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Schema11 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = Items1.class;
        protected static SchemaTuple1 getListOutputInstance(FrozenList<Object> arg) {
            return new SchemaTuple1(arg);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema11.class, arg, configuration);
        }
    }}
