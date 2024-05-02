package org.openapijsonschematools.client.paths.storeorder.post.responses.code200response.content.applicationxml;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Order;

public class ApplicationxmlSchema extends Order {
    // $refed class
    
    
    public static class ApplicationxmlSchema1 extends Order1 {
        private static @Nullable ApplicationxmlSchema1 instance = null;
        public static ApplicationxmlSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationxmlSchema1();
            }
            return instance;
        }
    }
}
