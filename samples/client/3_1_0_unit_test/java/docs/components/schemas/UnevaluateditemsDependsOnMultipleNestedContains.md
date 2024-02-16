# UnevaluateditemsDependsOnMultipleNestedContains
org.openapijsonschematools.client.components.schemas.UnevaluateditemsDependsOnMultipleNestedContains.java
public class UnevaluateditemsDependsOnMultipleNestedContains<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid](#unevaluateditemsdependsonmultiplenestedcontains1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean](#unevaluateditemsdependsonmultiplenestedcontains1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber](#unevaluateditemsdependsonmultiplenestedcontains1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedString](#unevaluateditemsdependsonmultiplenestedcontains1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedList](#unevaluateditemsdependsonmultiplenestedcontains1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap](#unevaluateditemsdependsonmultiplenestedcontains1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1](#unevaluateditemsdependsonmultiplenestedcontains1)<br> schema class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxed](#unevaluateditemsboxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedBoolean](#unevaluateditemsboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedNumber](#unevaluateditemsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedList](#unevaluateditemsboxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedMap](#unevaluateditemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItems](#unevaluateditems)<br> schema class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1](#schema1)<br> schema class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1Boxed](#contains1boxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedVoid](#contains1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedBoolean](#contains1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedNumber](#contains1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedString](#contains1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedList](#contains1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedMap](#contains1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1](#contains1)<br> schema class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0](#schema0)<br> schema class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxed](#containsboxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedVoid](#containsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedBoolean](#containsboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedNumber](#containsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedString](#containsboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedList](#containsboxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedMap](#containsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains](#contains)<br> schema class |

## UnevaluateditemsDependsOnMultipleNestedContains1Boxed
public static abstract sealed class UnevaluateditemsDependsOnMultipleNestedContains1Boxed<br>
permits<br>
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid](#unevaluateditemsdependsonmultiplenestedcontains1boxedvoid),
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean](#unevaluateditemsdependsonmultiplenestedcontains1boxedboolean),
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber](#unevaluateditemsdependsonmultiplenestedcontains1boxednumber),
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedString](#unevaluateditemsdependsonmultiplenestedcontains1boxedstring),
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedList](#unevaluateditemsdependsonmultiplenestedcontains1boxedlist),
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap](#unevaluateditemsdependsonmultiplenestedcontains1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid
public static final class UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid<br>
extends [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean
public static final class UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean<br>
extends [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber
public static final class UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber<br>
extends [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedString
public static final class UnevaluateditemsDependsOnMultipleNestedContains1BoxedString<br>
extends [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedList
public static final class UnevaluateditemsDependsOnMultipleNestedContains1BoxedList<br>
extends [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap
public static final class UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap<br>
extends [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1
public static class UnevaluateditemsDependsOnMultipleNestedContains1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>;)<br> |
| Class<? extends JsonSchema> | unevaluatedItems = [UnevaluatedItems.class](#unevaluateditems) |

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
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedString](#unevaluateditemsdependsonmultiplenestedcontains1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid](#unevaluateditemsdependsonmultiplenestedcontains1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber](#unevaluateditemsdependsonmultiplenestedcontains1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean](#unevaluateditemsdependsonmultiplenestedcontains1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap](#unevaluateditemsdependsonmultiplenestedcontains1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedList](#unevaluateditemsdependsonmultiplenestedcontains1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UnevaluatedItemsBoxed
public static abstract sealed class UnevaluatedItemsBoxed<br>
permits<br>
[UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid),
[UnevaluatedItemsBoxedBoolean](#unevaluateditemsboxedboolean),
[UnevaluatedItemsBoxedNumber](#unevaluateditemsboxednumber),
[UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring),
[UnevaluatedItemsBoxedList](#unevaluateditemsboxedlist),
[UnevaluatedItemsBoxedMap](#unevaluateditemsboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluatedItemsBoxedVoid
public static final class UnevaluatedItemsBoxedVoid<br>
extends [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UnevaluatedItemsBoxedBoolean
public static final class UnevaluatedItemsBoxedBoolean<br>
extends [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UnevaluatedItemsBoxedNumber
public static final class UnevaluatedItemsBoxedNumber<br>
extends [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UnevaluatedItemsBoxedString
public static final class UnevaluatedItemsBoxedString<br>
extends [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UnevaluatedItemsBoxedList
public static final class UnevaluatedItemsBoxedList<br>
extends [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## UnevaluatedItemsBoxedMap
public static final class UnevaluatedItemsBoxedMap<br>
extends [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## UnevaluatedItems
public static class UnevaluatedItems<br>
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
| [UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UnevaluatedItemsBoxedNumber](#unevaluateditemsboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UnevaluatedItemsBoxedBoolean](#unevaluateditemsboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UnevaluatedItemsBoxedMap](#unevaluateditemsboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UnevaluatedItemsBoxedList](#unevaluateditemsboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema1BoxedVoid
public static final class Schema1BoxedVoid<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema1BoxedBoolean
public static final class Schema1BoxedBoolean<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema1BoxedNumber
public static final class Schema1BoxedNumber<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema1BoxedString
public static final class Schema1BoxedString<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema1BoxedList
public static final class Schema1BoxedList<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema1BoxedMap
public static final class Schema1BoxedMap<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema1
public static class Schema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | contains = [Contains1.class](#contains1) |

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
| [Schema1BoxedString](#schema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema1BoxedVoid](#schema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema1BoxedNumber](#schema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema1BoxedBoolean](#schema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema1BoxedList](#schema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Contains1Boxed
public static abstract sealed class Contains1Boxed<br>
permits<br>
[Contains1BoxedVoid](#contains1boxedvoid),
[Contains1BoxedBoolean](#contains1boxedboolean),
[Contains1BoxedNumber](#contains1boxednumber),
[Contains1BoxedString](#contains1boxedstring),
[Contains1BoxedList](#contains1boxedlist),
[Contains1BoxedMap](#contains1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Contains1BoxedVoid
public static final class Contains1BoxedVoid<br>
extends [Contains1Boxed](#contains1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Contains1BoxedBoolean
public static final class Contains1BoxedBoolean<br>
extends [Contains1Boxed](#contains1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Contains1BoxedNumber
public static final class Contains1BoxedNumber<br>
extends [Contains1Boxed](#contains1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Contains1BoxedString
public static final class Contains1BoxedString<br>
extends [Contains1Boxed](#contains1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Contains1BoxedList
public static final class Contains1BoxedList<br>
extends [Contains1Boxed](#contains1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Contains1BoxedMap
public static final class Contains1BoxedMap<br>
extends [Contains1Boxed](#contains1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Contains1
public static class Contains1<br>
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
| [Contains1BoxedString](#contains1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Contains1BoxedVoid](#contains1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Contains1BoxedNumber](#contains1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Contains1BoxedBoolean](#contains1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Contains1BoxedMap](#contains1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Contains1BoxedList](#contains1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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
| Class<? extends JsonSchema> | contains = [Contains.class](#contains) |

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
## ContainsBoxed
public static abstract sealed class ContainsBoxed<br>
permits<br>
[ContainsBoxedVoid](#containsboxedvoid),
[ContainsBoxedBoolean](#containsboxedboolean),
[ContainsBoxedNumber](#containsboxednumber),
[ContainsBoxedString](#containsboxedstring),
[ContainsBoxedList](#containsboxedlist),
[ContainsBoxedMap](#containsboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ContainsBoxedVoid
public static final class ContainsBoxedVoid<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ContainsBoxedBoolean
public static final class ContainsBoxedBoolean<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ContainsBoxedNumber
public static final class ContainsBoxedNumber<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ContainsBoxedString
public static final class ContainsBoxedString<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ContainsBoxedList
public static final class ContainsBoxedList<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ContainsBoxedMap
public static final class ContainsBoxedMap<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Contains
public static class Contains<br>
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
| [ContainsBoxedString](#containsboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ContainsBoxedVoid](#containsboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ContainsBoxedNumber](#containsboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ContainsBoxedBoolean](#containsboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ContainsBoxedMap](#containsboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ContainsBoxedList](#containsboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
