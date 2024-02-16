# AllofCombinedWithAnyofOneof
org.openapijsonschematools.client.components.schemas.AllofCombinedWithAnyofOneof.java
public class AllofCombinedWithAnyofOneof<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)<br> abstract sealed validated payload class |
| static class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedVoid](#allofcombinedwithanyofoneof1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedBoolean](#allofcombinedwithanyofoneof1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedNumber](#allofcombinedwithanyofoneof1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedString](#allofcombinedwithanyofoneof1boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedList](#allofcombinedwithanyofoneof1boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedMap](#allofcombinedwithanyofoneof1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1](#allofcombinedwithanyofoneof1)<br> schema class |
| static class | [AllofCombinedWithAnyofOneof.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [AllofCombinedWithAnyofOneof.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema0](#schema0)<br> schema class |
| static class | [AllofCombinedWithAnyofOneof.Schema01Boxed](#schema01boxed)<br> abstract sealed validated payload class |
| static class | [AllofCombinedWithAnyofOneof.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema01BoxedBoolean](#schema01boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema01BoxedNumber](#schema01boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema01BoxedString](#schema01boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema01BoxedList](#schema01boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema01BoxedMap](#schema01boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema01](#schema01)<br> schema class |
| static class | [AllofCombinedWithAnyofOneof.Schema02Boxed](#schema02boxed)<br> abstract sealed validated payload class |
| static class | [AllofCombinedWithAnyofOneof.Schema02BoxedVoid](#schema02boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema02BoxedBoolean](#schema02boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema02BoxedNumber](#schema02boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema02BoxedString](#schema02boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema02BoxedList](#schema02boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema02BoxedMap](#schema02boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofCombinedWithAnyofOneof.Schema02](#schema02)<br> schema class |

## AllofCombinedWithAnyofOneof1Boxed
public static abstract sealed class AllofCombinedWithAnyofOneof1Boxed<br>
permits<br>
[AllofCombinedWithAnyofOneof1BoxedVoid](#allofcombinedwithanyofoneof1boxedvoid),
[AllofCombinedWithAnyofOneof1BoxedBoolean](#allofcombinedwithanyofoneof1boxedboolean),
[AllofCombinedWithAnyofOneof1BoxedNumber](#allofcombinedwithanyofoneof1boxednumber),
[AllofCombinedWithAnyofOneof1BoxedString](#allofcombinedwithanyofoneof1boxedstring),
[AllofCombinedWithAnyofOneof1BoxedList](#allofcombinedwithanyofoneof1boxedlist),
[AllofCombinedWithAnyofOneof1BoxedMap](#allofcombinedwithanyofoneof1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## AllofCombinedWithAnyofOneof1BoxedVoid
public static final class AllofCombinedWithAnyofOneof1BoxedVoid<br>
extends [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedBoolean
public static final class AllofCombinedWithAnyofOneof1BoxedBoolean<br>
extends [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedNumber
public static final class AllofCombinedWithAnyofOneof1BoxedNumber<br>
extends [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedString
public static final class AllofCombinedWithAnyofOneof1BoxedString<br>
extends [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedList
public static final class AllofCombinedWithAnyofOneof1BoxedList<br>
extends [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedMap
public static final class AllofCombinedWithAnyofOneof1BoxedMap<br>
extends [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema0BoxedVoid
public static final class Schema0BoxedVoid<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema0BoxedBoolean
public static final class Schema0BoxedBoolean<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema0BoxedNumber
public static final class Schema0BoxedNumber<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema0BoxedString
public static final class Schema0BoxedString<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema0BoxedList
public static final class Schema0BoxedList<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema0BoxedMap
public static final class Schema0BoxedMap<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema01Boxed
public static abstract sealed class Schema01Boxed<br>
permits<br>
[Schema01BoxedVoid](#schema01boxedvoid),
[Schema01BoxedBoolean](#schema01boxedboolean),
[Schema01BoxedNumber](#schema01boxednumber),
[Schema01BoxedString](#schema01boxedstring),
[Schema01BoxedList](#schema01boxedlist),
[Schema01BoxedMap](#schema01boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema01BoxedVoid
public static final class Schema01BoxedVoid<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema01BoxedBoolean
public static final class Schema01BoxedBoolean<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema01BoxedNumber
public static final class Schema01BoxedNumber<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema01BoxedString
public static final class Schema01BoxedString<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema01BoxedList
public static final class Schema01BoxedList<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema01BoxedMap
public static final class Schema01BoxedMap<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema02Boxed
public static abstract sealed class Schema02Boxed<br>
permits<br>
[Schema02BoxedVoid](#schema02boxedvoid),
[Schema02BoxedBoolean](#schema02boxedboolean),
[Schema02BoxedNumber](#schema02boxednumber),
[Schema02BoxedString](#schema02boxedstring),
[Schema02BoxedList](#schema02boxedlist),
[Schema02BoxedMap](#schema02boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema02BoxedVoid
public static final class Schema02BoxedVoid<br>
extends [Schema02Boxed](#schema02boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema02BoxedBoolean
public static final class Schema02BoxedBoolean<br>
extends [Schema02Boxed](#schema02boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema02BoxedNumber
public static final class Schema02BoxedNumber<br>
extends [Schema02Boxed](#schema02boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema02BoxedString
public static final class Schema02BoxedString<br>
extends [Schema02Boxed](#schema02boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema02BoxedList
public static final class Schema02BoxedList<br>
extends [Schema02Boxed](#schema02boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema02BoxedMap
public static final class Schema02BoxedMap<br>
extends [Schema02Boxed](#schema02boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
