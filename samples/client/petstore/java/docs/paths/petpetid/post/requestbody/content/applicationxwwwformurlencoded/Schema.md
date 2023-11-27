# Schema
org.openapijsonschematools.paths.petpetid.post.requestbody.content.applicationxwwwformurlencoded.Schema.java
public class Schema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema.Schema1<br> schema class |
| static class | Schema.SchemaMap<br> output class for Map payloads |
| static class | Schema.Status<br> schema class |
| static class | Schema.Name<br> schema class |

## Schema1
public class Schema1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## SchemaMap
public class SchemaMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | name()<br>[optional] |
| String | status()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | String | Updated name of the pet | [optional]
**status** | String | Updated status of the pet | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Status
public class Status
extends JsonSchema

A schema class that validates payloads

## Description
Updated status of the pet

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Name
public class Name
extends JsonSchema

A schema class that validates payloads

## Description
Updated name of the pet

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
