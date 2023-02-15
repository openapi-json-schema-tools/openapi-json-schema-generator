<a name="top"></a>
petstore_api.components.schema.object_with_inline_composition_property
# ObjectWithInlineCompositionProperty

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**someProp** | [dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ](#someProp) | [frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO](#someProp) |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

1. #### someProp
   
   4 Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |
   
   4 Composed Schemas (allOf/anyOf/oneOf/not)
   4 allOf
   Class Name | Input Type | Accessed Type | Description | Notes
   ------------- | ------------- | ------------- | ------------- | -------------
   [_0](#_0) | str,  | str,  |  |
   
   1. 4 _0
      
      6 Schema Type Info
      Input Type | Accessed Type | Description | Notes
      ------------ | ------------- | ------------- | -------------
      str,  | str,  |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
