package org.openapijsonschematools.paths.fakedeletecoffeeid.delete;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fakedeletecoffeeid.delete.parameters.parameter0.Schema0;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;

public class PathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    class PathParametersMap extends FrozenMap<String, Object> {
        PathParametersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static PathParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return PathParameters1.validate(arg, configuration);
        }
    }    
    
    public class PathParameters1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("id", Schema0.Schema01.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "id"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        public static PathParametersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new PathParametersMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PathParameters1.class, arg, configuration);
        }
    }
}
