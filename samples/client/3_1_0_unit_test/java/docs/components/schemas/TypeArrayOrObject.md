# TypeArrayOrObject
unit_test_api.components.schemas.TypeArrayOrObject.java
public class TypeArrayOrObject<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [TypeArrayOrObject.TypeArrayOrObject1Boxed](#typearrayorobject1boxed)<br> sealed interface for validated payloads |
| record | [TypeArrayOrObject.TypeArrayOrObject1BoxedList](#typearrayorobject1boxedlist)<br> boxed class to store validated List payloads |
| record | [TypeArrayOrObject.TypeArrayOrObject1BoxedMap](#typearrayorobject1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [TypeArrayOrObject.TypeArrayOrObject1](#typearrayorobject1)<br> schema class |

## TypeArrayOrObject1Boxed
public sealed interface TypeArrayOrObject1Boxed<br>
permits<br>
[TypeArrayOrObject1BoxedList](#typearrayorobject1boxedlist),
[TypeArrayOrObject1BoxedMap](#typearrayorobject1boxedmap)

sealed interface that stores validated payloads using boxed classes

## TypeArrayOrObject1BoxedList
public record TypeArrayOrObject1BoxedList<br>
implements [TypeArrayOrObject1Boxed](#typearrayorobject1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeArrayOrObject1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## TypeArrayOrObject1BoxedMap
public record TypeArrayOrObject1BoxedMap<br>
implements [TypeArrayOrObject1Boxed](#typearrayorobject1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeArrayOrObject1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [TypeArrayOrObject1BoxedList](#typearrayorobject1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [TypeArrayOrObject1BoxedMap](#typearrayorobject1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [TypeArrayOrObject1Boxed](#typearrayorobject1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
