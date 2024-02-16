# ObjectTypeMatchesObjects
org.openapijsonschematools.client.components.schemas.ObjectTypeMatchesObjects.java
public class ObjectTypeMatchesObjects<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1Boxed](#objecttypematchesobjects1boxed)<br> abstract sealed validated payload class |
| static class | [ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1BoxedMap](#objecttypematchesobjects1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1](#objecttypematchesobjects1)<br> schema class |

## ObjectTypeMatchesObjects1Boxed
public static abstract sealed class ObjectTypeMatchesObjects1Boxed<br>
permits<br>
[ObjectTypeMatchesObjects1BoxedMap](#objecttypematchesobjects1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ObjectTypeMatchesObjects1BoxedMap
public static final class ObjectTypeMatchesObjects1BoxedMap<br>
extends [ObjectTypeMatchesObjects1Boxed](#objecttypematchesobjects1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectTypeMatchesObjects1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ObjectTypeMatchesObjects1
public static class ObjectTypeMatchesObjects1<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
