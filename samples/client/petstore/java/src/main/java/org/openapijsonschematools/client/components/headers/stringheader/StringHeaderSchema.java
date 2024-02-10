package org.openapijsonschematools.client.components.headers.stringheader;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class StringHeaderSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class StringHeaderSchema1 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable StringHeaderSchema1 instance = null;
        public static StringHeaderSchema1 getInstance() {
            if (instance == null) {
                instance = new StringHeaderSchema1();
            }
            return instance;
        }
    }

}
