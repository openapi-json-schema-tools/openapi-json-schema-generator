package org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter5;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static StringWithValidation.StringWithValidation2 withDefaults() {
            return StringWithValidation.StringWithValidation2.withDefaults();
        }
    
        // container included
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringWithValidation.StringWithValidation2.class, arg, configuration);
        }
    }
}
