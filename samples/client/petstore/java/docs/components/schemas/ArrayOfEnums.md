# ArrayOfEnums
org.openapijsonschematools.components.schemas.ArrayOfEnums.java
public class ArrayOfEnums

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayOfEnums.ArrayOfEnums1](#arrayofenums1)<br> schema class |
| static class | [ArrayOfEnums.ArrayOfEnumsList](#arrayofenumslist)<br> output class for List payloads |

## ArrayOfEnums1
public static class ArrayOfEnums1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfEnumsList](#arrayofenumslist) | validate(List<String> arg, SchemaConfiguration configuration) |

## ArrayOfEnumsList
public class ArrayOfEnumsList
extends FrozenList<String>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfEnumsList](#arrayofenumslist) | of(List<String> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
