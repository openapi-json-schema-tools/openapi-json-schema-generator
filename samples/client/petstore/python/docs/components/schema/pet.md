# Pet
petstore_api.components.schema.pet

## Description
Pet object that needs to be added to the store

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PetDictInput](#petdictinput), [PetDict](#petdict) | [PetDict](#petdict) |

## PetDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | str |  |
**photoUrls** | [PhotoUrlsTupleInput](#photourlstupleinput), [PhotoUrlsTuple](#photourlstuple) |  |
**id** | int |  | [optional] value must be a 64 bit integer
**category** | [category.CategoryDictInput](../../components/schema/category.md#categorydictinput), [category.CategoryDict](../../components/schema/category.md#categorydict) |  | [optional]
**tags** | [TagsTupleInput](#tagstupleinput), [TagsTuple](#tagstuple) |  | [optional]
**status** | str | pet status in the store | [optional] must be one of ["available", "pending", "sold"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## PetDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**name** | str |  |
**photoUrls** | [PhotoUrlsTupleInput](#photourlstupleinput), [PhotoUrlsTuple](#photourlstuple) |  |
**id** | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**category** | [category.CategoryDictInput](../../components/schema/category.md#categorydictinput), [category.CategoryDict](../../components/schema/category.md#categorydict) |  | [optional]
**tags** | [TagsTupleInput](#tagstupleinput), [TagsTuple](#tagstuple), schemas.Unset |  | [optional]
**status** | str, schemas.Unset | pet status in the store | [optional] must be one of ["available", "pending", "sold"]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type Pet object that needs to be added to the store | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**name** | str |  |
**photoUrls** | [PhotoUrlsTuple](#photourlstuple) |  |
**id** | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**category** | [**Category**](category.md) |  | [optional]
**tags** | [TagsTuple](#tagstuple), schemas.Unset |  | [optional]
**status** | str, schemas.Unset | pet status in the store | [optional] must be one of ["available", "pending", "sold"]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PetDictInput](#petdictinput), [PetDict](#petdict) | [PetDict](#petdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

# PhotoUrls

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PhotoUrlsTupleInput](#photourlstupleinput), [PhotoUrlsTuple](#photourlstuple) | [PhotoUrlsTuple](#photourlstuple) |

## PhotoUrlsTupleInput
```
type: typing.Union[
    typing.List[
        str,
    ],
    typing.Tuple[
        str,
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | str |  |

## PhotoUrlsTuple
```
base class: typing.Tuple[
    str,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [PhotoUrlsTupleInput](#photourlstupleinput), [PhotoUrlsTuple](#photourlstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | str | This method is used under the hood when instance[0] is called

# Tags

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[TagsTupleInput](#tagstupleinput), [TagsTuple](#tagstuple) | [TagsTuple](#tagstuple) |

## TagsTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            tag.TagDictInput,
            tag.TagDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            tag.TagDictInput,
            tag.TagDict,
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**Tag**](tag.md) |  |

## TagsTuple
```
base class: typing.Tuple[
    tag.TagDict,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [TagsTupleInput](#tagstupleinput), [TagsTuple](#tagstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.OUTPUT_BASE_TYPES | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
