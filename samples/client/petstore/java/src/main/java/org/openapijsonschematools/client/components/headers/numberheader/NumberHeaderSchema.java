package org.openapijsonschematools.client.components.headers.numberheader;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.DecimalJsonSchema;

public class NumberHeaderSchema extends DecimalJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class NumberHeaderSchema1 extends DecimalJsonSchema.DecimalJsonSchema1 {
        private static @Nullable NumberHeaderSchema1 instance = null;
        public static NumberHeaderSchema1 getInstance() {
            if (instance == null) {
                instance = new NumberHeaderSchema1();
            }
            return instance;
        }
    }

}
