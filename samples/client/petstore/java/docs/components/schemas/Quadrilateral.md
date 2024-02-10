# Quadrilateral
org.openapijsonschematools.client.components.schemas.Quadrilateral.java
public class Quadrilateral

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Quadrilateral.Quadrilateral1Boxed](#quadrilateral1boxed)<br> sealed validated payload class |
| static class | [Quadrilateral.Quadrilateral1BoxedVoid](#quadrilateral1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Quadrilateral.Quadrilateral1BoxedBoolean](#quadrilateral1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Quadrilateral.Quadrilateral1BoxedNumber](#quadrilateral1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Quadrilateral.Quadrilateral1BoxedString](#quadrilateral1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Quadrilateral.Quadrilateral1BoxedList](#quadrilateral1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Quadrilateral.Quadrilateral1BoxedMap](#quadrilateral1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Quadrilateral.Quadrilateral1](#quadrilateral1)<br> schema class |

## Quadrilateral1Boxed
public static abstract sealed class Quadrilateral1Boxed<br>
permits<br>
[Quadrilateral1BoxedVoid](#quadrilateral1boxedvoid),
[Quadrilateral1BoxedBoolean](#quadrilateral1boxedboolean),
[Quadrilateral1BoxedNumber](#quadrilateral1boxednumber),
[Quadrilateral1BoxedString](#quadrilateral1boxedstring),
[Quadrilateral1BoxedList](#quadrilateral1boxedlist),
[Quadrilateral1BoxedMap](#quadrilateral1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Quadrilateral1BoxedVoid
public static final class Quadrilateral1BoxedVoid<br>
extends Quadrilateral1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Quadrilateral1BoxedBoolean
public static final class Quadrilateral1BoxedBoolean<br>
extends Quadrilateral1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Quadrilateral1BoxedNumber
public static final class Quadrilateral1BoxedNumber<br>
extends Quadrilateral1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Quadrilateral1BoxedString
public static final class Quadrilateral1BoxedString<br>
extends Quadrilateral1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Quadrilateral1BoxedList
public static final class Quadrilateral1BoxedList<br>
extends Quadrilateral1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Quadrilateral1BoxedMap
public static final class Quadrilateral1BoxedMap<br>
extends Quadrilateral1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Quadrilateral1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedString](#quadrilateral1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedVoid](#quadrilateral1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedNumber](#quadrilateral1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedBoolean](#quadrilateral1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedMap](#quadrilateral1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Quadrilateral1BoxedList](#quadrilateral1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
