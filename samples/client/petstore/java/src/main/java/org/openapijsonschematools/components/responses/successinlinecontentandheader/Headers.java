package org.openapijsonschematools.components.responses.successinlinecontentandheader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.components.responses.successinlinecontentandheader.headers.someheader.SomeHeaderSchema;
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
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class)),
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("someHeader", SomeHeaderSchema.SomeHeaderSchema1.class)
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
