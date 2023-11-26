# Schema
org.openapijsonschematools.paths.fakepetiduploadimagewithrequiredfile.post.requestbody.content.multipartformdata.Schema.java
public class Schema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema.Schema1<br> schema class |
| static class | Schema.SchemaMap<br> output class for Map payloads |
| static class | Schema.RequiredFile<br> schema class |
| static class | Schema.AdditionalMetadata<br> schema class |

## Schema1
public class Schema1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**requiredFile** | String | file to upload |
**additionalMetadata** | String | Additional data to pass to server | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
public class SchemaMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | requiredFile()<br> |
| String | additionalMetadata()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## RequiredFile
public class RequiredFile
extends JsonSchema

A schema class that validates payloads

## Description
file to upload
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static BinaryString | validate(BinaryString arg, SchemaConfiguration configuration) |

## AdditionalMetadata
public class AdditionalMetadata
extends JsonSchema

A schema class that validates payloads

## Description
Additional data to pass to server
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
