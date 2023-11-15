package org.openapijsonschematools.paths.fakerefsnumber.post.responses.response200.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static NumberWithValidations.NumberWithValidations2 withDefaults() {
            return NumberWithValidations.NumberWithValidations2.withDefaults();
        }
    
        public static Number validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberWithValidations.NumberWithValidations2.class, arg, configuration);
        }
        
        public static Number validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberWithValidations.NumberWithValidations2.class, arg, configuration);
        }
        
        public static Number validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberWithValidations.NumberWithValidations2.class, arg, configuration);
        }
        
        public static Number validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberWithValidations.NumberWithValidations2.class, arg, configuration);
        }
    }
}
