# ObjectInterface
org.openapijsonschematools.client.components.schemas.ObjectInterface.java
public class ObjectInterface

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectInterface.ObjectInterface1Boxed](#objectinterface1boxed)<br> sealed validated payload class |
| static class | [ObjectInterface.ObjectInterface1BoxedMap](#objectinterface1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectInterface.ObjectInterface1](#objectinterface1)<br> schema class |

## ObjectInterface1Boxed
public static abstract sealed class ObjectInterface1Boxed<br>
permits<br>
[ObjectInterface1BoxedMap](#objectinterface1boxedmap)

A sealed class that stores validated payloads using boxed classes

## ObjectInterface1BoxedMap
public static final class ObjectInterface1BoxedMap<br>
extends ObjectInterface1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectInterface1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ObjectInterface1
public static class ObjectInterface1<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
