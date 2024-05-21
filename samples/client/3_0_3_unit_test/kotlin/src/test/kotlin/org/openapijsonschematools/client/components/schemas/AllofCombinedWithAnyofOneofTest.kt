package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AllofCombinedWithAnyofOneofTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAllofFalseAnyofFalseOneofTrueFails() {
        // allOf: false, anyOf: false, oneOf: true
        val schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    5,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAllofFalseAnyofTrueOneofFalseFails() {
        // allOf: false, anyOf: true, oneOf: false
        val schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    3,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAllofFalseAnyofTrueOneofTrueFails() {
        // allOf: false, anyOf: true, oneOf: true
        val schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    15,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAllofTrueAnyofFalseOneofFalseFails() {
        // allOf: true, anyOf: false, oneOf: false
        val schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    2,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAllofTrueAnyofTrueOneofTruePasses() {
        // allOf: true, anyOf: true, oneOf: true
        val schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance()
        schema.validate(
            30,
            configuration
        )
    }

    @Test
    fun testAllofFalseAnyofFalseOneofFalseFails() {
        // allOf: false, anyOf: false, oneOf: false
        val schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAllofTrueAnyofFalseOneofTrueFails() {
        // allOf: true, anyOf: false, oneOf: true
        val schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    10,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAllofTrueAnyofTrueOneofFalseFails() {
        // allOf: true, anyOf: true, oneOf: false
        val schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    6,
                    configuration
                )
            }
        )
    }
}
