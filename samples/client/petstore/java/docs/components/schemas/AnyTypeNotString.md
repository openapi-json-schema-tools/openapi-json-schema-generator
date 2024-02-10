# AnyTypeNotString
org.openapijsonschematools.client.components.schemas.AnyTypeNotString.java
public class AnyTypeNotString

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AnyTypeNotString.AnyTypeNotString1Boxed](#anytypenotstring1boxed)<br> sealed validated payload class |
| static class | [AnyTypeNotString.AnyTypeNotString1BoxedVoid](#anytypenotstring1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AnyTypeNotString.AnyTypeNotString1BoxedBoolean](#anytypenotstring1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AnyTypeNotString.AnyTypeNotString1BoxedNumber](#anytypenotstring1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AnyTypeNotString.AnyTypeNotString1BoxedString](#anytypenotstring1boxedstring)<br> boxed class to store validated String payloads |
| static class | [AnyTypeNotString.AnyTypeNotString1BoxedList](#anytypenotstring1boxedlist)<br> boxed class to store validated List payloads |
| static class | [AnyTypeNotString.AnyTypeNotString1BoxedMap](#anytypenotstring1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeNotString.AnyTypeNotString1](#anytypenotstring1)<br> schema class |
| static class | [AnyTypeNotString.NotBoxed](#notboxed)<br> sealed validated payload class |
| static class | [AnyTypeNotString.NotBoxedString](#notboxedstring)<br> boxed class to store validated String payloads |
| static class | [AnyTypeNotString.Not](#not)<br> schema class |

## AnyTypeNotString1Boxed
public static abstract sealed class AnyTypeNotString1Boxed<br>
permits<br>
[AnyTypeNotString1BoxedVoid](#anytypenotstring1boxedvoid),
[AnyTypeNotString1BoxedBoolean](#anytypenotstring1boxedboolean),
[AnyTypeNotString1BoxedNumber](#anytypenotstring1boxednumber),
[AnyTypeNotString1BoxedString](#anytypenotstring1boxedstring),
[AnyTypeNotString1BoxedList](#anytypenotstring1boxedlist),
[AnyTypeNotString1BoxedMap](#anytypenotstring1boxedmap)

A sealed class that stores validated payloads using boxed classes

## AnyTypeNotString1BoxedVoid
public static final class AnyTypeNotString1BoxedVoid<br>
extends AnyTypeNotString1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AnyTypeNotString1BoxedBoolean
public static final class AnyTypeNotString1BoxedBoolean<br>
extends AnyTypeNotString1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AnyTypeNotString1BoxedNumber
public static final class AnyTypeNotString1BoxedNumber<br>
extends AnyTypeNotString1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AnyTypeNotString1BoxedString
public static final class AnyTypeNotString1BoxedString<br>
extends AnyTypeNotString1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AnyTypeNotString1BoxedList
public static final class AnyTypeNotString1BoxedList<br>
extends AnyTypeNotString1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AnyTypeNotString1BoxedMap
public static final class AnyTypeNotString1BoxedMap<br>
extends AnyTypeNotString1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AnyTypeNotString1
public static class AnyTypeNotString1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [Not.class](#not) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NotBoxed
public static abstract sealed class NotBoxed<br>
permits<br>
[NotBoxedString](#notboxedstring)

A sealed class that stores validated payloads using boxed classes

## NotBoxedString
public static final class NotBoxedString<br>
extends NotBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Not
public static class Not<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
