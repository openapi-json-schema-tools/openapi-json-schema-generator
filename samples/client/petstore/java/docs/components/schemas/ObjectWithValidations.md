# ObjectWithValidations
org.openapijsonschematools.client.components.schemas.ObjectWithValidations.java
public class ObjectWithValidations

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithValidations.ObjectWithValidations1Boxed](#objectwithvalidations1boxed)<br> sealed validated payload class |
| static class | [ObjectWithValidations.ObjectWithValidations1BoxedMap](#objectwithvalidations1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithValidations.ObjectWithValidations1](#objectwithvalidations1)<br> schema class |

## ObjectWithValidations1Boxed
public static abstract sealed class ObjectWithValidations1Boxed<br>
permits<br>
[ObjectWithValidations1BoxedMap](#objectwithvalidations1boxedmap)

A sealed class that stores validated payloads using boxed classes

## ObjectWithValidations1BoxedMap
public static final class ObjectWithValidations1BoxedMap<br>
extends ObjectWithValidations1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithValidations1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
