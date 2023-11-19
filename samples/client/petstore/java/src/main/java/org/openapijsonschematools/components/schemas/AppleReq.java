package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.BooleanJsonSchema;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class AppleReq {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public class Cultivar extends StringJsonSchema {}
    
    
    public class Mealy extends BooleanJsonSchema {}
    
    
    class AppleReqMap extends FrozenMap<String, Object> {
        AppleReqMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static AppleReqMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return AppleReq1.validate(arg, configuration);
        }
    }    
    
    public class AppleReq1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("cultivar", Cultivar.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("mealy", Mealy.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "cultivar"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        public static AppleReqMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new AppleReqMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AppleReq1.class, arg, configuration);
        }
    }
}
