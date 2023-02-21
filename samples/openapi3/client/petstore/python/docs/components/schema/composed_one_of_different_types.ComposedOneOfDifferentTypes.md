petstore_api.components.schema.composed_one_of_different_types
[]

# ComposedOneOfDifferentTypes

## Description
this is a model that allows payloads of type object or number

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO | this is a model that allows payloads of type object or number |

## Composed Schemas (allOf/anyOf/oneOf/not)
## oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**NumberWithValidations**](number_with_validations.NumberWithValidations.md) | [**NumberWithValidations**](number_with_validations.NumberWithValidations.md) | [**NumberWithValidations**](number_with_validations.NumberWithValidations.md) |  |
[**Animal**](animal.Animal.md) | [**Animal**](animal.Animal.md) | [**Animal**](animal.Animal.md) |  |
[_2](#oneOf_2) | None,  | NoneClass,  |  |
[_3](#oneOf_3) | str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_4](#oneOf_4) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_5](#oneOf_5) | list, tuple,  | tuple,  |  |
[_6](#oneOf_6) | str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

[oneOf, org.openapijsonschematools.codegen.model.CodegenKey@386c04]
<a id="oneOf_2"></a>
# _2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

[oneOf, org.openapijsonschematools.codegen.model.CodegenKey@386c04, oneOf, org.openapijsonschematools.codegen.model.CodegenKey@38e083]
<a id="oneOf_3"></a>
# _3

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

[oneOf, org.openapijsonschematools.codegen.model.CodegenKey@386c04, oneOf, org.openapijsonschematools.codegen.model.CodegenKey@38e083, oneOf, org.openapijsonschematools.codegen.model.CodegenKey@395502]
<a id="oneOf_4"></a>
# _4

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

[oneOf, org.openapijsonschematools.codegen.model.CodegenKey@386c04, oneOf, org.openapijsonschematools.codegen.model.CodegenKey@38e083, oneOf, org.openapijsonschematools.codegen.model.CodegenKey@395502, oneOf, org.openapijsonschematools.codegen.model.CodegenKey@39c981]
<a id="oneOf_5"></a>
# _5

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

[oneOf, org.openapijsonschematools.codegen.model.CodegenKey@386c04, oneOf, org.openapijsonschematools.codegen.model.CodegenKey@38e083, oneOf, org.openapijsonschematools.codegen.model.CodegenKey@395502, oneOf, org.openapijsonschematools.codegen.model.CodegenKey@39c981, oneOf, org.openapijsonschematools.codegen.model.CodegenKey@3a3e00]
<a id="oneOf_6"></a>
# _6

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
