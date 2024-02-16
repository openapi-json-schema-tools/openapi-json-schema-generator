package org.openapijsonschematools.client.components.responses.successinlinecontentandheader.headers.someheader;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class SomeHeaderSchema extends StringJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SomeHeaderSchema1 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable SomeHeaderSchema1 instance = null;
        public static SomeHeaderSchema1 getInstance() {
            if (instance == null) {
                instance = new SomeHeaderSchema1();
            }
            return instance;
        }
    }

}
