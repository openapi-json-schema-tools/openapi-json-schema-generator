package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.DecimalJsonSchema;

public class DecimalPayload {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class DecimalPayload1 extends DecimalJsonSchema.DecimalJsonSchema1 {
        private static @Nullable DecimalPayload1 instance = null;
        public static DecimalPayload1 getInstance() {
            if (instance == null) {
                instance = new DecimalPayload1();
            }
            return instance;
        }
    }

}
