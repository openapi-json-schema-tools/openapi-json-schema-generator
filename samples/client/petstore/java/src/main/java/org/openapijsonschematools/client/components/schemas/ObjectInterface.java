package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

public class ObjectInterface {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ObjectInterface1 extends MapJsonSchema.MapJsonSchema1 {
        private static @Nullable ObjectInterface1 instance = null;
        public static ObjectInterface1 getInstance() {
            if (instance == null) {
                instance = new ObjectInterface1();
            }
            return instance;
        }
    }

}
