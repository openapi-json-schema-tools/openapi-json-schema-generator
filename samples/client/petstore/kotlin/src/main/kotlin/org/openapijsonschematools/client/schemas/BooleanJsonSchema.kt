package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class BooleanJsonSchema {
    public sealed interface BooleanJsonSchema1Boxed permits BooleanJsonSchema1BoxedBoolean {
        @Nullable Object getData();
    }
    public record BooleanJsonSchema1BoxedBoolean(boolean data) implements BooleanJsonSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    public static class BooleanJsonSchema1 extends JsonSchema<BooleanJsonSchema1Boxed> implements BooleanSchemaValidator<BooleanJsonSchema1BoxedBoolean> {
        private static @Nullable BooleanJsonSchema1 instance = null;

        protected BooleanJsonSchema1() {
            super(new JsonSchemaInfo()
                    .type(Set.of(Boolean.class))
            );
        }

        public static BooleanJsonSchema1 getInstance() {
            if (instance == null) {
                instance = new BooleanJsonSchema1();
            }
            return instance;
        }

        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return getNewInstance(boolArg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }

        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return validate(boolArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }

        @Override
        public BooleanJsonSchema1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new BooleanJsonSchema1BoxedBoolean(validate(arg, configuration));
        }

        @Override
        public BooleanJsonSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Boolean booleanArg) {
                boolean castArg = booleanArg;
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}