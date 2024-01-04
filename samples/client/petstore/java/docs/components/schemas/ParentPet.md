# ParentPet
org.openapijsonschematools.client.components.schemas.ParentPet.java
public class ParentPet

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ParentPet.ParentPet1](#parentpet1)<br> schema class |

## ParentPet1
public static class ParentPet1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[GrandparentAnimal.GrandparentAnimal1.class](../../components/schemas/GrandparentAnimal.md#grandparentanimal1)<br>;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
