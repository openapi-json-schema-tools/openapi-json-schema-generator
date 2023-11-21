package org.openapijsonschematools.components.responses.successwithjsonapiresponse;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.components.headers.int32jsoncontenttypeheader.content.applicationjson.Int32JsonContentTypeHeaderSchema;
import org.openapijsonschematools.components.headers.numberheader.NumberHeaderSchema;
import org.openapijsonschematools.components.headers.stringheader.StringHeaderSchema;
import org.openapijsonschematools.components.schemas.StringWithValidation;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Headers {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class HeadersMap extends FrozenMap<String, Object> {
        HeadersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static HeadersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Headers1.validate(arg, configuration);
        }
    }    
    
    public class Headers1 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("ref-schema-header", StringWithValidation.StringWithValidation1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("int32", Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("ref-content-schema-header", StringWithValidation.StringWithValidation1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("stringHeader", StringHeaderSchema.StringHeaderSchema1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("numberHeader", NumberHeaderSchema.NumberHeaderSchema1.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "int32",
            "ref-content-schema-header",
            "ref-schema-header",
            "stringHeader"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static HeadersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new HeadersMap(arg);
        }
        public static HeadersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Headers1.class, arg, configuration);
        }
    }
}
