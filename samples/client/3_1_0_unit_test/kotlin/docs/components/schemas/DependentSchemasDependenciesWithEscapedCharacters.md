# DependentSchemasDependenciesWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.DependentSchemasDependenciesWithEscapedCharacters.java
class DependentSchemasDependenciesWithEscapedCharacters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid](#dependentschemasdependencieswithescapedcharacters1boxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean](#dependentschemasdependencieswithescapedcharacters1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber](#dependentschemasdependencieswithescapedcharacters1boxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedString](#dependentschemasdependencieswithescapedcharacters1boxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedList](#dependentschemasdependencieswithescapedcharacters1boxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedMap](#dependentschemasdependencieswithescapedcharacters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1](#dependentschemasdependencieswithescapedcharacters1)<br> schema class |
| sealed interface | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxed](#foobarboxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedVoid](#foobarboxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedBoolean](#foobarboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedNumber](#foobarboxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedString](#foobarboxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedList](#foobarboxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedMap](#foobarboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.Foobar](#foobar)<br> schema class |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarMapBuilder](#foobarmapbuilder)<br> builder for Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarMap](#foobarmap)<br> output class for Map payloads |
| sealed interface | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxed](#footbarboxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedVoid](#footbarboxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedBoolean](#footbarboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedNumber](#footbarboxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedString](#footbarboxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedList](#footbarboxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedMap](#footbarboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.Footbar](#footbar)<br> schema class |

## DependentSchemasDependenciesWithEscapedCharacters1Boxed
sealed interface DependentSchemasDependenciesWithEscapedCharacters1Boxed<br>
permits<br>
[DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid](#dependentschemasdependencieswithescapedcharacters1boxedvoid),
[DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean](#dependentschemasdependencieswithescapedcharacters1boxedboolean),
[DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber](#dependentschemasdependencieswithescapedcharacters1boxednumber),
[DependentSchemasDependenciesWithEscapedCharacters1BoxedString](#dependentschemasdependencieswithescapedcharacters1boxedstring),
[DependentSchemasDependenciesWithEscapedCharacters1BoxedList](#dependentschemasdependencieswithescapedcharacters1boxedlist),
[DependentSchemasDependenciesWithEscapedCharacters1BoxedMap](#dependentschemasdependencieswithescapedcharacters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid
data class DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid<br>
implements [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean
data class DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean<br>
implements [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber
data class DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber<br>
implements [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1BoxedString
data class DependentSchemasDependenciesWithEscapedCharacters1BoxedString<br>
implements [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1BoxedList
data class DependentSchemasDependenciesWithEscapedCharacters1BoxedList<br>
implements [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1BoxedMap
data class DependentSchemasDependenciesWithEscapedCharacters1BoxedMap<br>
implements [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1
class DependentSchemasDependenciesWithEscapedCharacters1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | dependentSchemas = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\tbar", [Footbar::class.java](#footbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo'bar", [Foobar::class.java](#foobar)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedString](#dependentschemasdependencieswithescapedcharacters1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid](#dependentschemasdependencieswithescapedcharacters1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber](#dependentschemasdependencieswithescapedcharacters1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean](#dependentschemasdependencieswithescapedcharacters1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedMap](#dependentschemasdependencieswithescapedcharacters1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedList](#dependentschemasdependencieswithescapedcharacters1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## FoobarBoxed
sealed interface FoobarBoxed<br>
permits<br>
[FoobarBoxedVoid](#foobarboxedvoid),
[FoobarBoxedBoolean](#foobarboxedboolean),
[FoobarBoxedNumber](#foobarboxednumber),
[FoobarBoxedString](#foobarboxedstring),
[FoobarBoxedList](#foobarboxedlist),
[FoobarBoxedMap](#foobarboxedmap)

sealed interface that stores validated payloads using boxed classes

## FoobarBoxedVoid
data class FoobarBoxedVoid<br>
implements [FoobarBoxed](#foobarboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FoobarBoxedBoolean
data class FoobarBoxedBoolean<br>
implements [FoobarBoxed](#foobarboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FoobarBoxedNumber
data class FoobarBoxedNumber<br>
implements [FoobarBoxed](#foobarboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FoobarBoxedString
data class FoobarBoxedString<br>
implements [FoobarBoxed](#foobarboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FoobarBoxedList
data class FoobarBoxedList<br>
implements [FoobarBoxed](#foobarboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FoobarBoxedMap
data class FoobarBoxedMap<br>
implements [FoobarBoxed](#foobarboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedMap([FoobarMap](#foobarmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FoobarMap](#foobarmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foobar
class Foobar<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | required = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\"bar"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| [FoobarMap](#foobarmap) | validate(arg: [Map&lt;?, ?&gt;](#foobarmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [FoobarBoxedString](#foobarboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [FoobarBoxedVoid](#foobarboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [FoobarBoxedNumber](#foobarboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [FoobarBoxedBoolean](#foobarboxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [FoobarBoxedMap](#foobarboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#foobarmapbuilder), configuration: SchemaConfiguration) |
| [FoobarBoxedList](#foobarboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [FoobarBoxed](#foobarboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## FoobarMap0Builder
class FoobarMap0Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarMap0Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(key: String, value: Nothing?) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(key: String, value: Boolean) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(key: String, value: String) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(key: String, value: Int) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(key: String, value: Float) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(key: String, value: Long) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(key: String, value: Double) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(key: String, value: List<Any?>) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(key: String, value: Map<String, Any?>) |

## FoobarMapBuilder
class FoobarMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FoobarMap0Builder](#foobarmap0builder) | fooReverseSolidusQuotationMarkBar(value: Nothing?) |
| [FoobarMap0Builder](#foobarmap0builder) | fooReverseSolidusQuotationMarkBar(value: Boolean) |
| [FoobarMap0Builder](#foobarmap0builder) | fooReverseSolidusQuotationMarkBar(value: String) |
| [FoobarMap0Builder](#foobarmap0builder) | fooReverseSolidusQuotationMarkBar(value: Int) |
| [FoobarMap0Builder](#foobarmap0builder) | fooReverseSolidusQuotationMarkBar(value: Float) |
| [FoobarMap0Builder](#foobarmap0builder) | fooReverseSolidusQuotationMarkBar(value: Long) |
| [FoobarMap0Builder](#foobarmap0builder) | fooReverseSolidusQuotationMarkBar(value: Double) |
| [FoobarMap0Builder](#foobarmap0builder) | fooReverseSolidusQuotationMarkBar(value: List<Any?>) |
| [FoobarMap0Builder](#foobarmap0builder) | fooReverseSolidusQuotationMarkBar(value: Map<String, Any?>) |

## FoobarMap
class FoobarMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FoobarMap](#foobarmap) | of([Map<String, Any?>](#foobarmapbuilder) arg, SchemaConfiguration configuration) |
| Any? | get(String key)<br>This schema has invalid Kotlin names so this method must be used when you access instance["foo\&quot;bar"],  |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FootbarBoxed
sealed interface FootbarBoxed<br>
permits<br>
[FootbarBoxedVoid](#footbarboxedvoid),
[FootbarBoxedBoolean](#footbarboxedboolean),
[FootbarBoxedNumber](#footbarboxednumber),
[FootbarBoxedString](#footbarboxedstring),
[FootbarBoxedList](#footbarboxedlist),
[FootbarBoxedMap](#footbarboxedmap)

sealed interface that stores validated payloads using boxed classes

## FootbarBoxedVoid
data class FootbarBoxedVoid<br>
implements [FootbarBoxed](#footbarboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FootbarBoxedBoolean
data class FootbarBoxedBoolean<br>
implements [FootbarBoxed](#footbarboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FootbarBoxedNumber
data class FootbarBoxedNumber<br>
implements [FootbarBoxed](#footbarboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FootbarBoxedString
data class FootbarBoxedString<br>
implements [FootbarBoxed](#footbarboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FootbarBoxedList
data class FootbarBoxedList<br>
implements [FootbarBoxed](#footbarboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FootbarBoxedMap
data class FootbarBoxedMap<br>
implements [FootbarBoxed](#footbarboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Footbar
class Footbar<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minProperties = 4 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [FootbarBoxedString](#footbarboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [FootbarBoxedVoid](#footbarboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [FootbarBoxedNumber](#footbarboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [FootbarBoxedBoolean](#footbarboxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [FootbarBoxedMap](#footbarboxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [FootbarBoxedList](#footbarboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [FootbarBoxed](#footbarboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
