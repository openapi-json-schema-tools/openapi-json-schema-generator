package org.openapijsonschematools.client.paths.fakerefscomposedoneofnumberwithvalidations.post.requestbody.content.application~1json;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.ComposedOneOfDifferentTypes;

public class Schema extends ComposedOneOfDifferentTypes {
    // $refed class
    
    
    public static class Schema1 extends ComposedOneOfDifferentTypes1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
