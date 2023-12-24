package org.openapijsonschematools.client.paths.petpetid.delete.parameters.parameter1;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;

public class Schema1 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema11 extends Int64JsonSchema {
        private static @Nullable Schema11 instance = null;
        public static Schema11 getInstance() {
            if (instance == null) {
                instance = new Schema11();
            }
            return instance;
        }
    }

}
