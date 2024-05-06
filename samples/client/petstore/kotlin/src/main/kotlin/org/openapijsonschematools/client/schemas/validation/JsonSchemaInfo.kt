package org.openapijsonschematools.client.schemas.validation

import java.math.BigDecimal
import java.util.regex.Pattern

class JsonSchemaInfo {
    var type: Set<Class<*>>? = null
    fun type(type: Set<Class<*>>?): JsonSchemaInfo {
        this.type = type
        return this
    }

    var format: String? = null
    fun format(format: String?): JsonSchemaInfo {
        this.format = format
        return this
    }

    var items: Class<out JsonSchema<*>?>? = null
    fun items(items: Class<out JsonSchema<*>?>?): JsonSchemaInfo {
        this.items = items
        return this
    }

    var properties: Map<String, Class<out JsonSchema<*>?>>? = null
    fun properties(properties: Map<String, Class<out JsonSchema<*>?>>?): JsonSchemaInfo {
        this.properties = properties
        return this
    }

    var required: Set<String>? = null
    fun required(required: Set<String>?): JsonSchemaInfo {
        this.required = required
        return this
    }

    var exclusiveMaximum: Number? = null
    fun exclusiveMaximum(exclusiveMaximum: Number?): JsonSchemaInfo {
        this.exclusiveMaximum = exclusiveMaximum
        return this
    }

    var exclusiveMinimum: Number? = null
    fun exclusiveMinimum(exclusiveMinimum: Number?): JsonSchemaInfo {
        this.exclusiveMinimum = exclusiveMinimum
        return this
    }

    var maxItems: Int? = null
    fun maxItems(maxItems: Int?): JsonSchemaInfo {
        this.maxItems = maxItems
        return this
    }

    var minItems: Int? = null
    fun minItems(minItems: Int?): JsonSchemaInfo {
        this.minItems = minItems
        return this
    }

    var maxLength: Int? = null
    fun maxLength(maxLength: Int?): JsonSchemaInfo {
        this.maxLength = maxLength
        return this
    }

    var minLength: Int? = null
    fun minLength(minLength: Int?): JsonSchemaInfo {
        this.minLength = minLength
        return this
    }

    var maxProperties: Int? = null
    fun maxProperties(maxProperties: Int?): JsonSchemaInfo {
        this.maxProperties = maxProperties
        return this
    }

    var minProperties: Int? = null
    fun minProperties(minProperties: Int?): JsonSchemaInfo {
        this.minProperties = minProperties
        return this
    }

    var maximum: Number? = null
    fun maximum(maximum: Number?): JsonSchemaInfo {
        this.maximum = maximum
        return this
    }

    var minimum: Number? = null
    fun minimum(minimum: Number?): JsonSchemaInfo {
        this.minimum = minimum
        return this
    }

    var multipleOf: BigDecimal? = null
    fun multipleOf(multipleOf: BigDecimal?): JsonSchemaInfo {
        this.multipleOf = multipleOf
        return this
    }

    var additionalProperties: Class<out JsonSchema<*>?>? = null
    fun additionalProperties(additionalProperties: Class<out JsonSchema<*>?>?): JsonSchemaInfo {
        this.additionalProperties = additionalProperties
        return this
    }

    var allOf: List<Class<out JsonSchema<*>?>>? = null
    fun allOf(allOf: List<Class<out JsonSchema<*>?>>?): JsonSchemaInfo {
        this.allOf = allOf
        return this
    }

    var anyOf: List<Class<out JsonSchema<*>?>>? = null
    fun anyOf(anyOf: List<Class<out JsonSchema<*>?>>?): JsonSchemaInfo {
        this.anyOf = anyOf
        return this
    }

    var oneOf: List<Class<out JsonSchema<*>?>>? = null
    fun oneOf(oneOf: List<Class<out JsonSchema<*>?>>?): JsonSchemaInfo {
        this.oneOf = oneOf
        return this
    }

    var not: Class<out JsonSchema<*>?>? = null
    fun not(not: Class<out JsonSchema<*>?>?): JsonSchemaInfo {
        this.not = not
        return this
    }

    var uniqueItems: Boolean? = null
    fun uniqueItems(uniqueItems: Boolean?): JsonSchemaInfo {
        this.uniqueItems = uniqueItems
        return this
    }

    var enumValues: Set<Any>? = null
    fun enumValues(enumValues: Set<Any>?): JsonSchemaInfo {
        this.enumValues = enumValues
        return this
    }

    var pattern: Pattern? = null
    fun pattern(pattern: Pattern?): JsonSchemaInfo {
        this.pattern = pattern
        return this
    }

    var defaultValue: Any? = null
    var defaultValueSet = false
    fun defaultValue(defaultValue: Any?): JsonSchemaInfo {
        this.defaultValue = defaultValue
        defaultValueSet = true
        return this
    }

    var constValue: Any? = null
    var constValueSet = false
    fun constValue(constValue: Any?): JsonSchemaInfo {
        this.constValue = constValue
        constValueSet = true
        return this
    }

    var contains: Class<out JsonSchema<*>?>? = null
    fun contains(contains: Class<out JsonSchema<*>?>?): JsonSchemaInfo {
        this.contains = contains
        return this
    }

    var maxContains: Int? = null
    fun maxContains(maxContains: Int?): JsonSchemaInfo {
        this.maxContains = maxContains
        return this
    }

    var minContains: Int? = null
    fun minContains(minContains: Int?): JsonSchemaInfo {
        this.minContains = minContains
        return this
    }

    var propertyNames: Class<out JsonSchema<*>?>? = null
    fun propertyNames(propertyNames: Class<out JsonSchema<*>?>?): JsonSchemaInfo {
        this.propertyNames = propertyNames
        return this
    }

    var dependentRequired: Map<String, Set<String>>? = null
    fun dependentRequired(dependentRequired: Map<String, Set<String>>?): JsonSchemaInfo {
        this.dependentRequired = dependentRequired
        return this
    }

    var dependentSchemas: Map<String, Class<out JsonSchema<*>?>>? = null
    fun dependentSchemas(dependentSchemas: Map<String, Class<out JsonSchema<*>?>>?): JsonSchemaInfo {
        this.dependentSchemas = dependentSchemas
        return this
    }

    var patternProperties: Map<Pattern, Class<out JsonSchema<*>?>>? = null
    fun patternProperties(patternProperties: Map<Pattern, Class<out JsonSchema<*>?>>?): JsonSchemaInfo {
        this.patternProperties = patternProperties
        return this
    }

    var prefixItems: List<Class<out JsonSchema<*>?>>? = null
    fun prefixItems(prefixItems: List<Class<out JsonSchema<*>?>>?): JsonSchemaInfo {
        this.prefixItems = prefixItems
        return this
    }

    var ifSchema: Class<out JsonSchema<*>?>? = null
    fun ifSchema(ifSchema: Class<out JsonSchema<*>?>?): JsonSchemaInfo {
        this.ifSchema = ifSchema
        return this
    }

    var then: Class<out JsonSchema<*>?>? = null
    fun then(then: Class<out JsonSchema<*>?>?): JsonSchemaInfo {
        this.then = then
        return this
    }

    var elseSchema: Class<out JsonSchema<*>?>? = null
    fun elseSchema(elseSchema: Class<out JsonSchema<*>?>?): JsonSchemaInfo {
        this.elseSchema = elseSchema
        return this
    }

    var unevaluatedItems: Class<out JsonSchema<*>?>? = null
    fun unevaluatedItems(unevaluatedItems: Class<out JsonSchema<*>?>?): JsonSchemaInfo {
        this.unevaluatedItems = unevaluatedItems
        return this
    }

    var unevaluatedProperties: Class<out JsonSchema<*>?>? = null
    fun unevaluatedProperties(unevaluatedProperties: Class<out JsonSchema<*>?>?): JsonSchemaInfo {
        this.unevaluatedProperties = unevaluatedProperties
        return this
    }
}