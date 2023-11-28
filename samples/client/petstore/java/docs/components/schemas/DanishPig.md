# DanishPig
org.openapijsonschematools.components.schemas.DanishPig.java
public class DanishPig

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [DanishPig.DanishPig1](#danishpig1)<br> schema class |
| static class | [DanishPig.DanishPigMap](#danishpigmap)<br> output class for Map payloads |
| static class | [DanishPig.ClassName](#classname)<br> schema class |

## DanishPig1
public static class DanishPig1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
<br/>
        new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
        new PropertyEntry("className", ClassName.class)
    ))),
<br/>
        new KeywordEntry("required", new RequiredValidator(Set.of(
        "className"
    )))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DanishPigMap](#danishpigmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## DanishPigMap
public static class DanishPigMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DanishPigMap](#danishpigmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["DanishPig"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **className** | String |  | must be one of ["DanishPig"] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ClassName
public static class ClassName<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(
        String.class
    )))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
