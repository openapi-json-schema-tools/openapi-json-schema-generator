package org.openapijsonschematools.client.paths.userlogin.get.responses.response200;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.components.headers.int32jsoncontenttypeheader.content.applicationjson.Int32JsonContentTypeHeaderSchema;
import org.openapijsonschematools.client.components.headers.numberheader.NumberHeaderSchema;
import org.openapijsonschematools.client.components.schemas.StringWithValidation;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.userlogin.get.responses.response200.headers.xexpiresafter.XExpiresAfterSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.response200.headers.xratelimit.content.applicationjson.XRateLimitSchema;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Headers {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class HeadersMap extends FrozenMap<String, Object> {
        HeadersMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "X-Rate-Limit",
            "int32",
            "ref-content-schema-header"
        );
        public static final Set<String> optionalKeys = Set.of(
            "X-Expires-After",
            "numberHeader"
        );
        public static HeadersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Headers1.class).validate(arg, configuration);
        }
        
        public int int32() {
            return (int) get("int32");
        }
        
        public String numberHeader() {
            String key = "numberHeader";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
    }
    public class HeadersMapInput {
        // requiredProperties, optionalProperties, NO additionalProperties
    }
    
    
    public static class Headers1 extends JsonSchema<Object, Object, HeadersMap, Object, Object, FrozenList<Object>> {
        public Headers1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("X-Rate-Limit", XRateLimitSchema.XRateLimitSchema1.class),
                    new PropertyEntry("int32", Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.class),
                    new PropertyEntry("X-Expires-After", XExpiresAfterSchema.XExpiresAfterSchema1.class),
                    new PropertyEntry("ref-content-schema-header", StringWithValidation.StringWithValidation1.class),
                    new PropertyEntry("numberHeader", NumberHeaderSchema.NumberHeaderSchema1.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "X-Rate-Limit",
                    "int32",
                    "ref-content-schema-header"
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
        
        @Override
        protected HeadersMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new HeadersMap(arg);
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public HeadersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
