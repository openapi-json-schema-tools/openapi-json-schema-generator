package org.openapijsonschematools.paths.commonparamsubdir.delete;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.commonparamsubdir.delete.parameters.parameter0.Schema0;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;

public class HeaderParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class HeaderParametersMap extends FrozenMap<String, Object> {
        HeaderParametersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static HeaderParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return HeaderParameters1.validate(arg, configuration);
        }
    }    
    
    public class HeaderParameters1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("someHeader", Schema0.Schema01.class)
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static HeaderParametersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new HeaderParametersMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(HeaderParameters1.class, arg, configuration);
        }
    }
}
