petstore_api.components.schema.object_with_colliding_properties
# Schema ObjectWithCollidingProperties

## Description
component with properties that have name collisions

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectWithCollidingPropertiesDictInput](#objectwithcollidingpropertiesdictinput) | [ObjectWithCollidingPropertiesDict](#objectwithcollidingpropertiesdict) |

## ObjectWithCollidingPropertiesDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someProp** | dict, schemas.immutabledict |  | [optional]
**someprop** | dict, schemas.immutabledict |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjectWithCollidingPropertiesDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**someProp** | dict, schemas.immutabledict, schemas.Unset | [properties.SomeProp](#properties-someprop) |  | [optional]
**someprop** | dict, schemas.immutabledict, schemas.Unset | [properties.Someprop2](#properties-someprop2) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties SomeProp

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# properties Someprop2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
