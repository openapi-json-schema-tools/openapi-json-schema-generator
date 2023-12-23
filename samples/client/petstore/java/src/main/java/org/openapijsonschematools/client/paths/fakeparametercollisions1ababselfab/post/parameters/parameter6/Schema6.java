package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter6;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema6 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema61 extends StringJsonSchema {
        private static @Nullable Schema61 instance = null;
        public static Schema61 getInstance() {
            if (instance == null) {
                instance = new Schema61();
            }
            return instance;
        }
    }

}
