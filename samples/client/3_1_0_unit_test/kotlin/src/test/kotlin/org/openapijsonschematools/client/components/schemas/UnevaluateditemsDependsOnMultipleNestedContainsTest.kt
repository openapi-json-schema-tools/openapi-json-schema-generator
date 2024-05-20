package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UnevaluateditemsDependsOnMultipleNestedContainsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun test7NotEvaluatedFailsUnevaluateditemsFails() {
        // 7 not evaluated, fails unevaluatedItems
        val schema = UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        2,
                        3,
                        4,
                        7,
                        8
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun test5NotEvaluatedPassesUnevaluateditemsPasses() {
        // 5 not evaluated, passes unevaluatedItems
        val schema = UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1.getInstance()
        schema.validate(
            listOf(
                2,
                3,
                4,
                5,
                6
            ),
            configuration
        )
    }
}
