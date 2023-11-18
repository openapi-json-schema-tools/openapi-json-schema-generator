package org.openapijsonschematools.paths.petfindbytags.get.parameters.parameter0;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.ListJsonSchema;
import org.openapijsonschematools.schemas.MapJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.UnsetAnyTypeJsonSchema;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class Schema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items0 extends StringJsonSchema {
    }
    
    
    public class Schema01 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = Items0.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema01.class, arg, configuration);
        }
    }}
