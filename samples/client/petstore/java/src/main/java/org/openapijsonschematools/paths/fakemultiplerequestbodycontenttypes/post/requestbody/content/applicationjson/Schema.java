package org.openapijsonschematools.paths.fakemultiplerequestbodycontenttypes.post.requestbody.content.applicationjson;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record A(LinkedHashSet<Class<?>> type) implements Schema {
        public static A withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new A(type);
        }
    }}
