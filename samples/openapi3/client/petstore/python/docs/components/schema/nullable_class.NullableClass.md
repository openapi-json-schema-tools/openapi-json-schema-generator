petstore_api.components.schema.nullable_class
<a id="nullableclass"></a>
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
**array_nullable_prop** | [None, list, tuple, ](#nullableclass-properties-arraynullableprop) | [NoneClass, tuple, ](#nullableclass-properties-arraynullableprop) |  | [optional]
**array_and_items_nullable_prop** | [None, list, tuple, ](#nullableclass-properties-arrayanditemsnullableprop) | [NoneClass, tuple, ](#nullableclass-properties-arrayanditemsnullableprop) |  | [optional]
**array_items_nullable** | [list, tuple, ](#nullableclass-properties-arrayitemsnullable) | [tuple, ](#nullableclass-properties-arrayitemsnullable) |  | [optional]
**object_nullable_prop** | [None, dict, frozendict.frozendict, ](#nullableclass-properties-objectnullableprop) | [NoneClass, frozendict.frozendict, ](#nullableclass-properties-objectnullableprop) |  | [optional]
**object_and_items_nullable_prop** | [None, dict, frozendict.frozendict, ](#nullableclass-properties-objectanditemsnullableprop) | [NoneClass, frozendict.frozendict, ](#nullableclass-properties-objectanditemsnullableprop) |  | [optional]
**object_items_nullable** | [dict, frozendict.frozendict, ](#nullableclass-properties-objectitemsnullable) | [frozendict.frozendict, ](#nullableclass-properties-objectitemsnullable) |  | [optional]
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

<a id="nullableclass-properties-arraynullableprop"></a>
# NullableClass properties ArrayNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, list, tuple,  | NoneClass, tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#nullableclass-properties-arraynullableprop-items) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

<a id="nullableclass-properties-arraynullableprop-items"></a>
# NullableClass properties ArrayNullableProp Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, list, tuple,  | NoneClass, tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items-properties-arrayitemsnullable"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items-properties-arrayitemsnullable-items) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items-properties-arrayitemsnullable-items"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items-properties-arrayitemsnullable-items-properties-objectnullableprop"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | dict, frozendict.frozendict,  | frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items-properties-arrayitemsnullable-items-properties-objectnullableprop-additionalproperties"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items-properties-arrayitemsnullable-items-properties-objectnullableprop-additionalproperties-properties-objectanditemsnullableprop"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties properties ObjectAndItemsNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items-properties-arrayitemsnullable-items-properties-objectnullableprop-additionalproperties-properties-objectanditemsnullableprop-additionalproperties"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties properties ObjectAndItemsNullableProp AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items-properties-arrayitemsnullable-items-properties-objectnullableprop-additionalproperties-properties-objectanditemsnullableprop-additionalproperties-properties-objectitemsnullable"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties properties ObjectAndItemsNullableProp AdditionalProperties properties ObjectItemsNullable

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items-properties-arrayitemsnullable-items-properties-objectnullableprop-additionalproperties-properties-objectanditemsnullableprop-additionalproperties-properties-objectitemsnullable-additionalproperties"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties properties ObjectAndItemsNullableProp AdditionalProperties properties ObjectItemsNullable AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

<a id="nullableclass-properties-arraynullableprop-items-properties-arrayanditemsnullableprop-items-properties-arrayitemsnullable-items-properties-objectnullableprop-additionalproperties-properties-objectanditemsnullableprop-additionalproperties-properties-objectitemsnullable-additionalproperties-additionalproperties"></a>
# NullableClass properties ArrayNullableProp Items properties ArrayAndItemsNullableProp Items properties ArrayItemsNullable Items properties ObjectNullableProp AdditionalProperties properties ObjectAndItemsNullableProp AdditionalProperties properties ObjectItemsNullable AdditionalProperties AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
