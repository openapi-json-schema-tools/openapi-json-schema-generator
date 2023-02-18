petstore_api.components.schema.nullable_class
# NullableClass

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**integer_prop** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  |  | [optional]
**number_prop** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  |  | [optional]
**boolean_prop** | None, bool,  | NoneClass, BoolClass,  |  | [optional]
**string_prop** | None, str,  | NoneClass, str,  |  | [optional]
**date_prop** | None, str, datetime.date,  | NoneClass, str,  |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | None, str, datetime.datetime,  | NoneClass, str,  |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | [None, list, tuple, ](#propertiesarray_nullable_prop) | [NoneClass, tuple, ](#propertiesarray_nullable_prop) |  | [optional]
**array_and_items_nullable_prop** | [None, list, tuple, ](#propertiesarray_and_items_nullable_prop) | [NoneClass, tuple, ](#propertiesarray_and_items_nullable_prop) |  | [optional]
**array_items_nullable** | [list, tuple, ](#propertiesarray_items_nullable) | [tuple, ](#propertiesarray_items_nullable) |  | [optional]
**object_nullable_prop** | [None, dict, frozendict.frozendict, ](#propertiesobject_nullable_prop) | [NoneClass, frozendict.frozendict, ](#propertiesobject_nullable_prop) |  | [optional]
**object_and_items_nullable_prop** | [None, dict, frozendict.frozendict, ](#propertiesobject_and_items_nullable_prop) | [NoneClass, frozendict.frozendict, ](#propertiesobject_and_items_nullable_prop) |  | [optional]
**object_items_nullable** | [dict, frozendict.frozendict, ](#propertiesobject_items_nullable) | [frozendict.frozendict, ](#propertiesobject_items_nullable) |  | [optional]
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

# <a id="propertiesarray_nullable_prop">ArrayNullableProp</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, list, tuple,  | NoneClass, tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#propertiesarray_nullable_propitems) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# <a id="propertiesarray_nullable_propitems">Items</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# <a id="propertiesarray_and_items_nullable_prop">ArrayAndItemsNullableProp</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, list, tuple,  | NoneClass, tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#propertiesarray_and_items_nullable_propitems) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# <a id="propertiesarray_and_items_nullable_propitems">Items</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# <a id="propertiesarray_items_nullable">ArrayItemsNullable</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#propertiesarray_items_nullableitems) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# <a id="propertiesarray_items_nullableitems">Items</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# <a id="propertiesobject_nullable_prop">ObjectNullableProp</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | dict, frozendict.frozendict,  | frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

# <a id="propertiesobject_nullable_propadditional_properties">AdditionalProperties</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# <a id="propertiesobject_and_items_nullable_prop">ObjectAndItemsNullableProp</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

# <a id="propertiesobject_and_items_nullable_propadditional_properties">AdditionalProperties</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# <a id="propertiesobject_items_nullable">ObjectItemsNullable</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

# <a id="propertiesobject_items_nullableadditional_properties">AdditionalProperties</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# <a id="additional_properties">AdditionalProperties</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
