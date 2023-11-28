# MixedPropertiesAndAdditionalPropertiesClass
org.openapijsonschematools.components.schemas.MixedPropertiesAndAdditionalPropertiesClass.java
public class MixedPropertiesAndAdditionalPropertiesClass

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClass1](#mixedpropertiesandadditionalpropertiesclass1)<br> schema class |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClassMap](#mixedpropertiesandadditionalpropertiesclassmap)<br> output class for Map payloads |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.MapSchema](#mapschema)<br> schema class |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.MapMap](#mapmap)<br> output class for Map payloads |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.DateTime](#datetime)<br> schema class |
| static class | [MixedPropertiesAndAdditionalPropertiesClass.UuidSchema](#uuidschema)<br> schema class |

## MixedPropertiesAndAdditionalPropertiesClass1
public static class MixedPropertiesAndAdditionalPropertiesClass1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
<br/>
        new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
        new PropertyEntry("uuid", UuidSchema.class),
        new PropertyEntry("dateTime", DateTime.class),
        new PropertyEntry("map", MapSchema.class)
    )))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MixedPropertiesAndAdditionalPropertiesClassMap](#mixedpropertiesandadditionalpropertiesclassmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## MixedPropertiesAndAdditionalPropertiesClassMap
public static class MixedPropertiesAndAdditionalPropertiesClassMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MixedPropertiesAndAdditionalPropertiesClassMap](#mixedpropertiesandadditionalpropertiesclassmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | dateTime()<br>[optional] value must conform to RFC-3339 date-time |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["uuid"], instance["map"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **uuid** | String |  | [optional] value must be a uuid |
| **dateTime** | String |  | [optional] value must conform to RFC-3339 date-time |
| **map** | Map<String, Map<String, Object>> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## MapSchema
public static class MapSchema<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
<br/>
        new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(Animal.Animal1.class))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapMap](#mapmap) | validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |

## MapMap
public static class MapMap<br>
extends FrozenMap<String, Animal.AnimalMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MapMap](#mapmap) | of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) |
| Animal.AnimalMap | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional] |

## DateTime
public static class DateTime<br>
extends DateTimeJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## UuidSchema
public static class UuidSchema<br>
extends UuidJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
