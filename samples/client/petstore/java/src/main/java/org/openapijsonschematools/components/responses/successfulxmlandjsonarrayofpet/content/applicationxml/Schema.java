package org.openapijsonschematools.components.responses.successfulxmlandjsonarrayofpet.content.applicationxml;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import org.openapijsonschematools.components.schemas.Pet;
import org.openapijsonschematools.schemas.FrozenList;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = Pet.Pet1.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }}
