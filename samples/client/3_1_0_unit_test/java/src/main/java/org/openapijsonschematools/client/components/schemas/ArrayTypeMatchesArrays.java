package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.ListJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;

public class ArrayTypeMatchesArrays {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ArrayTypeMatchesArrays1 extends ListJsonSchema.ListJsonSchema1 {
        private static @Nullable ArrayTypeMatchesArrays1 instance = null;
        public static ArrayTypeMatchesArrays1 getInstance() {
            if (instance == null) {
                instance = new ArrayTypeMatchesArrays1();
            }
            return instance;
        }
    }

}
