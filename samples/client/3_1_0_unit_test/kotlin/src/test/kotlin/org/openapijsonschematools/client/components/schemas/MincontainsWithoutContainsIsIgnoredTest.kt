package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MincontainsWithoutContainsIsIgnoredTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testOneItemValidAgainstLoneMincontainsPasses() {
        // one item valid against lone minContains
        val schema = MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1.getInstance()
        schema.validate(
            listOf(
                1
            ),
            configuration
        )
    }

    @Test
    fun testZeroItemsStillValidAgainstLoneMincontainsPasses() {
        // zero items still valid against lone minContains
        val schema = MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }
}
