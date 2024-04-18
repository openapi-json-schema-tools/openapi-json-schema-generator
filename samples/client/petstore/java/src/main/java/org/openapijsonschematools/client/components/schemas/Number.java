package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;

public class Number extends NumberJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Number1 extends NumberJsonSchema.NumberJsonSchema1 {
        private static @Nullable Number1 instance = null;
        public static Number1 getInstance() {
            if (instance == null) {
                instance = new Number1();
            }
            return instance;
        }
    }

}
