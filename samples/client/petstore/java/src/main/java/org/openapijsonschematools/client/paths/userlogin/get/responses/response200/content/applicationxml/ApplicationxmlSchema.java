package org.openapijsonschematools.client.paths.userlogin.get.responses.response200.content.applicationxml;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class ApplicationxmlSchema extends StringJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ApplicationxmlSchema1 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable ApplicationxmlSchema1 instance = null;
        public static ApplicationxmlSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationxmlSchema1();
            }
            return instance;
        }
    }

}
