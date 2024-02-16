# Not
org.openapijsonschematools.client.components.schemas.Not.java
public class Not<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Not.Not1Boxed](#not1boxed)<br> abstract sealed validated payload class |
| static class | [Not.Not1BoxedVoid](#not1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Not.Not1BoxedBoolean](#not1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Not.Not1BoxedNumber](#not1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Not.Not1BoxedString](#not1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Not.Not1BoxedList](#not1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Not.Not1BoxedMap](#not1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Not.Not1](#not1)<br> schema class |
| static class | [Not.Not2Boxed](#not2boxed)<br> abstract sealed validated payload class |
| static class | [Not.Not2BoxedNumber](#not2boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Not.Not2](#not2)<br> schema class |

## Not1Boxed
public static abstract sealed class Not1Boxed<br>
permits<br>
[Not1BoxedVoid](#not1boxedvoid),
[Not1BoxedBoolean](#not1boxedboolean),
[Not1BoxedNumber](#not1boxednumber),
[Not1BoxedString](#not1boxedstring),
[Not1BoxedList](#not1boxedlist),
[Not1BoxedMap](#not1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Not1BoxedVoid
public static final class Not1BoxedVoid<br>
extends [Not1Boxed](#not1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Not1BoxedBoolean
public static final class Not1BoxedBoolean<br>
extends [Not1Boxed](#not1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Not1BoxedNumber
public static final class Not1BoxedNumber<br>
extends [Not1Boxed](#not1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Not1BoxedString
public static final class Not1BoxedString<br>
extends [Not1Boxed](#not1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Not1BoxedList
public static final class Not1BoxedList<br>
extends [Not1Boxed](#not1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Not1BoxedMap
public static final class Not1BoxedMap<br>
extends [Not1Boxed](#not1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Not1
public static class Not1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [Not2.class](#not2) |

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
| [Not1BoxedString](#not1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Not1BoxedVoid](#not1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Not1BoxedNumber](#not1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Not1BoxedBoolean](#not1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Not1BoxedMap](#not1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Not1BoxedList](#not1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Not2Boxed
public static abstract sealed class Not2Boxed<br>
permits<br>
[Not2BoxedNumber](#not2boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Not2BoxedNumber
public static final class Not2BoxedNumber<br>
extends [Not2Boxed](#not2boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not2BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Not2
public static class Not2<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
