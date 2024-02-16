package org.openapijsonschematools.client.paths.fakerefsarraymodel.post.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.AnimalFarm;

public class ApplicationjsonSchema extends AnimalFarm {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends AnimalFarm1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
