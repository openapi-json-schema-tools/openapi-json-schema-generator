# PropertiesWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.PropertiesWithEscapedCharacters.java
class PropertiesWithEscapedCharacters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedVoid](#propertieswithescapedcharacters1boxedvoid)<br> boxed class to store validated null payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedBoolean](#propertieswithescapedcharacters1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedNumber](#propertieswithescapedcharacters1boxednumber)<br> boxed class to store validated Number payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedString](#propertieswithescapedcharacters1boxedstring)<br> boxed class to store validated String payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedList](#propertieswithescapedcharacters1boxedlist)<br> boxed class to store validated List payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedMap](#propertieswithescapedcharacters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1](#propertieswithescapedcharacters1)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap)<br> output class for Map payloads |
| sealed interface | [PropertiesWithEscapedCharacters.Foou000CbarBoxed](#foou000cbarboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.Foou000CbarBoxedNumber](#foou000cbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foou000Cbar](#foou000cbar)<br> schema class |
| sealed interface | [PropertiesWithEscapedCharacters.FootbarBoxed](#footbarboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.FootbarBoxedNumber](#footbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Footbar](#footbar)<br> schema class |
| sealed interface | [PropertiesWithEscapedCharacters.FoorbarBoxed](#foorbarboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.FoorbarBoxedNumber](#foorbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foorbar](#foorbar)<br> schema class |
| sealed interface | [PropertiesWithEscapedCharacters.Foobar1Boxed](#foobar1boxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.Foobar1BoxedNumber](#foobar1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foobar1](#foobar1)<br> schema class |
| sealed interface | [PropertiesWithEscapedCharacters.FoobarBoxed](#foobarboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.FoobarBoxedNumber](#foobarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foobar](#foobar)<br> schema class |
| sealed interface | [PropertiesWithEscapedCharacters.FoonbarBoxed](#foonbarboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.FoonbarBoxedNumber](#foonbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foonbar](#foonbar)<br> schema class |

## PropertiesWithEscapedCharacters1Boxed
sealed interface PropertiesWithEscapedCharacters1Boxed<br>
permits<br>
[PropertiesWithEscapedCharacters1BoxedVoid](#propertieswithescapedcharacters1boxedvoid),
[PropertiesWithEscapedCharacters1BoxedBoolean](#propertieswithescapedcharacters1boxedboolean),
[PropertiesWithEscapedCharacters1BoxedNumber](#propertieswithescapedcharacters1boxednumber),
[PropertiesWithEscapedCharacters1BoxedString](#propertieswithescapedcharacters1boxedstring),
[PropertiesWithEscapedCharacters1BoxedList](#propertieswithescapedcharacters1boxedlist),
[PropertiesWithEscapedCharacters1BoxedMap](#propertieswithescapedcharacters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PropertiesWithEscapedCharacters1BoxedVoid
data class PropertiesWithEscapedCharacters1BoxedVoid<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedBoolean
data class PropertiesWithEscapedCharacters1BoxedBoolean<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedNumber
data class PropertiesWithEscapedCharacters1BoxedNumber<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedString
data class PropertiesWithEscapedCharacters1BoxedString<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedList
data class PropertiesWithEscapedCharacters1BoxedList<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedMap
data class PropertiesWithEscapedCharacters1BoxedMap<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedMap([PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1
class PropertiesWithEscapedCharacters1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\nbar" to [Foonbar::class.java](#foonbar)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\"bar" to [Foobar::class.java](#foobar)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\\bar" to [Foobar1::class.java](#foobar1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\rbar" to [Foorbar::class.java](#foorbar)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\tbar" to [Footbar::class.java](#footbar)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\u000Cbar" to [Foou000Cbar::class.java](#foou000cbar))<br>)<br> |

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
| [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | validate(arg: [Map&lt;*, *&gt;](#propertieswithescapedcharactersmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [PropertiesWithEscapedCharacters1BoxedString](#propertieswithescapedcharacters1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PropertiesWithEscapedCharacters1BoxedVoid](#propertieswithescapedcharacters1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [PropertiesWithEscapedCharacters1BoxedNumber](#propertieswithescapedcharacters1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [PropertiesWithEscapedCharacters1BoxedBoolean](#propertieswithescapedcharacters1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [PropertiesWithEscapedCharacters1BoxedMap](#propertieswithescapedcharacters1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#propertieswithescapedcharactersmapbuilder), configuration: SchemaConfiguration) |
| [PropertiesWithEscapedCharacters1BoxedList](#propertieswithescapedcharacters1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## PropertiesWithEscapedCharactersMapBuilder
class PropertiesWithEscapedCharactersMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharactersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusNbar(value: Int) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusNbar(value: Float) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusNbar(value: Long) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusNbar(value: Double) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusQuotationMarkBar(value: Int) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusQuotationMarkBar(value: Float) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusQuotationMarkBar(value: Long) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusQuotationMarkBar(value: Double) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusReverseSolidusBar(value: Int) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusReverseSolidusBar(value: Float) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusReverseSolidusBar(value: Long) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusReverseSolidusBar(value: Double) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusRbar(value: Int) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusRbar(value: Float) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusRbar(value: Long) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusRbar(value: Double) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusTbar(value: Int) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusTbar(value: Float) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusTbar(value: Long) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusTbar(value: Double) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusU000cbar(value: Int) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusU000cbar(value: Float) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusU000cbar(value: Long) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusU000cbar(value: Double) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(key: String, value: String) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(key: String, value: Int) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(key: String, value: Float) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(key: String, value: Long) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(key: String, value: Double) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## PropertiesWithEscapedCharactersMap
class PropertiesWithEscapedCharactersMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | of([Map<String, Any?>](#propertieswithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| Any? | get(String key)<br>This schema has invalid Kotlin names so this method must be used when you access instance["foo\nbar"], instance["foo\&quot;bar"], instance["foo\\bar"], instance["foo\rbar"], instance["foo\tbar"], instance["foo\u000Cbar"],  |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foou000CbarBoxed
sealed interface Foou000CbarBoxed<br>
permits<br>
[Foou000CbarBoxedNumber](#foou000cbarboxednumber)

sealed interface that stores validated payloads using boxed classes

## Foou000CbarBoxedNumber
data class Foou000CbarBoxedNumber<br>
implements [Foou000CbarBoxed](#foou000cbarboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Foou000CbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foou000Cbar
class Foou000Cbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FootbarBoxed
sealed interface FootbarBoxed<br>
permits<br>
[FootbarBoxedNumber](#footbarboxednumber)

sealed interface that stores validated payloads using boxed classes

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

## Footbar
class Footbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FoorbarBoxed
sealed interface FoorbarBoxed<br>
permits<br>
[FoorbarBoxedNumber](#foorbarboxednumber)

sealed interface that stores validated payloads using boxed classes

## FoorbarBoxedNumber
data class FoorbarBoxedNumber<br>
implements [FoorbarBoxed](#foorbarboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoorbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foorbar
class Foorbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Foobar1Boxed
sealed interface Foobar1Boxed<br>
permits<br>
[Foobar1BoxedNumber](#foobar1boxednumber)

sealed interface that stores validated payloads using boxed classes

## Foobar1BoxedNumber
data class Foobar1BoxedNumber<br>
implements [Foobar1Boxed](#foobar1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Foobar1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foobar1
class Foobar1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FoobarBoxed
sealed interface FoobarBoxed<br>
permits<br>
[FoobarBoxedNumber](#foobarboxednumber)

sealed interface that stores validated payloads using boxed classes

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

## Foobar
class Foobar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FoonbarBoxed
sealed interface FoonbarBoxed<br>
permits<br>
[FoonbarBoxedNumber](#foonbarboxednumber)

sealed interface that stores validated payloads using boxed classes

## FoonbarBoxedNumber
data class FoonbarBoxedNumber<br>
implements [FoonbarBoxed](#foonbarboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoonbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foonbar
class Foonbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
