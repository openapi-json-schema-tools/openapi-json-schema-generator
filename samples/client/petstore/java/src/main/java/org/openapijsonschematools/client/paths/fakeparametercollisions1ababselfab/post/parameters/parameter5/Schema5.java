package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter5;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema5 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema51 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema51 instance = null;
        public static Schema51 getInstance() {
            if (instance == null) {
                instance = new Schema51();
            }
            return instance;
        }
    }

}
