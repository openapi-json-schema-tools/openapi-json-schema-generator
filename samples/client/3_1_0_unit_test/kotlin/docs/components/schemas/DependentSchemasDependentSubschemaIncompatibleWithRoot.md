# DependentSchemasDependentSubschemaIncompatibleWithRoot
org.openapijsonschematools.client.components.schemas.DependentSchemasDependentSubschemaIncompatibleWithRoot.java
class DependentSchemasDependentSubschemaIncompatibleWithRoot<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid](#dependentschemasdependentsubschemaincompatiblewithroot1boxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean](#dependentschemasdependentsubschemaincompatiblewithroot1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber](#dependentschemasdependentsubschemaincompatiblewithroot1boxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString](#dependentschemasdependentsubschemaincompatiblewithroot1boxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList](#dependentschemasdependentsubschemaincompatiblewithroot1boxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap](#dependentschemasdependentsubschemaincompatiblewithroot1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1](#dependentschemasdependentsubschemaincompatiblewithroot1)<br> schema class |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder)<br> builder for Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap)<br> output class for Map payloads |
| sealed interface | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo](#foo)<br> schema class |
| sealed interface | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo1Boxed](#foo1boxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo1BoxedMap](#foo1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo1](#foo1)<br> schema class |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMapBuilder1](#foomapbuilder1)<br> builder for Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMap](#foomap)<br> output class for Map payloads |
| sealed interface | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Bar](#bar)<br> schema class |
| sealed interface | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalProperties](#additionalproperties)<br> schema class |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed
sealed interface DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed<br>
permits<br>
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid](#dependentschemasdependentsubschemaincompatiblewithroot1boxedvoid),
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean](#dependentschemasdependentsubschemaincompatiblewithroot1boxedboolean),
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber](#dependentschemasdependentsubschemaincompatiblewithroot1boxednumber),
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString](#dependentschemasdependentsubschemaincompatiblewithroot1boxedstring),
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList](#dependentschemasdependentsubschemaincompatiblewithroot1boxedlist),
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap](#dependentschemasdependentsubschemaincompatiblewithroot1boxedmap)

sealed interface that stores validated payloads using boxed classes

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid
data class DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean
data class DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber
data class DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString
data class DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList
data class DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap
data class DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap([DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1
class DependentSchemasDependentSubschemaIncompatibleWithRoot1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo::class.java](#foo))<br>)<br> |
| Map<String, Class<? extends JsonSchema>> | dependentSchemas = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo1::class.java](#foo1))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap) | validate(arg: [Map&lt;*, *&gt;](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString](#dependentschemasdependentsubschemaincompatiblewithroot1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid](#dependentschemasdependentsubschemaincompatiblewithroot1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber](#dependentschemasdependentsubschemaincompatiblewithroot1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean](#dependentschemasdependentsubschemaincompatiblewithroot1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap](#dependentschemasdependentsubschemaincompatiblewithroot1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder), configuration: SchemaConfiguration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList](#dependentschemasdependentsubschemaincompatiblewithroot1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder
class DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(value: Nothing?) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(value: Boolean) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(value: String) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(value: Int) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(value: Float) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(value: Long) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(value: Double) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(value: List<Any?>) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(value: Map<String, Any?>) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(key: String, value: String) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(key: String, value: Int) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(key: String, value: Float) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(key: String, value: Long) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(key: String, value: Double) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## DependentSchemasDependentSubschemaIncompatibleWithRootMap
class DependentSchemasDependentSubschemaIncompatibleWithRootMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap) | of([Map<String, Any?>](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) arg, SchemaConfiguration configuration) |
| Any? | foo()<br>[optional] |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FooBoxed
sealed interface FooBoxed<br>
permits<br>
[FooBoxedVoid](#fooboxedvoid),
[FooBoxedBoolean](#fooboxedboolean),
[FooBoxedNumber](#fooboxednumber),
[FooBoxedString](#fooboxedstring),
[FooBoxedList](#fooboxedlist),
[FooBoxedMap](#fooboxedmap)

sealed interface that stores validated payloads using boxed classes

## FooBoxedVoid
data class FooBoxedVoid<br>
implements [FooBoxed](#fooboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FooBoxedBoolean
data class FooBoxedBoolean<br>
implements [FooBoxed](#fooboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FooBoxedNumber
data class FooBoxedNumber<br>
implements [FooBoxed](#fooboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

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

## FooBoxedList
data class FooBoxedList<br>
implements [FooBoxed](#fooboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FooBoxedMap
data class FooBoxedMap<br>
implements [FooBoxed](#fooboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foo
class Foo<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Foo1Boxed
sealed interface Foo1Boxed<br>
permits<br>
[Foo1BoxedMap](#foo1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Foo1BoxedMap
data class Foo1BoxedMap<br>
implements [Foo1Boxed](#foo1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Foo1BoxedMap([FooMap](#foomap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooMap](#foomap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foo1
class Foo1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.DependentSchemasDependentSubschemaIncompatibleWithRoot

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// Map validation
val validatedPayload: DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMap =
    DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo1.validate(
    DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMapBuilder1()
    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(Map::class.java) |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar" to [Bar::class.java](#bar))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties::class.java](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooMap](#foomap) | validate(arg: [Map&lt;*, *&gt;](#foomapbuilder1), configuration: SchemaConfiguration) |
| [Foo1BoxedMap](#foo1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#foomapbuilder1), configuration: SchemaConfiguration) |
| [Foo1Boxed](#foo1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## FooMapBuilder1
class FooMapBuilder1<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [FooMapBuilder1](#foomapbuilder1) | bar(value: Nothing?) |
| [FooMapBuilder1](#foomapbuilder1) | bar(value: Boolean) |
| [FooMapBuilder1](#foomapbuilder1) | bar(value: String) |
| [FooMapBuilder1](#foomapbuilder1) | bar(value: Int) |
| [FooMapBuilder1](#foomapbuilder1) | bar(value: Float) |
| [FooMapBuilder1](#foomapbuilder1) | bar(value: Long) |
| [FooMapBuilder1](#foomapbuilder1) | bar(value: Double) |
| [FooMapBuilder1](#foomapbuilder1) | bar(value: List<Any?>) |
| [FooMapBuilder1](#foomapbuilder1) | bar(value: Map<String, Any?>) |

## FooMap
class FooMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FooMap](#foomap) | of([Map<String, Any?>](#foomapbuilder1) arg, SchemaConfiguration configuration) |
| Any? | bar()<br>[optional] |

## BarBoxed
sealed interface BarBoxed<br>
permits<br>
[BarBoxedVoid](#barboxedvoid),
[BarBoxedBoolean](#barboxedboolean),
[BarBoxedNumber](#barboxednumber),
[BarBoxedString](#barboxedstring),
[BarBoxedList](#barboxedlist),
[BarBoxedMap](#barboxedmap)

sealed interface that stores validated payloads using boxed classes

## BarBoxedVoid
data class BarBoxedVoid<br>
implements [BarBoxed](#barboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BarBoxedBoolean
data class BarBoxedBoolean<br>
implements [BarBoxed](#barboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BarBoxedNumber
data class BarBoxedNumber<br>
implements [BarBoxed](#barboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

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

## BarBoxedList
data class BarBoxedList<br>
implements [BarBoxed](#barboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BarBoxedMap
data class BarBoxedMap<br>
implements [BarBoxed](#barboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Bar
class Bar<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
data class AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedBoolean
data class AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedNumber
data class AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedString
data class AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
data class AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
data class AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalProperties
class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
