package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.ArrayList;
import java.util.List;

public class ListSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> JsonSchema.validate(
                ListSchema.class, (Void) null, configuration
        ));
    }

    @Test
    public void testValidateList() {
        List<Object> inList = new ArrayList<>();
        inList.add("today");
        FrozenList<Object> validatedValue = ListSchema.validate(inList, configuration);
        ArrayList<String> outList = new ArrayList<>();
        outList.add("today");
        Assert.assertEquals(validatedValue, outList);
    }
}
