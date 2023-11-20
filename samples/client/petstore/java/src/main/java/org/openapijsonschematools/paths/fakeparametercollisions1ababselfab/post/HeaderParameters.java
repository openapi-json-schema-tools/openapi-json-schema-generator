package org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter5.Schema5;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter6.Schema6;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter7.Schema7;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter8.Schema8;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;

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
    
    public class HeaderParameters1 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("1", Schema5.Schema51.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("aB", Schema6.Schema61.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("A-B", Schema8.Schema81.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("self", Schema7.Schema71.class)
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static HeaderParametersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new HeaderParametersMap(arg);
        }
        public static HeaderParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(HeaderParameters1.class, arg, configuration);
        }
    }
}
