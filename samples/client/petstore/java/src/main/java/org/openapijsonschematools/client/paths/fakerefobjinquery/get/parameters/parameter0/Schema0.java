package org.openapijsonschematools.client.paths.fakerefobjinquery.get.parameters.parameter0;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Foo;

public class Schema0 extends Foo {
    // $refed class
    
    
    public static class Schema01 extends Foo1 {
        private static @Nullable Schema01 instance = null;
        public static Schema01 getInstance() {
            if (instance == null) {
                instance = new Schema01();
            }
            return instance;
        }
    }
}
