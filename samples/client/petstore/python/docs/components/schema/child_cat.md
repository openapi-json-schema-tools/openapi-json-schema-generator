petstore_api.components.schema.child_cat
# Schema ChildCat

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ParentPet**](parent_pet.md) | [**ParentPet**](parent_pet.md) | [**ParentPet**](parent_pet.md) |  |
[_1](#allof-_1) | dict, schemas.immutabledict | schemas.immutabledict |  |

# allof _1

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_1DictInput](#allof-_1-_1dictinput), [_1Dict](#allof-_1-_1dict) | [_1Dict](#allof-_1-_1dict) |

## allof _1 _1DictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## allof _1 _1Dict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
