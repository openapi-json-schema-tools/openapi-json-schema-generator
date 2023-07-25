petstore_api.components.schema.mixed_properties_and_additional_properties_class
# Schema MixedPropertiesAndAdditionalPropertiesClass

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**uuid** | str, uuid.UUID | str |  | [optional] value must be a uuid
**dateTime** | str, datetime.datetime | str |  | [optional] value must conform to RFC-3339 date-time
**map** | dict, schemas.immutabledict | [properties.Map](#properties-map) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

# properties Map

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | [**Animal**](animal.md), dict, schemas.immutabledict | [**Animal**](animal.md) | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
