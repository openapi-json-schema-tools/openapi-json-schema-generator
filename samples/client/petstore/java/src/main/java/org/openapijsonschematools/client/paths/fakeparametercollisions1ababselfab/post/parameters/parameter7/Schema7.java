package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter7;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema7 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema71 extends StringJsonSchema {
        private static @Nullable Schema71 instance = null;
        public static Schema71 getInstance() {
            if (instance == null) {
                instance = new Schema71();
            }
            return instance;
        }
    }

}
