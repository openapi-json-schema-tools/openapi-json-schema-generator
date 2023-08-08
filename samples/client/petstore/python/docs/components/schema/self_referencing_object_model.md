petstore_api.components.schema.self_referencing_object_model
# Schema SelfReferencingObjectModel

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SelfReferencingObjectModelDictInput](#selfreferencingobjectmodeldictinput) | [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) |

## SelfReferencingObjectModelDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**selfRef** | [**SelfReferencingObjectModel**](#top), dict, schemas.immutabledict |  | [optional]
**any_string_name** | [**SelfReferencingObjectModel**](#top), dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## SelfReferencingObjectModelDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**selfRef** | [**SelfReferencingObjectModel**](#top), dict, schemas.immutabledict, schemas.Unset | [**SelfReferencingObjectModel**](#top) |  | [optional]
**any_string_name** | [**SelfReferencingObjectModel**](#top), dict, schemas.immutabledict | [**SelfReferencingObjectModel**](#top) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
