package org.openapijsonschematools.schemas.validation;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class SomeSchema extends JsonSchema {
    static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        String.class
    ));
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
        PathToSchemasMap pathToSchemas = JsonSchema.validate(
                SomeSchema.class,
                "hi",
                validationMetadata
        );
        PathToSchemasMap expectedPathToSchemas = new PathToSchemasMap();
        LinkedHashMap<Class<? extends JsonSchema>, Void> validatedClasses = new LinkedHashMap<>();
        validatedClasses.put(SomeSchema.class, null);
        expectedPathToSchemas.put(pathToItem, validatedClasses);
        Assert.assertEquals(pathToSchemas, expectedPathToSchemas);
    }
}