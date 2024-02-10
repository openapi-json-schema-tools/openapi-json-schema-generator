# SomeObject
org.openapijsonschematools.client.components.schemas.SomeObject.java
public class SomeObject

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SomeObject.SomeObject1Boxed](#someobject1boxed)<br> sealed validated payload class |
| static class | [SomeObject.SomeObject1](#someobject1)<br> schema class |

## SomeObject1Boxed
public static abstract sealed class SomeObject1Boxed<br>
permits<br>
[SomeObject1BoxedVoid](#someobject1boxedvoid),
[SomeObject1BoxedBoolean](#someobject1boxedboolean),
[SomeObject1BoxedNumber](#someobject1boxednumber),
[SomeObject1BoxedString](#someobject1boxedstring),
[SomeObject1BoxedList](#someobject1boxedlist),
[SomeObject1BoxedMap](#someobject1boxedmap)

A sealed class that stores validated payloads using boxed classes

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
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
