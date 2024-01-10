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
import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class DateTimeJsonSchema extends JsonSchema implements StringSchemaValidator {
    private static @Nullable DateTimeJsonSchema instance = null;

    protected DateTimeJsonSchema() {
        super(new JsonSchemaInfo()
            .type(Set.of(String.class))
            .format("date-time")
        );
    }

    public static DateTimeJsonSchema getInstance() {
        if (instance == null) {
            instance = new DateTimeJsonSchema();
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

    public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg.toString(), configuration);
    }

    @Override
    public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        if (arg instanceof String) {
            return getNewInstance((String) arg, pathToItem, pathToSchemas);
        }
        throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
    }

    @Override
    public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
        if (arg instanceof String) {
            return validate((String) arg, configuration);
        } else if (arg instanceof ZonedDateTime) {
            return validate((ZonedDateTime) arg, configuration);
        }
        throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
    }
}