# MyObjectDto
org.openapijsonschematools.components.schemas.MyObjectDto.java
public class MyObjectDto

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | MyObjectDto.MyObjectDto1<br> schema class |
| static class | MyObjectDto.MyObjectDtoMap<br> output class for Map payloads |
| static class | MyObjectDto.Id<br> schema class |
| static class | MyObjectDto.AdditionalProperties<br> schema class |

## MyObjectDto1
public class MyObjectDto1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MyObjectDtoMap](#myobjectdtomap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## MyObjectDtoMap
public class MyObjectDtoMap
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MyObjectDtoMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | id()<br>[optional] value must be a uuid |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | String |  | [optional] value must be a uuid

## Id
public class Id
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## AdditionalProperties
public class AdditionalProperties
extends JsonSchema

A schema class that validates payloads

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
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
