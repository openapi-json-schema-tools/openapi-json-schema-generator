# PublicKey
petstore_api.components.schema.public_key
```
type: schemas.Schema
```

## Description
schema that contains a property named key

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PublicKeyDictInput](#publickeydictinput), [PublicKeyDict](#publickeydict) | [PublicKeyDict](#publickeydict) |

## PublicKeyDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**key** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## PublicKeyDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**key** | str, schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type schema that contains a property named key | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**key** | str, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PublicKeyDictInput](#publickeydictinput), [PublicKeyDict](#publickeydict) | [PublicKeyDict](#publickeydict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
