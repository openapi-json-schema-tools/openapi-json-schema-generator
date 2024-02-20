# ParentPet
org.openapijsonschematools.client.components.schemas.ParentPet.java
public class ParentPet<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ParentPet.ParentPet1Boxed](#parentpet1boxed)<br> abstract sealed validated payload class |
| record | [ParentPet.ParentPet1BoxedMap](#parentpet1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ParentPet.ParentPet1](#parentpet1)<br> schema class |

## ParentPet1Boxed
public sealed interface ParentPet1Boxed<br>
permits<br>
[ParentPet1BoxedMap](#parentpet1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ParentPet1BoxedMap
public record ParentPet1BoxedMap<br>
implements [ParentPet1Boxed](#parentpet1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ParentPet1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [ParentPet1BoxedMap](#parentpet1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ParentPet1Boxed](#parentpet1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
