petstore_api.components.schema.zebra
# Schema Zebra

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ZebraDictInput](#zebradictinput), [ZebraDict](#zebradict) | [ZebraDict](#zebradict) |

## ZebraDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | str |  | must be one of ["zebra"]
**type** | str |  | [optional] must be one of ["plains", "mountain", "grevys"]
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ZebraDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**className** | str |  | must be one of ["zebra"]
**type** | str |  | [optional] must be one of ["plains", "mountain", "grevys"]
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**className** | str |  | must be one of ["zebra"]
**type** | str, schemas.Unset |  | [optional] must be one of ["plains", "mountain", "grevys"]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ZebraDictInput](#zebradictinput), [ZebraDict](#zebradict) | [ZebraDict](#zebradict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
