package org.openapijsonschematools.client.paths.fakepemcontenttype.get.responses.response200.content.applicationxpemfile;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class ApplicationxpemfileSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ApplicationxpemfileSchema1 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable ApplicationxpemfileSchema1 instance = null;
        public static ApplicationxpemfileSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationxpemfileSchema1();
            }
            return instance;
        }
    }

}
