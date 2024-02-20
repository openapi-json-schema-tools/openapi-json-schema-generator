package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
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
        @Nullable Object data();
    }
    public static final class BooleanJsonSchema1BoxedBoolean implements BooleanJsonSchema1Boxed {
        public final boolean data;
        private BooleanJsonSchema1BoxedBoolean(boolean data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    public static class BooleanJsonSchema1 extends JsonSchema implements BooleanSchemaValidator<BooleanJsonSchema1BoxedBoolean> {
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
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
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
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }

        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return validate(boolArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }

        @Override
        public BooleanJsonSchema1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new BooleanJsonSchema1BoxedBoolean(validate(arg, configuration));
        }
    }
}