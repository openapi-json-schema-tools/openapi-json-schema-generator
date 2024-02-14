package org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post.responses.response200.content.applicationoctetstream;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class ApplicationoctetstreamSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ApplicationoctetstreamSchema1 extends StringJsonSchema.StringJsonSchema1 {
        // BinarySchema
        private static @Nullable ApplicationoctetstreamSchema1 instance = null;
        public static ApplicationoctetstreamSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationoctetstreamSchema1();
            }
            return instance;
        }
    }

}
