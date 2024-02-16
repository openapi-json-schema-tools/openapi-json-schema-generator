# UnevaluateditemsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.UnevaluateditemsWithNullInstanceElements.java
public class UnevaluateditemsWithNullInstanceElements<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedVoid](#unevaluateditemswithnullinstanceelements1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedBoolean](#unevaluateditemswithnullinstanceelements1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedNumber](#unevaluateditemswithnullinstanceelements1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedString](#unevaluateditemswithnullinstanceelements1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedList](#unevaluateditemswithnullinstanceelements1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedMap](#unevaluateditemswithnullinstanceelements1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1](#unevaluateditemswithnullinstanceelements1)<br> schema class |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluatedItemsBoxed](#unevaluateditemsboxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluatedItems](#unevaluateditems)<br> schema class |

## UnevaluateditemsWithNullInstanceElements1Boxed
public static abstract sealed class UnevaluateditemsWithNullInstanceElements1Boxed<br>
permits<br>
[UnevaluateditemsWithNullInstanceElements1BoxedVoid](#unevaluateditemswithnullinstanceelements1boxedvoid),
[UnevaluateditemsWithNullInstanceElements1BoxedBoolean](#unevaluateditemswithnullinstanceelements1boxedboolean),
[UnevaluateditemsWithNullInstanceElements1BoxedNumber](#unevaluateditemswithnullinstanceelements1boxednumber),
[UnevaluateditemsWithNullInstanceElements1BoxedString](#unevaluateditemswithnullinstanceelements1boxedstring),
[UnevaluateditemsWithNullInstanceElements1BoxedList](#unevaluateditemswithnullinstanceelements1boxedlist),
[UnevaluateditemsWithNullInstanceElements1BoxedMap](#unevaluateditemswithnullinstanceelements1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluateditemsWithNullInstanceElements1BoxedVoid
public static final class UnevaluateditemsWithNullInstanceElements1BoxedVoid<br>
extends [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedBoolean
public static final class UnevaluateditemsWithNullInstanceElements1BoxedBoolean<br>
extends [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedNumber
public static final class UnevaluateditemsWithNullInstanceElements1BoxedNumber<br>
extends [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedString
public static final class UnevaluateditemsWithNullInstanceElements1BoxedString<br>
extends [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedList
public static final class UnevaluateditemsWithNullInstanceElements1BoxedList<br>
extends [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedMap
public static final class UnevaluateditemsWithNullInstanceElements1BoxedMap<br>
extends [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1
public static class UnevaluateditemsWithNullInstanceElements1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
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
| [UnevaluateditemsWithNullInstanceElements1BoxedString](#unevaluateditemswithnullinstanceelements1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UnevaluateditemsWithNullInstanceElements1BoxedVoid](#unevaluateditemswithnullinstanceelements1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UnevaluateditemsWithNullInstanceElements1BoxedNumber](#unevaluateditemswithnullinstanceelements1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UnevaluateditemsWithNullInstanceElements1BoxedBoolean](#unevaluateditemswithnullinstanceelements1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UnevaluateditemsWithNullInstanceElements1BoxedMap](#unevaluateditemswithnullinstanceelements1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UnevaluateditemsWithNullInstanceElements1BoxedList](#unevaluateditemswithnullinstanceelements1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UnevaluatedItemsBoxed
public static abstract sealed class UnevaluatedItemsBoxed<br>
permits<br>
[UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid)

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

## UnevaluatedItems
public static class UnevaluatedItems<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
