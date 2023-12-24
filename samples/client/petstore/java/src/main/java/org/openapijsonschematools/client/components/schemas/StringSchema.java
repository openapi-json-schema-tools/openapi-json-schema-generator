package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class StringSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class StringSchema1 extends StringJsonSchema {
        private static @Nullable StringSchema1 instance = null;
        public static StringSchema1 getInstance() {
            if (instance == null) {
                instance = new StringSchema1();
            }
            return instance;
        }
    }

}
