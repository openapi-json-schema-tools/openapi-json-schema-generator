package org.openapijsonschematools.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.BooleanJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.AllOfValidator;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;

public class AdditionalpropertiesShouldNotLookInApplicators {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends BooleanJsonSchema {}
    
    
    public static class Foo extends AnyTypeJsonSchema {}
    
    
    public static class Schema0Map extends FrozenMap<String, Object> {
        Schema0Map(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "foo"
        );
        public static Schema0Map of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema0.validate(arg, configuration);
        }
        
        public Object foo() {
            String key = "foo";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public static class Schema0 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("foo", Foo.class)
            )))
        ));
        
        protected static Schema0Map getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new Schema0Map(arg);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static Schema0Map validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema0.class, arg, configuration);
        }
    }    
    
    public static class AdditionalpropertiesShouldNotLookInApplicatorsMap extends FrozenMap<String, Boolean> {
        AdditionalpropertiesShouldNotLookInApplicatorsMap(FrozenMap<String, Boolean> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static AdditionalpropertiesShouldNotLookInApplicatorsMap of(Map<String, Boolean> arg, SchemaConfiguration configuration) throws ValidationException {
            return AdditionalpropertiesShouldNotLookInApplicators1.validate(arg, configuration);
        }
        
        public boolean getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public static class AdditionalpropertiesShouldNotLookInApplicators1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        
        protected static AdditionalpropertiesShouldNotLookInApplicatorsMap getMapOutputInstance(FrozenMap<String, Boolean> arg) {
            return new AdditionalpropertiesShouldNotLookInApplicatorsMap(arg);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static AdditionalpropertiesShouldNotLookInApplicatorsMap validate(Map<String, Boolean> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(AdditionalpropertiesShouldNotLookInApplicators1.class, arg, configuration);
        }
    }}
