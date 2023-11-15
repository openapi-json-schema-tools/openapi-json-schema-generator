package org.openapijsonschematools.paths.fakeadditionalpropertieswitharrayofenums.get.responses.response200.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnums2 withDefaults() {
            return AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnums2.withDefaults();
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnums2.class, arg, configuration);
        }
    }
}
