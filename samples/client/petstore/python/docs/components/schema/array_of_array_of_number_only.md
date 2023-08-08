petstore_api.components.schema.array_of_array_of_number_only
# Schema ArrayOfArrayOfNumberOnly

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayOfArrayOfNumberOnlyDictInput](#arrayofarrayofnumberonlydictinput), [ArrayOfArrayOfNumberOnlyDict](#arrayofarrayofnumberonlydict) | [ArrayOfArrayOfNumberOnlyDict](#arrayofarrayofnumberonlydict) |

## ArrayOfArrayOfNumberOnlyDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**ArrayArrayNumber** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ArrayOfArrayOfNumberOnlyDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ArrayArrayNumber** | list, tuple, schemas.Unset | [properties.ArrayArrayNumber](#properties-arrayarraynumber) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ArrayArrayNumber

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayArrayNumberTupleInput](#properties-arrayarraynumber-arrayarraynumbertupleinput), [ArrayArrayNumberTuple](#properties-arrayarraynumber-arrayarraynumbertuple) | [ArrayArrayNumberTuple](#properties-arrayarraynumber-arrayarraynumbertuple) |

## properties ArrayArrayNumber ArrayArrayNumberTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
[items](#properties-arrayarraynumber-items) | list, tuple |  |

## properties ArrayArrayNumber ArrayArrayNumberTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayarraynumber-items) | list, tuple | tuple |  |

# properties ArrayArrayNumber Items

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput](#properties-arrayarraynumber-items-itemstupleinput), [ItemsTuple](#properties-arrayarraynumber-items-itemstuple) | [ItemsTuple](#properties-arrayarraynumber-items-itemstuple) |

## properties ArrayArrayNumber Items ItemsTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
items | float, int |  |

## properties ArrayArrayNumber Items ItemsTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | float, int | float, int |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
