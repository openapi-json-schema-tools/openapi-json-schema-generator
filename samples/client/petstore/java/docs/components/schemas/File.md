# File
org.openapijsonschematools.components.schemas.File.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | File.SourceURI<br> schema class |
| static class | File.FileMap<br> output class for Map payloads |
| static class | File.File1<br> schema class |

## File1
```
type: JsonSchema
```

## Description
Must be named &#x60;File&#x60; for test.

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FileMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**sourceURI** | String | Test capitalization | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## FileMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FileMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | sourceURI()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
