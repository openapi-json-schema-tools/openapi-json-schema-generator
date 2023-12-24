package org.openapijsonschematools.client.paths.fakemultipleresponsebodies.get.responses.response202.content.applicationjson;
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
