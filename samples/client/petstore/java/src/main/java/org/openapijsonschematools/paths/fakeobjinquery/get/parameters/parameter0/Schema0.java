package org.openapijsonschematools.paths.fakeobjinquery.get.parameters.parameter0;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class Schema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Keyword0 extends StringJsonSchema {}
    
    
    public static class SchemaMap0 extends FrozenMap<String, Object> {
        SchemaMap0(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static SchemaMap0 of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Schema01.validate(arg, configuration);
        }
    }    
    
    public class Schema01 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("keyword", Keyword0.class)
        ));
        protected static SchemaMap0 getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new SchemaMap0(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema01.class, arg, configuration);
        }
    }
}
