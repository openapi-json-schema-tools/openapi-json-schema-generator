package org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.parameter1;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.AllOfValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.MinLengthValidator;
import org.openapijsonschematools.client.schemas.validation.NonCollectionJsonSchema;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Schema1 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema01 extends NonCollectionJsonSchema {
        public Schema01() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("minLength", new MinLengthValidator(1))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class SomeProp1 extends NonCollectionJsonSchema {
        public SomeProp1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("allOf", new AllOfValidator(List.of(
                    Schema01.class
                )))
            )));
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return validateInt(arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLong(arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return validateFloat(arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return validateDouble(arg, configuration);
        }
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class SchemaMap1 extends FrozenMap<String, Object> {
        SchemaMap1(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "someProp"
        );
        public static SchemaMap1 of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema11.class).validate(arg, configuration);
        }
        
        public Object someProp() {
            String key = "someProp";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class SchemaMapInput1 {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Schema11 extends JsonSchema<Object, Object, SchemaMap1, Object, Object, FrozenList<Object>> {
        public Schema11() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("someProp", SomeProp1.class)
                )))
            )));
        }
        
        @Override
        protected SchemaMap1 getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new SchemaMap1(arg);
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public SchemaMap1 validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
