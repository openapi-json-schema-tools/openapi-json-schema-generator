package unit_test_api.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.schemas.BooleanJsonSchema;

public class BooleanTypeMatchesBooleans extends BooleanJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class BooleanTypeMatchesBooleans1 extends BooleanJsonSchema.BooleanJsonSchema1 {
        private static @Nullable BooleanTypeMatchesBooleans1 instance = null;
        public static BooleanTypeMatchesBooleans1 getInstance() {
            if (instance == null) {
                instance = new BooleanTypeMatchesBooleans1();
            }
            return instance;
        }
    }

}
