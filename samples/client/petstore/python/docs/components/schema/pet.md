petstore_api.components.schema.pet
# Schema Pet

## Description
Pet object that needs to be added to the store

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[PetDictInput](#petdictinput) | [PetDict](#petdict) | Pet object that needs to be added to the store |

## PetDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | str |  |
**photoUrls** | list, tuple |  |
**id** | int |  | [optional] value must be a 64 bit integer
**category** | [**Category**](category.md), dict, schemas.immutabledict |  | [optional]
**tags** | list, tuple |  | [optional]
**status** | str | pet status in the store | [optional] must be one of ["available", "pending", "sold"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## PetDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str | str |  |
**photoUrls** | list, tuple | [properties.PhotoUrls](#properties-photourls) |  |
**id** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**category** | [**Category**](category.md), dict, schemas.immutabledict, schemas.Unset | [**Category**](category.md) |  | [optional]
**tags** | list, tuple, schemas.Unset | [properties.Tags](#properties-tags) |  | [optional]
**status** | str, schemas.Unset | str, schemas.Unset | pet status in the store | [optional] must be one of ["available", "pending", "sold"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties PhotoUrls

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## properties PhotoUrls PhotoUrlsTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
items | str |  |

## properties PhotoUrls PhotoUrlsTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  |

# properties Tags

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## properties Tags TagsTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
[**Tag**](tag.md) | [**Tag**](tag.md) |  |

## properties Tags TagsTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Tag**](tag.md) | [**Tag**](tag.md) | [**Tag**](tag.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
