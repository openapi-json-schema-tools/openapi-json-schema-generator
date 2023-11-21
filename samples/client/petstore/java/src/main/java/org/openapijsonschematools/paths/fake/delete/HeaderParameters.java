package org.openapijsonschematools.paths.fake.delete;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fake.delete.parameters.parameter1.Schema1;
import org.openapijsonschematools.paths.fake.delete.parameters.parameter4.Schema4;
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

public class HeaderParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class HeaderParametersMap extends FrozenMap<String, Object> {
        HeaderParametersMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static HeaderParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return HeaderParameters1.validate(arg, configuration);
        }
    }    
    
    public class HeaderParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("required_boolean_group", Schema1.Schema11.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("boolean_group", Schema4.Schema41.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "required_boolean_group"
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        protected static HeaderParametersMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new HeaderParametersMap(arg);
        }
        public static HeaderParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(HeaderParameters1.class, arg, configuration);
        }
    }
}
