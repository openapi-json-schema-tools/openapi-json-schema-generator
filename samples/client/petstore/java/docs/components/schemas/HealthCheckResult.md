# HealthCheckResult1
org.openapijsonschematools.components.schemas.HealthCheckResult.java
```
type: JsonSchema
```

## Description
Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | HealthCheckResultMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**NullableMessage** |  |  | [optional]
**any_string_name** | Map, List, decimal.Decimal, float, int, String, LocalDate, ZonedDateTime, UUID, boolean, null, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## HealthCheckResultMap
```
base class: FrozenMap<String, Object>

```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**NullableMessage** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
