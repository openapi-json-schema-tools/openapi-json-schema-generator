package org.openapijsonschematools.paths.fakeinlineadditionalproperties.post.requestbody.content.applicationjson;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties(LinkedHashSet<Class<?>> type) implements Schema {
        public static AdditionalProperties withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalProperties(type);
        }
    }}
