package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.UnsetAnyTypeJsonSchema;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.openapijsonschematools.schemas.FrozenMap;

public class SelfReferencingObjectModel {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class SelfReferencingObjectModel1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("selfRef", SelfReferencingObjectModel1.class)
        ));
        static final Class<?> additionalProperties = SelfReferencingObjectModel1.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SelfReferencingObjectModel1.class, arg, configuration);
        }
    }
}
