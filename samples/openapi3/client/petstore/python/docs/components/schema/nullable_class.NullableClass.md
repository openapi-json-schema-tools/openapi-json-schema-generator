petstore_api.components.schema.nullable_class
<a id="nullable_class"></a>
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
**array_nullable_prop** | [None, list, tuple, ](#nullable_classpropertiesarray_nullable_prop) | [NoneClass, tuple, ](#nullable_classpropertiesarray_nullable_prop) |  | [optional]
**array_and_items_nullable_prop** | [None, list, tuple, ](#nullable_classpropertiesarray_and_items_nullable_prop) | [NoneClass, tuple, ](#nullable_classpropertiesarray_and_items_nullable_prop) |  | [optional]
**array_items_nullable** | [list, tuple, ](#nullable_classpropertiesarray_items_nullable) | [tuple, ](#nullable_classpropertiesarray_items_nullable) |  | [optional]
**object_nullable_prop** | [None, dict, frozendict.frozendict, ](#nullable_classpropertiesobject_nullable_prop) | [NoneClass, frozendict.frozendict, ](#nullable_classpropertiesobject_nullable_prop) |  | [optional]
**object_and_items_nullable_prop** | [None, dict, frozendict.frozendict, ](#nullable_classpropertiesobject_and_items_nullable_prop) | [NoneClass, frozendict.frozendict, ](#nullable_classpropertiesobject_and_items_nullable_prop) |  | [optional]
**object_items_nullable** | [dict, frozendict.frozendict, ](#nullable_classpropertiesobject_items_nullable) | [frozendict.frozendict, ](#nullable_classpropertiesobject_items_nullable) |  | [optional]
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

<a id="nullable_classpropertiesarray_nullable_prop"></a>
# NullableClass properties ArrayNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, list, tuple,  | NoneClass, tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#nullable_classpropertiesarray_nullable_propitems) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

<a id="nullable_classpropertiesarray_nullable_propitems"></a>
# NullableClass properties ArrayNullableProp Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_prop"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, list, tuple,  | NoneClass, tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitems) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitems"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitemspropertiesarray_items_nullable"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitemspropertiesarray_items_nullableitems) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitemspropertiesarray_items_nullableitems"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitemspropertiesarray_items_nullableitemspropertiesobject_nullable_prop"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | dict, frozendict.frozendict,  | frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitemspropertiesarray_items_nullableitemspropertiesobject_nullable_propadditional_properties"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitemspropertiesarray_items_nullableitemspropertiesobject_nullable_propadditional_propertiespropertiesobject_and_items_nullable_prop"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties properties ObjectAndItemsNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitemspropertiesarray_items_nullableitemspropertiesobject_nullable_propadditional_propertiespropertiesobject_and_items_nullable_propadditional_properties"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties properties ObjectAndItemsNullableProp AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitemspropertiesarray_items_nullableitemspropertiesobject_nullable_propadditional_propertiespropertiesobject_and_items_nullable_propadditional_propertiespropertiesobject_items_nullable"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties properties ObjectAndItemsNullableProp AdditionalProperties properties ObjectItemsNullable

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitemspropertiesarray_items_nullableitemspropertiesobject_nullable_propadditional_propertiespropertiesobject_and_items_nullable_propadditional_propertiespropertiesobject_items_nullableadditional_properties"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties properties ObjectAndItemsNullableProp AdditionalProperties properties ObjectItemsNullable AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullable_classpropertiesarray_nullable_propitemspropertiesarray_and_items_nullable_propitemspropertiesarray_items_nullableitemspropertiesobject_nullable_propadditional_propertiespropertiesobject_and_items_nullable_propadditional_propertiespropertiesobject_items_nullableadditional_propertiesadditional_properties"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties properties ObjectAndItemsNullableProp AdditionalProperties properties ObjectItemsNullable AdditionalProperties AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
