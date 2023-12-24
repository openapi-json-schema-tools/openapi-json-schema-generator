package org.openapijsonschematools.client.paths.fake.get.responses.response404.content.applicationjson;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema1 extends MapJsonSchema {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }

}
