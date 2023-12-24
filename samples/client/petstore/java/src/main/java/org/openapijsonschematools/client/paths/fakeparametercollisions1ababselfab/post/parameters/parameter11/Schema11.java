package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter11;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema11 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema111 extends StringJsonSchema {
        private static @Nullable Schema111 instance = null;
        public static Schema111 getInstance() {
            if (instance == null) {
                instance = new Schema111();
            }
            return instance;
        }
    }

}
