package org.openapijsonschematools.client.paths.fake.delete.parameters.parameter2;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;

public class Schema2 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema21 extends Int64JsonSchema.Int64JsonSchema1 {
        private static @Nullable Schema21 instance = null;
        public static Schema21 getInstance() {
            if (instance == null) {
                instance = new Schema21();
            }
            return instance;
        }
    }

}
