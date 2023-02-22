petstore_api.components.schema.user
# User

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | decimal.Decimal, int,  | decimal.Decimal,   | [optional] value must be a 64 bit integer
**username** | str,  | str,   | [optional]
**firstName** | str,  | str,   | [optional]
**lastName** | str,  | str,   | [optional]
**email** | str,  | str,   | [optional]
**password** | str,  | str,   | [optional]
**phone** | str,  | str,   | [optional]
**userStatus** | decimal.Decimal, int,  | decimal.Decimal,  User Status | [optional] value must be a 32 bit integer
[**objectWithNoDeclaredProps**](#user-properties-objectwithnodeclaredprops) | dict, frozendict.frozendict,  | frozendict.frozendict,  test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value. | [optional]
[**objectWithNoDeclaredPropsNullable**](#user-properties-objectwithnodeclaredpropsnullable) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value. | [optional]
**anyTypeProp** | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389 | [optional]
[**anyTypeExceptNullProp**](#user-properties-anytypeexceptnullprop) | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. | [optional]
**anyTypePropNullable** | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#x27;nullable&#x27; attribute does not change the allowed values. | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

# User properties ObjectWithNoDeclaredProps

## Description
test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value.

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value. |

# User properties ObjectWithNoDeclaredPropsNullable

## Description
test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value.

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value. |

# User properties AnyTypeExceptNullProp

## Description
any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object.

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO | any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. |

## Composed Schemas (allOf/anyOf/oneOf/not)
## not
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_not](#user-properties-anytypeexceptnullprop-_not) | None,  | NoneClass,  |  |

# User properties AnyTypeExceptNullProp _Not

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
