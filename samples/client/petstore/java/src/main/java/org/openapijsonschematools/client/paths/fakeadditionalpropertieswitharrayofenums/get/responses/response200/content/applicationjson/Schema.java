package org.openapijsonschematools.client.paths.fakeadditionalpropertieswitharrayofenums.get.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.AdditionalPropertiesWithArrayOfEnums;

public class Schema extends AdditionalPropertiesWithArrayOfEnums {
    // $refed class
    
    
    public static class Schema1 extends AdditionalPropertiesWithArrayOfEnums1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
