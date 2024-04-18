# SelfReferencingObjectModel
openapi_client.components.schema.self_referencing_object_model
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SelfReferencingObjectModelDictInput](#selfreferencingobjectmodeldictinput), [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) | [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) |

## SelfReferencingObjectModelDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            'SelfReferencingObjectModelDictInput',
            SelfReferencingObjectModelDict,
        ],
        typing.Union[
            'SelfReferencingObjectModelDictInput',
            SelfReferencingObjectModelDict,
        ],
    ]
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**selfRef** | [SelfReferencingObjectModelDictInput](#selfreferencingobjectmodeldictinput), [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) |  | [optional]
**any_string_name** | [SelfReferencingObjectModelDictInput](#selfreferencingobjectmodeldictinput), [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) | any string name can be used but the value must be the correct type | [optional]

## SelfReferencingObjectModelDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**selfRef** | [SelfReferencingObjectModelDictInput](#selfreferencingobjectmodeldictinput), [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict), schemas.Unset |  | [optional]
**kwargs** | [SelfReferencingObjectModelDictInput](#selfreferencingobjectmodeldictinput), [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**selfRef** | [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SelfReferencingObjectModelDictInput](#selfreferencingobjectmodeldictinput), [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) | [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict) | a constructor
get_additional_property_ | str | [SelfReferencingObjectModelDict](#selfreferencingobjectmodeldict), schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
