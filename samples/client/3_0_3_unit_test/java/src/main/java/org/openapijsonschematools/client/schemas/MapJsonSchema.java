package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapJsonSchema extends JsonSchema implements MapSchemaValidator<Object, FrozenMap<@Nullable Object>> {
    private static @Nullable MapJsonSchema instance = null;

    protected MapJsonSchema() {
        super(new JsonSchemaInfo()
            .type(Set.of(Map.class))
        );
    }

    public static MapJsonSchema getInstance() {
        if (instance == null) {
            instance = new MapJsonSchema();
        }
        return instance;
    }

    @Override
    public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
        for(Map.Entry<?, ?> entry: arg.entrySet()) {
            @Nullable Object entryKey = entry.getKey();
            @NonNull String propertyName;
            if (entryKey instanceof String) {
                propertyName = (@NonNull String) entryKey;
            } else {
                throw new RuntimeException("Invalid non-string key value");
            }
            List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
            propertyPathToItem.add(propertyName);
            Object value = entry.getValue();
            LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
            if (schemas == null) {
                throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
            }
            JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
            @Nullable Object castValue = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
            properties.put(propertyName, castValue);
        }
        return new FrozenMap<>(properties);
    }

    @Override
    public FrozenMap<@Nullable Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = List.of("args[0");
        Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        if (arg instanceof FrozenMap) {
            return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
        }
        throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
    }
}
