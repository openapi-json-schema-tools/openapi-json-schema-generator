package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

public class ObjectTypeMatchesObjects extends MapJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ObjectTypeMatchesObjects1 extends MapJsonSchema.MapJsonSchema1 {
        private static @Nullable ObjectTypeMatchesObjects1 instance = null;
        public static ObjectTypeMatchesObjects1 getInstance() {
            if (instance == null) {
                instance = new ObjectTypeMatchesObjects1();
            }
            return instance;
        }
    }

}
