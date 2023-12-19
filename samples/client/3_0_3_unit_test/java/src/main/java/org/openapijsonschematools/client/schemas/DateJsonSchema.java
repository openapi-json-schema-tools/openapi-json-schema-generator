package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class DateJsonSchema extends JsonSchema implements StringSchemaValidator {
    private static @Nullable DateJsonSchema instance = null;

    protected DateJsonSchema() {
        super(new JsonSchemaInfo()
            .type(Set.of(String.class))
            .format("date")
        );
    }

    public static DateJsonSchema getInstance() {
        if (instance == null) {
            instance = new DateJsonSchema();
        }
        return instance;
    }

    @Override
    public @NonNull String getNewInstance(@NonNull String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    @Override
    public @NonNull String validate(@NonNull String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = List.of("args[0");
        String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    public @NonNull String validate(@NonNull LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg.toString(), configuration);
    }

    @Override
    public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        if (arg instanceof String) {
            return getNewInstance((String) arg, pathToItem, pathToSchemas);
        }
        throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
    }
}
