<a name="top"></a>
petstore_api.components.schema.pet
# Pet

## description
Pet object that needs to be added to the store

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Pet object that needs to be added to the store |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,  |  |
**photoUrls** | [list, tuple, ](#photoUrls) | [tuple, ](#photoUrls) |  |
**id** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] value must be a 64 bit integer
**category** | [**Category**](category.Category.md) | [**Category**](category.Category.md) |  | [optional]
**tags** | [list, tuple, ](#tags) | [tuple, ](#tags) |  | [optional]
**status** | str,  | str,  | pet status in the store | [optional] must be one of ["available", "pending", "sold", ]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

1. #### photoUrls
   
   #### Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   list, tuple,  | tuple,  |  |
   
   ##### Tuple Items
   Class Name | Input Type | Accessed Type | Description | Notes
   ------------- | ------------- | ------------- | ------------- | -------------
   items | str,  | str,  |  |

1. #### tags
   
   #### Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   list, tuple,  | tuple,  |  |
   
   ##### Tuple Items
   Class Name | Input Type | Accessed Type | Description | Notes
   ------------- | ------------- | ------------- | ------------- | -------------
   [**Tag**](tag.Tag.md) | [**Tag**](tag.Tag.md) | [**Tag**](tag.Tag.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
