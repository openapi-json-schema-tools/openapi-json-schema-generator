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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapJsonSchema extends JsonSchema implements MapSchemaValidator<Object, FrozenMap<Object>> {
    private static MapJsonSchema instance;

    protected MapJsonSchema() {
        super(new JsonSchemaInfo()
            .type(Set.of(FrozenMap.class))
        );
    }

    public static MapJsonSchema getInstance() {
        if (instance == null) {
            instance = new MapJsonSchema();
        }
        return instance;
    }

    @Override
    public FrozenMap<Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
        for(Map.Entry<?, ?> entry: arg.entrySet()) {
            String propertyName = (String) entry.getKey();
            List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
            propertyPathToItem.add(propertyName);
            Object value = entry.getValue();
            JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
            Object castValue = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
            properties.put(propertyName, castValue);
        }
        return new FrozenMap<>(properties);
    }

    @Override
    public FrozenMap<Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = List.of("args[0");
        Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        if (arg instanceof FrozenMap) {
            return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
        }
        throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
    }
}
