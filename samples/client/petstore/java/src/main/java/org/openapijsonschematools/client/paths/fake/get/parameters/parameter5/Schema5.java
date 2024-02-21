package org.openapijsonschematools.client.paths.fake.get.parameters.parameter5;
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
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Schema5 {
    // nest classes so all schemas and input/output classes can be public
    
    public enum DoubleSchemaEnums5 implements DoubleValueMethod {
        POSITIVE_1_PT_1(1.1d),
        NEGATIVE_1_PT_2(-1.2d);
        private final double value;
    
        DoubleSchemaEnums5(double value) {
            this.value = value;
        }
        public double value() {
            return this.value;
        }
    }
    
    public enum FloatSchemaEnums5 implements FloatValueMethod {
        POSITIVE_1_PT_1(1.1f),
        NEGATIVE_1_PT_2(-1.2f);
        private final float value;
    
        FloatSchemaEnums5(float value) {
            this.value = value;
        }
        public float value() {
            return this.value;
        }
    }
    
    
    public sealed interface Schema51Boxed permits Schema51BoxedNumber {
        @Nullable Object getData();
    }
    
    public record Schema51BoxedNumber(Number data) implements Schema51Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Schema51 extends JsonSchema<Schema51Boxed> implements FloatEnumValidator<FloatSchemaEnums5>, DoubleEnumValidator<DoubleSchemaEnums5>, NumberSchemaValidator<Schema51BoxedNumber> {
        private static @Nullable Schema51 instance = null;
    
        protected Schema51() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .format("double")
                .enumValues(SetMaker.makeSet(
                    new BigDecimal("1.1"),
                    new BigDecimal("-1.2")
                ))
            );
        }
    
        public static Schema51 getInstance() {
            if (instance == null) {
                instance = new Schema51();
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
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public float validate(FloatSchemaEnums5 arg,SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public double validate(DoubleSchemaEnums5 arg,SchemaConfiguration configuration) throws ValidationException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public Schema51BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Schema51BoxedNumber(validate(arg, configuration));
        }
    }
}
