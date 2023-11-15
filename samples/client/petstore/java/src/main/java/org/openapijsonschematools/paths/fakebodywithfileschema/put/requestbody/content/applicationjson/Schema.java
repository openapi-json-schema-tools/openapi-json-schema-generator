package org.openapijsonschematools.paths.fakebodywithfileschema.put.requestbody.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static FileSchemaTestClass.FileSchemaTestClass2 withDefaults() {
            return FileSchemaTestClass.FileSchemaTestClass2.withDefaults();
        }
    
        // container included
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(FileSchemaTestClass.FileSchemaTestClass2.class, arg, configuration);
        }
    }
}
