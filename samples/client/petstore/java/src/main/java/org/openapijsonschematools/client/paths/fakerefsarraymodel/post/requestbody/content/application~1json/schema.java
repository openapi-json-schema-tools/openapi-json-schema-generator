package org.openapijsonschematools.client.paths.fakerefsarraymodel.post.requestbody.content.application~1json;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.AnimalFarm;

public class Schema extends AnimalFarm {
    // $refed class
    
    
    public static class Schema1 extends AnimalFarm1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
