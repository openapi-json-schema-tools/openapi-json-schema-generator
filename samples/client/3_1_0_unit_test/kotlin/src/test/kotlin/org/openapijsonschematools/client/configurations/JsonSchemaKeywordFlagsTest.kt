package org.openapijsonschematools.client.configurations;

import kotlin.test.Test
import kotlin.test.assertEquals

class JsonSchemaKeywordFlagsTest {
    @Test
    fun testGetEnabledKeywords() {
        val jsonSchemaKeywordFlags = JsonSchemaKeywordFlags(
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true
        )
        val enabledKeywords = jsonSchemaKeywordFlags.keywords
        val expectedEnabledKeywords = LinkedHashSet<String>()
        expectedEnabledKeywords.add("additionalProperties")
        expectedEnabledKeywords.add("allOf")
        expectedEnabledKeywords.add("anyOf")
        expectedEnabledKeywords.add("const")
        expectedEnabledKeywords.add("contains")
        expectedEnabledKeywords.add("dependentRequired")
        expectedEnabledKeywords.add("dependentSchemas")
        expectedEnabledKeywords.add("discriminator")
        expectedEnabledKeywords.add("else_")
        expectedEnabledKeywords.add("enum_")
        expectedEnabledKeywords.add("exclusiveMaximum")
        expectedEnabledKeywords.add("exclusiveMinimum")
        expectedEnabledKeywords.add("format")
        expectedEnabledKeywords.add("if_")
        expectedEnabledKeywords.add("maximum")
        expectedEnabledKeywords.add("minimum")
        expectedEnabledKeywords.add("items")
        expectedEnabledKeywords.add("maxContains")
        expectedEnabledKeywords.add("maxItems")
        expectedEnabledKeywords.add("maxLength")
        expectedEnabledKeywords.add("maxProperties")
        expectedEnabledKeywords.add("minContains")
        expectedEnabledKeywords.add("minItems")
        expectedEnabledKeywords.add("minLength")
        expectedEnabledKeywords.add("minProperties")
        expectedEnabledKeywords.add("multipleOf")
        expectedEnabledKeywords.add("not")
        expectedEnabledKeywords.add("oneOf")
        expectedEnabledKeywords.add("pattern")
        expectedEnabledKeywords.add("patternProperties")
        expectedEnabledKeywords.add("prefixItems")
        expectedEnabledKeywords.add("properties")
        expectedEnabledKeywords.add("propertyNames")
        expectedEnabledKeywords.add("required")
        expectedEnabledKeywords.add("then")
        expectedEnabledKeywords.add("type")
        expectedEnabledKeywords.add("uniqueItems")
        expectedEnabledKeywords.add("unevaluatedItems")
        expectedEnabledKeywords.add("unevaluatedProperties")
        assertEquals(enabledKeywords, expectedEnabledKeywords)
    }

    @Test
    fun testGetNoEnabledKeywords() {
        val jsonSchemaKeywordFlags = JsonSchemaKeywordFlags(
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false
        )
        val enabledKeywords = jsonSchemaKeywordFlags.keywords
        val expectedEnabledKeywords = LinkedHashSet<String>()
        assertEquals(enabledKeywords, expectedEnabledKeywords)
    }
}