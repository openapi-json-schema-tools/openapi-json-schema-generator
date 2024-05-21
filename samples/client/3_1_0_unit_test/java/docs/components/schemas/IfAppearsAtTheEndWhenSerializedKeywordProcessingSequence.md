# IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence
unit_test_api.components.schemas.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.java
public class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)<br> sealed interface for validated payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedstring)<br> boxed class to store validated String payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedlist)<br> boxed class to store validated List payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1](#ifappearsattheendwhenserializedkeywordprocessingsequence1)<br> schema class |
| sealed interface | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxed](#thenboxed)<br> sealed interface for validated payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.Then](#then)<br> schema class |
| enum | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.StringThenConst](#stringthenconst)<br>String enum |
| sealed interface | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxed](#ifschemaboxed)<br> sealed interface for validated payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchema](#ifschema)<br> schema class |
| sealed interface | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxed](#elseschemaboxed)<br> sealed interface for validated payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchema](#elseschema)<br> schema class |
| enum | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.StringElseConst](#stringelseconst)<br>String enum |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed
public sealed interface IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed<br>
permits<br>
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedvoid),
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedboolean),
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxednumber),
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedstring),
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedlist),
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid
public record IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean
public record IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber
public record IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString
public record IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList
public record IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap
public record IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1
public static class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema.class](#ifschema) |
| Class<? extends JsonSchema> | then = [Then.class](#then) |
| Class<? extends JsonSchema> | elseSchema = [ElseSchema.class](#elseschema) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ThenBoxed
public sealed interface ThenBoxed<br>
permits<br>
[ThenBoxedVoid](#thenboxedvoid),
[ThenBoxedBoolean](#thenboxedboolean),
[ThenBoxedNumber](#thenboxednumber),
[ThenBoxedString](#thenboxedstring),
[ThenBoxedList](#thenboxedlist),
[ThenBoxedMap](#thenboxedmap)

sealed interface that stores validated payloads using boxed classes

## ThenBoxedVoid
public record ThenBoxedVoid<br>
implements [ThenBoxed](#thenboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedBoolean
public record ThenBoxedBoolean<br>
implements [ThenBoxed](#thenboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedNumber
public record ThenBoxedNumber<br>
implements [ThenBoxed](#thenboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedString
public record ThenBoxedString<br>
implements [ThenBoxed](#thenboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedList
public record ThenBoxedList<br>
implements [ThenBoxed](#thenboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedMap
public record ThenBoxedMap<br>
implements [ThenBoxed](#thenboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Then
public static class Then<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| @Nullable Object | constValue = "yes" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ThenBoxedString](#thenboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ThenBoxedVoid](#thenboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ThenBoxedNumber](#thenboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ThenBoxedBoolean](#thenboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ThenBoxedMap](#thenboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ThenBoxedList](#thenboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ThenBoxed](#thenboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringThenConst
public enum StringThenConst<br>
extends `Enum<StringThenConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| YES | value = "yes" |

## IfSchemaBoxed
public sealed interface IfSchemaBoxed<br>
permits<br>
[IfSchemaBoxedVoid](#ifschemaboxedvoid),
[IfSchemaBoxedBoolean](#ifschemaboxedboolean),
[IfSchemaBoxedNumber](#ifschemaboxednumber),
[IfSchemaBoxedString](#ifschemaboxedstring),
[IfSchemaBoxedList](#ifschemaboxedlist),
[IfSchemaBoxedMap](#ifschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## IfSchemaBoxedVoid
public record IfSchemaBoxedVoid<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchemaBoxedBoolean
public record IfSchemaBoxedBoolean<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchemaBoxedNumber
public record IfSchemaBoxedNumber<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchemaBoxedString
public record IfSchemaBoxedString<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchemaBoxedList
public record IfSchemaBoxedList<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchemaBoxedMap
public record IfSchemaBoxedMap<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchema
public static class IfSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxLength = 4 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedString](#ifschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedVoid](#ifschemaboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedNumber](#ifschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedBoolean](#ifschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedMap](#ifschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedList](#ifschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IfSchemaBoxed](#ifschemaboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ElseSchemaBoxed
public sealed interface ElseSchemaBoxed<br>
permits<br>
[ElseSchemaBoxedVoid](#elseschemaboxedvoid),
[ElseSchemaBoxedBoolean](#elseschemaboxedboolean),
[ElseSchemaBoxedNumber](#elseschemaboxednumber),
[ElseSchemaBoxedString](#elseschemaboxedstring),
[ElseSchemaBoxedList](#elseschemaboxedlist),
[ElseSchemaBoxedMap](#elseschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## ElseSchemaBoxedVoid
public record ElseSchemaBoxedVoid<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchemaBoxedBoolean
public record ElseSchemaBoxedBoolean<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchemaBoxedNumber
public record ElseSchemaBoxedNumber<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchemaBoxedString
public record ElseSchemaBoxedString<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchemaBoxedList
public record ElseSchemaBoxedList<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchemaBoxedMap
public record ElseSchemaBoxedMap<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchema
public static class ElseSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| @Nullable Object | constValue = "other" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedString](#elseschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedVoid](#elseschemaboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedNumber](#elseschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedBoolean](#elseschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedMap](#elseschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedList](#elseschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxed](#elseschemaboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringElseConst
public enum StringElseConst<br>
extends `Enum<StringElseConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| OTHER | value = "other" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
