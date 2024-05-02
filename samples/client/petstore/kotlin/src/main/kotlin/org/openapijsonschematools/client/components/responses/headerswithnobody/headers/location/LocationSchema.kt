package org.openapijsonschematools.client.components.responses.headerswithnobody.headers.location;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class LocationSchema extends StringJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class LocationSchema1 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable LocationSchema1 instance = null;
        public static LocationSchema1 getInstance() {
            if (instance == null) {
                instance = new LocationSchema1();
            }
            return instance;
        }
    }

}
