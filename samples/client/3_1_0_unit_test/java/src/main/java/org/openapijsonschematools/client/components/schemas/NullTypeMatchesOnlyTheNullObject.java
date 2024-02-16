package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.NullJsonSchema;

public class NullTypeMatchesOnlyTheNullObject extends NullJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class NullTypeMatchesOnlyTheNullObject1 extends NullJsonSchema.NullJsonSchema1 {
        private static @Nullable NullTypeMatchesOnlyTheNullObject1 instance = null;
        public static NullTypeMatchesOnlyTheNullObject1 getInstance() {
            if (instance == null) {
                instance = new NullTypeMatchesOnlyTheNullObject1();
            }
            return instance;
        }
    }

}
