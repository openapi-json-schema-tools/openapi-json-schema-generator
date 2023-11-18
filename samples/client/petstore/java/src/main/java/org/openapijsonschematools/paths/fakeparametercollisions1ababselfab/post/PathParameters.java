package org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter10.Schema10;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter11.Schema11;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter12.Schema12;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter13.Schema13;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter9.Schema9;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;

public class PathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {
        // NotAnyTypeSchema
    }
    
    
    public class PathParameters1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("1", Schema9.Schema91.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("aB", Schema10.Schema101.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("Ab", Schema11.Schema111.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("A-B", Schema13.Schema131.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("self", Schema12.Schema121.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "1",
            "A-B",
            "Ab",
            "aB",
            "self"
        ));        static final Class<?> additionalProperties = AdditionalProperties.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PathParameters1.class, arg, configuration);
        }
    }
}
