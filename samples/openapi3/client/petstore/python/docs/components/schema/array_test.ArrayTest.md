petstore_api.components.schema.array_test
[]

# ArrayTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**array_of_string** | [list, tuple, ](#propertiesarray_of_string) | [tuple, ](#propertiesarray_of_string) |  | [optional]
**array_array_of_integer** | [list, tuple, ](#propertiesarray_array_of_integer) | [tuple, ](#propertiesarray_array_of_integer) |  | [optional]
**array_array_of_model** | [list, tuple, ](#propertiesarray_array_of_model) | [tuple, ](#propertiesarray_array_of_model) |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

[properties, org.openapijsonschematools.codegen.model.CodegenKey@8447620b]
<a id="propertiesarray_of_string"></a>
# ArrayOfString

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  |

[properties, org.openapijsonschematools.codegen.model.CodegenKey@8447620b, properties, org.openapijsonschematools.codegen.model.CodegenKey@edf975f3]
<a id="propertiesarray_array_of_integer"></a>
# ArrayArrayOfInteger

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#propertiesarray_array_of_integeritems) | list, tuple,  | tuple,  |  |

[properties, org.openapijsonschematools.codegen.model.CodegenKey@8447620b, properties, org.openapijsonschematools.codegen.model.CodegenKey@edf975f3, org.openapijsonschematools.codegen.model.CodegenKey@4562cb0]
<a id="propertiesarray_array_of_integeritems"></a>
# Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

[properties, org.openapijsonschematools.codegen.model.CodegenKey@8447620b, properties, org.openapijsonschematools.codegen.model.CodegenKey@edf975f3, org.openapijsonschematools.codegen.model.CodegenKey@4562cb0, properties, org.openapijsonschematools.codegen.model.CodegenKey@c95ae1c8]
<a id="propertiesarray_array_of_model"></a>
# ArrayArrayOfModel

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#propertiesarray_array_of_modelitems) | list, tuple,  | tuple,  |  |

[properties, org.openapijsonschematools.codegen.model.CodegenKey@8447620b, properties, org.openapijsonschematools.codegen.model.CodegenKey@edf975f3, org.openapijsonschematools.codegen.model.CodegenKey@4562cb0, properties, org.openapijsonschematools.codegen.model.CodegenKey@c95ae1c8, org.openapijsonschematools.codegen.model.CodegenKey@4562cb0]
<a id="propertiesarray_array_of_modelitems"></a>
# Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ReadOnlyFirst**](read_only_first.ReadOnlyFirst.md) | [**ReadOnlyFirst**](read_only_first.ReadOnlyFirst.md) | [**ReadOnlyFirst**](read_only_first.ReadOnlyFirst.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
