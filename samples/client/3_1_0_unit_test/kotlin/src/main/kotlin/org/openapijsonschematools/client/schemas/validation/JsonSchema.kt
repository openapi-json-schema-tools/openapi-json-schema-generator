package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import java.math.BigDecimal
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.regex.Pattern
import java.util.UUID

abstract class JsonSchema<T> protected constructor(
    val type: Set<Class<*>>? = null,
    val format: String? = null,
    val items: Class<out JsonSchema<*>>? = null,
    val properties: Map<String, Class<out JsonSchema<*>>>? = null,
    val required: Set<String>? = null,
    val exclusiveMaximum: Number? = null,
    val exclusiveMinimum: Number? = null,
    val maxItems: Int? = null,
    val minItems: Int? = null,
    val maxLength: Int? = null,
    val minLength: Int? = null,
    val maxProperties: Int? = null,
    val minProperties: Int? = null,
    val maximum: Number? = null,
    val minimum: Number? = null,
    val multipleOf: BigDecimal? = null,
    val additionalProperties: Class<out JsonSchema<*>>? = null,
    val allOf: List<Class<out JsonSchema<*>>>? = null,
    val anyOf: List<Class<out JsonSchema<*>>>? = null,
    val oneOf: List<Class<out JsonSchema<*>>>? = null,
    val not: Class<out JsonSchema<*>>? = null,
    val uniqueItems: Boolean? = null,
    val enumValues: Set<Any>? = null,
    val pattern: Pattern? = null,
    val defaultValue: JsonValue.JsonValueBoxed? = null,
    val constValue: JsonValue.JsonValueBoxed? = null,
    val contains: Class<out JsonSchema<*>>? = null,
    val maxContains: Int? = null,
    val minContains: Int? = null,
    val propertyNames: Class<out JsonSchema<*>>? = null,
    val dependentRequired: Map<String, Set<String>>? = null,
    val dependentSchemas: Map<String, Class<out JsonSchema<*>>>? = null,
    val patternProperties: Map<Pattern, Class<out JsonSchema<*>>>? = null,
    val prefixItems: List<Class<out JsonSchema<*>>>? = null,
    val ifSchema: Class<out JsonSchema<*>>? = null,
    val then: Class<out JsonSchema<*>>? = null,
    val elseSchema: Class<out JsonSchema<*>>? = null,
    val unevaluatedItems: Class<out JsonSchema<*>>? = null,
    val unevaluatedProperties: Class<out JsonSchema<*>>? = null
) {
    private val keywordToValidator: LinkedHashMap<String, KeywordValidator>

    init {
        val keywordToValidator = LinkedHashMap<String, KeywordValidator>()
        if (type != null) {
            keywordToValidator["type"] = TypeValidator()
        }
        if (format != null) {
            keywordToValidator["format"] = FormatValidator()
        }
        if (items != null) {
            keywordToValidator["items"] = ItemsValidator()
        }
        if (properties != null) {
            keywordToValidator["properties"] = PropertiesValidator()
        }
        if (required != null) {
            keywordToValidator["required"] = RequiredValidator()
        }
        if (exclusiveMaximum != null) {
            keywordToValidator["exclusiveMaximum"] = ExclusiveMaximumValidator()
        }
        if (exclusiveMinimum != null) {
            keywordToValidator["exclusiveMinimum"] = ExclusiveMinimumValidator()
        }
        if (maxItems != null) {
            keywordToValidator["maxItems"] = MaxItemsValidator()
        }
        if (minItems != null) {
            keywordToValidator["minItems"] = MinItemsValidator()
        }
        if (maxLength != null) {
            keywordToValidator["maxLength"] = MaxLengthValidator()
        }
        if (minLength != null) {
            keywordToValidator["minLength"] = MinLengthValidator()
        }
        if (maxProperties != null) {
            keywordToValidator["maxProperties"] = MaxPropertiesValidator()
        }
        if (minProperties != null) {
            keywordToValidator["minProperties"] = MinPropertiesValidator()
        }
        if (maximum != null) {
            keywordToValidator["maximum"] = MaximumValidator()
        }
        if (minimum != null) {
            keywordToValidator["minimum"] = MinimumValidator()
        }
        if (multipleOf != null) {
            keywordToValidator["multipleOf"] = MultipleOfValidator()
        }
        if (additionalProperties != null) {
            keywordToValidator["additionalProperties"] = AdditionalPropertiesValidator()
        }
        if (allOf != null) {
            keywordToValidator["allOf"] = AllOfValidator()
        }
        if (anyOf != null) {
            keywordToValidator["anyOf"] = AnyOfValidator()
        }
        if (oneOf != null) {
            keywordToValidator["oneOf"] = OneOfValidator()
        }
        if (not != null) {
            keywordToValidator["not"] = NotValidator()
        }
        if (uniqueItems != null) {
            keywordToValidator["uniqueItems"] = UniqueItemsValidator()
        }
        if (enumValues != null) {
            keywordToValidator["enum"] = EnumValidator()
        }
        if (pattern != null) {
            keywordToValidator["pattern"] = PatternValidator()
        }
        if (constValue != null) {
            keywordToValidator["const"] = ConstValidator()
        }
        if (contains != null) {
            keywordToValidator["contains"] = ContainsValidator()
        }
        if (maxContains != null) {
            keywordToValidator["maxContains"] = MaxContainsValidator()
        }
        if (minContains != null) {
            keywordToValidator["minContains"] = MinContainsValidator()
        }
        if (propertyNames != null) {
            keywordToValidator["propertyNames"] = PropertyNamesValidator()
        }
        if (dependentRequired != null) {
            keywordToValidator["dependentRequired"] = DependentRequiredValidator()
        }
        if (dependentSchemas != null) {
            keywordToValidator["dependentSchemas"] = DependentSchemasValidator()
        }
        if (patternProperties != null) {
            keywordToValidator["patternProperties"] = PatternPropertiesValidator()
        }
        if (prefixItems != null) {
            keywordToValidator["prefixItems"] = PrefixItemsValidator()
        }
        if (ifSchema != null) {
            keywordToValidator["if"] = IfValidator()
        }
        if (then != null) {
            keywordToValidator["then"] = ThenValidator()
        }
        if (elseSchema != null) {
            keywordToValidator["else"] = ElseValidator()
        }
        if (unevaluatedItems != null) {
            keywordToValidator["unevaluatedItems"] = UnevaluatedItemsValidator()
        }
        if (unevaluatedProperties != null) {
            keywordToValidator["unevaluatedProperties"] = UnevaluatedPropertiesValidator()
        }
        this.keywordToValidator = keywordToValidator
    }

    abstract fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any?
    @Throws(ValidationException::class)
    abstract fun validate(arg: Any?, configuration: SchemaConfiguration?): Any?
    @Throws(ValidationException::class)
    abstract fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): T
    private fun getContainsPathToSchemas(
        arg: Any?,
        validationMetadata: ValidationMetadata
    ): List<PathToSchemasMap> {
        if (arg !is List<*> || contains == null) {
            return ArrayList()
        }
        val containsSchema: JsonSchema<*> = JsonSchemaFactory.getInstance(contains)
        val containsPathToSchemas: MutableList<PathToSchemasMap> = ArrayList()
        for (i in arg.indices) {
            val thesePathToSchemas = PathToSchemasMap()
            val itemPathToItem: List<Any> = validationMetadata.pathToItem + i
            val itemValidationMetadata = ValidationMetadata(
                itemPathToItem,
                validationMetadata.configuration,
                validationMetadata.validatedPathToSchemas,
                validationMetadata.seenClasses
            )
            if (itemValidationMetadata.validationRanEarlier(containsSchema)) {
                // todo add_deeper_validated_schemas
                containsPathToSchemas.add(thesePathToSchemas)
                continue
            }
            try {
                val otherPathToSchemas = validate(
                    containsSchema, arg[i], itemValidationMetadata
                )
                containsPathToSchemas.add(otherPathToSchemas)
            } catch (ignored: ValidationException) {
            }
        }
        return containsPathToSchemas
    }

    @Throws(ValidationException::class)
    private fun getPatternPropertiesPathToSchemas(
        arg: Any?,
        validationMetadata: ValidationMetadata
    ): PathToSchemasMap {
        if (arg !is Map<*, *> || patternProperties == null) {
            return PathToSchemasMap()
        }
        val pathToSchemas = PathToSchemasMap()
        for ((key, value) in arg) {
            val entryKey = key!! as? String
                ?: throw ValidationException("Invalid non-string type for map key")
            val propPathToItem: List<Any> = validationMetadata.pathToItem + entryKey
            val propValidationMetadata = ValidationMetadata(
                propPathToItem,
                validationMetadata.configuration,
                validationMetadata.validatedPathToSchemas,
                validationMetadata.seenClasses
            )
            for ((key1, patternPropClass) in patternProperties) {
                if (!key1.matcher(entryKey).find()) {
                    continue
                }
                val patternPropSchema: JsonSchema<*> = JsonSchemaFactory.getInstance(patternPropClass)
                val otherPathToSchemas = validate(patternPropSchema, value, propValidationMetadata)
                pathToSchemas.update(otherPathToSchemas)
            }
        }
        return pathToSchemas
    }

    private fun getIfPathToSchemas(
        arg: Any?,
        validationMetadata: ValidationMetadata
    ): PathToSchemasMap {
        if (ifSchema == null) {
            return PathToSchemasMap()
        }
        val ifSchemaInstance: JsonSchema<*> = JsonSchemaFactory.getInstance(ifSchema)
        val pathToSchemas = PathToSchemasMap()
        try {
            val otherPathToSchemas = validate(ifSchemaInstance, arg, validationMetadata)
            pathToSchemas.update(otherPathToSchemas)
        } catch (ignored: ValidationException) {
        }
        return pathToSchemas
    }

    protected fun castToAllowedTypes(arg: String, pathToItem: List<Any>, pathSet: MutableSet<List<Any>>): String {
        pathSet.add(pathToItem)
        return arg
    }

    protected fun castToAllowedTypes(arg: Boolean, pathToItem: List<Any>, pathSet: MutableSet<List<Any>>): Boolean {
        pathSet.add(pathToItem)
        return arg
    }

    protected fun castToAllowedTypes(arg: Number, pathToItem: List<Any>, pathSet: MutableSet<List<Any>>): Number {
        pathSet.add(pathToItem)
        return arg
    }

    protected fun castToAllowedTypes(arg: Nothing?, pathToItem: List<Any>, pathSet: MutableSet<List<Any>>): Nothing? {
        pathSet.add(pathToItem)
        return arg
    }

    @Throws(ValidationException::class)
    protected fun castToAllowedTypes(arg: List<*>, pathToItem: List<Any>, pathSet: MutableSet<List<Any>>): List<*> {
        pathSet.add(pathToItem)
        val argFixed: MutableList<Any?> = ArrayList()
        var i = 0
        for (item in arg) {
            val newPathToItem: List<Any> = pathToItem + i
            val fixedVal = castToAllowedObjectTypes(item, newPathToItem, pathSet)
            argFixed.add(fixedVal)
            i += 1
        }
        return argFixed
    }

    @Throws(ValidationException::class)
    protected fun castToAllowedTypes(
        arg: Map<*, *>,
        pathToItem: List<Any>,
        pathSet: MutableSet<List<Any>>
    ): Map<*, *> {
        pathSet.add(pathToItem)
        val argFixed = LinkedHashMap<String, Any?>()
        for ((entryKey, value) in arg) {
            if (entryKey !is String) {
                throw ValidationException("Invalid non-string key value")
            }
            val newPathToItem: List<Any> = pathToItem + entryKey
            val fixedVal = castToAllowedObjectTypes(value, newPathToItem, pathSet)
            argFixed[entryKey] = fixedVal
        }
        return argFixed
    }

    @Throws(ValidationException::class)
    private fun castToAllowedObjectTypes(arg: Any?, pathToItem: List<Any>, pathSet: MutableSet<List<Any>>): Any? {
        return when (arg) {
            null -> {
                castToAllowedTypes(null, pathToItem, pathSet)
            }
            is String -> {
                castToAllowedTypes(arg, pathToItem, pathSet)
            }

            is Map<*, *> -> {
                pathSet.add(pathToItem)
                castToAllowedTypes(arg, pathToItem, pathSet)
            }

            is Boolean -> {
                castToAllowedTypes(arg, pathToItem, pathSet)
            }

            is Number -> {
                castToAllowedTypes(arg, pathToItem, pathSet)
            }

            is List<*> -> {
                castToAllowedTypes(arg, pathToItem, pathSet)
            }

            is ZonedDateTime -> {
                castToAllowedTypes(arg.toString(), pathToItem, pathSet)
            }

            is LocalDate -> {
                castToAllowedTypes(arg.toString(), pathToItem, pathSet)
            }

            is UUID -> {
                castToAllowedTypes(arg.toString(), pathToItem, pathSet)
            }

            else -> {
                val argClass = arg.javaClass
                throw ValidationException("Invalid type passed in for input=$arg type=$argClass")
            }
        }
    }

    companion object {
        @Throws(ValidationException::class)
        fun validate(
            jsonSchema: JsonSchema<*>,
            arg: Any?,
            validationMetadata: ValidationMetadata
        ): PathToSchemasMap {
            val disabledKeywords: LinkedHashSet<String> =
                validationMetadata.configuration.disabledKeywordFlags.keywords
            val pathToSchemas = PathToSchemasMap()
            val thisKeywordToValidator = jsonSchema.keywordToValidator
            var containsPathToSchemas: List<PathToSchemasMap>? = null
            if (thisKeywordToValidator.containsKey("contains")) {
                containsPathToSchemas = jsonSchema.getContainsPathToSchemas(arg, validationMetadata)
            }
            var patternPropertiesPathToSchemas: PathToSchemasMap? = null
            if (thisKeywordToValidator.containsKey("patternProperties")) {
                patternPropertiesPathToSchemas = jsonSchema.getPatternPropertiesPathToSchemas(arg, validationMetadata)
            }
            var ifPathToSchemas: PathToSchemasMap? = null
            if (thisKeywordToValidator.containsKey("if")) {
                ifPathToSchemas = jsonSchema.getIfPathToSchemas(arg, validationMetadata)
            }
            var knownPathToSchemas: PathToSchemasMap? = null
            for ((jsonKeyword, validator) in thisKeywordToValidator) {
                if (disabledKeywords.contains(jsonKeyword)) {
                    val typeIntegerUseCase = jsonKeyword == "format" && "int" == jsonSchema.format
                    if (!typeIntegerUseCase) {
                        continue
                    }
                }
                if ("unevaluatedItems" == jsonKeyword || "unevaluatedProperties" == jsonKeyword) {
                    knownPathToSchemas = pathToSchemas
                }
                val data = ValidationData(
                    jsonSchema,
                    arg,
                    validationMetadata,
                    containsPathToSchemas,
                    patternPropertiesPathToSchemas,
                    ifPathToSchemas,
                    knownPathToSchemas
                )
                val otherPathToSchemas = validator.validate(data) ?: continue
                pathToSchemas.update(otherPathToSchemas)
            }
            val pathToItem: List<Any> = validationMetadata.pathToItem
            if (!pathToSchemas.containsKey(pathToItem)) {
                pathToSchemas[validationMetadata.pathToItem] = LinkedHashMap()
            }
            val schemas: LinkedHashMap<JsonSchema<*>, Nothing?>? = pathToSchemas[pathToItem]
            if (schemas != null) {
                schemas[jsonSchema] = null
            }
            return pathToSchemas
        }

        @JvmStatic
        @Throws(ValidationException::class)
        protected fun getPathToSchemas(
            jsonSchema: JsonSchema<*>,
            arg: Any?,
            validationMetadata: ValidationMetadata,
            pathSet: Set<List<Any>>
        ): PathToSchemasMap {
            val pathToSchemasMap = PathToSchemasMap()
            // todo add check of validationMetadata.validationRanEarlier(this)
            val otherPathToSchemas = validate(jsonSchema, arg, validationMetadata)
            pathToSchemasMap.update(otherPathToSchemas)
            for (schemas in pathToSchemasMap.values) {
                val firstSchema: JsonSchema<*> = schemas.entries.iterator().next().key
                schemas.clear()
                schemas[firstSchema] = null
            }
            val mutPathSet: MutableSet<List<Any>> = pathSet.toMutableSet()
            mutPathSet.removeAll(pathToSchemasMap.keys)
            if (mutPathSet.isNotEmpty()) {
                val unsetAnyTypeSchema = LinkedHashMap<JsonSchema<*>, Nothing?>()
                unsetAnyTypeSchema[UnsetAnyTypeJsonSchema.UnsetAnyTypeJsonSchema1.getInstance()] = null
                for (pathToItem in mutPathSet) {
                    pathToSchemasMap[pathToItem] = unsetAnyTypeSchema
                }
            }
            return pathToSchemasMap
        }

        fun getClass(arg: Any?): String {
            return if (arg == null) {
                Void::class.java.getSimpleName()
            } else {
                arg.javaClass.getSimpleName()
            }
        } // todo add bytes and FileIO
    }
}