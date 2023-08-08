petstore_api.components.schema.array_of_number_only
# Schema ArrayOfNumberOnly

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayOfNumberOnlyDictInput](#arrayofnumberonlydictinput), [ArrayOfNumberOnlyDict](#arrayofnumberonlydict) | [ArrayOfNumberOnlyDict](#arrayofnumberonlydict) |

## ArrayOfNumberOnlyDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**ArrayNumber** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ArrayOfNumberOnlyDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[ArrayOfNumberOnlyDictInput](#arrayofnumberonlydictinput), [ArrayOfNumberOnlyDict](#arrayofnumberonlydict) | [ArrayOfNumberOnlyDict](#arrayofnumberonlydict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ArrayNumber** | list, tuple, schemas.Unset | [properties.ArrayNumber](#properties-arraynumber) |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ArrayNumber

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayNumberTupleInput](#properties-arraynumber-arraynumbertupleinput), [ArrayNumberTuple](#properties-arraynumber-arraynumbertuple) | [ArrayNumberTuple](#properties-arraynumber-arraynumbertuple) |

## properties ArrayNumber ArrayNumberTupleInput
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | float, int |  |

## properties ArrayNumber ArrayNumberTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | float, int | float, int |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
