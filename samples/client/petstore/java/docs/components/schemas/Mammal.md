# Mammal
org.openapijsonschematools.client.components.schemas.Mammal.java
public class Mammal

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Mammal.Mammal1Boxed](#mammal1boxed)<br> sealed validated payload class |
| static class | [Mammal.Mammal1](#mammal1)<br> schema class |

## Mammal1Boxed
public static abstract sealed class Mammal1Boxed<br>
permits<br>
[Mammal1BoxedVoid](#mammal1boxedvoid),
[Mammal1BoxedBoolean](#mammal1boxedboolean),
[Mammal1BoxedNumber](#mammal1boxednumber),
[Mammal1BoxedString](#mammal1boxedstring),
[Mammal1BoxedList](#mammal1boxedlist),
[Mammal1BoxedMap](#mammal1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Mammal1BoxedVoid
public static final class Mammal1BoxedVoid<br>
extends Mammal1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Mammal1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Mammal1
public static class Mammal1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Whale.Whale1.class](../../components/schemas/Whale.md#whale1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Zebra.Zebra1.class](../../components/schemas/Zebra.md#zebra1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Pig.Pig1.class](../../components/schemas/Pig.md#pig1)<br>))<br> |

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
