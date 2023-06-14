petstore_api.components.schema.nullable_shape
# Schema NullableShape

## Description
The value may be a shape or the &#x27;null&#x27; value. For a composed schema to validate a null payload, one of its chosen oneOf schemas must be type null or nullable (introduced in OAS schema &gt;&#x3D; 3.0)

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | immutabledict.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | The value may be a shape or the &#x27;null&#x27; value. For a composed schema to validate a null payload, one of its chosen oneOf schemas must be type null or nullable (introduced in OAS schema &gt;&#x3D; 3.0) |

## Composed Schemas (allOf/anyOf/oneOf/not)
## oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Triangle**](triangle.md) | [**Triangle**](triangle.md) | [**Triangle**](triangle.md) |  |
[**Quadrilateral**](quadrilateral.md) | [**Quadrilateral**](quadrilateral.md) | [**Quadrilateral**](quadrilateral.md) |  |
[_2](#oneof-_2) | None | None |  |

# oneof _2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None | None |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
