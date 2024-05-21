# EnumsInProperties
org.openapijsonschematools.client.components.schemas.EnumsInProperties.java
class EnumsInProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EnumsInProperties.EnumsInProperties1Boxed](#enumsinproperties1boxed)<br> sealed interface for validated payloads |
| data class | [EnumsInProperties.EnumsInProperties1BoxedMap](#enumsinproperties1boxedmap)<br> boxed class to store validated Map payloads |
| class | [EnumsInProperties.EnumsInProperties1](#enumsinproperties1)<br> schema class |
| class | [EnumsInProperties.EnumsInPropertiesMapBuilder](#enumsinpropertiesmapbuilder)<br> builder for Map payloads |
| class | [EnumsInProperties.EnumsInPropertiesMap](#enumsinpropertiesmap)<br> output class for Map payloads |
| sealed interface | [EnumsInProperties.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| data class | [EnumsInProperties.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| class | [EnumsInProperties.Bar](#bar)<br> schema class |
| enum | [EnumsInProperties.StringBarEnums](#stringbarenums)<br>String enum |
| sealed interface | [EnumsInProperties.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| data class | [EnumsInProperties.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| class | [EnumsInProperties.Foo](#foo)<br> schema class |
| enum | [EnumsInProperties.StringFooEnums](#stringfooenums)<br>String enum |

## EnumsInProperties1Boxed
sealed interface EnumsInProperties1Boxed<br>
permits<br>
[EnumsInProperties1BoxedMap](#enumsinproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## EnumsInProperties1BoxedMap
data class EnumsInProperties1BoxedMap<br>
implements [EnumsInProperties1Boxed](#enumsinproperties1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumsInProperties1BoxedMap([EnumsInPropertiesMap](#enumsinpropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EnumsInPropertiesMap](#enumsinpropertiesmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EnumsInProperties1
class EnumsInProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.EnumsInProperties

val configuration = SchemaConfiguration()

// Map validation
val validatedPayload: EnumsInProperties.EnumsInPropertiesMap =
    EnumsInProperties.EnumsInProperties1.validate(
    EnumsInProperties.EnumsInPropertiesMapBuilder()
        .bar("bar")

        .foo("foo")

    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(Map::class.java) |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo::class.java](#foo)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar" to [Bar::class.java](#bar))<br>)<br> |
| Set<String> | required = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EnumsInPropertiesMap](#enumsinpropertiesmap) | validate(arg: [Map&lt;*, *&gt;](#enumsinpropertiesmapbuilder), configuration: SchemaConfiguration) |
| [EnumsInProperties1BoxedMap](#enumsinproperties1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#enumsinpropertiesmapbuilder), configuration: SchemaConfiguration) |
| [EnumsInProperties1Boxed](#enumsinproperties1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## EnumsInPropertiesMap0Builder
class EnumsInPropertiesMap0Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumsInPropertiesMap0Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | foo(value: String) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | foo(value: [StringFooEnums](#stringfooenums)) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(key: String, value: Nothing?) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(key: String, value: Boolean) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(key: String, value: String) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(key: String, value: Int) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(key: String, value: Float) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(key: String, value: Long) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(key: String, value: Double) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(key: String, value: List<Any?>) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(key: String, value: Map<String, Any?>) |

## EnumsInPropertiesMapBuilder
class EnumsInPropertiesMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumsInPropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | bar(value: String) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | bar(value: [StringBarEnums](#stringbarenums)) |

## EnumsInPropertiesMap
class EnumsInPropertiesMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumsInPropertiesMap](#enumsinpropertiesmap) | of([Map<String, Any?>](#enumsinpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| String | bar()<br> must be one of ["bar"] |
| String | foo()<br>[optional] must be one of ["foo"] |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BarBoxed
sealed interface BarBoxed<br>
permits<br>
[BarBoxedString](#barboxedstring)

sealed interface that stores validated payloads using boxed classes

## BarBoxedString
data class BarBoxedString<br>
implements [BarBoxed](#barboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Bar
class Bar<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.EnumsInProperties

val configuration = SchemaConfiguration()

// String validation
val validatedPayload: String = EnumsInProperties.Bar.validate(
    "bar",
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String::class.java<br/>)<br/> |
| Set<Any> | enumValues = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| String | validate(arg: [StringBarEnums](#stringbarenums), configuration: SchemaConfiguration) |
| [BarBoxedString](#barboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [BarBoxed](#barboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## StringBarEnums
public enum StringBarEnums<br>
extends `Enum<StringBarEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| BAR | value = "bar" |

## FooBoxed
sealed interface FooBoxed<br>
permits<br>
[FooBoxedString](#fooboxedstring)

sealed interface that stores validated payloads using boxed classes

## FooBoxedString
data class FooBoxedString<br>
implements [FooBoxed](#fooboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foo
class Foo<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.EnumsInProperties

val configuration = SchemaConfiguration()

// String validation
val validatedPayload: String = EnumsInProperties.Foo.validate(
    "foo",
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String::class.java<br/>)<br/> |
| Set<Any> | enumValues = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| String | validate(arg: [StringFooEnums](#stringfooenums), configuration: SchemaConfiguration) |
| [FooBoxedString](#fooboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [FooBoxed](#fooboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## StringFooEnums
public enum StringFooEnums<br>
extends `Enum<StringFooEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| FOO | value = "foo" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
