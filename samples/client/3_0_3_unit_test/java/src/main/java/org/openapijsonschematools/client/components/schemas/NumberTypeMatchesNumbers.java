package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;

public class NumberTypeMatchesNumbers extends NumberJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class NumberTypeMatchesNumbers1 extends NumberJsonSchema.NumberJsonSchema1 {
        private static @Nullable NumberTypeMatchesNumbers1 instance = null;
        public static NumberTypeMatchesNumbers1 getInstance() {
            if (instance == null) {
                instance = new NumberTypeMatchesNumbers1();
            }
            return instance;
        }
    }

}
