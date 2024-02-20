# ObjectInterface
org.openapijsonschematools.client.components.schemas.ObjectInterface.java
public class ObjectInterface<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectInterface.ObjectInterface1Boxed](#objectinterface1boxed)<br> abstract sealed validated payload class |
| record | [ObjectInterface.ObjectInterface1BoxedMap](#objectinterface1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectInterface.ObjectInterface1](#objectinterface1)<br> schema class |

## ObjectInterface1Boxed
public sealed interface ObjectInterface1Boxed<br>
permits<br>
[ObjectInterface1BoxedMap](#objectinterface1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectInterface1BoxedMap
public record ObjectInterface1BoxedMap<br>
implements [ObjectInterface1Boxed](#objectinterface1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectInterface1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ObjectInterface1
public static class ObjectInterface1<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
