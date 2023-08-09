petstore_api.components.schema.object_with_colliding_properties
# Schema ObjectWithCollidingProperties

## Description
component with properties that have name collisions

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectWithCollidingPropertiesDictInput](#objectwithcollidingpropertiesdictinput), [ObjectWithCollidingPropertiesDict](#objectwithcollidingpropertiesdict) | [ObjectWithCollidingPropertiesDict](#objectwithcollidingpropertiesdict) |

## ObjectWithCollidingPropertiesDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someProp** | dict, schemas.immutabledict |  | [optional]
**someprop** | dict, schemas.immutabledict |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjectWithCollidingPropertiesDict
```
base class: schemas.immutabledict[str, schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**someProp** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**someprop** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type component with properties that have name collisions | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**someProp** | schemas.immutabledict, schemas.Unset |  | [optional]
**someprop** | schemas.immutabledict, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjectWithCollidingPropertiesDictInput](#objectwithcollidingpropertiesdictinput), [ObjectWithCollidingPropertiesDict](#objectwithcollidingpropertiesdict) | [ObjectWithCollidingPropertiesDict](#objectwithcollidingpropertiesdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

# SomeProp

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# Someprop2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
