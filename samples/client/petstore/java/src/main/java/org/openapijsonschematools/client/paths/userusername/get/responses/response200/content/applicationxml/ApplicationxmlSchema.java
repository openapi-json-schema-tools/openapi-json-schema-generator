package org.openapijsonschematools.client.paths.userusername.get.responses.response200.content.applicationxml;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.User;

public class ApplicationxmlSchema extends User {
    // $refed class
    
    
    public static class ApplicationxmlSchema1 extends User1 {
        private static @Nullable ApplicationxmlSchema1 instance = null;
        public static ApplicationxmlSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationxmlSchema1();
            }
            return instance;
        }
    }
}
