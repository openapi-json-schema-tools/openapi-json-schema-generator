package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter10;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema10 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema101 extends StringJsonSchema {
        private static @Nullable Schema101 instance = null;
        public static Schema101 getInstance() {
            if (instance == null) {
                instance = new Schema101();
            }
            return instance;
        }
    }

}
