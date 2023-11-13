package org.openapijsonschematools.paths.fakejsonformdata.get.requestbody.content.applicationxwwwformurlencoded;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Param(LinkedHashSet<Class<?>> type) implements Schema {
        public static Param withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Param(type);
        }
    }    
    
    public record Param2(LinkedHashSet<Class<?>> type) implements Schema {
        public static Param2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Param2(type);
        }
    }}
