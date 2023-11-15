package org.openapijsonschematools.paths.fakehealth.get.responses.response200.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static HealthCheckResult.HealthCheckResult2 withDefaults() {
            return HealthCheckResult.HealthCheckResult2.withDefaults();
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(HealthCheckResult.HealthCheckResult2.class, arg, configuration);
        }
    }
}
