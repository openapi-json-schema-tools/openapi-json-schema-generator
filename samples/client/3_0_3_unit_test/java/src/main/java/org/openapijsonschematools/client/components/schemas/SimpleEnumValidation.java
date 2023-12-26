package org.openapijsonschematools.client.components.schemas;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
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
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class SimpleEnumValidation {
    // nest classes so all schemas and input/output classes can be public
    
    public enum IntegerSimpleEnumValidationEnums {
        POSITIVE_1(1),
        POSITIVE_2(2),
        POSITIVE_3(3);
        private final Integer value;
    
        IntegerSimpleEnumValidationEnums(Integer value) {
            this.value = value;
        }
        public Integer value() {
            return this.value;
        }
    }
    
    public enum LongSimpleEnumValidationEnums {
        POSITIVE_1(1L),
        POSITIVE_2(2L),
        POSITIVE_3(3L);
        private final Long value;
    
        LongSimpleEnumValidationEnums(Long value) {
            this.value = value;
        }
        public Long value() {
            return this.value;
        }
    }
    
    public enum FloatSimpleEnumValidationEnums {
        POSITIVE_1(1.0f),
        POSITIVE_2(2.0f),
        POSITIVE_3(3.0f);
        private final Float value;
    
        FloatSimpleEnumValidationEnums(Float value) {
            this.value = value;
        }
        public Float value() {
            return this.value;
        }
    }
    
    public enum DoubleSimpleEnumValidationEnums {
        POSITIVE_1(1.0d),
        POSITIVE_2(2.0d),
        POSITIVE_3(3.0d);
        private final Double value;
    
        DoubleSimpleEnumValidationEnums(Double value) {
            this.value = value;
        }
        public Double value() {
            return this.value;
        }
    }
    
    
    public static class SimpleEnumValidation1 extends JsonSchema implements NumberSchemaValidator {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable SimpleEnumValidation1 instance = null;
    
        protected SimpleEnumValidation1() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .enumValues(SetMaker.makeSet(
                    new BigDecimal("1"),
                    new BigDecimal("2"),
                    new BigDecimal("3")
                ))
            );
        }
    
        public static SimpleEnumValidation1 getInstance() {
            if (instance == null) {
                instance = new SimpleEnumValidation1();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }
}
