# AllofCombinedWithAnyofOneof
unit_test_api.components.schemas.AllofCombinedWithAnyofOneof.java
public class AllofCombinedWithAnyofOneof<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)<br> sealed interface for validated payloads |
| record | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedVoid](#allofcombinedwithanyofoneof1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedBoolean](#allofcombinedwithanyofoneof1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedNumber](#allofcombinedwithanyofoneof1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedString](#allofcombinedwithanyofoneof1boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedList](#allofcombinedwithanyofoneof1boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedMap](#allofcombinedwithanyofoneof1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1](#allofcombinedwithanyofoneof1)<br> schema class |
| sealed interface | [AllofCombinedWithAnyofOneof.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AllofCombinedWithAnyofOneof.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofCombinedWithAnyofOneof.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofCombinedWithAnyofOneof.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofCombinedWithAnyofOneof.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofCombinedWithAnyofOneof.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofCombinedWithAnyofOneof.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema0](#schema0)<br> schema class |
| sealed interface | [AllofCombinedWithAnyofOneof.Schema01Boxed](#schema01boxed)<br> sealed interface for validated payloads |
| record | [AllofCombinedWithAnyofOneof.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofCombinedWithAnyofOneof.Schema01BoxedBoolean](#schema01boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofCombinedWithAnyofOneof.Schema01BoxedNumber](#schema01boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofCombinedWithAnyofOneof.Schema01BoxedString](#schema01boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofCombinedWithAnyofOneof.Schema01BoxedList](#schema01boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofCombinedWithAnyofOneof.Schema01BoxedMap](#schema01boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema01](#schema01)<br> schema class |
| sealed interface | [AllofCombinedWithAnyofOneof.Schema02Boxed](#schema02boxed)<br> sealed interface for validated payloads |
| record | [AllofCombinedWithAnyofOneof.Schema02BoxedVoid](#schema02boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofCombinedWithAnyofOneof.Schema02BoxedBoolean](#schema02boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofCombinedWithAnyofOneof.Schema02BoxedNumber](#schema02boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofCombinedWithAnyofOneof.Schema02BoxedString](#schema02boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofCombinedWithAnyofOneof.Schema02BoxedList](#schema02boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofCombinedWithAnyofOneof.Schema02BoxedMap](#schema02boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema02](#schema02)<br> schema class |

## AllofCombinedWithAnyofOneof1Boxed
public sealed interface AllofCombinedWithAnyofOneof1Boxed<br>
permits<br>
[AllofCombinedWithAnyofOneof1BoxedVoid](#allofcombinedwithanyofoneof1boxedvoid),
[AllofCombinedWithAnyofOneof1BoxedBoolean](#allofcombinedwithanyofoneof1boxedboolean),
[AllofCombinedWithAnyofOneof1BoxedNumber](#allofcombinedwithanyofoneof1boxednumber),
[AllofCombinedWithAnyofOneof1BoxedString](#allofcombinedwithanyofoneof1boxedstring),
[AllofCombinedWithAnyofOneof1BoxedList](#allofcombinedwithanyofoneof1boxedlist),
[AllofCombinedWithAnyofOneof1BoxedMap](#allofcombinedwithanyofoneof1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AllofCombinedWithAnyofOneof1BoxedVoid
public record AllofCombinedWithAnyofOneof1BoxedVoid<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedBoolean
public record AllofCombinedWithAnyofOneof1BoxedBoolean<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedNumber
public record AllofCombinedWithAnyofOneof1BoxedNumber<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedString
public record AllofCombinedWithAnyofOneof1BoxedString<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedList
public record AllofCombinedWithAnyofOneof1BoxedList<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedMap
public record AllofCombinedWithAnyofOneof1BoxedMap<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1
public static class AllofCombinedWithAnyofOneof1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema02.class](#schema02)<br>;)<br> |
| List<Class<? extends JsonSchema>> | anyOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema01.class](#schema01)<br>)<br> |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0)<br>))<br> |

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
| [AllofCombinedWithAnyofOneof1BoxedString](#allofcombinedwithanyofoneof1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AllofCombinedWithAnyofOneof1BoxedVoid](#allofcombinedwithanyofoneof1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AllofCombinedWithAnyofOneof1BoxedNumber](#allofcombinedwithanyofoneof1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AllofCombinedWithAnyofOneof1BoxedBoolean](#allofcombinedwithanyofoneof1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AllofCombinedWithAnyofOneof1BoxedMap](#allofcombinedwithanyofoneof1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AllofCombinedWithAnyofOneof1BoxedList](#allofcombinedwithanyofoneof1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
public record Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedBoolean
public record Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedNumber
public record Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedString
public record Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedList
public record Schema0BoxedList<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedMap
public record Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0
public static class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = new BigDecimal("5") |

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
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema0BoxedVoid](#schema0boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema0BoxedNumber](#schema0boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema0BoxedBoolean](#schema0boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema0BoxedList](#schema0boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Schema0Boxed](#schema0boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema01Boxed
public sealed interface Schema01Boxed<br>
permits<br>
[Schema01BoxedVoid](#schema01boxedvoid),
[Schema01BoxedBoolean](#schema01boxedboolean),
[Schema01BoxedNumber](#schema01boxednumber),
[Schema01BoxedString](#schema01boxedstring),
[Schema01BoxedList](#schema01boxedlist),
[Schema01BoxedMap](#schema01boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema01BoxedVoid
public record Schema01BoxedVoid<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01BoxedBoolean
public record Schema01BoxedBoolean<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01BoxedNumber
public record Schema01BoxedNumber<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01BoxedString
public record Schema01BoxedString<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01BoxedList
public record Schema01BoxedList<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01BoxedMap
public record Schema01BoxedMap<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01
public static class Schema01<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = new BigDecimal("3") |

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
| [Schema01BoxedString](#schema01boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema01BoxedVoid](#schema01boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema01BoxedNumber](#schema01boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema01BoxedBoolean](#schema01boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema01BoxedMap](#schema01boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema01BoxedList](#schema01boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Schema01Boxed](#schema01boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema02Boxed
public sealed interface Schema02Boxed<br>
permits<br>
[Schema02BoxedVoid](#schema02boxedvoid),
[Schema02BoxedBoolean](#schema02boxedboolean),
[Schema02BoxedNumber](#schema02boxednumber),
[Schema02BoxedString](#schema02boxedstring),
[Schema02BoxedList](#schema02boxedlist),
[Schema02BoxedMap](#schema02boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema02BoxedVoid
public record Schema02BoxedVoid<br>
implements [Schema02Boxed](#schema02boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema02BoxedBoolean
public record Schema02BoxedBoolean<br>
implements [Schema02Boxed](#schema02boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema02BoxedNumber
public record Schema02BoxedNumber<br>
implements [Schema02Boxed](#schema02boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema02BoxedString
public record Schema02BoxedString<br>
implements [Schema02Boxed](#schema02boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema02BoxedList
public record Schema02BoxedList<br>
implements [Schema02Boxed](#schema02boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema02BoxedMap
public record Schema02BoxedMap<br>
implements [Schema02Boxed](#schema02boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema02
public static class Schema02<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = new BigDecimal("2") |

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
| [Schema02BoxedString](#schema02boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema02BoxedVoid](#schema02boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema02BoxedNumber](#schema02boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema02BoxedBoolean](#schema02boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema02BoxedMap](#schema02boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema02BoxedList](#schema02boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Schema02Boxed](#schema02boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
