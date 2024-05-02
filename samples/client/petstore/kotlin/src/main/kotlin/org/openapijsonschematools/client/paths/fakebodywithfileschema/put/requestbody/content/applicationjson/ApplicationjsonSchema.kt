package org.openapijsonschematools.client.paths.fakebodywithfileschema.put.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.FileSchemaTestClass;

public class ApplicationjsonSchema extends FileSchemaTestClass {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends FileSchemaTestClass1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
