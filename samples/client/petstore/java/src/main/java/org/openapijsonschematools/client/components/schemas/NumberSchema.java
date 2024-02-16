package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;

public class NumberSchema extends NumberJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class NumberSchema1 extends NumberJsonSchema.NumberJsonSchema1 {
        private static @Nullable NumberSchema1 instance = null;
        public static NumberSchema1 getInstance() {
            if (instance == null) {
                instance = new NumberSchema1();
            }
            return instance;
        }
    }

}
