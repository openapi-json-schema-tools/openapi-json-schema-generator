package unit_test_api.schemas;

import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.JsonSchema;
import unit_test_api.schemas.validation.JsonSchemaInfo;
import unit_test_api.schemas.validation.PathToSchemasMap;
import unit_test_api.schemas.validation.NullSchemaValidator;
import unit_test_api.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class NullJsonSchema {
    public sealed interface NullJsonSchema1Boxed permits NullJsonSchema1BoxedVoid {
        @Nullable Object getData();
    }
    public record NullJsonSchema1BoxedVoid(Void data) implements NullJsonSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }

    public static class NullJsonSchema1 extends JsonSchema<NullJsonSchema1Boxed> implements NullSchemaValidator<NullJsonSchema1BoxedVoid> {
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
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }

        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                return validate((Void) null, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }

        @Override
        public NullJsonSchema1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new NullJsonSchema1BoxedVoid(validate(arg, configuration));
        }

        @Override
        public NullJsonSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
