package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;

public class BooleanTypeMatchesBooleans {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class BooleanTypeMatchesBooleans1 extends BooleanJsonSchema {
        private static @Nullable BooleanTypeMatchesBooleans1 instance = null;
        public static BooleanTypeMatchesBooleans1 getInstance() {
            if (instance == null) {
                instance = new BooleanTypeMatchesBooleans1();
            }
            return instance;
        }
    }

}
