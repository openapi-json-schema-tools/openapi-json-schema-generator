package org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.parameter2;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema2 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema21 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema21 instance = null;
        public static Schema21 getInstance() {
            if (instance == null) {
                instance = new Schema21();
            }
            return instance;
        }
    }

}
