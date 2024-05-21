package org.openapijsonschematools.client.components.schemas
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.UUID
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class RequiredWithEscapedCharacters {
    // nest classes so all schemas and input/output classes can be public
    
    
    class RequiredWithEscapedCharactersMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf(
                "foo\tbar",
                "foo\nbar",
                "foo\u000Cbar",
                "foo\rbar",
                "foo\"bar",
                "foo\\bar"
            )
            val optionalKeys: Set<String> = setOf()
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): RequiredWithEscapedCharactersMap {
                return RequiredWithEscapedCharacters1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class, InvalidAdditionalPropertyException::class)
        fun getAdditionalProperty(name: String): Any? {
            throwIfKeyKnown(name, requiredKeys, optionalKeys)
            throwIfKeyNotPresent(name)
            return get(name)
        }
    }
    
    interface SetterForFootbar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusTbar(value: Nothing?): T {
            val instance = getInstance()
            instance["foo\tbar"] = null
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: Boolean): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: String): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: Int): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: Float): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: Long): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: Double): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: List<Any?>): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
    }
    
    interface SetterForFoonbar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusNbar(value: Nothing?): T {
            val instance = getInstance()
            instance["foo\nbar"] = null
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: Boolean): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: String): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: Int): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: Float): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: Long): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: Double): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: List<Any?>): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
    }
    
    interface SetterForFoou000Cbar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusU000cbar(value: Nothing?): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = null
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: Boolean): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: String): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: Int): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: Float): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: Long): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: Double): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: List<Any?>): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
    }
    
    interface SetterForFoorbar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusRbar(value: Nothing?): T {
            val instance = getInstance()
            instance["foo\rbar"] = null
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: Boolean): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: String): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: Int): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: Float): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: Long): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: Double): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: List<Any?>): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
    }
    
    interface SetterForFoobar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusQuotationMarkBar(value: Nothing?): T {
            val instance = getInstance()
            instance["foo\"bar"] = null
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: Boolean): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: String): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: Int): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: Float): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: Long): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: Double): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: List<Any?>): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
    }
    
    interface SetterForFoobar1 <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusReverseSolidusBar(value: Nothing?): T {
            val instance = getInstance()
            instance["foo\\bar"] = null
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: Boolean): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: String): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: Int): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: Float): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: Long): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: Double): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: List<Any?>): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap000000Builder(private val instance: MutableMap<String, Any?>): UnsetAddPropsSetter<RequiredWithEscapedCharactersMap000000Builder>, GenericBuilder<Map<String, Any?>> {
        private val knownKeys: Set<String> = setOf(
            "foo\tbar",
            "foo\nbar",
            "foo\u000Cbar",
            "foo\rbar",
            "foo\"bar",
            "foo\\bar"
        )
        override fun getKnownKeys(): Set<String> {
            return knownKeys
        }
        override fun build(): Map<String, Any?> {
            return instance
        }
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000000Builder  {
            return this
        }
    }
    
    class RequiredWithEscapedCharactersMap000001Builder(private val instance: MutableMap<String, Any?>): SetterForFoobar1<RequiredWithEscapedCharactersMap000000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000000Builder {
            return RequiredWithEscapedCharactersMap000000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap000010Builder(private val instance: MutableMap<String, Any?>): SetterForFoobar<RequiredWithEscapedCharactersMap000000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000000Builder {
            return RequiredWithEscapedCharactersMap000000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap000011Builder(private val instance: MutableMap<String, Any?>): SetterForFoobar<RequiredWithEscapedCharactersMap000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap000010Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000001Builder {
            return RequiredWithEscapedCharactersMap000001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000010Builder {
            return RequiredWithEscapedCharactersMap000010Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap000100Builder(private val instance: MutableMap<String, Any?>): SetterForFoorbar<RequiredWithEscapedCharactersMap000000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000000Builder {
            return RequiredWithEscapedCharactersMap000000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap000101Builder(private val instance: MutableMap<String, Any?>): SetterForFoorbar<RequiredWithEscapedCharactersMap000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap000100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000001Builder {
            return RequiredWithEscapedCharactersMap000001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000100Builder {
            return RequiredWithEscapedCharactersMap000100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap000110Builder(private val instance: MutableMap<String, Any?>): SetterForFoorbar<RequiredWithEscapedCharactersMap000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap000100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000010Builder {
            return RequiredWithEscapedCharactersMap000010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000100Builder {
            return RequiredWithEscapedCharactersMap000100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap000111Builder(private val instance: MutableMap<String, Any?>): SetterForFoorbar<RequiredWithEscapedCharactersMap000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap000101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap000110Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000011Builder {
            return RequiredWithEscapedCharactersMap000011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000101Builder {
            return RequiredWithEscapedCharactersMap000101Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000110Builder {
            return RequiredWithEscapedCharactersMap000110Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap001000Builder(private val instance: MutableMap<String, Any?>): SetterForFoou000Cbar<RequiredWithEscapedCharactersMap000000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000000Builder {
            return RequiredWithEscapedCharactersMap000000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap001001Builder(private val instance: MutableMap<String, Any?>): SetterForFoou000Cbar<RequiredWithEscapedCharactersMap000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap001000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000001Builder {
            return RequiredWithEscapedCharactersMap000001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001000Builder {
            return RequiredWithEscapedCharactersMap001000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap001010Builder(private val instance: MutableMap<String, Any?>): SetterForFoou000Cbar<RequiredWithEscapedCharactersMap000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap001000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000010Builder {
            return RequiredWithEscapedCharactersMap000010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001000Builder {
            return RequiredWithEscapedCharactersMap001000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap001011Builder(private val instance: MutableMap<String, Any?>): SetterForFoou000Cbar<RequiredWithEscapedCharactersMap000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap001001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap001010Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000011Builder {
            return RequiredWithEscapedCharactersMap000011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001001Builder {
            return RequiredWithEscapedCharactersMap001001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001010Builder {
            return RequiredWithEscapedCharactersMap001010Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap001100Builder(private val instance: MutableMap<String, Any?>): SetterForFoou000Cbar<RequiredWithEscapedCharactersMap000100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap001000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000100Builder {
            return RequiredWithEscapedCharactersMap000100Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001000Builder {
            return RequiredWithEscapedCharactersMap001000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap001101Builder(private val instance: MutableMap<String, Any?>): SetterForFoou000Cbar<RequiredWithEscapedCharactersMap000101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap001001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap001100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000101Builder {
            return RequiredWithEscapedCharactersMap000101Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001001Builder {
            return RequiredWithEscapedCharactersMap001001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001100Builder {
            return RequiredWithEscapedCharactersMap001100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap001110Builder(private val instance: MutableMap<String, Any?>): SetterForFoou000Cbar<RequiredWithEscapedCharactersMap000110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap001010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap001100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000110Builder {
            return RequiredWithEscapedCharactersMap000110Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001010Builder {
            return RequiredWithEscapedCharactersMap001010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001100Builder {
            return RequiredWithEscapedCharactersMap001100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap001111Builder(private val instance: MutableMap<String, Any?>): SetterForFoou000Cbar<RequiredWithEscapedCharactersMap000111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap001011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap001101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap001110Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000111Builder {
            return RequiredWithEscapedCharactersMap000111Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001011Builder {
            return RequiredWithEscapedCharactersMap001011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001101Builder {
            return RequiredWithEscapedCharactersMap001101Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001110Builder {
            return RequiredWithEscapedCharactersMap001110Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap010000Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap000000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000000Builder {
            return RequiredWithEscapedCharactersMap000000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap010001Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap010000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000001Builder {
            return RequiredWithEscapedCharactersMap000001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010000Builder {
            return RequiredWithEscapedCharactersMap010000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap010010Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap010000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000010Builder {
            return RequiredWithEscapedCharactersMap000010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010000Builder {
            return RequiredWithEscapedCharactersMap010000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap010011Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap010001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap010010Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000011Builder {
            return RequiredWithEscapedCharactersMap000011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010001Builder {
            return RequiredWithEscapedCharactersMap010001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010010Builder {
            return RequiredWithEscapedCharactersMap010010Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap010100Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap000100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap010000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000100Builder {
            return RequiredWithEscapedCharactersMap000100Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010000Builder {
            return RequiredWithEscapedCharactersMap010000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap010101Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap000101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap010001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap010100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000101Builder {
            return RequiredWithEscapedCharactersMap000101Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010001Builder {
            return RequiredWithEscapedCharactersMap010001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010100Builder {
            return RequiredWithEscapedCharactersMap010100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap010110Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap000110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap010010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap010100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000110Builder {
            return RequiredWithEscapedCharactersMap000110Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010010Builder {
            return RequiredWithEscapedCharactersMap010010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010100Builder {
            return RequiredWithEscapedCharactersMap010100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap010111Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap000111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap010011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap010101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap010110Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000111Builder {
            return RequiredWithEscapedCharactersMap000111Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010011Builder {
            return RequiredWithEscapedCharactersMap010011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010101Builder {
            return RequiredWithEscapedCharactersMap010101Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010110Builder {
            return RequiredWithEscapedCharactersMap010110Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap011000Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap001000Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap010000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001000Builder {
            return RequiredWithEscapedCharactersMap001000Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010000Builder {
            return RequiredWithEscapedCharactersMap010000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap011001Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap001001Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap010001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap011000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001001Builder {
            return RequiredWithEscapedCharactersMap001001Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010001Builder {
            return RequiredWithEscapedCharactersMap010001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011000Builder {
            return RequiredWithEscapedCharactersMap011000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap011010Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap001010Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap010010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap011000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001010Builder {
            return RequiredWithEscapedCharactersMap001010Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010010Builder {
            return RequiredWithEscapedCharactersMap010010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011000Builder {
            return RequiredWithEscapedCharactersMap011000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap011011Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap001011Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap010011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap011001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap011010Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001011Builder {
            return RequiredWithEscapedCharactersMap001011Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010011Builder {
            return RequiredWithEscapedCharactersMap010011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011001Builder {
            return RequiredWithEscapedCharactersMap011001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011010Builder {
            return RequiredWithEscapedCharactersMap011010Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap011100Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap001100Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap010100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap011000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001100Builder {
            return RequiredWithEscapedCharactersMap001100Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010100Builder {
            return RequiredWithEscapedCharactersMap010100Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011000Builder {
            return RequiredWithEscapedCharactersMap011000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap011101Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap001101Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap010101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap011001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap011100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001101Builder {
            return RequiredWithEscapedCharactersMap001101Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010101Builder {
            return RequiredWithEscapedCharactersMap010101Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011001Builder {
            return RequiredWithEscapedCharactersMap011001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011100Builder {
            return RequiredWithEscapedCharactersMap011100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap011110Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap001110Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap010110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap011010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap011100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001110Builder {
            return RequiredWithEscapedCharactersMap001110Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010110Builder {
            return RequiredWithEscapedCharactersMap010110Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011010Builder {
            return RequiredWithEscapedCharactersMap011010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011100Builder {
            return RequiredWithEscapedCharactersMap011100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap011111Builder(private val instance: MutableMap<String, Any?>): SetterForFoonbar<RequiredWithEscapedCharactersMap001111Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap010111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap011011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap011101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap011110Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001111Builder {
            return RequiredWithEscapedCharactersMap001111Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010111Builder {
            return RequiredWithEscapedCharactersMap010111Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011011Builder {
            return RequiredWithEscapedCharactersMap011011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011101Builder {
            return RequiredWithEscapedCharactersMap011101Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011110Builder {
            return RequiredWithEscapedCharactersMap011110Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap100000Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap000000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000000Builder {
            return RequiredWithEscapedCharactersMap000000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap100001Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap000001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap100000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000001Builder {
            return RequiredWithEscapedCharactersMap000001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100000Builder {
            return RequiredWithEscapedCharactersMap100000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap100010Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap000010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap100000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000010Builder {
            return RequiredWithEscapedCharactersMap000010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100000Builder {
            return RequiredWithEscapedCharactersMap100000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap100011Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap000011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap100010Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000011Builder {
            return RequiredWithEscapedCharactersMap000011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100001Builder {
            return RequiredWithEscapedCharactersMap100001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100010Builder {
            return RequiredWithEscapedCharactersMap100010Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap100100Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap000100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap100000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000100Builder {
            return RequiredWithEscapedCharactersMap000100Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100000Builder {
            return RequiredWithEscapedCharactersMap100000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap100101Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap000101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap100100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000101Builder {
            return RequiredWithEscapedCharactersMap000101Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100001Builder {
            return RequiredWithEscapedCharactersMap100001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100100Builder {
            return RequiredWithEscapedCharactersMap100100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap100110Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap000110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap100010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap100100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000110Builder {
            return RequiredWithEscapedCharactersMap000110Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100010Builder {
            return RequiredWithEscapedCharactersMap100010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100100Builder {
            return RequiredWithEscapedCharactersMap100100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap100111Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap000111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap100011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap100101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap100110Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap000111Builder {
            return RequiredWithEscapedCharactersMap000111Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100011Builder {
            return RequiredWithEscapedCharactersMap100011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100101Builder {
            return RequiredWithEscapedCharactersMap100101Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100110Builder {
            return RequiredWithEscapedCharactersMap100110Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap101000Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap001000Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap100000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001000Builder {
            return RequiredWithEscapedCharactersMap001000Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100000Builder {
            return RequiredWithEscapedCharactersMap100000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap101001Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap001001Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap101000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001001Builder {
            return RequiredWithEscapedCharactersMap001001Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100001Builder {
            return RequiredWithEscapedCharactersMap100001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101000Builder {
            return RequiredWithEscapedCharactersMap101000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap101010Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap001010Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap100010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap101000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001010Builder {
            return RequiredWithEscapedCharactersMap001010Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100010Builder {
            return RequiredWithEscapedCharactersMap100010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101000Builder {
            return RequiredWithEscapedCharactersMap101000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap101011Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap001011Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap100011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap101001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap101010Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001011Builder {
            return RequiredWithEscapedCharactersMap001011Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100011Builder {
            return RequiredWithEscapedCharactersMap100011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101001Builder {
            return RequiredWithEscapedCharactersMap101001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101010Builder {
            return RequiredWithEscapedCharactersMap101010Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap101100Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap001100Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap100100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap101000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001100Builder {
            return RequiredWithEscapedCharactersMap001100Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100100Builder {
            return RequiredWithEscapedCharactersMap100100Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101000Builder {
            return RequiredWithEscapedCharactersMap101000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap101101Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap001101Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap100101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap101001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap101100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001101Builder {
            return RequiredWithEscapedCharactersMap001101Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100101Builder {
            return RequiredWithEscapedCharactersMap100101Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101001Builder {
            return RequiredWithEscapedCharactersMap101001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101100Builder {
            return RequiredWithEscapedCharactersMap101100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap101110Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap001110Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap100110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap101010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap101100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001110Builder {
            return RequiredWithEscapedCharactersMap001110Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100110Builder {
            return RequiredWithEscapedCharactersMap100110Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101010Builder {
            return RequiredWithEscapedCharactersMap101010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101100Builder {
            return RequiredWithEscapedCharactersMap101100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap101111Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap001111Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap100111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap101011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap101101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap101110Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap001111Builder {
            return RequiredWithEscapedCharactersMap001111Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100111Builder {
            return RequiredWithEscapedCharactersMap100111Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101011Builder {
            return RequiredWithEscapedCharactersMap101011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101101Builder {
            return RequiredWithEscapedCharactersMap101101Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101110Builder {
            return RequiredWithEscapedCharactersMap101110Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap110000Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap010000Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010000Builder {
            return RequiredWithEscapedCharactersMap010000Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100000Builder {
            return RequiredWithEscapedCharactersMap100000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap110001Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap010001Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap110000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010001Builder {
            return RequiredWithEscapedCharactersMap010001Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100001Builder {
            return RequiredWithEscapedCharactersMap100001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110000Builder {
            return RequiredWithEscapedCharactersMap110000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap110010Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap010010Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap110000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010010Builder {
            return RequiredWithEscapedCharactersMap010010Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100010Builder {
            return RequiredWithEscapedCharactersMap100010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110000Builder {
            return RequiredWithEscapedCharactersMap110000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap110011Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap010011Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap110001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap110010Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010011Builder {
            return RequiredWithEscapedCharactersMap010011Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100011Builder {
            return RequiredWithEscapedCharactersMap100011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110001Builder {
            return RequiredWithEscapedCharactersMap110001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110010Builder {
            return RequiredWithEscapedCharactersMap110010Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap110100Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap010100Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap110000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010100Builder {
            return RequiredWithEscapedCharactersMap010100Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100100Builder {
            return RequiredWithEscapedCharactersMap100100Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110000Builder {
            return RequiredWithEscapedCharactersMap110000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap110101Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap010101Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap110001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap110100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010101Builder {
            return RequiredWithEscapedCharactersMap010101Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100101Builder {
            return RequiredWithEscapedCharactersMap100101Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110001Builder {
            return RequiredWithEscapedCharactersMap110001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110100Builder {
            return RequiredWithEscapedCharactersMap110100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap110110Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap010110Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap110010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap110100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010110Builder {
            return RequiredWithEscapedCharactersMap010110Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100110Builder {
            return RequiredWithEscapedCharactersMap100110Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110010Builder {
            return RequiredWithEscapedCharactersMap110010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110100Builder {
            return RequiredWithEscapedCharactersMap110100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap110111Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap010111Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap100111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap110011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap110101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap110110Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap010111Builder {
            return RequiredWithEscapedCharactersMap010111Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap100111Builder {
            return RequiredWithEscapedCharactersMap100111Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110011Builder {
            return RequiredWithEscapedCharactersMap110011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110101Builder {
            return RequiredWithEscapedCharactersMap110101Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110110Builder {
            return RequiredWithEscapedCharactersMap110110Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap111000Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap011000Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101000Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap110000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011000Builder {
            return RequiredWithEscapedCharactersMap011000Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101000Builder {
            return RequiredWithEscapedCharactersMap101000Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110000Builder {
            return RequiredWithEscapedCharactersMap110000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap111001Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap011001Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101001Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap110001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap111000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011001Builder {
            return RequiredWithEscapedCharactersMap011001Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101001Builder {
            return RequiredWithEscapedCharactersMap101001Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110001Builder {
            return RequiredWithEscapedCharactersMap110001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111000Builder {
            return RequiredWithEscapedCharactersMap111000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap111010Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap011010Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101010Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap110010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap111000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011010Builder {
            return RequiredWithEscapedCharactersMap011010Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101010Builder {
            return RequiredWithEscapedCharactersMap101010Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110010Builder {
            return RequiredWithEscapedCharactersMap110010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111000Builder {
            return RequiredWithEscapedCharactersMap111000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap111011Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap011011Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101011Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap110011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap111001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap111010Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011011Builder {
            return RequiredWithEscapedCharactersMap011011Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101011Builder {
            return RequiredWithEscapedCharactersMap101011Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110011Builder {
            return RequiredWithEscapedCharactersMap110011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111001Builder {
            return RequiredWithEscapedCharactersMap111001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111010Builder {
            return RequiredWithEscapedCharactersMap111010Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap111100Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap011100Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101100Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap110100Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap111000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011100Builder {
            return RequiredWithEscapedCharactersMap011100Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101100Builder {
            return RequiredWithEscapedCharactersMap101100Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110100Builder {
            return RequiredWithEscapedCharactersMap110100Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111000Builder {
            return RequiredWithEscapedCharactersMap111000Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap111101Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap011101Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101101Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap110101Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap111001Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap111100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011101Builder {
            return RequiredWithEscapedCharactersMap011101Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101101Builder {
            return RequiredWithEscapedCharactersMap101101Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110101Builder {
            return RequiredWithEscapedCharactersMap110101Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111001Builder {
            return RequiredWithEscapedCharactersMap111001Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111100Builder {
            return RequiredWithEscapedCharactersMap111100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMap111110Builder(private val instance: MutableMap<String, Any?>): SetterForFootbar<RequiredWithEscapedCharactersMap011110Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101110Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap110110Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap111010Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap111100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011110Builder {
            return RequiredWithEscapedCharactersMap011110Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101110Builder {
            return RequiredWithEscapedCharactersMap101110Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110110Builder {
            return RequiredWithEscapedCharactersMap110110Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111010Builder {
            return RequiredWithEscapedCharactersMap111010Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111100Builder {
            return RequiredWithEscapedCharactersMap111100Builder(instance)
        }
    }
    
    class RequiredWithEscapedCharactersMapBuilder: SetterForFootbar<RequiredWithEscapedCharactersMap011111Builder>, SetterForFoonbar<RequiredWithEscapedCharactersMap101111Builder>, SetterForFoou000Cbar<RequiredWithEscapedCharactersMap110111Builder>, SetterForFoorbar<RequiredWithEscapedCharactersMap111011Builder>, SetterForFoobar<RequiredWithEscapedCharactersMap111101Builder>, SetterForFoobar1<RequiredWithEscapedCharactersMap111110Builder> {
        private val instance: MutableMap<String, Any?>
        init {
            this.instance = LinkedHashMap()
        }
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap011111Builder {
            return RequiredWithEscapedCharactersMap011111Builder(instance)
        }
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap101111Builder {
            return RequiredWithEscapedCharactersMap101111Builder(instance)
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap110111Builder {
            return RequiredWithEscapedCharactersMap110111Builder(instance)
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111011Builder {
            return RequiredWithEscapedCharactersMap111011Builder(instance)
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111101Builder {
            return RequiredWithEscapedCharactersMap111101Builder(instance)
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): RequiredWithEscapedCharactersMap111110Builder {
            return RequiredWithEscapedCharactersMap111110Builder(instance)
        }
    }
    
    
    sealed interface RequiredWithEscapedCharacters1Boxed {
        fun getData(): Any?
    }
    
    data class RequiredWithEscapedCharacters1BoxedVoid(val data: Nothing?) : RequiredWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class RequiredWithEscapedCharacters1BoxedBoolean(val data: Boolean): RequiredWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class RequiredWithEscapedCharacters1BoxedNumber(val data: Number) : RequiredWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class RequiredWithEscapedCharacters1BoxedString(val data: String) : RequiredWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class RequiredWithEscapedCharacters1BoxedList(val data: FrozenList<Any?>) : RequiredWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class RequiredWithEscapedCharacters1BoxedMap(val data: RequiredWithEscapedCharactersMap) : RequiredWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class RequiredWithEscapedCharacters1 private constructor(): JsonSchema<RequiredWithEscapedCharacters1Boxed>(
        required =setOf(
            "foo\tbar",
            "foo\nbar",
            "foo\u000Cbar",
            "foo\rbar",
            "foo\"bar",
            "foo\\bar"
        ),
    ), NullSchemaValidator<RequiredWithEscapedCharacters1BoxedVoid>, BooleanSchemaValidator<RequiredWithEscapedCharacters1BoxedBoolean>, NumberSchemaValidator<RequiredWithEscapedCharacters1BoxedNumber>, StringSchemaValidator<RequiredWithEscapedCharacters1BoxedString>, ListSchemaValidator<FrozenList<Any?>, RequiredWithEscapedCharacters1BoxedList>, MapSchemaValidator<RequiredWithEscapedCharactersMap, RequiredWithEscapedCharacters1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: RequiredWithEscapedCharacters1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: RequiredWithEscapedCharacters1().also { instance = it }
                }
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Nothing?, configuration: SchemaConfiguration?): Nothing? {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validatedPathToSchemas = PathToSchemasMap()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Boolean, configuration: SchemaConfiguration?): Boolean {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validatedPathToSchemas = PathToSchemasMap()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Number, configuration: SchemaConfiguration?): Number {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validatedPathToSchemas = PathToSchemasMap()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: Int, configuration: SchemaConfiguration?): Int {
            return validate(arg as Number, configuration) as Int
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: Long, configuration: SchemaConfiguration?): Long {
            return validate(arg as Number, configuration) as Long
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: Float, configuration: SchemaConfiguration?): Float {
            return validate(arg as Number, configuration) as Float
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: Double, configuration: SchemaConfiguration?): Double {
            return validate(arg as Number, configuration) as Double
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: String, configuration: SchemaConfiguration?): String {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validatedPathToSchemas = PathToSchemasMap()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: LocalDate, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: ZonedDateTime, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: UUID, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }
        
        override fun getNewInstance(arg: List<*>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): FrozenList<Any?> {
            val items: MutableList<Any?> = ArrayList()
            var i: Int = 0
            for (item: Any? in arg) {
                val itemPathToItem = pathToItem + i
                val schemas: LinkedHashMap<JsonSchema<*>, Nothing?>? = pathToSchemas.get(itemPathToItem)
                if (schemas == null) {
                    throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                }
                val itemSchema: JsonSchema<*> = schemas.entries.iterator().next().key
                val itemInstance: Any? = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas)
                items.add(itemInstance)
                i += 1
            }
            val newInstanceItems: FrozenList<Any?> = FrozenList(items)
            return newInstanceItems
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: List<*>, configuration: SchemaConfiguration?): FrozenList<Any?> {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): RequiredWithEscapedCharactersMap {
            val properties: LinkedHashMap<String, Any?> = LinkedHashMap()
            for((propertyName, value) in arg) {
                if (!(propertyName is String)) {
                    throw RuntimeException("Invalid non-string key value")
                }
                val propertyPathToItem: List<Any> = pathToItem + propertyName
                val schemas: LinkedHashMap<JsonSchema<*>, Nothing?>? = pathToSchemas.get(propertyPathToItem)
                if (schemas == null) {
                    throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                }
                val propertySchema: JsonSchema<*> = schemas.entries.iterator().next().key
                val propertyInstance: Any? = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas)
                properties[propertyName] = propertyInstance
            }
            val castProperties: FrozenMap<Any?> = FrozenMap(properties)
            return RequiredWithEscapedCharactersMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): RequiredWithEscapedCharactersMap {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validatedPathToSchemas = PathToSchemasMap()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg == null) {
                return validate(null, configuration)
            } else if (arg is Boolean) {
                return validate(arg, configuration)
            } else if (arg is Number) {
                return validate(arg, configuration)
            } else if (arg is String) {
                return validate(arg, configuration)
            } else if (arg is List<*>) {
                return validate(arg, configuration)
            } else if (arg is Map<*, *>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg == null) {
                return arg
            } else if (arg is Boolean) {
                return arg
            } else if (arg is Number) {
                return arg
            } else if (arg is String) {
                return arg
            } else if (arg is List<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            } else if (arg is Map<*, *>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): RequiredWithEscapedCharacters1BoxedVoid {
            return RequiredWithEscapedCharacters1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): RequiredWithEscapedCharacters1BoxedBoolean {
            return RequiredWithEscapedCharacters1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): RequiredWithEscapedCharacters1BoxedNumber {
            return RequiredWithEscapedCharacters1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): RequiredWithEscapedCharacters1BoxedString {
            return RequiredWithEscapedCharacters1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): RequiredWithEscapedCharacters1BoxedList {
            return RequiredWithEscapedCharacters1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): RequiredWithEscapedCharacters1BoxedMap {
            return RequiredWithEscapedCharacters1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): RequiredWithEscapedCharacters1Boxed {
            if (arg == null) {
                return validateAndBox(null, configuration)
            } else if (arg is Boolean) {
                return validateAndBox(arg, configuration)
            } else if (arg is String) {
                return validateAndBox(arg, configuration)
            } else if (arg is Number) {
                return validateAndBox(arg, configuration)
            } else if (arg is List<*>) {
                return validateAndBox(arg, configuration)
            } else if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }
}
