# MapTest
org.openapijsonschematools.components.schemas.MapTest.java
public class MapTest

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | MapTest.MapTest1<br> schema class |
| static class | MapTest.MapTestMap<br> output class for Map payloads |
| static class | MapTest.DirectMap<br> schema class |
| static class | MapTest.DirectMapMap<br> output class for Map payloads |
| static class | MapTest.AdditionalProperties3<br> schema class |
| static class | MapTest.MapOfEnumString<br> schema class |
| static class | MapTest.MapOfEnumStringMap<br> output class for Map payloads |
| static class | MapTest.AdditionalProperties2<br> schema class |
| static class | MapTest.MapMapOfString<br> schema class |
| static class | MapTest.MapMapOfStringMap<br> output class for Map payloads |
| static class | MapTest.AdditionalProperties<br> schema class |
| static class | MapTest.AdditionalPropertiesMap<br> output class for Map payloads |
| static class | MapTest.AdditionalProperties1<br> schema class |

## MapTest1
public class MapTest1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapTestMap](#maptestmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## MapTestMap
public class MapTestMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapTestMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| MapMapOfStringMap | map_map_of_string()<br>[optional] |
| MapOfEnumStringMap | map_of_enum_string()<br>[optional] |
| DirectMapMap | direct_map()<br>[optional] |
| StringBooleanMap.StringBooleanMapMap | indirect_map()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**map_map_of_string** | Map<String, Map<String, String>> |  | [optional]
**map_of_enum_string** | Map<String, String> |  | [optional]
**direct_map** | Map<String, boolean> |  | [optional]
**indirect_map** | Map<String, boolean> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## DirectMap
public class DirectMap
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DirectMapMap](#directmapmap) | validate(Map<String, Boolean> arg, SchemaConfiguration configuration) |

## DirectMapMap
public class DirectMapMap
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static DirectMapMap | of(Map<String, Boolean> arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | boolean | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties3
public class AdditionalProperties3
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |

## MapOfEnumString
public class MapOfEnumString
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfEnumStringMap](#mapofenumstringmap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## MapOfEnumStringMap
public class MapOfEnumStringMap
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapOfEnumStringMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | String | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower"]

## AdditionalProperties2
public class AdditionalProperties2
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## MapMapOfString
public class MapMapOfString
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapMapOfStringMap](#mapmapofstringmap) | validate(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) |

## MapMapOfStringMap
public class MapMapOfStringMap
extends FrozenMap<String, AdditionalPropertiesMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapMapOfStringMap | of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) |
| AdditionalPropertiesMap | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | Map<String, String> | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties
public class AdditionalProperties
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesMap](#additionalpropertiesmap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## AdditionalPropertiesMap
public class AdditionalPropertiesMap
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AdditionalPropertiesMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | String | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties1
public class AdditionalProperties1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
