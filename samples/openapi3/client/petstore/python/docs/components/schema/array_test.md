petstore_api.components.schema.array_test
# Schema ArrayTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**array_of_string** | list, tuple | [properties.ArrayOfString](#properties-arrayofstring) |  | [optional]
**array_array_of_integer** | list, tuple | [properties.ArrayArrayOfInteger](#properties-arrayarrayofinteger) |  | [optional]
**array_array_of_model** | list, tuple | [properties.ArrayArrayOfModel](#properties-arrayarrayofmodel) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

# properties ArrayOfString

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  |

# properties ArrayArrayOfInteger

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayarrayofinteger-items2) | list, tuple | tuple |  |

# properties ArrayArrayOfInteger Items2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | int | int |  | value must be a 64 bit integer

# properties ArrayArrayOfModel

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayarrayofmodel-items4) | list, tuple | tuple |  |

# properties ArrayArrayOfModel Items4

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ReadOnlyFirst**](read_only_first.md) | [**ReadOnlyFirst**](read_only_first.md) | [**ReadOnlyFirst**](read_only_first.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
