package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

sealed interface SomeSchemaBoxed permits SomeSchemaBoxedString {}
record SomeSchemaBoxedString() implements SomeSchemaBoxed {}

public class JsonSchemaTest {
    sealed interface SomeSchemaBoxed permits SomeSchemaBoxedString {}
    record SomeSchemaBoxedString() implements SomeSchemaBoxed {}

    static class SomeSchema extends JsonSchema<SomeSchemaBoxed> {
        private static @Nullable SomeSchema instance = null;
        protected SomeSchema() {
            super(new JsonSchemaInfo()
                    .type(Set.of(String.class))
            );
        }

        public static SomeSchema getInstance() {
            if (instance == null) {
                instance = new SomeSchema();
            }
            return instance;
        }

        @Override
        public Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return arg;
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }

        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String) {
                return arg;
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }

        @Override
        public SomeSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            return new SomeSchemaBoxedString();
        }
    }

    @Test
    public void testValidateSucceeds() throws ValidationException {
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        SomeSchema schema = JsonSchemaFactory.getInstance(SomeSchema.class);
        PathToSchemasMap pathToSchemas = JsonSchema.validate(
                schema,
                "hi",
                validationMetadata
        );
        PathToSchemasMap expectedPathToSchemas = new PathToSchemasMap();
        LinkedHashMap<JsonSchema<?>, Nothing?> validatedClasses = new LinkedHashMap<>();
        validatedClasses.put(schema, null);
        expectedPathToSchemas.put(pathToItem, validatedClasses);
        Assert.assertEquals(pathToSchemas, expectedPathToSchemas);
    }
}