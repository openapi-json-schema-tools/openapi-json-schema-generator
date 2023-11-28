# Schema
org.openapijsonschematools.paths.fakeuploadfile.post.requestbody.content.multipartformdata.Schema.java
public class Schema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaMap](#schemamap)<br> output class for Map payloads |
| static class | [Schema.File](#file)<br> schema class |
| static class | [Schema.AdditionalMetadata](#additionalmetadata)<br> schema class |

## Schema1
public static class Schema1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("additionalMetadata", AdditionalMetadata.class),
    new PropertyEntry("file", File.class)
))),
new KeywordEntry("required", new RequiredValidator(Set.of(
    "file"
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap](#schemamap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## SchemaMap
public static class SchemaMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap](#schemamap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | file()<br> |
| String | additionalMetadata()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **file** | String | file to upload | |
| **additionalMetadata** | String | Additional data to pass to server | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## File
public static class File<br>
extends JsonSchema

A schema class that validates payloads

## Description
file to upload
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static BinaryString | validate(BinaryString arg, SchemaConfiguration configuration) |

## AdditionalMetadata
public static class AdditionalMetadata<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
Additional data to pass to server
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
