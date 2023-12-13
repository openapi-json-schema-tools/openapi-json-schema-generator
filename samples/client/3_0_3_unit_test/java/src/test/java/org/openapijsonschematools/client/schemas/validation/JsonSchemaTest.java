package org.openapijsonschematools.client.schemas.validation;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

class SomeSchema extends JsonSchema {
    public SomeSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(String.class)))
        )));
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