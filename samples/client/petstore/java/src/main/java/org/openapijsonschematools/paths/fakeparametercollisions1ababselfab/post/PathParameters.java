package org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter10.Schema10;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter11.Schema11;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter12.Schema12;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter13.Schema13;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter9.Schema9;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

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
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("1", Schema9.Schema91.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("aB", Schema10.Schema101.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("Ab", Schema11.Schema111.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("A-B", Schema13.Schema131.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("self", Schema12.Schema121.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "1",
            "A-B",
            "Ab",
            "aB",
            "self"
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
