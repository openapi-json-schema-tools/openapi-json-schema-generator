package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

open class MapJsonSchema {
    sealed interface MapJsonSchema1Boxed {
        fun getData(): Any?
    }

    data class MapJsonSchema1BoxedMap(val data: FrozenMap<Any?>) : MapJsonSchema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }

    open class MapJsonSchema1 protected constructor() : JsonSchema<MapJsonSchema1Boxed>(
        JsonSchemaInfo(
            type = setOf(Map::class.java)
        )
    ), MapSchemaValidator<FrozenMap<Any?>, MapJsonSchema1BoxedMap> {
        override fun getNewInstance(
            arg: Map<*, *>,
            pathToItem: List<Any>,
            pathToSchemas: PathToSchemasMap
        ): FrozenMap<Any?> {
            val properties = LinkedHashMap<String, Any?>()
            for ((entryKey, value1) in arg) {
                if (entryKey !is String) {
                    throw RuntimeException("Invalid non-string key value")
                }
                val propertyPathToItem: List<Any> = pathToItem + entryKey
                val schemas: LinkedHashMap<JsonSchema<*>, Nothing?> = pathToSchemas[propertyPathToItem]
                    ?: throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                val propertySchema: JsonSchema<*> = schemas.entries.iterator().next().key
                val castValue = propertySchema.getNewInstance(value1, propertyPathToItem, pathToSchemas)
                properties[entryKey] = castValue
            }
            return FrozenMap(properties)
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): FrozenMap<Any?> {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg: Map<*, *> = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata =
                ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): FrozenMap<Any?> {
            if (arg is Map<*, *>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is Map<*, *>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): MapJsonSchema1BoxedMap {
            return MapJsonSchema1BoxedMap(validate(arg, configuration))
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): MapJsonSchema1Boxed {
            if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        companion object {
            @Volatile
            private var instance: MapJsonSchema1? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: MapJsonSchema1().also { instance = it }
                }
        }
    }
}