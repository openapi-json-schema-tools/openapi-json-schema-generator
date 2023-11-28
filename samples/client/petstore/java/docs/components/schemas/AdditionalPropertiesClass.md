# AdditionalPropertiesClass
org.openapijsonschematools.components.schemas.AdditionalPropertiesClass.java
public class AdditionalPropertiesClass

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClass1](#additionalpropertiesclass1)<br> schema class |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesClassMap](#additionalpropertiesclassmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesString](#mapwithundeclaredpropertiesstring)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties5](#additionalproperties5)<br> schema class |
| static class | [AdditionalPropertiesClass.EmptyMap](#emptymap)<br> schema class |
| static class | [AdditionalPropertiesClass.EmptyMapMap](#emptymapmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties4](#additionalproperties4)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3](#mapwithundeclaredpropertiesanytype3)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties3](#additionalproperties3)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2](#mapwithundeclaredpropertiesanytype2)<br> schema class |
| static class | [AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1](#mapwithundeclaredpropertiesanytype1)<br> schema class |
| static class | [AdditionalPropertiesClass.Anytype1](#anytype1)<br> schema class |
| static class | [AdditionalPropertiesClass.MapOfMapProperty](#mapofmapproperty)<br> schema class |
| static class | [AdditionalPropertiesClass.MapOfMapPropertyMap](#mapofmappropertymap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties1](#additionalproperties1)<br> schema class |
| static class | [AdditionalPropertiesClass.AdditionalPropertiesMap](#additionalpropertiesmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties2](#additionalproperties2)<br> schema class |
| static class | [AdditionalPropertiesClass.MapProperty](#mapproperty)<br> schema class |
| static class | [AdditionalPropertiesClass.MapPropertyMap](#mappropertymap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesClass.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalPropertiesClass1
public static class AdditionalPropertiesClass1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_property", MapProperty.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_of_map_property", MapOfMapProperty.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("anytype_1", Anytype1.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_1", MapWithUndeclaredPropertiesAnytype1.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_2", MapWithUndeclaredPropertiesAnytype2.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_anytype_3", MapWithUndeclaredPropertiesAnytype3.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("empty_map", EmptyMap.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("map_with_undeclared_properties_string", MapWithUndeclaredPropertiesString.class)<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesClassMap](#additionalpropertiesclassmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## AdditionalPropertiesClassMap
public static class AdditionalPropertiesClassMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesClassMap](#additionalpropertiesclassmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| [MapPropertyMap](#mappropertymap) | map_property()<br>[optional] |
| [MapOfMapPropertyMap](#mapofmappropertymap) | map_of_map_property()<br>[optional] |
| Object | anytype_1()<br>[optional] |
| FrozenMap<String, Object> | map_with_undeclared_properties_anytype_1()<br>[optional] |
| FrozenMap<String, Object> | map_with_undeclared_properties_anytype_2()<br>[optional] |
| [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | map_with_undeclared_properties_anytype_3()<br>[optional] |
| [EmptyMapMap](#emptymapmap) | empty_map()<br>[optional] |
| [MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap) | map_with_undeclared_properties_string()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **map_property** | Map<String, String> |  | [optional] |
| **map_of_map_property** | Map<String, Map<String, String>> |  | [optional] |
| **anytype_1** | Object |  | [optional] |
| **map_with_undeclared_properties_anytype_1** | Map<String, Object> |  | [optional] |
| **map_with_undeclared_properties_anytype_2** | Map<String, Object> |  | [optional] |
| **map_with_undeclared_properties_anytype_3** | Map<String, Object> |  | [optional] |
| **empty_map** | Map<String, Object> | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional] |
| **map_with_undeclared_properties_string** | Map<String, String> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## MapWithUndeclaredPropertiesString
public static class MapWithUndeclaredPropertiesString<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties5.class](#additionalproperties5)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## MapWithUndeclaredPropertiesStringMap
public static class MapWithUndeclaredPropertiesStringMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesStringMap](#mapwithundeclaredpropertiesstringmap) | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties5
public static class AdditionalProperties5<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## EmptyMap
public static class EmptyMap<br>
extends JsonSchema

A schema class that validates payloads

## Description
an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map.
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties4.class](#additionalproperties4)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EmptyMapMap](#emptymapmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## EmptyMapMap
public static class EmptyMapMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EmptyMapMap](#emptymapmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |

## AdditionalProperties4
public static class AdditionalProperties4<br>
extends NotAnyTypeJsonSchema
    // NotAnyTypeSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

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
public static class MapWithUndeclaredPropertiesAnytype3<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties3.class](#additionalproperties3)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## MapWithUndeclaredPropertiesAnytype3Map
public static class MapWithUndeclaredPropertiesAnytype3Map<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapWithUndeclaredPropertiesAnytype3Map](#mapwithundeclaredpropertiesanytype3map) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties3
public static class AdditionalProperties3<br>
extends AnyTypeJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

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
public static class MapWithUndeclaredPropertiesAnytype2<br>
extends MapJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## MapWithUndeclaredPropertiesAnytype1
public static class MapWithUndeclaredPropertiesAnytype1<br>
extends MapJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Anytype1
public static class Anytype1<br>
extends AnyTypeJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

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
public static class MapOfMapProperty<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties1.class](#additionalproperties1)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfMapPropertyMap](#mapofmappropertymap) | validate(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) |

## MapOfMapPropertyMap
public static class MapOfMapPropertyMap<br>
extends FrozenMap<String, AdditionalPropertiesMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapOfMapPropertyMap](#mapofmappropertymap) | of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) |
| [AdditionalPropertiesMap](#additionalpropertiesmap) | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Map<String, String> | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties1
public static class AdditionalProperties1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties2.class](#additionalproperties2)))<br>)); |

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

## AdditionalProperties2
public static class AdditionalProperties2<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## MapProperty
public static class MapProperty<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties.class](#additionalproperties)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapPropertyMap](#mappropertymap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## MapPropertyMap
public static class MapPropertyMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapPropertyMap](#mappropertymap) | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties
public static class AdditionalProperties<br>
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
