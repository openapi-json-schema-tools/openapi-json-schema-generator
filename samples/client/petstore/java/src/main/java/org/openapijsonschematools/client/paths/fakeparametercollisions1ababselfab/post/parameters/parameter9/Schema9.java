package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter9;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema9 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema91 extends StringJsonSchema {
        private static @Nullable Schema91 instance = null;
        public static Schema91 getInstance() {
            if (instance == null) {
                instance = new Schema91();
            }
            return instance;
        }
    }

}
