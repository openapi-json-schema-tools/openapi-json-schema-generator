package unit_test_api.components.schemas;
import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.schemas.StringJsonSchema;

public class TypeAsArrayWithOneItem extends StringJsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class TypeAsArrayWithOneItem1 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable TypeAsArrayWithOneItem1 instance = null;
        public static TypeAsArrayWithOneItem1 getInstance() {
            if (instance == null) {
                instance = new TypeAsArrayWithOneItem1();
            }
            return instance;
        }
    }

}
