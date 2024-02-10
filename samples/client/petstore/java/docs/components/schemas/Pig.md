# Pig
org.openapijsonschematools.client.components.schemas.Pig.java
public class Pig

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Pig.Pig1Boxed](#pig1boxed)<br> sealed validated payload class |
| static class | [Pig.Pig1](#pig1)<br> schema class |

## Pig1Boxed
public static abstract sealed class Pig1Boxed<br>
permits<br>
[Pig1BoxedVoid](#pig1boxedvoid),
[Pig1BoxedBoolean](#pig1boxedboolean),
[Pig1BoxedNumber](#pig1boxednumber),
[Pig1BoxedString](#pig1boxedstring),
[Pig1BoxedList](#pig1boxedlist),
[Pig1BoxedMap](#pig1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Pig1BoxedVoid
public static final class Pig1BoxedVoid<br>
extends Pig1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Pig1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Pig1BoxedBoolean
public static final class Pig1BoxedBoolean<br>
extends Pig1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Pig1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Pig1BoxedString
public static final class Pig1BoxedString<br>
extends Pig1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Pig1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

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
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
