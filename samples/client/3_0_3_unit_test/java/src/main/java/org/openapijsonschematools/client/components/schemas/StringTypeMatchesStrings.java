package org.openapijsonschematools.client.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

public class StringTypeMatchesStrings {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class StringTypeMatchesStrings1 extends StringJsonSchema {
        private static @Nullable StringTypeMatchesStrings1 instance = null;
        public static StringTypeMatchesStrings1 getInstance() {
            if (instance == null) {
                instance = new StringTypeMatchesStrings1();
            }
            return instance;
        }
    }

}
