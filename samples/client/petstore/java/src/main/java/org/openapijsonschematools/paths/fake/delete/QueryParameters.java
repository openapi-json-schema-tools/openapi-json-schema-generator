package org.openapijsonschematools.paths.fake.delete;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fake.delete.parameters.parameter0.Schema0;
import org.openapijsonschematools.paths.fake.delete.parameters.parameter2.Schema2;
import org.openapijsonschematools.paths.fake.delete.parameters.parameter3.Schema3;
import org.openapijsonschematools.paths.fake.delete.parameters.parameter5.Schema5;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    class QueryParametersMap extends FrozenMap<String, Object> {
        QueryParametersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static QueryParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return QueryParameters1.validate(arg, configuration);
        }
    }    
    
    public class QueryParameters1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("required_string_group", Schema0.Schema01.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("int64_group", Schema5.Schema51.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("string_group", Schema3.Schema31.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("required_int64_group", Schema2.Schema21.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "required_int64_group",
            "required_string_group"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        public static QueryParametersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new QueryParametersMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(QueryParameters1.class, arg, configuration);
        }
    }
}
