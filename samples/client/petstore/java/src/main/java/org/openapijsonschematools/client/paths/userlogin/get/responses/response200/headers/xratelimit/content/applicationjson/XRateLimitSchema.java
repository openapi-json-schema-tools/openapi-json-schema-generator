package org.openapijsonschematools.client.paths.userlogin.get.responses.response200.headers.xratelimit.content.applicationjson;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;

public class XRateLimitSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class XRateLimitSchema1 extends Int32JsonSchema.Int32JsonSchema1 {
        private static @Nullable XRateLimitSchema1 instance = null;
        public static XRateLimitSchema1 getInstance() {
            if (instance == null) {
                instance = new XRateLimitSchema1();
            }
            return instance;
        }
    }

}
