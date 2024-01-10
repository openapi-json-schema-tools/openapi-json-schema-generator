# TypeArrayOrObject
org.openapijsonschematools.client.components.schemas.TypeArrayOrObject.java
public class TypeArrayOrObject

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [TypeArrayOrObject.TypeArrayOrObject1](#typearrayorobject1)<br> schema class |

## TypeArrayOrObject1
public static class TypeArrayOrObject1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;List.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
