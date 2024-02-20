# Triangle
org.openapijsonschematools.client.components.schemas.Triangle.java
public class Triangle<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Triangle.Triangle1Boxed](#triangle1boxed)<br> abstract sealed validated payload class |
| record | [Triangle.Triangle1BoxedVoid](#triangle1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Triangle.Triangle1BoxedBoolean](#triangle1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Triangle.Triangle1BoxedNumber](#triangle1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Triangle.Triangle1BoxedString](#triangle1boxedstring)<br> boxed class to store validated String payloads |
| record | [Triangle.Triangle1BoxedList](#triangle1boxedlist)<br> boxed class to store validated List payloads |
| record | [Triangle.Triangle1BoxedMap](#triangle1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Triangle.Triangle1](#triangle1)<br> schema class |

## Triangle1Boxed
public sealed interface Triangle1Boxed<br>
permits<br>
[Triangle1BoxedVoid](#triangle1boxedvoid),
[Triangle1BoxedBoolean](#triangle1boxedboolean),
[Triangle1BoxedNumber](#triangle1boxednumber),
[Triangle1BoxedString](#triangle1boxedstring),
[Triangle1BoxedList](#triangle1boxedlist),
[Triangle1BoxedMap](#triangle1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Triangle1BoxedVoid
public record Triangle1BoxedVoid<br>
implements [Triangle1Boxed](#triangle1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Triangle1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Triangle1BoxedBoolean
public record Triangle1BoxedBoolean<br>
implements [Triangle1Boxed](#triangle1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Triangle1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Triangle1BoxedNumber
public record Triangle1BoxedNumber<br>
implements [Triangle1Boxed](#triangle1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Triangle1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Triangle1BoxedString
public record Triangle1BoxedString<br>
implements [Triangle1Boxed](#triangle1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Triangle1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Triangle1BoxedList
public record Triangle1BoxedList<br>
implements [Triangle1Boxed](#triangle1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Triangle1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Triangle1BoxedMap
public record Triangle1BoxedMap<br>
implements [Triangle1Boxed](#triangle1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Triangle1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Triangle1
public static class Triangle1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[EquilateralTriangle.EquilateralTriangle1.class](../../components/schemas/EquilateralTriangle.md#equilateraltriangle1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[IsoscelesTriangle.IsoscelesTriangle1.class](../../components/schemas/IsoscelesTriangle.md#isoscelestriangle1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[ScaleneTriangle.ScaleneTriangle1.class](../../components/schemas/ScaleneTriangle.md#scalenetriangle1)<br>))<br> |

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
| [Triangle1BoxedString](#triangle1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Triangle1BoxedVoid](#triangle1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Triangle1BoxedNumber](#triangle1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Triangle1BoxedBoolean](#triangle1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Triangle1BoxedMap](#triangle1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Triangle1BoxedList](#triangle1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Triangle1Boxed](#triangle1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
