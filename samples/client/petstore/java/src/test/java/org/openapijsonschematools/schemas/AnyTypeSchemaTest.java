package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class AnyTypeSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testValidateNull() {
        Void validatedValue = JsonSchemas.AnyTypeSchema.validate((Void) null, configuration);
        Assert.assertNull(validatedValue);
    }

    @Test
    public void testValidateBoolean() {
        Boolean trueValue = JsonSchemas.AnyTypeSchema.validate(Boolean.TRUE, configuration);
        Assert.assertEquals(trueValue, Boolean.TRUE);

        Boolean falseValue = JsonSchemas.AnyTypeSchema.validate(Boolean.FALSE, configuration);
        Assert.assertEquals(falseValue, Boolean.FALSE);
    }

    @Test
    public void testValidateInteger() {
        Integer validatedValue = JsonSchemas.AnyTypeSchema.validate(1, configuration);
        Assert.assertEquals(validatedValue, Integer.valueOf(1));
    }

    @Test
    public void testValidateLong() {
        Long validatedValue = JsonSchemas.AnyTypeSchema.validate(1L, configuration);
        Assert.assertEquals(validatedValue, Long.valueOf(1));
    }

    @Test
    public void testValidateFloat() {
        Float validatedValue = JsonSchemas.AnyTypeSchema.validate(3.14f, configuration);
        Assert.assertEquals(validatedValue, Float.valueOf(3.14f));
    }

    @Test
    public void testValidateDouble() {
        Double validatedValue = JsonSchemas.AnyTypeSchema.validate(70.6458763d, configuration);
        Assert.assertEquals(validatedValue, Double.valueOf(70.6458763d));
    }

    @Test
    public void testValidateString() {
        String validatedValue = JsonSchemas.AnyTypeSchema.validate("a", configuration);
        Assert.assertEquals(validatedValue, "a");
    }

    @Test
    public void testValidateZonedDateTime() {
        String validatedValue = JsonSchemas.AnyTypeSchema.validate(ZonedDateTime.of(2017, 7, 21, 17, 32, 28, 0, ZoneId.of("Z")), configuration);
        Assert.assertEquals(validatedValue, "2017-07-21T17:32:28Z");
    }

    @Test
    public void testValidateLocalDate() {
        String validatedValue = JsonSchemas.AnyTypeSchema.validate(LocalDate.of(2017, 7, 21), configuration);
        Assert.assertEquals(validatedValue, "2017-07-21");
    }

    @Test
    public void testValidateMap() {
        LinkedHashMap<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("today", LocalDate.of(2017, 7, 21));
        FrozenMap<String, String> validatedValue = JsonSchemas.AnyTypeSchema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("today", "2017-07-21");
        Assert.assertEquals(validatedValue, outMap);
    }

    @Test
    public void testValidateList() {
        ArrayList<Object> inList = new ArrayList<>();
        inList.add(LocalDate.of(2017, 7, 21));
        FrozenList<String> validatedValue = JsonSchemas.AnyTypeSchema.validate(inList, configuration);
        ArrayList<String> outList = new ArrayList<>();
        outList.add( "2017-07-21");
        Assert.assertEquals(validatedValue, outList);
    }
}