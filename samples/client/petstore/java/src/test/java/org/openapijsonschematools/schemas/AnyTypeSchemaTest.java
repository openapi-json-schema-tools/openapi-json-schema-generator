package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AnyTypeSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testValidateNull() {
        Void validatedValue = AnyTypeSchema.validate((Void) null, configuration);
        Assert.assertNull(validatedValue);
    }

    @Test
    public void testValidateBoolean() {
        Boolean trueValue = AnyTypeSchema.validate(Boolean.TRUE, configuration);
        Assert.assertEquals(trueValue, Boolean.TRUE);

        Boolean falseValue = AnyTypeSchema.validate(Boolean.FALSE, configuration);
        Assert.assertEquals(falseValue, Boolean.FALSE);
    }

    @Test
    public void testValidateInt() {
        Integer validatedValue = AnyTypeSchema.validate(1, configuration);
        Assert.assertEquals(validatedValue, Integer.valueOf(1));
    }

    @Test
    public void testValidateFloat() {
        Float validatedValue = AnyTypeSchema.validate(3.14f, configuration);
        Assert.assertEquals(validatedValue, Float.valueOf(3.14f));
    }

    @Test
    public void testValidateDouble() {
        Double validatedValue = AnyTypeSchema.validate(70.6458763d, configuration);
        Assert.assertEquals(validatedValue, Double.valueOf(70.6458763d));
    }

    @Test
    public void testValidateString() {
        String validatedValue = AnyTypeSchema.validate("a", configuration);
        Assert.assertEquals(validatedValue, "a");
    }

    @Test
    public void testValidateZonedDateTime() {
        String validatedValue = AnyTypeSchema.validate(ZonedDateTime.of(2017, 7, 21, 17, 32, 28, 0, ZoneId.of("Z")), configuration);
        Assert.assertEquals(validatedValue, "2017-07-21T17:32:28Z");
    }

    @Test
    public void testValidateLocalDate() {
        String validatedValue = AnyTypeSchema.validate(LocalDate.of(2017, 7, 21), configuration);
        Assert.assertEquals(validatedValue, "2017-07-21");
    }
}
