package org.openapijsonschematools.paths.userlogin.get.responses.response200;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.components.headers.int32jsoncontenttypeheader.content.applicationjson.Int32JsonContentTypeHeaderSchema;
import org.openapijsonschematools.components.headers.numberheader.NumberHeaderSchema;
import org.openapijsonschematools.components.schemas.StringWithValidation;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.userlogin.get.responses.response200.headers.xexpiresafter.XExpiresAfterSchema;
import org.openapijsonschematools.paths.userlogin.get.responses.response200.headers.xratelimit.content.applicationjson.XRateLimitSchema;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;

public class Headers {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    class HeadersMap extends FrozenMap<String, Object> {
        HeadersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static HeadersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Headers1.validate(arg, configuration);
        }
    }    
    
    public class Headers1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("X-Rate-Limit", XRateLimitSchema.XRateLimitSchema1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("int32", Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("X-Expires-After", XExpiresAfterSchema.XExpiresAfterSchema1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("ref-content-schema-header", StringWithValidation.StringWithValidation1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("numberHeader", NumberHeaderSchema.NumberHeaderSchema1.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "X-Rate-Limit",
            "int32",
            "ref-content-schema-header"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        public static HeadersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new HeadersMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Headers1.class, arg, configuration);
        }
    }
}
