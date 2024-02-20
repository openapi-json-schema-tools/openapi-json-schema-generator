package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class NullJsonSchema {
    public sealed interface NullJsonSchema1Boxed permits NullJsonSchema1BoxedVoid {
        @Nullable Object data();
    }
    public static final class NullJsonSchema1BoxedVoid implements NullJsonSchema1Boxed {
        public final Void data;
        private NullJsonSchema1BoxedVoid(Void data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }

    public static class NullJsonSchema1 extends JsonSchema implements NullSchemaValidator<NullJsonSchema1BoxedVoid> {
        private static @Nullable NullJsonSchema1 instance = null;

        protected NullJsonSchema1() {
            super(new JsonSchemaInfo()
                    .type(Set.of(Void.class))
            );
        }

        public static NullJsonSchema1 getInstance() {
            if (instance == null) {
                instance = new NullJsonSchema1();
            }
            return instance;
        }

        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }

        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            if (arg == null) {
                return validate((Void) null, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }

        @Override
        public NullJsonSchema1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new NullJsonSchema1BoxedVoid(validate(arg, configuration));
        }
    }
}
