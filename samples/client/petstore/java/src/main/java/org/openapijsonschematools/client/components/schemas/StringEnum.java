package org.openapijsonschematools.client.components.schemas;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.NullEnumValidator;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NullValueMethod;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringValueMethod;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class StringEnum {
    // nest classes so all schemas and input/output classes can be public
    
    public enum StringStringEnumEnums implements StringValueMethod {
        PLACED("placed"),
        APPROVED("approved"),
        DELIVERED("delivered"),
        SINGLE_QUOTED("single quoted"),
        MULTIPLE_LINE_FEED_LF_LINES("multiple\nlines"),
        DOUBLE_QUOTE_LINE_FEED_LF_WITH_NEWLINE("double quote \n with newline");
        private final String value;
    
        StringStringEnumEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    public enum NullStringEnumEnums implements NullValueMethod {
        NONE(null);
        private final Void value;
    
        NullStringEnumEnums(Void value) {
            this.value = value;
        }
        public Void value() {
            return this.value;
        }
    }
    
    
    public static abstract sealed class StringEnum1Boxed permits StringEnum1BoxedVoid, StringEnum1BoxedString {}
    public static final class StringEnum1BoxedVoid extends StringEnum1Boxed {
        public final Void data;
        private StringEnum1BoxedVoid(Void data) {
            this.data = data;
        }
    }
    public static final class StringEnum1BoxedString extends StringEnum1Boxed {
        public final String data;
        private StringEnum1BoxedString(String data) {
            this.data = data;
        }
    }
    
    
    public static class StringEnum1 extends JsonSchema implements NullEnumValidator<NullStringEnumEnums>, StringEnumValidator<StringStringEnumEnums>, NullSchemaValidator<StringEnum1BoxedVoid>, StringSchemaValidator<StringEnum1BoxedString> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable StringEnum1 instance = null;
    
        protected StringEnum1() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "placed",
                    "approved",
                    "delivered",
                    "single quoted",
                    "multiple\nlines",
                    "double quote \n with newline",
                    null
                ))
            );
        }
    
        public static StringEnum1 getInstance() {
            if (instance == null) {
                instance = new StringEnum1();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public Void validate(NullStringEnumEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public String validate(StringStringEnumEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public StringEnum1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new StringEnum1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public StringEnum1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new StringEnum1BoxedString(validate(arg, configuration));
        }
    }
}
