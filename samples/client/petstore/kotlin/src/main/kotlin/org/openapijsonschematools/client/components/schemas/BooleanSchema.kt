package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;

public class BooleanSchema extends BooleanJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class BooleanSchema1 extends BooleanJsonSchema.BooleanJsonSchema1 {
        private static @Nullable BooleanSchema1 instance = null;
        public static BooleanSchema1 getInstance() {
            if (instance == null) {
                instance = new BooleanSchema1();
            }
            return instance;
        }
    }

}
