package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PropertiesPatternpropertiesAdditionalpropertiesInteractionTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testPropertyValidatesPropertyPasses() {
        // property validates property
        val schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    listOf(
                        1,
                        2
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun testAdditionalpropertyIgnoresPropertyPasses() {
        // additionalProperty ignores property
        val schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "bar",
                    listOf<Any?>(
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun testPatternpropertyInvalidatesPropertyFails() {
        // patternProperty invalidates property
        val schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            listOf<Any?>(
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testPatternpropertyValidatesNonpropertyPasses() {
        // patternProperty validates nonproperty
        val schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "fxo",
                    listOf(
                        1,
                        2
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun testPatternpropertyInvalidatesNonpropertyFails() {
        // patternProperty invalidates nonproperty
        val schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "fxo",
                            listOf<Any?>(
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testPropertyInvalidatesPropertyFails() {
        // property invalidates property
        val schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            listOf(
                                1,
                                2,
                                3,
                                4
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testAdditionalpropertyInvalidatesOthersFails() {
        // additionalProperty invalidates others
        val schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "quux",
                            "foo"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testAdditionalpropertyValidatesOthersPasses() {
        // additionalProperty validates others
        val schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "quux",
                    3
                )
            ),
            configuration
        )
    }
}
