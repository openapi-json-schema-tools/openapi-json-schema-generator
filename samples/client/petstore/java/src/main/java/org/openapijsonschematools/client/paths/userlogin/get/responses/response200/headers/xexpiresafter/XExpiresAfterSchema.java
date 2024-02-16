package org.openapijsonschematools.client.paths.userlogin.get.responses.response200.headers.xexpiresafter;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.DateTimeJsonSchema;

public class XExpiresAfterSchema extends DateTimeJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class XExpiresAfterSchema1 extends DateTimeJsonSchema.DateTimeJsonSchema1 {
        private static @Nullable XExpiresAfterSchema1 instance = null;
        public static XExpiresAfterSchema1 getInstance() {
            if (instance == null) {
                instance = new XExpiresAfterSchema1();
            }
            return instance;
        }
    }

}
