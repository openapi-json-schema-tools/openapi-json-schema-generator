# File
org.openapijsonschematools.components.schemas.File.java
public class File

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [File.File1](#file1)<br> schema class |
| static class | [File.FileMap](#filemap)<br> output class for Map payloads |
| static class | [File.SourceURI](#sourceuri)<br> schema class |

## File1
public static class File1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Must be named &#x60;File&#x60; for test.
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("sourceURI", [SourceURI.class](#sourceuri)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FileMap](#filemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## FileMap
public static class FileMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FileMap](#filemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | sourceURI()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **sourceURI** | String | Test capitalization | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## SourceURI
public static class SourceURI<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
Test capitalization
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
