package org.openapijsonschematools.paths.fake.get.requestbody.content.applicationxwwwformurlencoded;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Items(LinkedHashSet<Class<?>> type) implements Schema {
        public static Items withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Items(type);
        }
    
    }    
    
    public record EnumFormString(LinkedHashSet<Class<?>> type) implements Schema {
        public static EnumFormString withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new EnumFormString(type);
        }
    
    }}
