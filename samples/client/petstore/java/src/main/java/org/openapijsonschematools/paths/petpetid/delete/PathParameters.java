package org.openapijsonschematools.paths.petpetid.delete;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.petpetid.delete.parameters.parameter1.Schema1;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;

public class PathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class PathParametersMap extends FrozenMap<String, Object> {
        PathParametersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static PathParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return PathParameters1.validate(arg, configuration);
        }
    }    
    
    public class PathParameters1 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("petId", Schema1.Schema11.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "petId"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static PathParametersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new PathParametersMap(arg);
        }
        public static PathParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PathParameters1.class, arg, configuration);
        }
    }
}
