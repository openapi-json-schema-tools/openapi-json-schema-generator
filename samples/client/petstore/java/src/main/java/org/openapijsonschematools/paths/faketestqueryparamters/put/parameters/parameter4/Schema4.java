package org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter4;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class Schema4 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items4 extends StringJsonSchema {}
    
    
    public static class SchemaTuple4 extends FrozenList<Object> {
        SchemaTuple4(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Schema41 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = Items4.class;
        protected static SchemaTuple4 getListOutputInstance(FrozenList<Object> arg) {
            return new SchemaTuple4(arg);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema41.class, arg, configuration);
        }
    }}
