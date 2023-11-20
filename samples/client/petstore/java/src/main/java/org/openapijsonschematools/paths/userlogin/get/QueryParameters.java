package org.openapijsonschematools.paths.userlogin.get;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.userlogin.get.parameters.parameter0.Schema0;
import org.openapijsonschematools.paths.userlogin.get.parameters.parameter1.Schema1;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class QueryParametersMap extends FrozenMap<String, Object> {
        QueryParametersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static QueryParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return QueryParameters1.validate(arg, configuration);
        }
    }    
    
    public class QueryParameters1 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("password", Schema1.Schema11.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("username", Schema0.Schema01.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "password",
            "username"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static QueryParametersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new QueryParametersMap(arg);
        }
        public static QueryParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(QueryParameters1.class, arg, configuration);
        }
    }
}
