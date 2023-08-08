petstore_api.components.schema.user
# Schema User

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[UserDictInput](#userdictinput) | [UserDict](#userdict) |

## UserDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | int |  | [optional] value must be a 64 bit integer
**username** | str |  | [optional]
**firstName** | str |  | [optional]
**lastName** | str |  | [optional]
**email** | str |  | [optional]
**password** | str |  | [optional]
**phone** | str |  | [optional]
**userStatus** | int | User Status | [optional] value must be a 32 bit integer
**objectWithNoDeclaredProps** | dict, schemas.immutabledict | test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value. | [optional]
**objectWithNoDeclaredPropsNullable** | None, dict, schemas.immutabledict | test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value. | [optional]
**anyTypeProp** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389 | [optional]
**anyTypeExceptNullProp** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. | [optional]
**anyTypePropNullable** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#x27;nullable&#x27; attribute does not change the allowed values. | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## UserDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**username** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**firstName** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**lastName** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**email** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**password** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**phone** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**userStatus** | int, schemas.Unset | int, schemas.Unset | User Status | [optional] value must be a 32 bit integer
**objectWithNoDeclaredProps** | dict, schemas.immutabledict, schemas.Unset | [properties.ObjectWithNoDeclaredProps](#properties-objectwithnodeclaredprops) | test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value. | [optional]
**objectWithNoDeclaredPropsNullable** | None, dict, schemas.immutabledict, schemas.Unset | [properties.ObjectWithNoDeclaredPropsNullable](#properties-objectwithnodeclaredpropsnullable) | test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value. | [optional]
**anyTypeProp** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389 | [optional]
**anyTypeExceptNullProp** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset | [properties.AnyTypeExceptNullProp](#properties-anytypeexceptnullprop) | any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. | [optional]
**anyTypePropNullable** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#x27;nullable&#x27; attribute does not change the allowed values. | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ObjectWithNoDeclaredProps

## Description
test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value.

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# properties ObjectWithNoDeclaredPropsNullable

## Description
test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value.

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

# properties AnyTypeExceptNullProp

## Description
any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object.

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## not
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_not](#properties-anytypeexceptnullprop-_not) | None | None |  |

# properties AnyTypeExceptNullProp _Not

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None | None |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
