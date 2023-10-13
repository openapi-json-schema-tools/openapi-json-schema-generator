# MixedPropertiesAndAdditionalPropertiesClass
petstore_api.components.schema.mixed_properties_and_additional_properties_class
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MixedPropertiesAndAdditionalPropertiesClassDictInput](#mixedpropertiesandadditionalpropertiesclassdictinput), [MixedPropertiesAndAdditionalPropertiesClassDict](#mixedpropertiesandadditionalpropertiesclassdict) | [MixedPropertiesAndAdditionalPropertiesClassDict](#mixedpropertiesandadditionalpropertiesclassdict) |

## MixedPropertiesAndAdditionalPropertiesClassDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | str, uuid.UUID |  | [optional] value must be a uuid
**dateTime** | str, datetime.datetime |  | [optional] value must conform to RFC-3339 date-time
**map** | [MapDictInput](#mapdictinput), [MapDict](#mapdict) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## MixedPropertiesAndAdditionalPropertiesClassDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**uuid** | str, uuid.UUID, schemas.Unset |  | [optional] value must be a uuid
**dateTime** | str, datetime.datetime, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**map** | [MapDictInput](#mapdictinput), [MapDict](#mapdict), schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**uuid** | str, schemas.Unset |  | [optional] value must be a uuid
**dateTime** | str, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**map** | [MapDict](#mapdict), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MixedPropertiesAndAdditionalPropertiesClassDictInput](#mixedpropertiesandadditionalpropertiesclassdictinput), [MixedPropertiesAndAdditionalPropertiesClassDict](#mixedpropertiesandadditionalpropertiesclassdict) | [MixedPropertiesAndAdditionalPropertiesClassDict](#mixedpropertiesandadditionalpropertiesclassdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

# Map
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapDictInput](#mapdictinput), [MapDict](#mapdict) | [MapDict](#mapdict) |

## MapDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        animal.AnimalDictInput,
        animal.AnimalDict,
    ],
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | [animal.AnimalDictInput](../../components/schema/animal.md#animaldictinput), [animal.AnimalDict](../../components/schema/animal.md#animaldict) | any string name can be used but the value must be the correct type | [optional]

## MapDict
```
base class: schemas.immutabledict[str, AnimalDict]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | [animal.AnimalDictInput](../../components/schema/animal.md#animaldictinput), [animal.AnimalDict](../../components/schema/animal.md#animaldict) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MapDictInput](#mapdictinput), [MapDict](#mapdict) | [MapDict](#mapdict) | a constructor
get_additional_property_ | str | [animal.AnimalDict](../../components/schema/animal.md#animaldict), schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
