petstore_api.components.schema.composed_any_of_different_types_no_validations
# ComposedAnyOfDifferentTypesNoValidations

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

## Composed Schemas (allOf/anyOf/oneOf/not)
## anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_0](#anyOf_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_1](#anyOf_1) | str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_2](#anyOf_2) | str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time
[_3](#anyOf_3) | bytes, io.FileIO, io.BufferedReader,  | bytes, io.FileIO,  |  |
[_4](#anyOf_4) | str,  | str,  |  |
[_5](#anyOf_5) | str,  | str,  |  |
[_6](#anyOf_6) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_7](#anyOf_7) | bool,  | BoolClass,  |  |
[_8](#anyOf_8) | None,  | NoneClass,  |  |
[_9](#anyOf_9) | list, tuple,  | tuple,  |  |
[_10](#anyOf_10) | decimal.Decimal, int, float,  | decimal.Decimal,  |  |
[_11](#anyOf_11) | decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 32 bit float
[_12](#anyOf_12) | decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 64 bit float
[_13](#anyOf_13) | decimal.Decimal, int,  | decimal.Decimal,  |  |
[_14](#anyOf_14) | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer
[_15](#anyOf_15) | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

# <a id="anyOf_0">_0</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# <a id="anyOf_1">_1</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# <a id="anyOf_2">_2</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

# <a id="anyOf_3">_3</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bytes, io.FileIO, io.BufferedReader,  | bytes, io.FileIO,  |  |

# <a id="anyOf_4">_4</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# <a id="anyOf_5">_5</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# <a id="anyOf_6">_6</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# <a id="anyOf_7">_7</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  |

# <a id="anyOf_8">_8</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

# <a id="anyOf_9">_9</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

# <a id="anyOf_10">_10</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  |

# <a id="anyOf_11">_11</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 32 bit float

# <a id="anyOf_12">_12</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 64 bit float

# <a id="anyOf_13">_13</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  |

# <a id="anyOf_14">_14</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer

# <a id="anyOf_15">_15</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
