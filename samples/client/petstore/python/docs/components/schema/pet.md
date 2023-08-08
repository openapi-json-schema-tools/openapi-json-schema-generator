petstore_api.components.schema.pet
# Schema Pet

## Description
Pet object that needs to be added to the store

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PetDictInput](#petdictinput), [PetDict](#petdict) | [PetDict](#petdict) |

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
### from_dict_ method
Input Type | Return Type
---------- | -----------
[PetDictInput](#petdictinput), [PetDict](#petdict) | [PetDict](#petdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**name** | str |  |
**photoUrls** | list, tuple |  |
**id** | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**category** | [**Category**](category.md), dict, schemas.immutabledict, schemas.Unset |  | [optional]
**tags** | list, tuple, schemas.Unset |  | [optional]
**status** | str, schemas.Unset | pet status in the store | [optional] must be one of ["available", "pending", "sold"]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**name** | str |  |
**photoUrls** | [properties.PhotoUrls](#properties-photourls) |  |
**id** | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**category** | [**Category**](category.md) |  | [optional]
**tags** | [properties.Tags](#properties-tags) |  | [optional]
**status** | str, schemas.Unset | pet status in the store | [optional] must be one of ["available", "pending", "sold"]

# properties PhotoUrls

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PhotoUrlsTupleInput](#properties-photourls-photourlstupleinput), [PhotoUrlsTuple](#properties-photourls-photourlstuple) | [PhotoUrlsTuple](#properties-photourls-photourlstuple) |

## properties PhotoUrls PhotoUrlsTupleInput
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | str |  |

## properties PhotoUrls PhotoUrlsTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | str | str |  |

# properties Tags

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[TagsTupleInput](#properties-tags-tagstupleinput), [TagsTuple](#properties-tags-tagstuple) | [TagsTuple](#properties-tags-tagstuple) |

## properties Tags TagsTupleInput
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**Tag**](tag.md) |  |

## properties Tags TagsTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**Tag**](tag.md) | [**Tag**](tag.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
