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
import org.openapijsonschematools.client.schemas.validation.DoubleEnumValidator;
import org.openapijsonschematools.client.schemas.validation.DoubleValueMethod;
import org.openapijsonschematools.client.schemas.validation.FloatEnumValidator;
import org.openapijsonschematools.client.schemas.validation.FloatValueMethod;
import org.openapijsonschematools.client.schemas.validation.IntegerEnumValidator;
import org.openapijsonschematools.client.schemas.validation.IntegerValueMethod;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.LongEnumValidator;
import org.openapijsonschematools.client.schemas.validation.LongValueMethod;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class EnumWith0DoesNotMatchFalse {
    // nest classes so all schemas and input/output classes can be public
    
    public enum IntegerEnumWith0DoesNotMatchFalseEnums implements IntegerValueMethod {
        POSITIVE_0(0);
        private final int value;
    
        IntegerEnumWith0DoesNotMatchFalseEnums(int value) {
            this.value = value;
        }
        public int value() {
            return this.value;
        }
    }
    
    public enum LongEnumWith0DoesNotMatchFalseEnums implements LongValueMethod {
        POSITIVE_0(0L);
        private final long value;
    
        LongEnumWith0DoesNotMatchFalseEnums(long value) {
            this.value = value;
        }
        public long value() {
            return this.value;
        }
    }
    
    public enum FloatEnumWith0DoesNotMatchFalseEnums implements FloatValueMethod {
        POSITIVE_0(0.0f);
        private final float value;
    
        FloatEnumWith0DoesNotMatchFalseEnums(float value) {
            this.value = value;
        }
        public float value() {
            return this.value;
        }
    }
    
    public enum DoubleEnumWith0DoesNotMatchFalseEnums implements DoubleValueMethod {
        POSITIVE_0(0.0d);
        private final double value;
    
        DoubleEnumWith0DoesNotMatchFalseEnums(double value) {
            this.value = value;
        }
        public double value() {
            return this.value;
        }
    }
    
    
    public sealed interface EnumWith0DoesNotMatchFalse1Boxed permits EnumWith0DoesNotMatchFalse1BoxedNumber {
        @Nullable Object getData();
    }
    
    public record EnumWith0DoesNotMatchFalse1BoxedNumber(Number data) implements EnumWith0DoesNotMatchFalse1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class EnumWith0DoesNotMatchFalse1 extends JsonSchema<EnumWith0DoesNotMatchFalse1Boxed> implements IntegerEnumValidator<IntegerEnumWith0DoesNotMatchFalseEnums>, LongEnumValidator<LongEnumWith0DoesNotMatchFalseEnums>, FloatEnumValidator<FloatEnumWith0DoesNotMatchFalseEnums>, DoubleEnumValidator<DoubleEnumWith0DoesNotMatchFalseEnums>, NumberSchemaValidator<EnumWith0DoesNotMatchFalse1BoxedNumber> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable EnumWith0DoesNotMatchFalse1 instance = null;
    
        protected EnumWith0DoesNotMatchFalse1() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .enumValues(SetMaker.makeSet(
                    new BigDecimal("0")
                ))
            );
        }
    
        public static EnumWith0DoesNotMatchFalse1 getInstance() {
            if (instance == null) {
                instance = new EnumWith0DoesNotMatchFalse1();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public int validate(IntegerEnumWith0DoesNotMatchFalseEnums arg,SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            return (int) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public long validate(LongEnumWith0DoesNotMatchFalseEnums arg,SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            return (long) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public float validate(FloatEnumWith0DoesNotMatchFalseEnums arg,SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            return (float) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public double validate(DoubleEnumWith0DoesNotMatchFalseEnums arg,SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            return (double) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public EnumWith0DoesNotMatchFalse1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new EnumWith0DoesNotMatchFalse1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public EnumWith0DoesNotMatchFalse1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
