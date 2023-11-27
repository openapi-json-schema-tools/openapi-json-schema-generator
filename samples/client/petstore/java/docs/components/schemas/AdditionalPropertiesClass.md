# AdditionalPropertiesClass
org.openapijsonschematools.components.schemas.AdditionalPropertiesClass.java
public class AdditionalPropertiesClass

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | AdditionalPropertiesClass.AdditionalPropertiesClass1<br> schema class |
| static class | AdditionalPropertiesClass.AdditionalPropertiesClassMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesString<br> schema class |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.AdditionalProperties5<br> schema class |
| static class | AdditionalPropertiesClass.EmptyMap<br> schema class |
| static class | AdditionalPropertiesClass.EmptyMapMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.AdditionalProperties4<br> schema class |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3<br> schema class |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Map<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.AdditionalProperties3<br> schema class |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2<br> schema class |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1<br> schema class |
| static class | AdditionalPropertiesClass.Anytype1<br> schema class |
| static class | AdditionalPropertiesClass.MapOfMapProperty<br> schema class |
| static class | AdditionalPropertiesClass.MapOfMapPropertyMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.AdditionalProperties1<br> schema class |
| static class | AdditionalPropertiesClass.AdditionalPropertiesMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.AdditionalProperties2<br> schema class |
| static class | AdditionalPropertiesClass.MapProperty<br> schema class |
| static class | AdditionalPropertiesClass.MapPropertyMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.AdditionalProperties<br> schema class |

## AdditionalPropertiesClass1
public class AdditionalPropertiesClass1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesClassMap](#additionalpropertiesclassmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## AdditionalPropertiesClassMap
public class AdditionalPropertiesClassMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AdditionalPropertiesClassMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| MapPropertyMap | map_property()<br>[optional] |
| MapOfMapPropertyMap | map_of_map_property()<br>[optional] |
| Object | anytype_1()<br>[optional] |
| FrozenMap<String, Object> | map_with_undeclared_properties_anytype_1()<br>[optional] |
| FrozenMap<String, Object> | map_with_undeclared_properties_anytype_2()<br>[optional] |
| MapWithUndeclaredPropertiesAnytype3Map | map_with_undeclared_properties_anytype_3()<br>[optional] |
| EmptyMapMap | empty_map()<br>[optional] |
| MapWithUndeclaredPropertiesStringMap | map_with_undeclared_properties_string()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**map_property** | Map<String, String> |  | [optional]
**map_of_map_property** | Map<String, Map<String, String>> |  | [optional]
**anytype_1** | Object |  | [optional]
**map_with_undeclared_properties_anytype_1** | Map<String, Object> |  | [optional]
**map_with_undeclared_properties_anytype_2** | Map<String, Object> |  | [optional]
**map_with_undeclared_properties_anytype_3** | Map<String, Object> |  | [optional]
**empty_map** | Map<String, Object> | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional]
**map_with_undeclared_properties_string** | Map<String, String> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## MapWithUndeclaredPropertiesString
public class MapWithUndeclaredPropertiesString
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## MapWithUndeclaredPropertiesStringMap
public class MapWithUndeclaredPropertiesStringMap
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapWithUndeclaredPropertiesStringMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | String | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties5
public class AdditionalProperties5
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## EmptyMap
public class EmptyMap
extends JsonSchema

A schema class that validates payloads

## Description
an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map.

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## EmptyMapMap
public class EmptyMapMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static EmptyMapMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------

## AdditionalProperties4
public class AdditionalProperties4
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

## MapWithUndeclaredPropertiesAnytype3
public class MapWithUndeclaredPropertiesAnytype3
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## MapWithUndeclaredPropertiesAnytype3Map
public class MapWithUndeclaredPropertiesAnytype3Map
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapWithUndeclaredPropertiesAnytype3Map | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties3
public class AdditionalProperties3
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

## MapWithUndeclaredPropertiesAnytype2
public class MapWithUndeclaredPropertiesAnytype2
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [](#) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## MapWithUndeclaredPropertiesAnytype1
public class MapWithUndeclaredPropertiesAnytype1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [](#) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Anytype1
public class Anytype1
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

## MapOfMapProperty
public class MapOfMapProperty
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfMapPropertyMap](#mapofmappropertymap) | validate(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) |

## MapOfMapPropertyMap
public class MapOfMapPropertyMap
extends FrozenMap<String, AdditionalPropertiesMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapOfMapPropertyMap | of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) |
| AdditionalPropertiesMap | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | Map<String, String> | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties1
public class AdditionalProperties1
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

## AdditionalProperties2
public class AdditionalProperties2
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## MapProperty
public class MapProperty
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapPropertyMap](#mappropertymap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## MapPropertyMap
public class MapPropertyMap
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapPropertyMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | String | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties
public class AdditionalProperties
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
