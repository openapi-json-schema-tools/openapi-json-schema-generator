petstore_api.components.schema.additional_properties_validator
# Schema AdditionalPropertiesValidator

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_0](#allof-_0) | dict, schemas.immutabledict | schemas.immutabledict |  |
[_1](#allof-_1) | dict, schemas.immutabledict | schemas.immutabledict |  |
[_2](#allof-_2) | dict, schemas.immutabledict | schemas.immutabledict |  |

# allof _0

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_0DictInput](#allof-_0-_0dictinput), [_0Dict](#allof-_0-_0dict) | [_0Dict](#allof-_0-_0dict) |

## allof _0 _0DictInput
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## allof _0 _0Dict
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [_0DictInput](#allof-_0-_0dictinput), [_0Dict](#allof-_0-_0dict) | [_0Dict](#allof-_0-_0dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

# allof _1

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_1DictInput](#allof-_1-_1dictinput), [_1Dict](#allof-_1-_1dict) | [_1Dict](#allof-_1-_1dict) |

## allof _1 _1DictInput
type: typing.Mapping[
    str,
    typing.Union[
        schemas.INPUT_TYPES_ALL,
        schemas.OUTPUT_BASE_TYPES
    ],
]
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## allof _1 _1Dict
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [_1DictInput](#allof-_1-_1dictinput), [_1Dict](#allof-_1-_1dict) | [_1Dict](#allof-_1-_1dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

# allof _2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_2DictInput](#allof-_2-_2dictinput), [_2Dict](#allof-_2-_2dict) | [_2Dict](#allof-_2-_2dict) |

## allof _2 _2DictInput
type: typing.Mapping[
    str,
    typing.Union[
        schemas.INPUT_TYPES_ALL,
        schemas.OUTPUT_BASE_TYPES
    ],
]
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## allof _2 _2Dict
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [_2DictInput](#allof-_2-_2dictinput), [_2Dict](#allof-_2-_2dict) | [_2Dict](#allof-_2-_2dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
