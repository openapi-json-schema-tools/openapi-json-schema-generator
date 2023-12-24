package org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.parameter1;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema1 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema11 extends StringJsonSchema {
        private static @Nullable Schema11 instance = null;
        public static Schema11 getInstance() {
            if (instance == null) {
                instance = new Schema11();
            }
            return instance;
        }
    }

}
