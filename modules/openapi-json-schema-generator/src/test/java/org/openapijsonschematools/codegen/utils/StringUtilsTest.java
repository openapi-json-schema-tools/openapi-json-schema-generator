package org.openapijsonschematools.codegen.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilsTest {
    // we'll assume that <i>underscore</i> (Twitter elephant bird) works fine
    @Test
    public void testUnderscore() {
        Assert.assertEquals(StringUtils.underscore("abcd"), "abcd");
        Assert.assertEquals(StringUtils.underscore("abCd"), "ab_cd");
        Assert.assertEquals(StringUtils.underscore("ListABCs"), "list_abcs");
    }

    @Test
    public void testCamelize() throws Exception {
        Assert.assertEquals(StringUtils.camelize("abcd"), "Abcd");
        Assert.assertEquals(StringUtils.camelize("some-value"), "SomeValue");
        Assert.assertEquals(StringUtils.camelize("some_value"), "SomeValue");
        Assert.assertEquals(StringUtils.camelize("$type"), "$Type");

        Assert.assertEquals(StringUtils.camelize("abcd", true), "abcd");
        Assert.assertEquals(StringUtils.camelize("some-value", true), "someValue");
        Assert.assertEquals(StringUtils.camelize("some_value", true), "someValue");
        Assert.assertEquals(StringUtils.camelize("Abcd", true), "abcd");
        Assert.assertEquals(StringUtils.camelize("$type", true), "$type");

        Assert.assertEquals(StringUtils.camelize("123", true), "123");
        Assert.assertEquals(StringUtils.camelize("$123", true), "$123");
    }

    @Test
    public void testDashize() {
        Assert.assertEquals(StringUtils.dashize("abcd"), "abcd");
        Assert.assertEquals(StringUtils.dashize("some-value"), "some-value");
        Assert.assertEquals(StringUtils.dashize("some_value"), "some-value");
        Assert.assertEquals(StringUtils.dashize("Foo_Response__links"), "foo-response-links");
        Assert.assertEquals(StringUtils.dashize("Foo Response _links"), "foo-response-links");
    }
}
