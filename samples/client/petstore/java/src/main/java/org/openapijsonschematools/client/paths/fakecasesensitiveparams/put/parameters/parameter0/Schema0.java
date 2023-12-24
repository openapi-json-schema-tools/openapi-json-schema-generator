package org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.parameter0;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema01 extends StringJsonSchema {
        private static @Nullable Schema01 instance = null;
        public static Schema01 getInstance() {
            if (instance == null) {
                instance = new Schema01();
            }
            return instance;
        }
    }

}
