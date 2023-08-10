# NullableShape
petstore_api.components.schema.nullable_shape
```
type: schemas.Schema
```

## Description
The value may be a shape or the &#x27;null&#x27; value. For a composed schema to validate a null payload, one of its chosen oneOf schemas must be type null or nullable (introduced in OAS schema &gt;&#x3D; 3.0)

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## oneOf
Schema Class | Input Type | Accessed Type | Description | Notes
------------ | ---------- | ------------- | ----------- | -----
[**triangle.Triangle**](triangle.md) | [**triangle.Triangle**](triangle.md) | [**triangle.Triangle**](triangle.md) |  |
[**quadrilateral.Quadrilateral**](quadrilateral.md) | [**quadrilateral.Quadrilateral**](quadrilateral.md) | [**quadrilateral.Quadrilateral**](quadrilateral.md) |  |
[_2](#_2) | None | None |  |

# _2
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None | None |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
