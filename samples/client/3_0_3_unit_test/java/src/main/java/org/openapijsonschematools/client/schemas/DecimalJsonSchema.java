package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class DecimalJsonSchema {
    public sealed interface DecimalJsonSchema1Boxed permits DecimalJsonSchema1BoxedString {
        @Nullable Object getData();
    }
    public record DecimalJsonSchema1BoxedString(String data) implements DecimalJsonSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }

    public static class DecimalJsonSchema1 extends JsonSchema<DecimalJsonSchema1Boxed> implements StringSchemaValidator<DecimalJsonSchema1BoxedString> {
        private static @Nullable DecimalJsonSchema1 instance = null;

        protected DecimalJsonSchema1() {
            super(new JsonSchemaInfo()
                    .type(Set.of(String.class))
                    .format("number")
            );
        }

        public static DecimalJsonSchema1 getInstance() {
            if (instance == null) {
                instance = new DecimalJsonSchema1();
            }
            return instance;
        }

        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }

        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }

        @Override
        public DecimalJsonSchema1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new DecimalJsonSchema1BoxedString(validate(arg, configuration));
        }

        @Override
        public DecimalJsonSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}