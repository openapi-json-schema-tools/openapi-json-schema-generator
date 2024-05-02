package org.openapijsonschematools.client.paths.fake.delete.parameters.parameter3;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema3 extends StringJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema31 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema31 instance = null;
        public static Schema31 getInstance() {
            if (instance == null) {
                instance = new Schema31();
            }
            return instance;
        }
    }

}
