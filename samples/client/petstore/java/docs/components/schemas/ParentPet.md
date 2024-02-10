# ParentPet
org.openapijsonschematools.client.components.schemas.ParentPet.java
public class ParentPet

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ParentPet.ParentPet1Boxed](#parentpet1boxed)<br> sealed validated payload class |
| static class | [ParentPet.ParentPet1](#parentpet1)<br> schema class |

## ParentPet1Boxed
public static abstract sealed class ParentPet1Boxed<br>
permits<br>
[ParentPet1BoxedMap](#parentpet1boxedmap)

A sealed class that stores validated payloads using boxed classes

## ParentPet1BoxedMap
public static final class ParentPet1BoxedMap<br>
extends ParentPet1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ParentPet1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
