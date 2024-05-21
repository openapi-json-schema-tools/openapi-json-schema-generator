package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AllofWithOneEmptySchemaTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAnyDataIsValidPasses() {
        // any data is valid
        val schema = AllofWithOneEmptySchema.AllofWithOneEmptySchema1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }
}
