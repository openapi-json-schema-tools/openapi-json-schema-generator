# SomeObject
org.openapijsonschematools.client.components.schemas.SomeObject.java
public class SomeObject<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SomeObject.SomeObject1Boxed](#someobject1boxed)<br> abstract sealed validated payload class |
| record | [SomeObject.SomeObject1BoxedVoid](#someobject1boxedvoid)<br> boxed class to store validated null payloads |
| record | [SomeObject.SomeObject1BoxedBoolean](#someobject1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [SomeObject.SomeObject1BoxedNumber](#someobject1boxednumber)<br> boxed class to store validated Number payloads |
| record | [SomeObject.SomeObject1BoxedString](#someobject1boxedstring)<br> boxed class to store validated String payloads |
| record | [SomeObject.SomeObject1BoxedList](#someobject1boxedlist)<br> boxed class to store validated List payloads |
| record | [SomeObject.SomeObject1BoxedMap](#someobject1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SomeObject.SomeObject1](#someobject1)<br> schema class |

## SomeObject1Boxed
public sealed interface SomeObject1Boxed<br>
permits<br>
[SomeObject1BoxedVoid](#someobject1boxedvoid),
[SomeObject1BoxedBoolean](#someobject1boxedboolean),
[SomeObject1BoxedNumber](#someobject1boxednumber),
[SomeObject1BoxedString](#someobject1boxedstring),
[SomeObject1BoxedList](#someobject1boxedlist),
[SomeObject1BoxedMap](#someobject1boxedmap)

sealed interface that stores validated payloads using boxed classes

## SomeObject1BoxedVoid
public record SomeObject1BoxedVoid<br>
implements [SomeObject1Boxed](#someobject1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeObject1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeObject1BoxedBoolean
public record SomeObject1BoxedBoolean<br>
implements [SomeObject1Boxed](#someobject1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeObject1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeObject1BoxedNumber
public record SomeObject1BoxedNumber<br>
implements [SomeObject1Boxed](#someobject1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeObject1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeObject1BoxedString
public record SomeObject1BoxedString<br>
implements [SomeObject1Boxed](#someobject1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeObject1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeObject1BoxedList
public record SomeObject1BoxedList<br>
implements [SomeObject1Boxed](#someobject1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeObject1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeObject1BoxedMap
public record SomeObject1BoxedMap<br>
implements [SomeObject1Boxed](#someobject1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeObject1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeObject1
public static class SomeObject1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[ObjectInterface.ObjectInterface1.class](../../components/schemas/ObjectInterface.md#objectinterface1)<br>;)<br> |

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
| [SomeObject1BoxedString](#someobject1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [SomeObject1BoxedVoid](#someobject1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [SomeObject1BoxedNumber](#someobject1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [SomeObject1BoxedBoolean](#someobject1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [SomeObject1BoxedMap](#someobject1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [SomeObject1BoxedList](#someobject1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [SomeObject1Boxed](#someobject1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
