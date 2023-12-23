package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter5;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringWithValidation;

public class Schema5 extends StringWithValidation {
    // $refed class
    
    
    public static class Schema51 extends StringWithValidation1 {
        private static @Nullable Schema51 instance = null;
        public static Schema51 getInstance() {
            if (instance == null) {
                instance = new Schema51();
            }
            return instance;
        }
    }
}
