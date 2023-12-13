package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class PropertiesWithEscapedCharacters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Foonbar extends NumberJsonSchema {}
    
    
    public static class Foobar extends NumberJsonSchema {}
    
    
    public static class Foobar1 extends NumberJsonSchema {}
    
    
    public static class Foorbar extends NumberJsonSchema {}
    
    
    public static class Footbar extends NumberJsonSchema {}
    
    
    public static class Foofbar extends NumberJsonSchema {}
    
    
    public static class PropertiesWithEscapedCharactersMap extends FrozenMap<Object> {
        PropertiesWithEscapedCharactersMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "foo\nbar",
            "foo\"bar",
            "foo\\bar",
            "foo\rbar",
            "foo\tbar",
            "foo\fbar"
        );
        public static PropertiesWithEscapedCharactersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(PropertiesWithEscapedCharacters1.class).validate(arg, configuration);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class PropertiesWithEscapedCharactersMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class PropertiesWithEscapedCharacters1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public PropertiesWithEscapedCharacters1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("foo\nbar", Foonbar.class),
                    new PropertyEntry("foo\"bar", Foobar.class),
                    new PropertyEntry("foo\\bar", Foobar1.class),
                    new PropertyEntry("foo\rbar", Foorbar.class),
                    new PropertyEntry("foo\tbar", Footbar.class),
                    new PropertyEntry("foo\fbar", Foofbar.class)
                )))
            )));
        }
        
        @Override
        protected PropertiesWithEscapedCharactersMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new PropertiesWithEscapedCharactersMap(arg);
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
        
        public PropertiesWithEscapedCharactersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }
}
