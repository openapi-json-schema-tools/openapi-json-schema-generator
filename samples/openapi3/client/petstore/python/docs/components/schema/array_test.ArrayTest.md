petstore_api.components.schema.array_test
<a id="array_test"></a>
# ArrayTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**array_of_string** | [list, tuple, ](#array_testpropertiesarray_of_string) | [tuple, ](#array_testpropertiesarray_of_string) |  | [optional]
**array_array_of_integer** | [list, tuple, ](#array_testpropertiesarray_array_of_integer) | [tuple, ](#array_testpropertiesarray_array_of_integer) |  | [optional]
**array_array_of_model** | [list, tuple, ](#array_testpropertiesarray_array_of_model) | [tuple, ](#array_testpropertiesarray_array_of_model) |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

<a id="array_testpropertiesarray_of_string"></a>
# ArrayTest properties ArrayOfString

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  |

<a id="array_testpropertiesarray_of_stringpropertiesarray_array_of_integer"></a>
# ArrayTest properties ArrayOfString properties ArrayArrayOfInteger

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#array_testpropertiesarray_of_stringpropertiesarray_array_of_integeritems) | list, tuple,  | tuple,  |  |

<a id="array_testpropertiesarray_of_stringpropertiesarray_array_of_integeritems"></a>
# ArrayTest properties ArrayOfString properties ArrayArrayOfInteger Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

<a id="array_testpropertiesarray_of_stringpropertiesarray_array_of_integeritemspropertiesarray_array_of_model"></a>
# ArrayTest properties ArrayOfString properties ArrayArrayOfInteger Items properties ArrayArrayOfModel

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#array_testpropertiesarray_of_stringpropertiesarray_array_of_integeritemspropertiesarray_array_of_modelitems) | list, tuple,  | tuple,  |  |

<a id="array_testpropertiesarray_of_stringpropertiesarray_array_of_integeritemspropertiesarray_array_of_modelitems"></a>
# ArrayTest properties ArrayOfString properties ArrayArrayOfInteger Items properties ArrayArrayOfModel Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ReadOnlyFirst**](read_only_first.ReadOnlyFirst.md) | [**ReadOnlyFirst**](read_only_first.ReadOnlyFirst.md) | [**ReadOnlyFirst**](read_only_first.ReadOnlyFirst.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
