# MixedPropertiesAndAdditionalPropertiesClass
org.openapijsonschematools.components.schemas.MixedPropertiesAndAdditionalPropertiesClass.java
public class MixedPropertiesAndAdditionalPropertiesClass

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClass1<br> schema class |
| static class | MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClassMap<br> output class for Map payloads |
| static class | MixedPropertiesAndAdditionalPropertiesClass.MapSchema<br> schema class |
| static class | MixedPropertiesAndAdditionalPropertiesClass.MapMap<br> output class for Map payloads |
| static class | MixedPropertiesAndAdditionalPropertiesClass.DateTime<br> schema class |
| static class | MixedPropertiesAndAdditionalPropertiesClass.UuidSchema<br> schema class |

## MixedPropertiesAndAdditionalPropertiesClass1
public class MixedPropertiesAndAdditionalPropertiesClass1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MixedPropertiesAndAdditionalPropertiesClassMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | String |  | [optional] value must be a uuid
**dateTime** | String |  | [optional] value must conform to RFC-3339 date-time
**map** | Map<String, Map<String, Object>> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## MixedPropertiesAndAdditionalPropertiesClassMap
public class MixedPropertiesAndAdditionalPropertiesClassMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MixedPropertiesAndAdditionalPropertiesClassMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | dateTime()<br>[optional] value must conform to RFC-3339 date-time |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["uuid"], instance["map"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## MapSchema
public class MapSchema
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapMap | validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional]

## MapMap
public class MapMap
extends FrozenMap<String, Animal.AnimalMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapMap | of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |
| Animal.AnimalMap | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## DateTime
public class DateTime
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## UuidSchema
public class UuidSchema
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
