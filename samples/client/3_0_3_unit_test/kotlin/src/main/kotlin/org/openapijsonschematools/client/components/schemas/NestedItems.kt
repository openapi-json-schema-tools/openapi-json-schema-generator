package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.NumberJsonSchema
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class NestedItems {
    // nest classes so all schemas and input/output classes can be public
    
    
    class Items3 : NumberJsonSchema.NumberJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Items3? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Items3().also { instance = it }
                }
        }
    }
    
    
    class ItemsList(m: FrozenList<Number>) : FrozenList<Number>(m) {
        companion object {
            @Throws(ValidationException::class)
            fun of(arg: List<Number>, configuration: SchemaConfiguration?): ItemsList {
                return Items2.getInstance().validate(arg, configuration)
            }
        }
    }
    
    class ItemsListBuilder {
        // class to build List<Number>
        private val list: MutableList<Number>
    
        init {
            this.list = ArrayList()
        }
    
        
        fun add(item: Int): ItemsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Float): ItemsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Long): ItemsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Double): ItemsListBuilder {
            list.add(item)
            return this
        }
    
        fun build(): List<Number> {
            return list
        }
    }
    
    
    sealed interface Items2Boxed {
        fun getData(): Any?
    }
    
    data class Items2BoxedList(val data: ItemsList) : Items2Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    
    class Items2 private constructor(): JsonSchema<Items2Boxed>(
        JsonSchemaInfo()
            .type(setOf(List::class.java))
            .items(Items3::class.java)
    ), ListSchemaValidator<ItemsList, Items2BoxedList> {
    
        companion object {
            @Volatile
            private var instance: Items2? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Items2().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: List<*>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): ItemsList {
            val items: MutableList<Number> = ArrayList()
            var i: Int = 0
            for (item: Any? in arg) {
                val itemPathToItem: List<Any> = pathToItem + i
                val schemas: LinkedHashMap<JsonSchema<*>, Nothing?>? = pathToSchemas.get(itemPathToItem)
                if (schemas == null) {
                    throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                }
                val itemSchema: JsonSchema<*> = schemas.entries.iterator().next().key
                val itemInstance: Any? = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas)
                if (!(itemInstance is Number)) {
                    throw RuntimeException("Invalid instantiated value")
                }
                items.add(itemInstance)
                i += 1
            }
            val newInstanceItems: FrozenList<Number> = FrozenList(items)
            return ItemsList(newInstanceItems)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: List<*>, configuration: SchemaConfiguration?): ItemsList {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is List<*>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is List<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): Items2BoxedList {
            return Items2BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): Items2Boxed {
            if (arg is List<*>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }    
    
    class ItemsList1(m: FrozenList<ItemsList>) : FrozenList<ItemsList>(m) {
        companion object {
            @Throws(ValidationException::class)
            fun of(arg: List<List<Number>>, configuration: SchemaConfiguration?): ItemsList1 {
                return Items1.getInstance().validate(arg, configuration)
            }
        }
    }
    
    class ItemsListBuilder1 {
        // class to build List<List<Number>>
        private val list: MutableList<List<Number>>
    
        init {
            this.list = ArrayList()
        }
    
        
        fun add(item: List<Number>): ItemsListBuilder1 {
            list.add(item)
            return this
        }
    
        fun build(): List<List<Number>> {
            return list
        }
    }
    
    
    sealed interface Items1Boxed {
        fun getData(): Any?
    }
    
    data class Items1BoxedList(val data: ItemsList1) : Items1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    
    class Items1 private constructor(): JsonSchema<Items1Boxed>(
        JsonSchemaInfo()
            .type(setOf(List::class.java))
            .items(Items2::class.java)
    ), ListSchemaValidator<ItemsList1, Items1BoxedList> {
    
        companion object {
            @Volatile
            private var instance: Items1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Items1().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: List<*>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): ItemsList1 {
            val items: MutableList<ItemsList> = ArrayList()
            var i: Int = 0
            for (item: Any? in arg) {
                val itemPathToItem: List<Any> = pathToItem + i
                val schemas: LinkedHashMap<JsonSchema<*>, Nothing?>? = pathToSchemas.get(itemPathToItem)
                if (schemas == null) {
                    throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                }
                val itemSchema: JsonSchema<*> = schemas.entries.iterator().next().key
                val itemInstance: Any? = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas)
                if (!(itemInstance is ItemsList)) {
                    throw RuntimeException("Invalid instantiated value")
                }
                items.add(itemInstance)
                i += 1
            }
            val newInstanceItems: FrozenList<ItemsList> = FrozenList(items)
            return ItemsList1(newInstanceItems)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: List<*>, configuration: SchemaConfiguration?): ItemsList1 {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is List<*>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is List<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): Items1BoxedList {
            return Items1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): Items1Boxed {
            if (arg is List<*>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }    
    
    class ItemsList2(m: FrozenList<ItemsList1>) : FrozenList<ItemsList1>(m) {
        companion object {
            @Throws(ValidationException::class)
            fun of(arg: List<List<List<Number>>>, configuration: SchemaConfiguration?): ItemsList2 {
                return Items.getInstance().validate(arg, configuration)
            }
        }
    }
    
    class ItemsListBuilder2 {
        // class to build List<List<List<Number>>>
        private val list: MutableList<List<List<Number>>>
    
        init {
            this.list = ArrayList()
        }
    
        
        fun add(item: List<List<Number>>): ItemsListBuilder2 {
            list.add(item)
            return this
        }
    
        fun build(): List<List<List<Number>>> {
            return list
        }
    }
    
    
    sealed interface ItemsBoxed {
        fun getData(): Any?
    }
    
    data class ItemsBoxedList(val data: ItemsList2) : ItemsBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    
    class Items private constructor(): JsonSchema<ItemsBoxed>(
        JsonSchemaInfo()
            .type(setOf(List::class.java))
            .items(Items1::class.java)
    ), ListSchemaValidator<ItemsList2, ItemsBoxedList> {
    
        companion object {
            @Volatile
            private var instance: Items? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Items().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: List<*>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): ItemsList2 {
            val items: MutableList<ItemsList1> = ArrayList()
            var i: Int = 0
            for (item: Any? in arg) {
                val itemPathToItem: List<Any> = pathToItem + i
                val schemas: LinkedHashMap<JsonSchema<*>, Nothing?>? = pathToSchemas.get(itemPathToItem)
                if (schemas == null) {
                    throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                }
                val itemSchema: JsonSchema<*> = schemas.entries.iterator().next().key
                val itemInstance: Any? = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas)
                if (!(itemInstance is ItemsList1)) {
                    throw RuntimeException("Invalid instantiated value")
                }
                items.add(itemInstance)
                i += 1
            }
            val newInstanceItems: FrozenList<ItemsList1> = FrozenList(items)
            return ItemsList2(newInstanceItems)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: List<*>, configuration: SchemaConfiguration?): ItemsList2 {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is List<*>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is List<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): ItemsBoxedList {
            return ItemsBoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): ItemsBoxed {
            if (arg is List<*>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }    
    
    class NestedItemsList(m: FrozenList<ItemsList2>) : FrozenList<ItemsList2>(m) {
        companion object {
            @Throws(ValidationException::class)
            fun of(arg: List<List<List<List<Number>>>>, configuration: SchemaConfiguration?): NestedItemsList {
                return NestedItems1.getInstance().validate(arg, configuration)
            }
        }
    }
    
    class NestedItemsListBuilder {
        // class to build List<List<List<List<Number>>>>
        private val list: MutableList<List<List<List<Number>>>>
    
        init {
            this.list = ArrayList()
        }
    
        
        fun add(item: List<List<List<Number>>>): NestedItemsListBuilder {
            list.add(item)
            return this
        }
    
        fun build(): List<List<List<List<Number>>>> {
            return list
        }
    }
    
    
    sealed interface NestedItems1Boxed {
        fun getData(): Any?
    }
    
    data class NestedItems1BoxedList(val data: NestedItemsList) : NestedItems1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    
    class NestedItems1 private constructor(): JsonSchema<NestedItems1Boxed>(
        JsonSchemaInfo()
            .type(setOf(List::class.java))
            .items(Items::class.java)
    ), ListSchemaValidator<NestedItemsList, NestedItems1BoxedList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: NestedItems1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: NestedItems1().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: List<*>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): NestedItemsList {
            val items: MutableList<ItemsList2> = ArrayList()
            var i: Int = 0
            for (item: Any? in arg) {
                val itemPathToItem: List<Any> = pathToItem + i
                val schemas: LinkedHashMap<JsonSchema<*>, Nothing?>? = pathToSchemas.get(itemPathToItem)
                if (schemas == null) {
                    throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                }
                val itemSchema: JsonSchema<*> = schemas.entries.iterator().next().key
                val itemInstance: Any? = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas)
                if (!(itemInstance is ItemsList2)) {
                    throw RuntimeException("Invalid instantiated value")
                }
                items.add(itemInstance)
                i += 1
            }
            val newInstanceItems: FrozenList<ItemsList2> = FrozenList(items)
            return NestedItemsList(newInstanceItems)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: List<*>, configuration: SchemaConfiguration?): NestedItemsList {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is List<*>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is List<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): NestedItems1BoxedList {
            return NestedItems1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): NestedItems1Boxed {
            if (arg is List<*>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }
}
