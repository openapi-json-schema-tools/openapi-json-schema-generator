# AdditionalPropertiesWithArrayOfEnums
org.openapijsonschematools.components.schemas.AdditionalPropertiesWithArrayOfEnums.java
public class AdditionalPropertiesWithArrayOfEnums

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnums1<br> schema class |
| static class | AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnumsMap<br> output class for Map payloads |
| static class | AdditionalPropertiesWithArrayOfEnums.AdditionalProperties<br> schema class |
| static class | AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesList<br> output class for List payloads |

## AdditionalPropertiesWithArrayOfEnums1
public class AdditionalPropertiesWithArrayOfEnums1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AdditionalPropertiesWithArrayOfEnumsMap | validate(Map<String, List<String>> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, List<String>>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | List<String> | any string name can be used but the value must be the correct type | [optional]

## AdditionalPropertiesWithArrayOfEnumsMap
public class AdditionalPropertiesWithArrayOfEnumsMap
extends FrozenMap<String, AdditionalPropertiesList>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AdditionalPropertiesWithArrayOfEnumsMap | of(Map<String, List<String>> arg, SchemaConfiguration configuration) |
| AdditionalPropertiesList | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties
public class AdditionalProperties
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AdditionalPropertiesList | validate(List<String> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

## AdditionalPropertiesList
public class AdditionalPropertiesList
extends FrozenList<String>

A class to store validated List payloads

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | 
configuration | configurations.SchemaConfiguration

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
