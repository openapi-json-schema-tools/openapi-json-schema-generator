petstore_api.components.schema.object_with_non_intersecting_values
# ObjectWithNonIntersectingValues

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectWithNonIntersectingValuesDictInput](#objectwithnonintersectingvaluesdictinput), [ObjectWithNonIntersectingValuesDict](#objectwithnonintersectingvaluesdict) | [ObjectWithNonIntersectingValuesDict](#objectwithnonintersectingvaluesdict) |

## ObjectWithNonIntersectingValuesDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            int,
            float
        ],
        str,
    ]
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | float, int |  | [optional]
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## ObjectWithNonIntersectingValuesDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**a** | float, int, schemas.Unset |  | [optional]
**kwargs** | str | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**a** | float, int, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjectWithNonIntersectingValuesDictInput](#objectwithnonintersectingvaluesdictinput), [ObjectWithNonIntersectingValuesDict](#objectwithnonintersectingvaluesdict) | [ObjectWithNonIntersectingValuesDict](#objectwithnonintersectingvaluesdict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
