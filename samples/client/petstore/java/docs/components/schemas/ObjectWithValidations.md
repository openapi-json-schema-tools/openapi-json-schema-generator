# ObjectWithValidations
org.openapijsonschematools.client.components.schemas.ObjectWithValidations.java
public class ObjectWithValidations

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithValidations.ObjectWithValidations1Boxed](#objectwithvalidations1boxed)<br> sealed validated payload class |
| static class | [ObjectWithValidations.ObjectWithValidations1](#objectwithvalidations1)<br> schema class |

## ObjectWithValidations1Boxed
public static abstract sealed class ObjectWithValidations1Boxed<br>

## ObjectWithValidations1
public static class ObjectWithValidations1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Integer | minProperties = 2 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
