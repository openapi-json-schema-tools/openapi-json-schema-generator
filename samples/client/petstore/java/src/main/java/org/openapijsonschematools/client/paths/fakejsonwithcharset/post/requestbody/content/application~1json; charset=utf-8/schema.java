package org.openapijsonschematools.client.paths.fakejsonwithcharset.post.requestbody.content.application~1json; charset&#x3D;utf-8;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema1 extends AnyTypeJsonSchema {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }

}
