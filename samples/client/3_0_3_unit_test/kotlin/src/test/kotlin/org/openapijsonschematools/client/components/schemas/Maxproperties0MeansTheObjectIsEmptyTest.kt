package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class Maxproperties0MeansTheObjectIsEmptyTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testOnePropertyIsInvalidFails() {
        // one property is invalid
        val schema = Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            1
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testNoPropertiesIsValidPasses() {
        // no properties is valid
        val schema = Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }
}
