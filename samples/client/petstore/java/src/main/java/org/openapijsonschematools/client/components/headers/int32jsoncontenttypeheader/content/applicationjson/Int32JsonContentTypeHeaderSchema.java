package org.openapijsonschematools.client.components.headers.int32jsoncontenttypeheader.content.applicationjson;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;

public class Int32JsonContentTypeHeaderSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Int32JsonContentTypeHeaderSchema1 extends Int32JsonSchema {
        private static @Nullable Int32JsonContentTypeHeaderSchema1 instance = null;
        public static Int32JsonContentTypeHeaderSchema1 getInstance() {
            if (instance == null) {
                instance = new Int32JsonContentTypeHeaderSchema1();
            }
            return instance;
        }
    }

}
