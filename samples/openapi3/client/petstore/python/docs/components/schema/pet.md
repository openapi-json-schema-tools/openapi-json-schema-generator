petstore_api.components.schema.pet
# Schema Pet

## Description
Pet object that needs to be added to the store

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict | Pet object that needs to be added to the store |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str | str |  |
**photoUrls** | list, tuple | [properties.PhotoUrls](#properties-photourls) |  |
**id** | int | int |  | [optional] value must be a 64 bit integer
**category** | [**Category**](category.md), dict, immutabledict.immutabledict | [**Category**](category.md) |  | [optional]
**tags** | list, tuple | [properties.Tags](#properties-tags) |  | [optional]
**status** | str | str | pet status in the store | [optional] must be one of ["available", "pending", "sold"]
**any_string_name** | dict, immutabledict.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | immutabledict.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

# properties PhotoUrls

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  |

# properties Tags

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Tag**](tag.md) | [**Tag**](tag.md) | [**Tag**](tag.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
