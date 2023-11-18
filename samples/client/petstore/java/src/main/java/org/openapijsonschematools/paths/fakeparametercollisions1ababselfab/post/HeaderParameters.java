package org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter5.Schema5;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter6.Schema6;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter7.Schema7;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter8.Schema8;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;

public class HeaderParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public class HeaderParameters1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("1", Schema5.Schema51.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("aB", Schema6.Schema61.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("A-B", Schema8.Schema81.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("self", Schema7.Schema71.class)
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(HeaderParameters1.class, arg, configuration);
        }
    }
}
