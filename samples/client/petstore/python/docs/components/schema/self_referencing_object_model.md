petstore_api.components.schema.self_referencing_object_model
# Schema SelfReferencingObjectModel

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SelfReferencingObjectModelDictInput](#selfreferencingobjectmodeldictinput), [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) | [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) |

## SelfReferencingObjectModelDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**selfRef** | [**SelfReferencingObjectModel**](#top), dict, schemas.immutabledict |  | [optional]
**any_string_name** | [**SelfReferencingObjectModel**](#top), dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## SelfReferencingObjectModelDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[SelfReferencingObjectModelDictInput](#selfreferencingobjectmodeldictinput), [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) | [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**selfRef** | [**SelfReferencingObjectModel**](#top), dict, schemas.immutabledict, schemas.Unset |  | [optional]
**kwargs** | [**SelfReferencingObjectModel**](#top), dict, schemas.immutabledict | [**SelfReferencingObjectModel**](#top) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**selfRef** | [**SelfReferencingObjectModel**](#top) |  | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
