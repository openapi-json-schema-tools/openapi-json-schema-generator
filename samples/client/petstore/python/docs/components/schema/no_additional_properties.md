# NoAdditionalProperties
petstore_api.components.schema.no_additional_properties
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[NoAdditionalPropertiesDictInput](#noadditionalpropertiesdictinput), [NoAdditionalPropertiesDict](#noadditionalpropertiesdict) | [NoAdditionalPropertiesDict](#noadditionalpropertiesdict) |

## NoAdditionalPropertiesDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | int |  | value must be a 64 bit integer
**petId** | int |  | [optional] value must be a 64 bit integer

## NoAdditionalPropertiesDict
```
base class: schemas.immutabledict[str, int]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**id** | int |  | value must be a 64 bit integer
**petId** | int, schemas.Unset |  | [optional] value must be a 64 bit integer

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**id** | int |  | value must be a 64 bit integer
**petId** | int, schemas.Unset |  | [optional] value must be a 64 bit integer

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [NoAdditionalPropertiesDictInput](#noadditionalpropertiesdictinput), [NoAdditionalPropertiesDict](#noadditionalpropertiesdict) | [NoAdditionalPropertiesDict](#noadditionalpropertiesdict) | a constructor

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
