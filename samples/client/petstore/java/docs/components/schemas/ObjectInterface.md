# ObjectInterface
org.openapijsonschematools.client.components.schemas.ObjectInterface.java
public class ObjectInterface

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectInterface.ObjectInterface1Boxed](#objectinterface1boxed)<br> sealed validated payload class |
| static class | [ObjectInterface.ObjectInterface1](#objectinterface1)<br> schema class |

## ObjectInterface1Boxed
public static abstract sealed class ObjectInterface1Boxed<br>

## ObjectInterface1
public static class ObjectInterface1<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
