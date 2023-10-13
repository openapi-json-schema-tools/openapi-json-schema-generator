# FormatTest
petstore_api.components.schema.format_test
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[FormatTestDictInput](#formattestdictinput), [FormatTestDict](#formattestdict) | [FormatTestDict](#formattestdict) |

## FormatTestDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**byte** | str |  |
**date** | str, datetime.date |  | value must conform to RFC-3339 full-date YYYY-MM-DD
**number** | float, int |  |
**password** | str |  |
**integer** | int |  | [optional]
**int32** | int |  | [optional] value must be a 32 bit integer
**int32withValidations** | int |  | [optional] value must be a 32 bit integer
**int64** | int |  | [optional] value must be a 64 bit integer
**float** | float, int | this is a reserved python keyword | [optional] value must be a 32 bit float
**float32** | float, int |  | [optional] value must be a 32 bit float
**double** | float, int |  | [optional] value must be a 64 bit float
**float64** | float, int |  | [optional] value must be a 64 bit float
**arrayWithUniqueItems** | [ArrayWithUniqueItemsTupleInput](#arraywithuniqueitemstupleinput), [ArrayWithUniqueItemsTuple](#arraywithuniqueitemstuple) |  | [optional]
**string** | str |  | [optional]
**binary** | bytes, io.FileIO, io.BufferedReader |  | [optional]
**dateTime** | str, datetime.datetime |  | [optional] value must conform to RFC-3339 date-time
**uuid** | str, uuid.UUID |  | [optional] value must be a uuid
**uuidNoExample** | str, uuid.UUID |  | [optional] value must be a uuid
**pattern_with_digits** | str | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** | str | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** | None |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## FormatTestDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**byte** | str |  |
**date** | str, datetime.date |  | value must conform to RFC-3339 full-date YYYY-MM-DD
**number** | float, int |  |
**password** | str |  |
**integer** | int, schemas.Unset |  | [optional]
**int32** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**int32withValidations** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**int64** | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**float32** | float, int, schemas.Unset |  | [optional] value must be a 32 bit float
**double** | float, int, schemas.Unset |  | [optional] value must be a 64 bit float
**float64** | float, int, schemas.Unset |  | [optional] value must be a 64 bit float
**arrayWithUniqueItems** | [ArrayWithUniqueItemsTupleInput](#arraywithuniqueitemstupleinput), [ArrayWithUniqueItemsTuple](#arraywithuniqueitemstuple), schemas.Unset |  | [optional]
**string** | str, schemas.Unset |  | [optional]
**binary** | bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**dateTime** | str, datetime.datetime, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**uuid** | str, uuid.UUID, schemas.Unset |  | [optional] value must be a uuid
**uuidNoExample** | str, uuid.UUID, schemas.Unset |  | [optional] value must be a uuid
**pattern_with_digits** | str, schemas.Unset | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** | str, schemas.Unset | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** | None, schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**byte** | str |  |
**date** | str |  | value must conform to RFC-3339 full-date YYYY-MM-DD
**number** | float, int |  |
**password** | str |  |
**integer** | int, schemas.Unset |  | [optional]
**int32** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**int32withValidations** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**int64** | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**float32** | float, int, schemas.Unset |  | [optional] value must be a 32 bit float
**double** | float, int, schemas.Unset |  | [optional] value must be a 64 bit float
**float64** | float, int, schemas.Unset |  | [optional] value must be a 64 bit float
**arrayWithUniqueItems** | [ArrayWithUniqueItemsTuple](#arraywithuniqueitemstuple), schemas.Unset |  | [optional]
**string** | str, schemas.Unset |  | [optional]
**binary** | bytes, io.FileIO, schemas.Unset |  | [optional]
**dateTime** | str, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**uuid** | str, schemas.Unset |  | [optional] value must be a uuid
**uuidNoExample** | str, schemas.Unset |  | [optional] value must be a uuid
**pattern_with_digits** | str, schemas.Unset | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** | str, schemas.Unset | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** | None, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [FormatTestDictInput](#formattestdictinput), [FormatTestDict](#formattestdict) | [FormatTestDict](#formattestdict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | This model has invalid python names so this method is used under the hood when you access instance["float"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

# ArrayWithUniqueItems
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayWithUniqueItemsTupleInput](#arraywithuniqueitemstupleinput), [ArrayWithUniqueItemsTuple](#arraywithuniqueitemstuple) | [ArrayWithUniqueItemsTuple](#arraywithuniqueitemstuple) |

## ArrayWithUniqueItemsTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            int,
            float
        ],
    ],
    typing.Tuple[
        typing.Union[
            int,
            float
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
float, int |  |

## ArrayWithUniqueItemsTuple
```
base class: typing.Tuple[
    typing.Union[int, float],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ArrayWithUniqueItemsTupleInput](#arraywithuniqueitemstupleinput), [ArrayWithUniqueItemsTuple](#arraywithuniqueitemstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | float, int | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
