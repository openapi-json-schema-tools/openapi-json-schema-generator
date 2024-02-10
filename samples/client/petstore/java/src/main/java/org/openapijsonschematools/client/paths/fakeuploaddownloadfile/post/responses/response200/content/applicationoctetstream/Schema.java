package org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post.responses.response200.content.applicationoctetstream;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema1 extends StringJsonSchema.StringJsonSchema1 {
        // BinarySchema
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }

}
