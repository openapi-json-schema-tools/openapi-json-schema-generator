package org.openapijsonschematools.client.schemas.validation;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class SomeSchema extends JsonSchema {
    private static SomeSchema instance;
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
    public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        if (arg instanceof String) {
            return arg;
        }
        throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
    }
}

public class JsonSchemaTest {

    @Test
    public void testValidateSucceeds() {
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
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
        LinkedHashMap<JsonSchema, Void> validatedClasses = new LinkedHashMap<>();
        validatedClasses.put(schema, null);
        expectedPathToSchemas.put(pathToItem, validatedClasses);
        Assert.assertEquals(pathToSchemas, expectedPathToSchemas);
    }
}