# ObjectWithInvalidNamedRefedProperties
petstore_api.components.schema.object_with_invalid_named_refed_properties

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectWithInvalidNamedRefedPropertiesDictInput](#objectwithinvalidnamedrefedpropertiesdictinput), [ObjectWithInvalidNamedRefedPropertiesDict](#objectwithinvalidnamedrefedpropertiesdict) | [ObjectWithInvalidNamedRefedPropertiesDict](#objectwithinvalidnamedrefedpropertiesdict) |

## ObjectWithInvalidNamedRefedPropertiesDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**!reference** | [**ArrayWithValidationsInItems**](array_with_validations_in_items.md), list, tuple |  |
**from** | [**FromSchema**](from_schema.md), dict, schemas.immutabledict |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjectWithInvalidNamedRefedPropertiesDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjectWithInvalidNamedRefedPropertiesDictInput](#objectwithinvalidnamedrefedpropertiesdictinput), [ObjectWithInvalidNamedRefedPropertiesDict](#objectwithinvalidnamedrefedpropertiesdict) | [ObjectWithInvalidNamedRefedPropertiesDict](#objectwithinvalidnamedrefedpropertiesdict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.OUTPUT_BASE_TYPES | This model has invalid python names so this method is used under the hood when you access instance["!reference"], instance["from"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
