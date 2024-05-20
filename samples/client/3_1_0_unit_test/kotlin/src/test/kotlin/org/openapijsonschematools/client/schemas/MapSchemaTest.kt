package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MapSchemaTest {
    @Test
    fun testExceptionThrownForInvalidType() {
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    mapJsonSchema,
                    null,
                    validationMetadata
                )
            }
        )
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateMap() {
        val inMap: MutableMap<String?, Any?> = LinkedHashMap()
        inMap["today"] = LocalDate.of(2017, 7, 21)
        val validatedValue = mapJsonSchema.validate(inMap, configuration)
        val outMap: Map<String, Any?> = mapOf("today" to "2017-07-21")
        assertEquals(validatedValue, outMap)
    }

    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
        val mapJsonSchema = MapJsonSchema.MapJsonSchema1.getInstance()
        val validationMetadata = ValidationMetadata(
            listOf("args[0"),
            configuration,
            PathToSchemasMap(),
            LinkedHashSet()
        )
    }
}