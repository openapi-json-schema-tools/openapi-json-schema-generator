# ObjectWithValidations
org.openapijsonschematools.client.components.schemas.ObjectWithValidations.java
public class ObjectWithValidations<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectWithValidations.ObjectWithValidations1Boxed](#objectwithvalidations1boxed)<br> sealed interface for validated payloads |
| record | [ObjectWithValidations.ObjectWithValidations1BoxedMap](#objectwithvalidations1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithValidations.ObjectWithValidations1](#objectwithvalidations1)<br> schema class |

## ObjectWithValidations1Boxed
public sealed interface ObjectWithValidations1Boxed<br>
permits<br>
[ObjectWithValidations1BoxedMap](#objectwithvalidations1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectWithValidations1BoxedMap
public record ObjectWithValidations1BoxedMap<br>
implements [ObjectWithValidations1Boxed](#objectwithvalidations1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithValidations1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [ObjectWithValidations1BoxedMap](#objectwithvalidations1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ObjectWithValidations1Boxed](#objectwithvalidations1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
