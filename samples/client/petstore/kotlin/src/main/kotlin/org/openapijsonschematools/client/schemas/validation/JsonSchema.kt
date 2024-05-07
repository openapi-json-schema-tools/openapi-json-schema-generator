package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import java.math.BigDecimal
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.regex.Pattern
import java.util.UUID

abstract class JsonSchema<T> protected constructor(jsonSchemaInfo: JsonSchemaInfo) {
    val type: Set<Class<*>>?
    val format: String?
    val items: Class<out JsonSchema<*>>?
    val properties: Map<String, Class<out JsonSchema<*>>>?
    val required: Set<String>?
    val exclusiveMaximum: Number?
    val exclusiveMinimum: Number?
    val maxItems: Int?
    val minItems: Int?
    val maxLength: Int?
    val minLength: Int?
    val maxProperties: Int?
    val minProperties: Int?
    val maximum: Number?
    val minimum: Number?
    val multipleOf: BigDecimal?
    val additionalProperties: Class<out JsonSchema<*>>?
    val allOf: List<Class<out JsonSchema<*>>>?
    val anyOf: List<Class<out JsonSchema<*>>>?
    val oneOf: List<Class<out JsonSchema<*>>>?
    val not: Class<out JsonSchema<*>>?
    val uniqueItems: Boolean?
    val enumValues: Set<Any>?
    val pattern: Pattern?
    val defaultValue: Any?
    val defaultValueSet: Boolean
    val constValue: Any?
    val constValueSet: Boolean
    val contains: Class<out JsonSchema<*>>?
    val maxContains: Int?
    val minContains: Int?
    val propertyNames: Class<out JsonSchema<*>>?
    val dependentRequired: Map<String, Set<String>>?
    val dependentSchemas: Map<String, Class<out JsonSchema<*>>>?
    val patternProperties: Map<Pattern, Class<out JsonSchema<*>>>?
    val prefixItems: List<Class<out JsonSchema<*>>>?
    val ifSchema: Class<out JsonSchema<*>>?
    val then: Class<out JsonSchema<*>>?
    val elseSchema: Class<out JsonSchema<*>>?
    val unevaluatedItems: Class<out JsonSchema<*>>?
    val unevaluatedProperties: Class<out JsonSchema<*>>?
    private val keywordToValidator: LinkedHashMap<String, KeywordValidator>

    init {
        val keywordToValidator = LinkedHashMap<String, KeywordValidator>()
        type = jsonSchemaInfo.type
        if (type != null) {
            keywordToValidator["type"] = TypeValidator()
        }
        format = jsonSchemaInfo.format
        if (format != null) {
            keywordToValidator["format"] = FormatValidator()
        }
        items = jsonSchemaInfo.items
        if (items != null) {
            keywordToValidator["items"] = ItemsValidator()
        }
        properties = jsonSchemaInfo.properties
        if (properties != null) {
            keywordToValidator["properties"] = PropertiesValidator()
        }
        required = jsonSchemaInfo.required
        if (required != null) {
            keywordToValidator["required"] = RequiredValidator()
        }
        exclusiveMaximum = jsonSchemaInfo.exclusiveMaximum
        if (exclusiveMaximum != null) {
            keywordToValidator["exclusiveMaximum"] = ExclusiveMaximumValidator()
        }
        exclusiveMinimum = jsonSchemaInfo.exclusiveMinimum
        if (exclusiveMinimum != null) {
            keywordToValidator["exclusiveMinimum"] = ExclusiveMinimumValidator()
        }
        maxItems = jsonSchemaInfo.maxItems
        if (maxItems != null) {
            keywordToValidator["maxItems"] = MaxItemsValidator()
        }
        minItems = jsonSchemaInfo.minItems
        if (minItems != null) {
            keywordToValidator["minItems"] = MinItemsValidator()
        }
        maxLength = jsonSchemaInfo.maxLength
        if (maxLength != null) {
            keywordToValidator["maxLength"] = MaxLengthValidator()
        }
        minLength = jsonSchemaInfo.minLength
        if (minLength != null) {
            keywordToValidator["minLength"] = MinLengthValidator()
        }
        maxProperties = jsonSchemaInfo.maxProperties
        if (maxProperties != null) {
            keywordToValidator["maxProperties"] = MaxPropertiesValidator()
        }
        minProperties = jsonSchemaInfo.minProperties
        if (minProperties != null) {
            keywordToValidator["minProperties"] = MinPropertiesValidator()
        }
        maximum = jsonSchemaInfo.maximum
        if (maximum != null) {
            keywordToValidator["maximum"] = MaximumValidator()
        }
        minimum = jsonSchemaInfo.minimum
        if (minimum != null) {
            keywordToValidator["minimum"] = MinimumValidator()
        }
        multipleOf = jsonSchemaInfo.multipleOf
        if (multipleOf != null) {
            keywordToValidator["multipleOf"] = MultipleOfValidator()
        }
        additionalProperties = jsonSchemaInfo.additionalProperties
        if (additionalProperties != null) {
            keywordToValidator["additionalProperties"] = AdditionalPropertiesValidator()
        }
        allOf = jsonSchemaInfo.allOf
        if (allOf != null) {
            keywordToValidator["allOf"] = AllOfValidator()
        }
        anyOf = jsonSchemaInfo.anyOf
        if (anyOf != null) {
            keywordToValidator["anyOf"] = AnyOfValidator()
        }
        oneOf = jsonSchemaInfo.oneOf
        if (oneOf != null) {
            keywordToValidator["oneOf"] = OneOfValidator()
        }
        not = jsonSchemaInfo.not
        if (not != null) {
            keywordToValidator["not"] = NotValidator()
        }
        uniqueItems = jsonSchemaInfo.uniqueItems
        if (uniqueItems != null) {
            keywordToValidator["uniqueItems"] = UniqueItemsValidator()
        }
        enumValues = jsonSchemaInfo.enumValues
        if (enumValues != null) {
            keywordToValidator["enum"] = EnumValidator()
        }
        pattern = jsonSchemaInfo.pattern
        if (pattern != null) {
            keywordToValidator["pattern"] = PatternValidator()
        }
        defaultValue = jsonSchemaInfo.defaultValue
        defaultValueSet = jsonSchemaInfo.defaultValueSet
        constValue = jsonSchemaInfo.constValue
        constValueSet = jsonSchemaInfo.constValueSet
        if (constValueSet) {
            keywordToValidator["const"] = ConstValidator()
        }
        contains = jsonSchemaInfo.contains
        if (contains != null) {
            keywordToValidator["contains"] = ContainsValidator()
        }
        maxContains = jsonSchemaInfo.maxContains
        if (maxContains != null) {
            keywordToValidator["maxContains"] = MaxContainsValidator()
        }
        minContains = jsonSchemaInfo.minContains
        if (minContains != null) {
            keywordToValidator["minContains"] = MinContainsValidator()
        }
        propertyNames = jsonSchemaInfo.propertyNames
        if (propertyNames != null) {
            keywordToValidator["propertyNames"] = PropertyNamesValidator()
        }
        dependentRequired = jsonSchemaInfo.dependentRequired
        if (dependentRequired != null) {
            keywordToValidator["dependentRequired"] = DependentRequiredValidator()
        }
        dependentSchemas = jsonSchemaInfo.dependentSchemas
        if (dependentSchemas != null) {
            keywordToValidator["dependentSchemas"] = DependentSchemasValidator()
        }
        patternProperties = jsonSchemaInfo.patternProperties
        if (patternProperties != null) {
            keywordToValidator["patternProperties"] = PatternPropertiesValidator()
        }
        prefixItems = jsonSchemaInfo.prefixItems
        if (prefixItems != null) {
            keywordToValidator["prefixItems"] = PrefixItemsValidator()
        }
        ifSchema = jsonSchemaInfo.ifSchema
        if (ifSchema != null) {
            keywordToValidator["if"] = IfValidator()
        }
        then = jsonSchemaInfo.then
        if (then != null) {
            keywordToValidator["then"] = ThenValidator()
        }
        elseSchema = jsonSchemaInfo.elseSchema
        if (elseSchema != null) {
            keywordToValidator["else"] = ElseValidator()
        }
        unevaluatedItems = jsonSchemaInfo.unevaluatedItems
        if (unevaluatedItems != null) {
            keywordToValidator["unevaluatedItems"] = UnevaluatedItemsValidator()
        }
        unevaluatedProperties = jsonSchemaInfo.unevaluatedProperties
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
    ): List<PathToSchemasMap>? {
        if (arg !is List<*> || contains == null) {
            return ArrayList()
        }
        val containsSchema: JsonSchema<*> = JsonSchemaFactory.getInstance(contains)
        val containsPathToSchemas: MutableList<PathToSchemasMap> = ArrayList()
        for (i in arg.indices) {
            val thesePathToSchemas = PathToSchemasMap()
            val itemPathToItem: MutableList<Any> = ArrayList<Any>(validationMetadata.pathToItem)
            itemPathToItem.add(i)
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
            val propPathToItem: MutableList<Any> = ArrayList<Any?>(validationMetadata.pathToItem())
            propPathToItem.add(entryKey)
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
            val newPathToItem: MutableList<Any?> = ArrayList(pathToItem)
            newPathToItem.add(i)
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
            val `val` = value!!
            val newPathToItem: MutableList<Any?> = ArrayList(pathToItem)
            newPathToItem.add(entryKey)
            val fixedVal = castToAllowedObjectTypes(`val`, newPathToItem, pathSet)
            argFixed[entryKey] = fixedVal
        }
        return argFixed
    }

    @Throws(ValidationException::class)
    private fun castToAllowedObjectTypes(arg: Any?, pathToItem: List<Any?>, pathSet: MutableSet<List<Any>>): Any? {
        return if (arg == null) {
            castToAllowedTypes(null as Void?, pathToItem, pathSet)
        } else if (arg is String) {
            castToAllowedTypes(arg, pathToItem, pathSet)
        } else if (arg is Map<*, *>) {
            pathSet.add(pathToItem)
            castToAllowedTypes(arg, pathToItem, pathSet)
        } else if (arg is Boolean) {
            castToAllowedTypes(arg, pathToItem, pathSet)
        } else if (arg is Int) {
            castToAllowedTypes(arg as Number, pathToItem, pathSet)
        } else if (arg is Long) {
            castToAllowedTypes(arg as Number, pathToItem, pathSet)
        } else if (arg is Float) {
            castToAllowedTypes(arg as Number, pathToItem, pathSet)
        } else if (arg is Double) {
            castToAllowedTypes(arg as Number, pathToItem, pathSet)
        } else if (arg is List<*>) {
            castToAllowedTypes(arg, pathToItem, pathSet)
        } else if (arg is ZonedDateTime) {
            castToAllowedTypes(arg.toString(), pathToItem, pathSet)
        } else if (arg is LocalDate) {
            castToAllowedTypes(arg.toString(), pathToItem, pathSet)
        } else if (arg is UUID) {
            castToAllowedTypes(arg.toString(), pathToItem, pathSet)
        } else {
            val argClass: Class<*> = arg.javaClass
            throw ValidationException("Invalid type passed in for input=$arg type=$argClass")
        }
    }

    fun getNewInstance(arg: Nothing?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Nothing? {
        return arg
    }

    fun getNewInstance(arg: Boolean, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Boolean {
        return arg
    }

    fun getNewInstance(arg: Number, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Number {
        return arg
    }

    fun getNewInstance(arg: String, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): String {
        return arg
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
                pathToSchemas[validationMetadata.pathToItem] = LinkedHashMap<Any, Any>()
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
                val firstSchema: JsonSchema<*> = schemas!!.entries.iterator().next().key!!
                schemas.clear()
                schemas[firstSchema] = null
            }
            var mutPathSet: MutableSet<List<Any?>> = pathSet.toMutableSet()
            mutPathSet.removeAll(pathToSchemasMap.keys)
            if (!mutPathSet.isEmpty()) {
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