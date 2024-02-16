package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter13;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema13 extends StringJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema131 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema131 instance = null;
        public static Schema131 getInstance() {
            if (instance == null) {
                instance = new Schema131();
            }
            return instance;
        }
    }

}
