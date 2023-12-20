package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.UUID;

public class StringJsonSchema extends JsonSchema implements StringSchemaValidator {
    private static @Nullable StringJsonSchema instance = null;

    protected StringJsonSchema() {
        super(new JsonSchemaInfo()
            .type(Set.of(String.class))
        );
    }

    public static StringJsonSchema getInstance() {
        if (instance == null) {
            instance = new StringJsonSchema();
        }
        return instance;
    }

    @Override
    public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
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

    public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg.toString(), configuration);
    }

    public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg.toString(), configuration);
    }

    public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
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