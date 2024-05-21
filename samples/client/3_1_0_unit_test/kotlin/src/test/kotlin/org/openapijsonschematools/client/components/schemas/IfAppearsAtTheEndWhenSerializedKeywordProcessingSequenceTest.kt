package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequenceTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testInvalidRedirectsToElseAndFailsFails() {
        // invalid redirects to else and fails
        val schema = IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "invalid",
                    configuration
                )
            }
        )
    }

    @Test
    fun testYesRedirectsToThenAndPassesPasses() {
        // yes redirects to then and passes
        val schema = IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1.getInstance()
        schema.validate(
            "yes",
            configuration
        )
    }

    @Test
    fun testOtherRedirectsToElseAndPassesPasses() {
        // other redirects to else and passes
        val schema = IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1.getInstance()
        schema.validate(
            "other",
            configuration
        )
    }

    @Test
    fun testNoRedirectsToThenAndFailsFails() {
        // no redirects to then and fails
        val schema = IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "no",
                    configuration
                )
            }
        )
    }
}
