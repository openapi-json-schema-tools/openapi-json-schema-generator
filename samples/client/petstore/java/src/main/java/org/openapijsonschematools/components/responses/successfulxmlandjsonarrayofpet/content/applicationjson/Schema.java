package org.openapijsonschematools.components.responses.successfulxmlandjsonarrayofpet.content.applicationjson;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapijsonschematools.components.schemas.Pet;
import org.openapijsonschematools.components.schemas.RefPet;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.JsonSchema;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = RefPet.RefPet1.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }}
