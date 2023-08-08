petstore_api.components.schema.address
# Schema Address

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AddressDictInput](#addressdictinput), [AddressDict](#addressdict) | [AddressDict](#addressdict) |

## AddressDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | int | any string name can be used but the value must be the correct type | [optional]

## AddressDict
base class: schemas.immutabledict[str, int]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | int | int, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AddressDictInput](#addressdictinput), [AddressDict](#addressdict) | [AddressDict](#addressdict) | a constructor
get_additional_property_ | str | int, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
