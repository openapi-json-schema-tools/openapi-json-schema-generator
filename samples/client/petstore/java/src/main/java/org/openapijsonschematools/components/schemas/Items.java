package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.UnsetAnyTypeJsonSchema;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.MapJsonSchema;

public class Items {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items2 extends MapJsonSchema {
    }
    
    
    public class Items1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        component's name collides with the inner schema name
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = Items2.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items1.class, arg, configuration);
        }
    }}
