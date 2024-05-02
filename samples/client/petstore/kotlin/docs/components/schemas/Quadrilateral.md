# Quadrilateral
org.openapijsonschematools.client.components.schemas.Quadrilateral.java
public class Quadrilateral<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Quadrilateral.Quadrilateral1Boxed](#quadrilateral1boxed)<br> sealed interface for validated payloads |
| record | [Quadrilateral.Quadrilateral1BoxedVoid](#quadrilateral1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Quadrilateral.Quadrilateral1BoxedBoolean](#quadrilateral1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Quadrilateral.Quadrilateral1BoxedNumber](#quadrilateral1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Quadrilateral.Quadrilateral1BoxedString](#quadrilateral1boxedstring)<br> boxed class to store validated String payloads |
| record | [Quadrilateral.Quadrilateral1BoxedList](#quadrilateral1boxedlist)<br> boxed class to store validated List payloads |
| record | [Quadrilateral.Quadrilateral1BoxedMap](#quadrilateral1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Quadrilateral.Quadrilateral1](#quadrilateral1)<br> schema class |

## Quadrilateral1Boxed
public sealed interface Quadrilateral1Boxed<br>
permits<br>
[Quadrilateral1BoxedVoid](#quadrilateral1boxedvoid),
[Quadrilateral1BoxedBoolean](#quadrilateral1boxedboolean),
[Quadrilateral1BoxedNumber](#quadrilateral1boxednumber),
[Quadrilateral1BoxedString](#quadrilateral1boxedstring),
[Quadrilateral1BoxedList](#quadrilateral1boxedlist),
[Quadrilateral1BoxedMap](#quadrilateral1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Quadrilateral1BoxedVoid
public record Quadrilateral1BoxedVoid<br>
implements [Quadrilateral1Boxed](#quadrilateral1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Quadrilateral1BoxedBoolean
public record Quadrilateral1BoxedBoolean<br>
implements [Quadrilateral1Boxed](#quadrilateral1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Quadrilateral1BoxedNumber
public record Quadrilateral1BoxedNumber<br>
implements [Quadrilateral1Boxed](#quadrilateral1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Quadrilateral1BoxedString
public record Quadrilateral1BoxedString<br>
implements [Quadrilateral1Boxed](#quadrilateral1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Quadrilateral1BoxedList
public record Quadrilateral1BoxedList<br>
implements [Quadrilateral1Boxed](#quadrilateral1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Quadrilateral1BoxedMap
public record Quadrilateral1BoxedMap<br>
implements [Quadrilateral1Boxed](#quadrilateral1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Quadrilateral1
public static class Quadrilateral1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[SimpleQuadrilateral.SimpleQuadrilateral1.class](../../components/schemas/SimpleQuadrilateral.md#simplequadrilateral1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[ComplexQuadrilateral.ComplexQuadrilateral1.class](../../components/schemas/ComplexQuadrilateral.md#complexquadrilateral1)<br>))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedString](#quadrilateral1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedVoid](#quadrilateral1boxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedNumber](#quadrilateral1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedBoolean](#quadrilateral1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedMap](#quadrilateral1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedList](#quadrilateral1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Quadrilateral1Boxed](#quadrilateral1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
