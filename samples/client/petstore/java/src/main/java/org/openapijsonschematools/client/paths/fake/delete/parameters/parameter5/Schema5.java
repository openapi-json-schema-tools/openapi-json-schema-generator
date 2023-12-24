package org.openapijsonschematools.client.paths.fake.delete.parameters.parameter5;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;

public class Schema5 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema51 extends Int64JsonSchema {
        private static @Nullable Schema51 instance = null;
        public static Schema51 getInstance() {
            if (instance == null) {
                instance = new Schema51();
            }
            return instance;
        }
    }

}
