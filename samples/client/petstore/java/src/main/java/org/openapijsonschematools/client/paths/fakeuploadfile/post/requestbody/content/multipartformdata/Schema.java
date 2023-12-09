package org.openapijsonschematools.client.paths.fakeuploadfile.post.requestbody.content.multipartformdata;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
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

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalMetadata extends StringJsonSchema {}
    
    
    public static class File extends StringJsonSchema {
        // BinarySchema
    }
    
    
    public static class SchemaMap extends FrozenMap<String, Object> {
        SchemaMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "file"
        );
        public static final Set<String> optionalKeys = Set.of(
            "additionalMetadata"
        );
        public static SchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema1.class).validate(arg, configuration);
        }
        
        public String file() {
            return (String) get("file");
        }
        
        public String additionalMetadata() {
            String key = "additionalMetadata";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class SchemaMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Schema1 extends JsonSchema<Object, SchemaMap, Object, FrozenList<Object>> {
        public Schema1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("additionalMetadata", AdditionalMetadata.class),
                    new PropertyEntry("file", File.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "file"
                )))
            )));
        }
        
        @Override
        protected SchemaMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new SchemaMap((FrozenMap<String, Object>) arg);
        }
        public SchemaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
