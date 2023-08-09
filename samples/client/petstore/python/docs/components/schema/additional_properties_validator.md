petstore_api.components.schema.additional_properties_validator
# AdditionalPropertiesValidator

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_0](#) | dict, schemas.immutabledict | schemas.immutabledict |  |
[_1](#) | dict, schemas.immutabledict | schemas.immutabledict |  |
[_2](#) | dict, schemas.immutabledict | schemas.immutabledict |  |

petstore_api.components.schema.AdditionalPropertiesValidator.allOf
# _0

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_0DictInput](#_0dictinput), [_0Dict](#_0dict) | [_0Dict](#_0dict) |

## _0DictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## _0Dict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [_0DictInput](#_0dictinput), [_0Dict](#_0dict) | [_0Dict](#_0dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

petstore_api.components.schema.AdditionalPropertiesValidator.allOf
# _1

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_1DictInput](#_1dictinput), [_1Dict](#_1dict) | [_1Dict](#_1dict) |

## _1DictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        schemas.INPUT_TYPES_ALL,
        schemas.OUTPUT_BASE_TYPES
    ],
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## _1Dict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [_1DictInput](#_1dictinput), [_1Dict](#_1dict) | [_1Dict](#_1dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

petstore_api.components.schema.AdditionalPropertiesValidator.allOf
# _2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_2DictInput](#_2dictinput), [_2Dict](#_2dict) | [_2Dict](#_2dict) |

## _2DictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        schemas.INPUT_TYPES_ALL,
        schemas.OUTPUT_BASE_TYPES
    ],
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## _2Dict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [_2DictInput](#_2dictinput), [_2Dict](#_2dict) | [_2Dict](#_2dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
