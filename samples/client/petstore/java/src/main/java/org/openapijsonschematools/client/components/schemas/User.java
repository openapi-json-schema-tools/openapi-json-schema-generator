package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.NullJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.NotValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class User {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Id extends Int64JsonSchema {}
    
    
    public static class Username extends StringJsonSchema {}
    
    
    public static class FirstName extends StringJsonSchema {}
    
    
    public static class LastName extends StringJsonSchema {}
    
    
    public static class Email extends StringJsonSchema {}
    
    
    public static class Password extends StringJsonSchema {}
    
    
    public static class Phone extends StringJsonSchema {}
    
    
    public static class UserStatus extends Int32JsonSchema {}
    
    
    public static class ObjectWithNoDeclaredProps extends MapJsonSchema {}
    
    
    public static class ObjectWithNoDeclaredPropsNullable extends JsonSchema<FrozenMap, FrozenList> {
        public ObjectWithNoDeclaredPropsNullable() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    FrozenMap.class
                )))
            ));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }    
    
    public static class AnyTypeProp extends AnyTypeJsonSchema {}
    
    
    public static class Not extends NullJsonSchema {}
    
    
    public static class AnyTypeExceptNullProp extends JsonSchema<FrozenMap, FrozenList> {
        public AnyTypeExceptNullProp() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("not", new NotValidator(Not.class))
            ));
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
    
    public static class AnyTypePropNullable extends AnyTypeJsonSchema {}
    
    
    public static class UserMap extends FrozenMap<String, Object> {
        UserMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "id",
            "username",
            "firstName",
            "lastName",
            "email",
            "password",
            "phone",
            "userStatus",
            "objectWithNoDeclaredProps",
            "objectWithNoDeclaredPropsNullable",
            "anyTypeProp",
            "anyTypeExceptNullProp",
            "anyTypePropNullable"
        );
        public static UserMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(User1.class).validate(arg, configuration);
        }
        
        public long id() {
            String key = "id";
            throwIfKeyNotPresent(key);
            return (long) get(key);
        }
        
        public String username() {
            String key = "username";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String firstName() {
            String key = "firstName";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String lastName() {
            String key = "lastName";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String email() {
            String key = "email";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String password() {
            String key = "password";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String phone() {
            String key = "phone";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public int userStatus() {
            String key = "userStatus";
            throwIfKeyNotPresent(key);
            return (int) get(key);
        }
        
        public FrozenMap<String, Object> objectWithNoDeclaredProps() {
            String key = "objectWithNoDeclaredProps";
            throwIfKeyNotPresent(key);
            return (FrozenMap<String, Object>) get(key);
        }
        
        public FrozenMap<String, Object> objectWithNoDeclaredPropsNullable() {
            String key = "objectWithNoDeclaredPropsNullable";
            throwIfKeyNotPresent(key);
            return (FrozenMap<String, Object>) get(key);
        }
        
        public Object anyTypeProp() {
            String key = "anyTypeProp";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public Object anyTypeExceptNullProp() {
            String key = "anyTypeExceptNullProp";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public Object anyTypePropNullable() {
            String key = "anyTypePropNullable";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class UserMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class User1 extends JsonSchema<UserMap, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public User1() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("id", Id.class),
                    new PropertyEntry("username", Username.class),
                    new PropertyEntry("firstName", FirstName.class),
                    new PropertyEntry("lastName", LastName.class),
                    new PropertyEntry("email", Email.class),
                    new PropertyEntry("password", Password.class),
                    new PropertyEntry("phone", Phone.class),
                    new PropertyEntry("userStatus", UserStatus.class),
                    new PropertyEntry("objectWithNoDeclaredProps", ObjectWithNoDeclaredProps.class),
                    new PropertyEntry("objectWithNoDeclaredPropsNullable", ObjectWithNoDeclaredPropsNullable.class),
                    new PropertyEntry("anyTypeProp", AnyTypeProp.class),
                    new PropertyEntry("anyTypeExceptNullProp", AnyTypeExceptNullProp.class),
                    new PropertyEntry("anyTypePropNullable", AnyTypePropNullable.class)
                )))
            ));
        }
        
        @Override
        protected UserMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new UserMap((FrozenMap<String, Object>) arg);
        }
        public UserMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
