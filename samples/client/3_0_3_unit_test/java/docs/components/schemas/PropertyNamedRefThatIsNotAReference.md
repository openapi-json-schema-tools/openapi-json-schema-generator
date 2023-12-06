# PropertyNamedRefThatIsNotAReference
org.openapijsonschematools.client.components.schemas.PropertyNamedRefThatIsNotAReference.java
public class PropertyNamedRefThatIsNotAReference

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to store list input interfaces, extends List

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1](#propertynamedrefthatisnotareference1)<br> schema class |
| static class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap)<br> output class for Map payloads |
| static class | [PropertyNamedRefThatIsNotAReference.Ref](#ref)<br> schema class |

## PropertyNamedRefThatIsNotAReference1
public static class PropertyNamedRefThatIsNotAReference1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("$ref", [Ref.class](#ref)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static [PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## PropertyNamedRefThatIsNotAReferenceMap
public static class PropertyNamedRefThatIsNotAReferenceMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["$ref"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **$ref** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Ref
public static class Ref<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
