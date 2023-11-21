package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ReqPropsFromTrueAddProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends AnyTypeJsonSchema {}
    
    
    public static class ReqPropsFromTrueAddPropsMap extends FrozenMap<String, Object> {
        ReqPropsFromTrueAddPropsMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ReqPropsFromTrueAddPropsMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ReqPropsFromTrueAddProps1.validate(arg, configuration);
        }
    }    
    
    public class ReqPropsFromTrueAddProps1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "invalid-name",
            "validName"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static ReqPropsFromTrueAddPropsMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ReqPropsFromTrueAddPropsMap(arg);
        }
        public static ReqPropsFromTrueAddPropsMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ReqPropsFromTrueAddProps1.class, arg, configuration);
        }
    }
}
