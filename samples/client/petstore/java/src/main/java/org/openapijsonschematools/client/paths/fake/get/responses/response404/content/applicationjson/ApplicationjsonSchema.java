package org.openapijsonschematools.client.paths.fake.get.responses.response404.content.applicationjson;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

public class ApplicationjsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ApplicationjsonSchema1 extends MapJsonSchema.MapJsonSchema1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }

}
