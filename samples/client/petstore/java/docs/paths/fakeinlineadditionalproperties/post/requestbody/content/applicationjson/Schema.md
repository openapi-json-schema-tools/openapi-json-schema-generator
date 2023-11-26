# Schema
org.openapijsonschematools.paths.fakeinlineadditionalproperties.post.requestbody.content.applicationjson.Schema.java
public class Schema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema.Schema1<br> schema class |
| static class | Schema.SchemaMap<br> output class for Map payloads |
| static class | Schema.AdditionalProperties<br> schema class |

## Schema1
public class Schema1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## SchemaMap
public class SchemaMap
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
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

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
