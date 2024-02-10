package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter8;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema8 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema81 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema81 instance = null;
        public static Schema81 getInstance() {
            if (instance == null) {
                instance = new Schema81();
            }
            return instance;
        }
    }

}
