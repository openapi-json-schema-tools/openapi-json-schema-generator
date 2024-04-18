# UnevaluateditemsAsSchema
org.openapijsonschematools.client.components.schemas.UnevaluateditemsAsSchema.java
public class UnevaluateditemsAsSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedVoid](#unevaluateditemsasschema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedBoolean](#unevaluateditemsasschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedNumber](#unevaluateditemsasschema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedString](#unevaluateditemsasschema1boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedList](#unevaluateditemsasschema1boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedMap](#unevaluateditemsasschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1](#unevaluateditemsasschema1)<br> schema class |
| sealed interface | [UnevaluateditemsAsSchema.UnevaluatedItemsBoxed](#unevaluateditemsboxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsAsSchema.UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluatedItems](#unevaluateditems)<br> schema class |

## UnevaluateditemsAsSchema1Boxed
public sealed interface UnevaluateditemsAsSchema1Boxed<br>
permits<br>
[UnevaluateditemsAsSchema1BoxedVoid](#unevaluateditemsasschema1boxedvoid),
[UnevaluateditemsAsSchema1BoxedBoolean](#unevaluateditemsasschema1boxedboolean),
[UnevaluateditemsAsSchema1BoxedNumber](#unevaluateditemsasschema1boxednumber),
[UnevaluateditemsAsSchema1BoxedString](#unevaluateditemsasschema1boxedstring),
[UnevaluateditemsAsSchema1BoxedList](#unevaluateditemsasschema1boxedlist),
[UnevaluateditemsAsSchema1BoxedMap](#unevaluateditemsasschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluateditemsAsSchema1BoxedVoid
public record UnevaluateditemsAsSchema1BoxedVoid<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsAsSchema1BoxedBoolean
public record UnevaluateditemsAsSchema1BoxedBoolean<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsAsSchema1BoxedNumber
public record UnevaluateditemsAsSchema1BoxedNumber<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsAsSchema1BoxedString
public record UnevaluateditemsAsSchema1BoxedString<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsAsSchema1BoxedList
public record UnevaluateditemsAsSchema1BoxedList<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsAsSchema1BoxedMap
public record UnevaluateditemsAsSchema1BoxedMap<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluateditemsAsSchema1
public static class UnevaluateditemsAsSchema1<br>
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
| [UnevaluateditemsAsSchema1BoxedString](#unevaluateditemsasschema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UnevaluateditemsAsSchema1BoxedVoid](#unevaluateditemsasschema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UnevaluateditemsAsSchema1BoxedNumber](#unevaluateditemsasschema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UnevaluateditemsAsSchema1BoxedBoolean](#unevaluateditemsasschema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UnevaluateditemsAsSchema1BoxedMap](#unevaluateditemsasschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UnevaluateditemsAsSchema1BoxedList](#unevaluateditemsasschema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UnevaluatedItemsBoxed
public sealed interface UnevaluatedItemsBoxed<br>
permits<br>
[UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedItemsBoxedString
public record UnevaluatedItemsBoxedString<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedItems
public static class UnevaluatedItems<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
