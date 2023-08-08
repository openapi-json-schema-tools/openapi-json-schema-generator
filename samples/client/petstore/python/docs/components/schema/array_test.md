petstore_api.components.schema.array_test
# Schema ArrayTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ArrayTestDictInput](#arraytestdictinput) | [ArrayTestDict](#arraytestdict) |  |

## ArrayTestDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**array_of_string** | list, tuple |  | [optional]
**array_array_of_integer** | list, tuple |  | [optional]
**array_array_of_model** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ArrayTestDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**array_of_string** | list, tuple, schemas.Unset | [properties.ArrayOfString](#properties-arrayofstring) |  | [optional]
**array_array_of_integer** | list, tuple, schemas.Unset | [properties.ArrayArrayOfInteger](#properties-arrayarrayofinteger) |  | [optional]
**array_array_of_model** | list, tuple, schemas.Unset | [properties.ArrayArrayOfModel](#properties-arrayarrayofmodel) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ArrayOfString

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ArrayOfStringTupleInput](#properties-arrayofstring-arrayofstringtupleinput) | tuple |  |

## properties ArrayOfString ArrayOfStringTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
items | str |  |

## properties ArrayOfString ArrayOfStringTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  |

# properties ArrayArrayOfInteger

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ArrayArrayOfIntegerTupleInput](#properties-arrayarrayofinteger-arrayarrayofintegertupleinput) | tuple |  |

## properties ArrayArrayOfInteger ArrayArrayOfIntegerTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
[items](#properties-arrayarrayofinteger-items2) | list, tuple |  |

## properties ArrayArrayOfInteger ArrayArrayOfIntegerTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayarrayofinteger-items2) | list, tuple | tuple |  |

# properties ArrayArrayOfInteger Items2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ItemsTupleInput](#properties-arrayarrayofinteger-items2-itemstupleinput) | tuple |  |

## properties ArrayArrayOfInteger Items2 ItemsTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
items | int |  | value must be a 64 bit integer

## properties ArrayArrayOfInteger Items2 ItemsTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | int | int |  | value must be a 64 bit integer

# properties ArrayArrayOfModel

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ArrayArrayOfModelTupleInput](#properties-arrayarrayofmodel-arrayarrayofmodeltupleinput) | tuple |  |

## properties ArrayArrayOfModel ArrayArrayOfModelTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
[items](#properties-arrayarrayofmodel-items4) | list, tuple |  |

## properties ArrayArrayOfModel ArrayArrayOfModelTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayarrayofmodel-items4) | list, tuple | tuple |  |

# properties ArrayArrayOfModel Items4

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ItemsTupleInput2](#properties-arrayarrayofmodel-items4-itemstupleinput2) | tuple |  |

## properties ArrayArrayOfModel Items4 ItemsTupleInput2
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
[**ReadOnlyFirst**](read_only_first.md) | [**ReadOnlyFirst**](read_only_first.md) |  |

## properties ArrayArrayOfModel Items4 ItemsTuple2
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ReadOnlyFirst**](read_only_first.md) | [**ReadOnlyFirst**](read_only_first.md) | [**ReadOnlyFirst**](read_only_first.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
