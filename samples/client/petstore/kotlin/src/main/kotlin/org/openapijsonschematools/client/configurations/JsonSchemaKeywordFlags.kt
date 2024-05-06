package org.openapijsonschematools.client.configurations

data class JsonSchemaKeywordFlags(
    val additionalProperties: Boolean,
    val allOf: Boolean,
    val anyOf: Boolean,
    val const_: Boolean,
    val contains: Boolean,
    val dependentRequired: Boolean,
    val dependentSchemas: Boolean,
    val discriminator: Boolean,
    val else_: Boolean,
    val enum_: Boolean,
    val exclusiveMaximum: Boolean,
    val exclusiveMinimum: Boolean,
    val format: Boolean,
    val if_: Boolean,
    val maximum: Boolean,
    val minimum: Boolean,
    val items: Boolean,
    val maxContains: Boolean,
    val maxItems: Boolean,
    val maxLength: Boolean,
    val maxProperties: Boolean,
    val minContains: Boolean,
    val minItems: Boolean,
    val minLength: Boolean,
    val minProperties: Boolean,
    val multipleOf: Boolean,
    val not: Boolean,
    val oneOf: Boolean,
    val pattern: Boolean,
    val patternProperties: Boolean,
    val prefixItems: Boolean,
    val properties: Boolean,
    val propertyNames: Boolean,
    val required: Boolean,
    val then: Boolean,
    val type: Boolean,
    val uniqueItems: Boolean,
    val unevaluatedItems: Boolean,
    val unevaluatedProperties: Boolean
) {
    val keywords: LinkedHashSet<String>
        get() {
            val enabledKeywords = LinkedHashSet<String>()
            if (additionalProperties) {
                enabledKeywords.add("additionalProperties")
            }
            if (allOf) {
                enabledKeywords.add("allOf")
            }
            if (anyOf) {
                enabledKeywords.add("anyOf")
            }
            if (const_) {
                enabledKeywords.add("const")
            }
            if (contains) {
                enabledKeywords.add("contains")
            }
            if (dependentRequired) {
                enabledKeywords.add("dependentRequired")
            }
            if (dependentSchemas) {
                enabledKeywords.add("dependentSchemas")
            }
            if (discriminator) {
                enabledKeywords.add("discriminator")
            }
            if (else_) {
                enabledKeywords.add("else_")
            }
            if (enum_) {
                enabledKeywords.add("enum_")
            }
            if (exclusiveMaximum) {
                enabledKeywords.add("exclusiveMaximum")
            }
            if (exclusiveMinimum) {
                enabledKeywords.add("exclusiveMinimum")
            }
            if (format) {
                enabledKeywords.add("format")
            }
            if (if_) {
                enabledKeywords.add("if_")
            }
            if (maximum) {
                enabledKeywords.add("maximum")
            }
            if (minimum) {
                enabledKeywords.add("minimum")
            }
            if (items) {
                enabledKeywords.add("items")
            }
            if (maxContains) {
                enabledKeywords.add("maxContains")
            }
            if (maxItems) {
                enabledKeywords.add("maxItems")
            }
            if (maxLength) {
                enabledKeywords.add("maxLength")
            }
            if (maxProperties) {
                enabledKeywords.add("maxProperties")
            }
            if (minContains) {
                enabledKeywords.add("minContains")
            }
            if (minItems) {
                enabledKeywords.add("minItems")
            }
            if (minLength) {
                enabledKeywords.add("minLength")
            }
            if (minProperties) {
                enabledKeywords.add("minProperties")
            }
            if (multipleOf) {
                enabledKeywords.add("multipleOf")
            }
            if (not) {
                enabledKeywords.add("not")
            }
            if (oneOf) {
                enabledKeywords.add("oneOf")
            }
            if (pattern) {
                enabledKeywords.add("pattern")
            }
            if (patternProperties) {
                enabledKeywords.add("patternProperties")
            }
            if (prefixItems) {
                enabledKeywords.add("prefixItems")
            }
            if (properties) {
                enabledKeywords.add("properties")
            }
            if (propertyNames) {
                enabledKeywords.add("propertyNames")
            }
            if (required) {
                enabledKeywords.add("required")
            }
            if (then) {
                enabledKeywords.add("then")
            }
            if (type) {
                enabledKeywords.add("type")
            }
            if (uniqueItems) {
                enabledKeywords.add("uniqueItems")
            }
            if (unevaluatedItems) {
                enabledKeywords.add("unevaluatedItems")
            }
            if (unevaluatedProperties) {
                enabledKeywords.add("unevaluatedProperties")
            }
            return enabledKeywords
        }

    class Builder {
        private var additionalProperties = false
        private var allOf = false
        private var anyOf = false
        private var const_ = false
        private var contains = false
        private var dependentRequired = false
        private var dependentSchemas = false
        private var discriminator = false
        private var else_ = false
        private var enum_ = false
        private var exclusiveMaximum = false
        private var exclusiveMinimum = false
        private var format = false
        private var if_ = false
        private var maximum = false
        private var minimum = false
        private var items = false
        private var maxContains = false
        private var maxItems = false
        private var maxLength = false
        private var maxProperties = false
        private var minContains = false
        private var minItems = false
        private var minLength = false
        private var minProperties = false
        private var multipleOf = false
        private var not = false
        private var oneOf = false
        private var pattern = false
        private var patternProperties = false
        private var prefixItems = false
        private var properties = false
        private var propertyNames = false
        private var required = false
        private var then = false
        private var type = false
        private var uniqueItems = false
        private var unevaluatedItems = false
        private var unevaluatedProperties = false
        fun additionalProperties(): Builder {
            additionalProperties = true
            return this
        }

        fun allOf(): Builder {
            allOf = true
            return this
        }

        fun anyOf(): Builder {
            anyOf = true
            return this
        }

        fun const_(): Builder {
            const_ = true
            return this
        }

        fun contains(): Builder {
            contains = true
            return this
        }

        fun dependentRequired(): Builder {
            dependentRequired = true
            return this
        }

        fun dependentSchemas(): Builder {
            dependentSchemas = true
            return this
        }

        fun discriminator(): Builder {
            discriminator = true
            return this
        }

        fun else_(): Builder {
            else_ = true
            return this
        }

        fun enum_(): Builder {
            enum_ = true
            return this
        }

        fun exclusiveMaximum(): Builder {
            exclusiveMaximum = true
            return this
        }

        fun exclusiveMinimum(): Builder {
            exclusiveMinimum = true
            return this
        }

        fun format(): Builder {
            format = true
            return this
        }

        fun if_(): Builder {
            if_ = true
            return this
        }

        fun maximum(): Builder {
            maximum = true
            return this
        }

        fun minimum(): Builder {
            minimum = true
            return this
        }

        fun items(): Builder {
            items = true
            return this
        }

        fun maxContains(): Builder {
            maxContains = true
            return this
        }

        fun maxItems(): Builder {
            maxItems = true
            return this
        }

        fun maxLength(): Builder {
            maxLength = true
            return this
        }

        fun maxProperties(): Builder {
            maxProperties = true
            return this
        }

        fun minContains(): Builder {
            minContains = true
            return this
        }

        fun minItems(): Builder {
            minItems = true
            return this
        }

        fun minLength(): Builder {
            minLength = true
            return this
        }

        fun minProperties(): Builder {
            minProperties = true
            return this
        }

        fun multipleOf(): Builder {
            multipleOf = true
            return this
        }

        operator fun not(): Builder {
            not = true
            return this
        }

        fun oneOf(): Builder {
            oneOf = true
            return this
        }

        fun pattern(): Builder {
            pattern = true
            return this
        }

        fun patternProperties(): Builder {
            patternProperties = true
            return this
        }

        fun prefixItems(): Builder {
            prefixItems = true
            return this
        }

        fun properties(): Builder {
            properties = true
            return this
        }

        fun propertyNames(): Builder {
            propertyNames = true
            return this
        }

        fun required(): Builder {
            required = true
            return this
        }

        fun then(): Builder {
            then = true
            return this
        }

        fun type(): Builder {
            type = true
            return this
        }

        fun uniqueItems(): Builder {
            uniqueItems = true
            return this
        }

        fun unevaluatedItems(): Builder {
            unevaluatedItems = true
            return this
        }

        fun unevaluatedProperties(): Builder {
            unevaluatedProperties = true
            return this
        }

        fun build(): JsonSchemaKeywordFlags {
            return JsonSchemaKeywordFlags(
                additionalProperties,
                allOf,
                anyOf,
                const_,
                contains,
                dependentRequired,
                dependentSchemas,
                discriminator,
                else_,
                enum_,
                exclusiveMaximum,
                exclusiveMinimum,
                format,
                if_,
                maximum,
                minimum,
                items,
                maxContains,
                maxItems,
                maxLength,
                maxProperties,
                minContains,
                minItems,
                minLength,
                minProperties,
                multipleOf,
                not,
                oneOf,
                pattern,
                patternProperties,
                prefixItems,
                properties,
                propertyNames,
                required,
                then,
                type,
                uniqueItems,
                unevaluatedItems,
                unevaluatedProperties
            )
        }
    }
}