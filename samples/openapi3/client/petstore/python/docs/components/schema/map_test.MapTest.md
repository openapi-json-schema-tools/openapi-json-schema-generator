<a name="top"></a>
petstore_api.components.schema.map_test
# MapTest

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**map_map_of_string** | [dict, frozendict.frozendict, ](#map_map_of_string) | [frozendict.frozendict, ](#map_map_of_string) |  | [optional]
**map_of_enum_string** | [dict, frozendict.frozendict, ](#map_of_enum_string) | [frozendict.frozendict, ](#map_of_enum_string) |  | [optional]
**direct_map** | [dict, frozendict.frozendict, ](#direct_map) | [frozendict.frozendict, ](#direct_map) |  | [optional]
**indirect_map** | [**StringBooleanMap**](string_boolean_map.StringBooleanMap.md) | [**StringBooleanMap**](string_boolean_map.StringBooleanMap.md) |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

1. #### map_map_of_string
   
   4 Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
   
   4# Dictionary Keys
   Key | Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | ------------- | -------------
   **any_string_name** | dict, frozendict.frozendict,  | frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]
   
   1. 4## any_string_name
      
      6 Schema Type Info
      Input Type | Accessed Type | Description | Notes
      ------------ | ------------- | ------------- | -------------
      dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
      
      6# Dictionary Keys
      Key | Input Type | Accessed Type | Description | Notes
      ------------ | ------------- | ------------- | ------------- | -------------
      **any_string_name** | str,  | str,  | any string name can be used but the value must be the correct type | [optional]

1. #### map_of_enum_string
   
   4 Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
   
   4# Dictionary Keys
   Key | Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | ------------- | -------------
   **any_string_name** | str,  | str,  | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower", ]

1. #### direct_map
   
   4 Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
   
   4# Dictionary Keys
   Key | Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | ------------- | -------------
   **any_string_name** | bool,  | BoolClass,  | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
