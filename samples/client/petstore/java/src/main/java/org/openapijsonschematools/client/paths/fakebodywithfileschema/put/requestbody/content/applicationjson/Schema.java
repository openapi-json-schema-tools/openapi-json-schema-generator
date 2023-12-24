package org.openapijsonschematools.client.paths.fakebodywithfileschema.put.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.FileSchemaTestClass;

public class Schema extends FileSchemaTestClass {
    // $refed class
    
    
    public static class Schema1 extends FileSchemaTestClass1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
