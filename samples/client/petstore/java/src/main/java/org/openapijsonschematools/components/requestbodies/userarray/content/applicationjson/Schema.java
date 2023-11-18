package org.openapijsonschematools.components.requestbodies.userarray.content.applicationjson;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.DateJsonSchema;
import org.openapijsonschematools.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.schemas.DecimalJsonSchema;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.ListJsonSchema;
import org.openapijsonschematools.schemas.MapJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.UnsetAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.UuidJsonSchema;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.components.schemas.User;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = User.User1.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }}
