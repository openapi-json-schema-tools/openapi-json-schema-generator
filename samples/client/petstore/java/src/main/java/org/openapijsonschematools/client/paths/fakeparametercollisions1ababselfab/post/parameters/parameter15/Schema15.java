package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter15;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema15 extends StringJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema151 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema151 instance = null;
        public static Schema151 getInstance() {
            if (instance == null) {
                instance = new Schema151();
            }
            return instance;
        }
    }

}
