# UnevaluateditemsAsSchema
org.openapijsonschematools.client.components.schemas.UnevaluateditemsAsSchema.java
public class UnevaluateditemsAsSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedVoid](#unevaluateditemsasschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedBoolean](#unevaluateditemsasschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedNumber](#unevaluateditemsasschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedString](#unevaluateditemsasschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedList](#unevaluateditemsasschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedMap](#unevaluateditemsasschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1](#unevaluateditemsasschema1)<br> schema class |
| static class | [UnevaluateditemsAsSchema.UnevaluatedItemsBoxed](#unevaluateditemsboxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsAsSchema.UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluatedItems](#unevaluateditems)<br> schema class |

## UnevaluateditemsAsSchema1Boxed
public static abstract sealed class UnevaluateditemsAsSchema1Boxed<br>
permits<br>
[UnevaluateditemsAsSchema1BoxedVoid](#unevaluateditemsasschema1boxedvoid),
[UnevaluateditemsAsSchema1BoxedBoolean](#unevaluateditemsasschema1boxedboolean),
[UnevaluateditemsAsSchema1BoxedNumber](#unevaluateditemsasschema1boxednumber),
[UnevaluateditemsAsSchema1BoxedString](#unevaluateditemsasschema1boxedstring),
[UnevaluateditemsAsSchema1BoxedList](#unevaluateditemsasschema1boxedlist),
[UnevaluateditemsAsSchema1BoxedMap](#unevaluateditemsasschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluateditemsAsSchema1BoxedVoid
public static final class UnevaluateditemsAsSchema1BoxedVoid<br>
extends [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UnevaluateditemsAsSchema1BoxedBoolean
public static final class UnevaluateditemsAsSchema1BoxedBoolean<br>
extends [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UnevaluateditemsAsSchema1BoxedNumber
public static final class UnevaluateditemsAsSchema1BoxedNumber<br>
extends [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UnevaluateditemsAsSchema1BoxedString
public static final class UnevaluateditemsAsSchema1BoxedString<br>
extends [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UnevaluateditemsAsSchema1BoxedList
public static final class UnevaluateditemsAsSchema1BoxedList<br>
extends [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## UnevaluateditemsAsSchema1BoxedMap
public static final class UnevaluateditemsAsSchema1BoxedMap<br>
extends [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UnevaluatedItemsBoxed
public static abstract sealed class UnevaluatedItemsBoxed<br>
permits<br>
[UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)

abstract sealed class that stores validated payloads using boxed classes

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

## UnevaluatedItems
public static class UnevaluatedItems<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
