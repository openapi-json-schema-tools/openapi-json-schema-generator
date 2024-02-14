package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter18;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema18 extends StringJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema181 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema181 instance = null;
        public static Schema181 getInstance() {
            if (instance == null) {
                instance = new Schema181();
            }
            return instance;
        }
    }

}
