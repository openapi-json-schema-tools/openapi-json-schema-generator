# ObjectTypeMatchesObjects
org.openapijsonschematools.client.components.schemas.ObjectTypeMatchesObjects.java
public class ObjectTypeMatchesObjects<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1Boxed](#objecttypematchesobjects1boxed)<br> sealed interface for validated payloads |
| record | [ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1BoxedMap](#objecttypematchesobjects1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1](#objecttypematchesobjects1)<br> schema class |

## ObjectTypeMatchesObjects1Boxed
public sealed interface ObjectTypeMatchesObjects1Boxed<br>
permits<br>
[ObjectTypeMatchesObjects1BoxedMap](#objecttypematchesobjects1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectTypeMatchesObjects1BoxedMap
public record ObjectTypeMatchesObjects1BoxedMap<br>
implements [ObjectTypeMatchesObjects1Boxed](#objecttypematchesobjects1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectTypeMatchesObjects1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ObjectTypeMatchesObjects1
public static class ObjectTypeMatchesObjects1<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
