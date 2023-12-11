package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter5.Schema5;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter6.Schema6;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter7.Schema7;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter8.Schema8;
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
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class HeaderParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class HeaderParametersMap extends FrozenMap<String, Object> {
        HeaderParametersMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "1",
            "aB",
            "A-B",
            "self"
        );
        public static HeaderParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(HeaderParameters1.class).validate(arg, configuration);
        }
        
        public String aB() {
            String key = "aB";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String self() {
            String key = "self";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
    }
    public class HeaderParametersMapInput {
        // empty mapping
    }
    
    
    public static class HeaderParameters1 extends JsonSchema<Object, Object, HeaderParametersMap, Object, Object, FrozenList<Object>> {
        public HeaderParameters1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("1", Schema5.Schema51.class),
                    new PropertyEntry("aB", Schema6.Schema61.class),
                    new PropertyEntry("A-B", Schema8.Schema81.class),
                    new PropertyEntry("self", Schema7.Schema71.class)
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
        
        @Override
        protected HeaderParametersMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new HeaderParametersMap(arg);
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public HeaderParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
