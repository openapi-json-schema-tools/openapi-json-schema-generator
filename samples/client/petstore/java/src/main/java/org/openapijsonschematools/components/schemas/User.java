package org.openapijsonschematools.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.Int32JsonSchema;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.MapJsonSchema;
import org.openapijsonschematools.schemas.NullJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class User {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Id extends Int64JsonSchema {}
    
    
    public class Username extends StringJsonSchema {}
    
    
    public class FirstName extends StringJsonSchema {}
    
    
    public class LastName extends StringJsonSchema {}
    
    
    public class Email extends StringJsonSchema {}
    
    
    public class Password extends StringJsonSchema {}
    
    
    public class Phone extends StringJsonSchema {}
    
    
    public class UserStatus extends Int32JsonSchema {}
    
    
    public class ObjectWithNoDeclaredProps extends MapJsonSchema {}
    
    
    public class ObjectWithNoDeclaredPropsNullable extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Void.class,
                FrozenMap.class
            )))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectWithNoDeclaredPropsNullable.class, arg, configuration);
        }
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectWithNoDeclaredPropsNullable.class, arg, configuration);
        }
    }    
    
    public class AnyTypeProp extends AnyTypeJsonSchema {}
    
    
    public class Not extends NullJsonSchema {}
    
    
    public class AnyTypeExceptNullProp extends JsonSchema {
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
        
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeExceptNullProp.class, arg, configuration);
        }
    }    
    
    public class AnyTypePropNullable extends AnyTypeJsonSchema {}
    
    
    public static class UserMap extends FrozenMap<String, Object> {

        UserMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static UserMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return User1.validate(arg, configuration);
        }
        
        public long id() {

            String key = "id";
            if (!containsKey(key)) {
                throw new RuntimeException("id is unset");
            }
            return long get(key);

        }
        
        public String username() {

            String key = "username";
            if (!containsKey(key)) {
                throw new RuntimeException("username is unset");
            }
            return String get(key);

        }
        
        public String firstName() {

            String key = "firstName";
            if (!containsKey(key)) {
                throw new RuntimeException("firstName is unset");
            }
            return String get(key);

        }
        
        public String lastName() {

            String key = "lastName";
            if (!containsKey(key)) {
                throw new RuntimeException("lastName is unset");
            }
            return String get(key);

        }
        
        public String email() {

            String key = "email";
            if (!containsKey(key)) {
                throw new RuntimeException("email is unset");
            }
            return String get(key);

        }
        
        public String password() {

            String key = "password";
            if (!containsKey(key)) {
                throw new RuntimeException("password is unset");
            }
            return String get(key);

        }
        
        public String phone() {

            String key = "phone";
            if (!containsKey(key)) {
                throw new RuntimeException("phone is unset");
            }
            return String get(key);

        }
        
        public int userStatus() {

            String key = "userStatus";
            if (!containsKey(key)) {
                throw new RuntimeException("userStatus is unset");
            }
            return int get(key);

        }
        
        public FrozenMap<String, Object> objectWithNoDeclaredProps() {

            String key = "objectWithNoDeclaredProps";
            if (!containsKey(key)) {
                throw new RuntimeException("objectWithNoDeclaredProps is unset");
            }
            return FrozenMap<String, Object> get(key);

        }
        
        public FrozenMap<String, Object> objectWithNoDeclaredPropsNullable() {

            String key = "objectWithNoDeclaredPropsNullable";
            if (!containsKey(key)) {
                throw new RuntimeException("objectWithNoDeclaredPropsNullable is unset");
            }
            return FrozenMap<String, Object> get(key);

        }
        
        public Object anyTypeProp() {

            String key = "anyTypeProp";
            if (!containsKey(key)) {
                throw new RuntimeException("anyTypeProp is unset");
            }
            return get(key);
        }
        
        public Object anyTypeExceptNullProp() {

            String key = "anyTypeExceptNullProp";
            if (!containsKey(key)) {
                throw new RuntimeException("anyTypeExceptNullProp is unset");
            }
            return get(key);
        }
        
        public Object anyTypePropNullable() {

            String key = "anyTypePropNullable";
            if (!containsKey(key)) {
                throw new RuntimeException("anyTypePropNullable is unset");
            }
            return get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class User1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
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
        protected static UserMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new UserMap(arg);
        }
        public static UserMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(User1.class, arg, configuration);
        }
    }
}
