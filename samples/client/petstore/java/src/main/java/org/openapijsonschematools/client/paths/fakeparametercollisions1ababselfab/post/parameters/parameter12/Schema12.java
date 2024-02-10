package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter12;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema12 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema121 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema121 instance = null;
        public static Schema121 getInstance() {
            if (instance == null) {
                instance = new Schema121();
            }
            return instance;
        }
    }

}
