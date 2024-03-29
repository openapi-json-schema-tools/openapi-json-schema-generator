package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.IntJsonSchema;

public class IntegerTypeMatchesIntegers extends IntJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class IntegerTypeMatchesIntegers1 extends IntJsonSchema.IntJsonSchema1 {
        private static @Nullable IntegerTypeMatchesIntegers1 instance = null;
        public static IntegerTypeMatchesIntegers1 getInstance() {
            if (instance == null) {
                instance = new IntegerTypeMatchesIntegers1();
            }
            return instance;
        }
    }

}
