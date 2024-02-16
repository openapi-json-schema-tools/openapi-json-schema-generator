package org.openapijsonschematools.client.paths.fakehealth.get.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.HealthCheckResult;

public class ApplicationjsonSchema extends HealthCheckResult {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends HealthCheckResult1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
