petstore_api.components.schema.user
# Schema User

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | int | int |  | [optional] value must be a 64 bit integer
**username** | str | str |  | [optional]
**firstName** | str | str |  | [optional]
**lastName** | str | str |  | [optional]
**email** | str | str |  | [optional]
**password** | str | str |  | [optional]
**phone** | str | str |  | [optional]
**userStatus** | int | int | User Status | [optional] value must be a 32 bit integer
**objectWithNoDeclaredProps** | dict, schemas.immutabledict | [properties.ObjectWithNoDeclaredProps](#properties-objectwithnodeclaredprops) | test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value. | [optional]
**objectWithNoDeclaredPropsNullable** | None, dict, schemas.immutabledict | [properties.ObjectWithNoDeclaredPropsNullable](#properties-objectwithnodeclaredpropsnullable) | test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value. | [optional]
**anyTypeProp** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389 | [optional]
**anyTypeExceptNullProp** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [properties.AnyTypeExceptNullProp](#properties-anytypeexceptnullprop) | any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. | [optional]
**anyTypePropNullable** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | test code generation for any type Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#x27;nullable&#x27; attribute does not change the allowed values. | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

# properties ObjectWithNoDeclaredProps

## Description
test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value.

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict | test code generation for objects Value must be a map of strings to values. It cannot be the &#x27;null&#x27; value. |

# properties ObjectWithNoDeclaredPropsNullable

## Description
test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value.

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict | test code generation for nullable objects. Value must be a map of strings to values or the &#x27;null&#x27; value. |

# properties AnyTypeExceptNullProp

## Description
any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object.

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | any type except &#x27;null&#x27; Here the &#x27;type&#x27; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. |

## Composed Schemas (allOf/anyOf/oneOf/not)
## not
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_not](#properties-anytypeexceptnullprop-_not) | None | None |  |

# properties AnyTypeExceptNullProp _Not

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None | None |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
