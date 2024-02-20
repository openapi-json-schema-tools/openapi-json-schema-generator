# Pig
org.openapijsonschematools.client.components.schemas.Pig.java
public class Pig<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Pig.Pig1Boxed](#pig1boxed)<br> abstract sealed validated payload class |
| record | [Pig.Pig1BoxedVoid](#pig1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Pig.Pig1BoxedBoolean](#pig1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Pig.Pig1BoxedNumber](#pig1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Pig.Pig1BoxedString](#pig1boxedstring)<br> boxed class to store validated String payloads |
| record | [Pig.Pig1BoxedList](#pig1boxedlist)<br> boxed class to store validated List payloads |
| record | [Pig.Pig1BoxedMap](#pig1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Pig.Pig1](#pig1)<br> schema class |

## Pig1Boxed
public sealed interface Pig1Boxed<br>
permits<br>
[Pig1BoxedVoid](#pig1boxedvoid),
[Pig1BoxedBoolean](#pig1boxedboolean),
[Pig1BoxedNumber](#pig1boxednumber),
[Pig1BoxedString](#pig1boxedstring),
[Pig1BoxedList](#pig1boxedlist),
[Pig1BoxedMap](#pig1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Pig1BoxedVoid
public record Pig1BoxedVoid<br>
implements [Pig1Boxed](#pig1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Pig1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Pig1BoxedBoolean
public record Pig1BoxedBoolean<br>
implements [Pig1Boxed](#pig1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Pig1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Pig1BoxedNumber
public record Pig1BoxedNumber<br>
implements [Pig1Boxed](#pig1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Pig1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Pig1BoxedString
public record Pig1BoxedString<br>
implements [Pig1Boxed](#pig1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Pig1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Pig1BoxedList
public record Pig1BoxedList<br>
implements [Pig1Boxed](#pig1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Pig1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Pig1BoxedMap
public record Pig1BoxedMap<br>
implements [Pig1Boxed](#pig1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Pig1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Pig1
public static class Pig1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[BasquePig.BasquePig1.class](../../components/schemas/BasquePig.md#basquepig1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[DanishPig.DanishPig1.class](../../components/schemas/DanishPig.md#danishpig1)<br>))<br> |

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
| [Pig1BoxedString](#pig1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Pig1BoxedVoid](#pig1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Pig1BoxedNumber](#pig1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Pig1BoxedBoolean](#pig1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Pig1BoxedMap](#pig1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Pig1BoxedList](#pig1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
