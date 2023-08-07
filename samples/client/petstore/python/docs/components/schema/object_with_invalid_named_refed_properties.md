petstore_api.components.schema.object_with_invalid_named_refed_properties
# Schema ObjectWithInvalidNamedRefedProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ObjectWithInvalidNamedRefedPropertiesDictInput](#objectwithinvalidnamedrefedpropertiesdictinput) | [ObjectWithInvalidNamedRefedPropertiesDict](#objectwithinvalidnamedrefedpropertiesdict) |  |

## ObjectWithInvalidNamedRefedPropertiesDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**!reference** | [**ArrayWithValidationsInItems**](array_with_validations_in_items.md), list, tuple |  |
**from** | [**FromSchema**](from_schema.md), dict, schemas.immutabledict |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | any string name can be used but the value must be the correct type | [optional]

## ObjectWithInvalidNamedRefedPropertiesDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**!reference** | [**ArrayWithValidationsInItems**](array_with_validations_in_items.md), list, tuple | [**ArrayWithValidationsInItems**](array_with_validations_in_items.md) |  |
**from** | [**FromSchema**](from_schema.md), dict, schemas.immutabledict | [**FromSchema**](from_schema.md) |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
