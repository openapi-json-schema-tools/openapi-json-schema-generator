# AbstractStepMessage1
org.openapijsonschematools.components.schemas.AbstractStepMessage.java
```
type: JsonSchema
```

## Description
Abstract Step

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object
> | AbstractStepMessageMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**description** |  |  |
**discriminator** |  |  |
**sequenceNumber** |  |  |
**any_string_name** | Map, List, decimal.Decimal, float, int, String, LocalDate, ZonedDateTime, UUID, boolean, null, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## AbstractStepMessageMap
```
base class: FrozenMap<String, Object>

```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**description** |  |  |
**discriminator** |  |  |
**sequenceNumber** |  |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

## Composed Schemas (allOf/anyOf/oneOf/not)
## anyOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
 |  | 

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
