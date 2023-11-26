# FileSchemaTestClass
org.openapijsonschematools.components.schemas.FileSchemaTestClass.java
public class FileSchemaTestClass

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | FileSchemaTestClass.FileSchemaTestClass1<br> schema class |
| static class | FileSchemaTestClass.FileSchemaTestClassMap<br> output class for Map payloads |
| static class | FileSchemaTestClass.Files<br> schema class |
| static class | FileSchemaTestClass.FilesList<br> output class for List payloads |

## FileSchemaTestClass1
public class FileSchemaTestClass1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FileSchemaTestClassMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**file** | Map<String, Object> |  | [optional]
**files** | List<Map<String, Object>> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## FileSchemaTestClassMap
public class FileSchemaTestClassMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FileSchemaTestClassMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| File.FileMap | file()<br>[optional] |
| FilesList | files()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Files
public class Files
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FilesList | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## FilesList
public class FilesList
extends FrozenList<File.FileMap>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
