package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;

public class Boolean extends BooleanJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Boolean1 extends BooleanJsonSchema.BooleanJsonSchema1 {
        private static @Nullable Boolean1 instance = null;
        public static Boolean1 getInstance() {
            if (instance == null) {
                instance = new Boolean1();
            }
            return instance;
        }
    }

}
