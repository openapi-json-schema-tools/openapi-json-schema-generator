# PropertyNamedRefThatIsNotAReference
org.openapijsonschematools.client.components.schemas.PropertyNamedRefThatIsNotAReference.java
public class PropertyNamedRefThatIsNotAReference

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1](#propertynamedrefthatisnotareference1)<br> schema class |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder)<br> builder for Map payloads |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap)<br> output class for Map payloads |
| static class | [PropertyNamedRefThatIsNotAReference.Ref](#ref)<br> schema class |

## PropertyNamedRefThatIsNotAReference1
public static class PropertyNamedRefThatIsNotAReference1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("$ref", [Ref.class](#ref)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) | validate([Map<?, ?>](#propertynamedrefthatisnotareferencemapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PropertyNamedRefThatIsNotAReferenceMapBuilder
public class PropertyNamedRefThatIsNotAReferenceMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReferenceMapBuilder()<br>Creates an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |

## PropertyNamedRefThatIsNotAReferenceMap
public static class PropertyNamedRefThatIsNotAReferenceMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) | of([Map<String, ? extends @Nullable Object>](#propertynamedrefthatisnotareferencemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["$ref"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Ref
public static class Ref<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
