package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter4;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema4 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema41 extends StringJsonSchema {
        private static @Nullable Schema41 instance = null;
        public static Schema41 getInstance() {
            if (instance == null) {
                instance = new Schema41();
            }
            return instance;
        }
    }

}
