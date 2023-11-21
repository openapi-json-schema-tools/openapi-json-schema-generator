package org.openapijsonschematools.paths.fakeobjinquery.get.parameters.parameter0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

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
        public static SchemaMap0 validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema01.class, arg, configuration);
        }
    }
}
