# NonInterferenceAcrossCombinedSchemas
org.openapijsonschematools.client.components.schemas.NonInterferenceAcrossCombinedSchemas.java
class NonInterferenceAcrossCombinedSchemas<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)<br> sealed interface for validated payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedVoid](#noninterferenceacrosscombinedschemas1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedBoolean](#noninterferenceacrosscombinedschemas1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedNumber](#noninterferenceacrosscombinedschemas1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedString](#noninterferenceacrosscombinedschemas1boxedstring)<br> boxed class to store validated String payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedList](#noninterferenceacrosscombinedschemas1boxedlist)<br> boxed class to store validated List payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedMap](#noninterferenceacrosscombinedschemas1boxedmap)<br> boxed class to store validated Map payloads |
| class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1](#noninterferenceacrosscombinedschemas1)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.Schema2Boxed](#schema2boxed)<br> sealed interface for validated payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedVoid](#schema2boxedvoid)<br> boxed class to store validated null payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedBoolean](#schema2boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedNumber](#schema2boxednumber)<br> boxed class to store validated Number payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedString](#schema2boxedstring)<br> boxed class to store validated String payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedList](#schema2boxedlist)<br> boxed class to store validated List payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedMap](#schema2boxedmap)<br> boxed class to store validated Map payloads |
| class | [NonInterferenceAcrossCombinedSchemas.Schema2](#schema2)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxed](#elseschemaboxed)<br> sealed interface for validated payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| class | [NonInterferenceAcrossCombinedSchemas.ElseSchema](#elseschema)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| class | [NonInterferenceAcrossCombinedSchemas.Schema1](#schema1)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.ThenBoxed](#thenboxed)<br> sealed interface for validated payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| class | [NonInterferenceAcrossCombinedSchemas.Then](#then)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| class | [NonInterferenceAcrossCombinedSchemas.Schema0](#schema0)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxed](#ifschemaboxed)<br> sealed interface for validated payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| data class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| class | [NonInterferenceAcrossCombinedSchemas.IfSchema](#ifschema)<br> schema class |

## NonInterferenceAcrossCombinedSchemas1Boxed
sealed interface NonInterferenceAcrossCombinedSchemas1Boxed<br>
permits<br>
[NonInterferenceAcrossCombinedSchemas1BoxedVoid](#noninterferenceacrosscombinedschemas1boxedvoid),
[NonInterferenceAcrossCombinedSchemas1BoxedBoolean](#noninterferenceacrosscombinedschemas1boxedboolean),
[NonInterferenceAcrossCombinedSchemas1BoxedNumber](#noninterferenceacrosscombinedschemas1boxednumber),
[NonInterferenceAcrossCombinedSchemas1BoxedString](#noninterferenceacrosscombinedschemas1boxedstring),
[NonInterferenceAcrossCombinedSchemas1BoxedList](#noninterferenceacrosscombinedschemas1boxedlist),
[NonInterferenceAcrossCombinedSchemas1BoxedMap](#noninterferenceacrosscombinedschemas1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NonInterferenceAcrossCombinedSchemas1BoxedVoid
data class NonInterferenceAcrossCombinedSchemas1BoxedVoid<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedBoolean
data class NonInterferenceAcrossCombinedSchemas1BoxedBoolean<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedNumber
data class NonInterferenceAcrossCombinedSchemas1BoxedNumber<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedString
data class NonInterferenceAcrossCombinedSchemas1BoxedString<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedList
data class NonInterferenceAcrossCombinedSchemas1BoxedList<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedMap
data class NonInterferenceAcrossCombinedSchemas1BoxedMap<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1
class NonInterferenceAcrossCombinedSchemas1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1::class.java](#schema1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema2::class.java](#schema2)<br>;)<br> |

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
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedString](#noninterferenceacrosscombinedschemas1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedVoid](#noninterferenceacrosscombinedschemas1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedNumber](#noninterferenceacrosscombinedschemas1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedBoolean](#noninterferenceacrosscombinedschemas1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedMap](#noninterferenceacrosscombinedschemas1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedList](#noninterferenceacrosscombinedschemas1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema2Boxed
sealed interface Schema2Boxed<br>
permits<br>
[Schema2BoxedVoid](#schema2boxedvoid),
[Schema2BoxedBoolean](#schema2boxedboolean),
[Schema2BoxedNumber](#schema2boxednumber),
[Schema2BoxedString](#schema2boxedstring),
[Schema2BoxedList](#schema2boxedlist),
[Schema2BoxedMap](#schema2boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema2BoxedVoid
data class Schema2BoxedVoid<br>
implements [Schema2Boxed](#schema2boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema2BoxedBoolean
data class Schema2BoxedBoolean<br>
implements [Schema2Boxed](#schema2boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema2BoxedNumber
data class Schema2BoxedNumber<br>
implements [Schema2Boxed](#schema2boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema2BoxedString
data class Schema2BoxedString<br>
implements [Schema2Boxed](#schema2boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema2BoxedList
data class Schema2BoxedList<br>
implements [Schema2Boxed](#schema2boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema2BoxedMap
data class Schema2BoxedMap<br>
implements [Schema2Boxed](#schema2boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema2
class Schema2<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | elseSchema = [ElseSchema::class.java](#elseschema) |

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
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [Schema2BoxedString](#schema2boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema2BoxedVoid](#schema2boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema2BoxedNumber](#schema2boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema2BoxedBoolean](#schema2boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Schema2BoxedMap](#schema2boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [Schema2BoxedList](#schema2boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema2Boxed](#schema2boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ElseSchemaBoxed
sealed interface ElseSchemaBoxed<br>
permits<br>
[ElseSchemaBoxedVoid](#elseschemaboxedvoid),
[ElseSchemaBoxedBoolean](#elseschemaboxedboolean),
[ElseSchemaBoxedNumber](#elseschemaboxednumber),
[ElseSchemaBoxedString](#elseschemaboxedstring),
[ElseSchemaBoxedList](#elseschemaboxedlist),
[ElseSchemaBoxedMap](#elseschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## ElseSchemaBoxedVoid
data class ElseSchemaBoxedVoid<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchemaBoxedBoolean
data class ElseSchemaBoxedBoolean<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchemaBoxedNumber
data class ElseSchemaBoxedNumber<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchemaBoxedString
data class ElseSchemaBoxedString<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchemaBoxedList
data class ElseSchemaBoxedList<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchemaBoxedMap
data class ElseSchemaBoxedMap<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchema
class ElseSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = BigDecimal("2") |

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
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedString](#elseschemaboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedVoid](#elseschemaboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedNumber](#elseschemaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedBoolean](#elseschemaboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedMap](#elseschemaboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedList](#elseschemaboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ElseSchemaBoxed](#elseschemaboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema1Boxed
sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedVoid
data class Schema1BoxedVoid<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedBoolean
data class Schema1BoxedBoolean<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedNumber
data class Schema1BoxedNumber<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedString
data class Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedList
data class Schema1BoxedList<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedMap
data class Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1
class Schema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | then = [Then::class.java](#then) |

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
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [Schema1BoxedString](#schema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema1BoxedVoid](#schema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema1BoxedNumber](#schema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema1BoxedBoolean](#schema1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [Schema1BoxedList](#schema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ThenBoxed
sealed interface ThenBoxed<br>
permits<br>
[ThenBoxedVoid](#thenboxedvoid),
[ThenBoxedBoolean](#thenboxedboolean),
[ThenBoxedNumber](#thenboxednumber),
[ThenBoxedString](#thenboxedstring),
[ThenBoxedList](#thenboxedlist),
[ThenBoxedMap](#thenboxedmap)

sealed interface that stores validated payloads using boxed classes

## ThenBoxedVoid
data class ThenBoxedVoid<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ThenBoxedBoolean
data class ThenBoxedBoolean<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ThenBoxedNumber
data class ThenBoxedNumber<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ThenBoxedString
data class ThenBoxedString<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ThenBoxedList
data class ThenBoxedList<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ThenBoxedMap
data class ThenBoxedMap<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Then
class Then<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = -10 |

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
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [ThenBoxedString](#thenboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ThenBoxedVoid](#thenboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ThenBoxedNumber](#thenboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ThenBoxedBoolean](#thenboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ThenBoxedMap](#thenboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ThenBoxedList](#thenboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ThenBoxed](#thenboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema0Boxed
sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
data class Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedBoolean
data class Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedNumber
data class Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedString
data class Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedList
data class Schema0BoxedList<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedMap
data class Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0
class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema::class.java](#ifschema) |

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
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema0BoxedVoid](#schema0boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema0BoxedNumber](#schema0boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema0BoxedBoolean](#schema0boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [Schema0BoxedList](#schema0boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema0Boxed](#schema0boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## IfSchemaBoxed
sealed interface IfSchemaBoxed<br>
permits<br>
[IfSchemaBoxedVoid](#ifschemaboxedvoid),
[IfSchemaBoxedBoolean](#ifschemaboxedboolean),
[IfSchemaBoxedNumber](#ifschemaboxednumber),
[IfSchemaBoxedString](#ifschemaboxedstring),
[IfSchemaBoxedList](#ifschemaboxedlist),
[IfSchemaBoxedMap](#ifschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## IfSchemaBoxedVoid
data class IfSchemaBoxedVoid<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchemaBoxedBoolean
data class IfSchemaBoxedBoolean<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchemaBoxedNumber
data class IfSchemaBoxedNumber<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchemaBoxedString
data class IfSchemaBoxedString<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchemaBoxedList
data class IfSchemaBoxedList<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchemaBoxedMap
data class IfSchemaBoxedMap<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchema
class IfSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | exclusiveMaximum = 0 |

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
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [IfSchemaBoxedString](#ifschemaboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IfSchemaBoxedVoid](#ifschemaboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IfSchemaBoxedNumber](#ifschemaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IfSchemaBoxedBoolean](#ifschemaboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [IfSchemaBoxedMap](#ifschemaboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [IfSchemaBoxedList](#ifschemaboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IfSchemaBoxed](#ifschemaboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
