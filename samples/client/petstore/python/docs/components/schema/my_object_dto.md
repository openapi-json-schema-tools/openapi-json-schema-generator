# MyObjectDto
openapi_client.components.schema.my_object_dto
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MyObjectDtoDictInput](#myobjectdtodictinput), [MyObjectDtoDict](#myobjectdtodict) | [MyObjectDtoDict](#myobjectdtodict) |

## MyObjectDtoDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | str, uuid.UUID |  | [optional] value must be a uuid

## MyObjectDtoDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**id** | str, uuid.UUID, schemas.Unset |  | [optional] value must be a uuid

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**id** | str, schemas.Unset |  | [optional] value must be a uuid

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MyObjectDtoDictInput](#myobjectdtodictinput), [MyObjectDtoDict](#myobjectdtodict) | [MyObjectDtoDict](#myobjectdtodict) | a constructor

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
