package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AnyofWithOneEmptySchemaTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testNumberIsValidPasses() {
        // number is valid
        val schema = AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.getInstance()
        schema.validate(
            123,
            configuration
        )
    }

    @Test
    fun testStringIsValidPasses() {
        // string is valid
        val schema = AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.getInstance()
        schema.validate(
            "foo",
            configuration
        )
    }
}
