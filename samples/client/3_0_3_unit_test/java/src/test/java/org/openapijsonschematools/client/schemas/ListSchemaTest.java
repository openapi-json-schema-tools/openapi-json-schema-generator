package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class ListSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ListJsonSchema listJsonSchema = JsonSchemaFactory.getInstance(ListJsonSchema.class);

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> listJsonSchema.validate(
                (Void) null, configuration
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
