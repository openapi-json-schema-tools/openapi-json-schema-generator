package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.UnsetAnyTypeJsonSchema;

import java.util.LinkedHashSet;
import java.util.Set;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class StringSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class StringSchema1 extends StringJsonSchema {
    }
}
