package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter10.Schema10;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter11.Schema11;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter12.Schema12;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter13.Schema13;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter9.Schema9;
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

public class PathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class PathParametersMap extends FrozenMap<String, Object> {
        PathParametersMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "1",
            "A-B",
            "Ab",
            "aB",
            "self"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static PathParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(PathParameters1.class).validate(arg, configuration);
        }
        
        public String Ab() {
            return (String) get("Ab");
        }
        
        public String aB() {
            return (String) get("aB");
        }
        
        public String self() {
            return (String) get("self");
        }
    }
    public class PathParametersMapInput {
        // empty mapping
    }
    
    
    public static class PathParameters1 extends JsonSchema<Object, Object, PathParametersMap, Object, Object, FrozenList<Object>> {
        public PathParameters1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("1", Schema9.Schema91.class),
                    new PropertyEntry("aB", Schema10.Schema101.class),
                    new PropertyEntry("Ab", Schema11.Schema111.class),
                    new PropertyEntry("A-B", Schema13.Schema131.class),
                    new PropertyEntry("self", Schema12.Schema121.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "1",
                    "A-B",
                    "Ab",
                    "aB",
                    "self"
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
        
        @Override
        protected PathParametersMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new PathParametersMap(arg);
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public PathParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
