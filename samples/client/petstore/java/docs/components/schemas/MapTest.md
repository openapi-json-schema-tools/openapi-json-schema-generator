# MapTest
org.openapijsonschematools.components.schemas.MapTest.java
public class MapTest

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MapTest.MapTest1](#maptest1)<br> schema class |
| static class | [MapTest.MapTestMap](#maptestmap)<br> output class for Map payloads |
| static class | [MapTest.DirectMap](#directmap)<br> schema class |
| static class | [MapTest.DirectMapMap](#directmapmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties3](#additionalproperties3)<br> schema class |
| static class | [MapTest.MapOfEnumString](#mapofenumstring)<br> schema class |
| static class | [MapTest.MapOfEnumStringMap](#mapofenumstringmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties2](#additionalproperties2)<br> schema class |
| static class | [MapTest.MapMapOfString](#mapmapofstring)<br> schema class |
| static class | [MapTest.MapMapOfStringMap](#mapmapofstringmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties](#additionalproperties)<br> schema class |
| static class | [MapTest.AdditionalPropertiesMap](#additionalpropertiesmap)<br> output class for Map payloads |
| static class | [MapTest.AdditionalProperties1](#additionalproperties1)<br> schema class |

## MapTest1
public static class MapTest1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_map_of_string", MapMapOfString.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_of_enum_string", MapOfEnumString.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("direct_map", DirectMap.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("indirect_map", StringBooleanMap.StringBooleanMap1.class)<br>)))<br>));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapTestMap](#maptestmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## MapTestMap
public static class MapTestMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapTestMap](#maptestmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| [MapMapOfStringMap](#mapmapofstringmap) | map_map_of_string()<br>[optional] |
| [MapOfEnumStringMap](#mapofenumstringmap) | map_of_enum_string()<br>[optional] |
| [DirectMapMap](#directmapmap) | direct_map()<br>[optional] |
| [StringBooleanMap.StringBooleanMapMap](../../components/schemas/StringBooleanMap.md#stringbooleanmapmap) | indirect_map()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **map_map_of_string** | Map<String, Map<String, String>> |  | [optional] |
| **map_of_enum_string** | Map<String, String> |  | [optional] |
| **direct_map** | Map<String, boolean> |  | [optional] |
| **indirect_map** | Map<String, boolean> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## DirectMap
public static class DirectMap<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties3.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DirectMapMap](#directmapmap) | validate(Map<String, Boolean> arg, SchemaConfiguration configuration) |

## DirectMapMap
public static class DirectMapMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DirectMapMap](#directmapmap) | of(Map<String, Boolean> arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | boolean | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties3
public static class AdditionalProperties3<br>
extends BooleanJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |

## MapOfEnumString
public static class MapOfEnumString<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties2.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfEnumStringMap](#mapofenumstringmap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## MapOfEnumStringMap
public static class MapOfEnumStringMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfEnumStringMap](#mapofenumstringmap) | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower"] |

## AdditionalProperties2
public static class AdditionalProperties2<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>)))));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## MapMapOfString
public static class MapMapOfString<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapMapOfStringMap](#mapmapofstringmap) | validate(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) |

## MapMapOfStringMap
public static class MapMapOfStringMap<br>
extends FrozenMap<String, AdditionalPropertiesMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapMapOfStringMap](#mapmapofstringmap) | of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) |
| [AdditionalPropertiesMap](#additionalpropertiesmap) | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Map<String, String> | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties
public static class AdditionalProperties<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties1.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesMap](#additionalpropertiesmap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## AdditionalPropertiesMap
public static class AdditionalPropertiesMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesMap](#additionalpropertiesmap) | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties1
public static class AdditionalProperties1<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
