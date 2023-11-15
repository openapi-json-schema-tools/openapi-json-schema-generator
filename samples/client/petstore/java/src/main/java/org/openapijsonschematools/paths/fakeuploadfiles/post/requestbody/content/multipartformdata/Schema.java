package org.openapijsonschematools.paths.fakeuploadfiles.post.requestbody.content.multipartformdata;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.JsonSchemas;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Items(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Items withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // FileIO,
            // bytes,
            String format = "binary";
            return new Items(type, format);
        }
        // FileIO,
        // bytes,
    }    
    
    public record Files(LinkedHashSet<Class<?>> type, Class<?> items) implements JsonSchema {
        public static Files withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenList.class);
            Class<?> items = Items.class;
            return new Files(type, items);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Files.class, arg, configuration);
        }
    }    
    
    public record Schema2(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            return new Schema2(type);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema2.class, arg, configuration);
        }
    }
}
