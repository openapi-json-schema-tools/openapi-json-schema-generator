petstore_api.components.schema.mixed_properties_and_additional_properties_class
# MixedPropertiesAndAdditionalPropertiesClass

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**uuid** | str, uuid.UUID,  | str,  |  | [optional] value must be a uuid
**dateTime** | str, datetime.datetime,  | str,  |  | [optional] value must conform to RFC-3339 date-time
**map** | [dict, frozendict.frozendict, ](#propertiesmap) | [frozendict.frozendict, ](#propertiesmap) |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

# MixedPropertiesAndAdditionalPropertiesClass properties Map

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | [**Animal**](animal.Animal.md) | [**Animal**](animal.Animal.md) | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
