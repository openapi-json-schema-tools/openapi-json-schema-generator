package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter14;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema14 extends StringJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema141 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema141 instance = null;
        public static Schema141 getInstance() {
            if (instance == null) {
                instance = new Schema141();
            }
            return instance;
        }
    }

}
