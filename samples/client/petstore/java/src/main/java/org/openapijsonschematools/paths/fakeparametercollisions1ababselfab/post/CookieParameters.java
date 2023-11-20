package org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter14.Schema14;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter15.Schema15;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter16.Schema16;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter17.Schema17;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter18.Schema18;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;

public class CookieParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class CookieParametersMap extends FrozenMap<String, Object> {
        CookieParametersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static CookieParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return CookieParameters1.validate(arg, configuration);
        }
    }    
    
    public class CookieParameters1 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("1", Schema14.Schema141.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("aB", Schema15.Schema151.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("Ab", Schema16.Schema161.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("A-B", Schema18.Schema181.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("self", Schema17.Schema171.class)
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static CookieParametersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new CookieParametersMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(CookieParameters1.class, arg, configuration);
        }
    }
}
