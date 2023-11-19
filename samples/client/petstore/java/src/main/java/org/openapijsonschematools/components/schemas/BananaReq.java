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
import org.openapijsonschematools.schemas.NumberJsonSchema;

public class BananaReq {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public class LengthCm extends NumberJsonSchema {}
    
    
    public class Sweet extends BooleanJsonSchema {}
    
    
    public static class BananaReqMap extends FrozenMap<String, Object> {
        BananaReqMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static BananaReqMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return BananaReq1.validate(arg, configuration);
        }
    }    
    
    public class BananaReq1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("lengthCm", LengthCm.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("sweet", Sweet.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "lengthCm"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        static BananaReqMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new BananaReqMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(BananaReq1.class, arg, configuration);
        }
    }
}
