# UnevaluateditemsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.UnevaluateditemsWithNullInstanceElements.java
public class UnevaluateditemsWithNullInstanceElements<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedVoid](#unevaluateditemswithnullinstanceelements1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedBoolean](#unevaluateditemswithnullinstanceelements1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedNumber](#unevaluateditemswithnullinstanceelements1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedString](#unevaluateditemswithnullinstanceelements1boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedList](#unevaluateditemswithnullinstanceelements1boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedMap](#unevaluateditemswithnullinstanceelements1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1](#unevaluateditemswithnullinstanceelements1)<br> schema class |
| sealed interface | [UnevaluateditemsWithNullInstanceElements.UnevaluatedItemsBoxed](#unevaluateditemsboxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluatedItems](#unevaluateditems)<br> schema class |

## UnevaluateditemsWithNullInstanceElements1Boxed
public sealed interface UnevaluateditemsWithNullInstanceElements1Boxed<br>
permits<br>
[UnevaluateditemsWithNullInstanceElements1BoxedVoid](#unevaluateditemswithnullinstanceelements1boxedvoid),
[UnevaluateditemsWithNullInstanceElements1BoxedBoolean](#unevaluateditemswithnullinstanceelements1boxedboolean),
[UnevaluateditemsWithNullInstanceElements1BoxedNumber](#unevaluateditemswithnullinstanceelements1boxednumber),
[UnevaluateditemsWithNullInstanceElements1BoxedString](#unevaluateditemswithnullinstanceelements1boxedstring),
[UnevaluateditemsWithNullInstanceElements1BoxedList](#unevaluateditemswithnullinstanceelements1boxedlist),
[UnevaluateditemsWithNullInstanceElements1BoxedMap](#unevaluateditemswithnullinstanceelements1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluateditemsWithNullInstanceElements1BoxedVoid
public record UnevaluateditemsWithNullInstanceElements1BoxedVoid<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedBoolean
public record UnevaluateditemsWithNullInstanceElements1BoxedBoolean<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedNumber
public record UnevaluateditemsWithNullInstanceElements1BoxedNumber<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedString
public record UnevaluateditemsWithNullInstanceElements1BoxedString<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedList
public record UnevaluateditemsWithNullInstanceElements1BoxedList<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedMap
public record UnevaluateditemsWithNullInstanceElements1BoxedMap<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UnevaluatedItemsBoxed
public sealed interface UnevaluatedItemsBoxed<br>
permits<br>
[UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedItemsBoxedVoid
public record UnevaluatedItemsBoxedVoid<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedItems
public static class UnevaluatedItems<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
