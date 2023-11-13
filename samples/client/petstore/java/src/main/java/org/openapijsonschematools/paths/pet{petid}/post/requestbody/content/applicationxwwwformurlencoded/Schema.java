package org.openapijsonschematools.paths.pet{petid}.post.requestbody.content.applicationxwwwformurlencoded;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Name(LinkedHashSet<Class<?>> type) implements Schema {
        public static Name withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Name(type);
        }
    }    
    
    public record Status(LinkedHashSet<Class<?>> type) implements Schema {
        public static Status withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Status(type);
        }
    }}
