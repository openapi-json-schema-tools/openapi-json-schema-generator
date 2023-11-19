package org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter2;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class Schema2 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items2 extends StringJsonSchema {}
    
    
    public static class SchemaTuple2 extends FrozenList<Object> {
        SchemaTuple2(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Schema21 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        public static final Class<?> items = Items2.class;
        protected static SchemaTuple2 getListOutputInstance(FrozenList<Object> arg) {
            return new SchemaTuple2(arg);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema21.class, arg, configuration);
        }
    }}
