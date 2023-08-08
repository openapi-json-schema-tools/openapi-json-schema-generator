petstore_api.components.schema.scalene_triangle
# Schema ScaleneTriangle

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**TriangleInterface**](triangle_interface.md) | [**TriangleInterface**](triangle_interface.md) | [**TriangleInterface**](triangle_interface.md) |  |
[_1](#allof-_1) | dict, schemas.immutabledict | schemas.immutabledict |  |

# allof _1

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_1DictInput](#allof-_1-_1dictinput), [_1Dict](#allof-_1-_1dict) | [_1Dict](#allof-_1-_1dict) |

## allof _1 _1DictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**triangleType** | str |  | [optional] must be one of ["ScaleneTriangle"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## allof _1 _1Dict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[_1DictInput](#allof-_1-_1dictinput), [_1Dict](#allof-_1-_1dict) | [_1Dict](#allof-_1-_1dict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**triangleType** | str, schemas.Unset |  | [optional] must be one of ["ScaleneTriangle"]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**triangleType** | str, schemas.Unset |  | [optional] must be one of ["ScaleneTriangle"]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
