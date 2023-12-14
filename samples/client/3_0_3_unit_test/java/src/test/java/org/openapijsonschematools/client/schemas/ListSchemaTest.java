package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ListSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ListJsonSchema listJsonSchema = ListJsonSchema.getInstance();
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );
    
    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                listJsonSchema,
                null,
                validationMetadata
        ));
    }

    @Test
    public void testValidateList() {
        List<Object> inList = new ArrayList<>();
        inList.add("today");
        FrozenList<Object> validatedValue = listJsonSchema.validate(inList, configuration);
        ArrayList<String> outList = new ArrayList<>();
        outList.add("today");
        Assert.assertEquals(validatedValue, outList);
    }
}
