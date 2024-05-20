package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MaxcontainsWithoutContainsIsIgnoredTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testTwoItemsStillValidAgainstLoneMaxcontainsPasses() {
        // two items still valid against lone maxContains
        val schema = MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1.getInstance()
        schema.validate(
            listOf(
                1,
                2
            ),
            configuration
        )
    }

    @Test
    fun testOneItemValidAgainstLoneMaxcontainsPasses() {
        // one item valid against lone maxContains
        val schema = MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1.getInstance()
        schema.validate(
            listOf(
                1
            ),
            configuration
        )
    }
}
