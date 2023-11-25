# AdditionalPropertiesWithArrayOfEnums
org.openapijsonschematools.components.schemas.AdditionalPropertiesWithArrayOfEnums.java
public class AdditionalPropertiesWithArrayOfEnums

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesList<br> output class for List payloads |
| static class | AdditionalPropertiesWithArrayOfEnums.AdditionalProperties<br> schema class |
| static class | AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnumsMap<br> output class for Map payloads |
| static class | AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnums1<br> schema class |

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
type: Map<String, Object>
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


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
