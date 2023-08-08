petstore_api.components.schema.array_of_number_only
# Schema ArrayOfNumberOnly

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ArrayOfNumberOnlyDictInput](#arrayofnumberonlydictinput) | [ArrayOfNumberOnlyDict](#arrayofnumberonlydict) |  |

## ArrayOfNumberOnlyDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**ArrayNumber** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ArrayOfNumberOnlyDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ArrayNumber** | list, tuple, schemas.Unset | [properties.ArrayNumber](#properties-arraynumber) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ArrayNumber

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ArrayNumberTupleInput](#properties-arraynumber-arraynumbertupleinput) | [ArrayNumberTuple](#properties-arraynumber-arraynumbertuple) |  |

## properties ArrayNumber ArrayNumberTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
items | float, int |  |

## properties ArrayNumber ArrayNumberTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | float, int | float, int |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
