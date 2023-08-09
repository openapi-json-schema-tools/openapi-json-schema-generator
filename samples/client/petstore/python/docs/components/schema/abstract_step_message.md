# AbstractStepMessage
petstore_api.components.schema.abstract_step_message

## Description
Abstract Step

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AbstractStepMessageDictInput](#abstractstepmessagedictinput), [AbstractStepMessageDict](#abstractstepmessagedict) | [AbstractStepMessageDict](#abstractstepmessagedict) |

## AbstractStepMessageDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**description** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |
**discriminator** | str |  |
**sequenceNumber** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## AbstractStepMessageDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**description** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |
**discriminator** | str |  |
**sequenceNumber** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type Abstract Step | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**description** | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |
**discriminator** | str |  |
**sequenceNumber** | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AbstractStepMessageDictInput](#abstractstepmessagedictinput), [AbstractStepMessageDict](#abstractstepmessagedict) | [AbstractStepMessageDict](#abstractstepmessagedict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

## Composed Schemas (allOf/anyOf/oneOf/not)
## anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AbstractStepMessage**](#top) | [**AbstractStepMessage**](#top) | [**AbstractStepMessage**](#top) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
