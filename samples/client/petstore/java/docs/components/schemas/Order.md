# Order1
org.openapijsonschematools.components.schemas.Order.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | OrderMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | long |  | [optional] value must be a 64 bit integer
**petId** | long |  | [optional] value must be a 64 bit integer
**quantity** | int |  | [optional] value must be a 32 bit integer
**shipDate** | String |  | [optional] value must conform to RFC-3339 date-time
**status** | String | Order Status | [optional] must be one of ["placed", "approved", "delivered"]
**complete** | boolean |  | [optional] if omitted the server will use the default value of false
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## OrderMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**id** |  |  | [optional]
**petId** |  |  | [optional]
**quantity** |  |  | [optional]
**shipDate** |  |  | [optional]
**status** |  | Order Status | [optional]
**complete** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
