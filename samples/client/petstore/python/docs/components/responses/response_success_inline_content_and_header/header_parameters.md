petstore_api.components.responses.response_success_inline_content_and_header.headers
# Headers

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[HeadersDictInput](#headersdictinput), [HeadersDict](#headersdict) | [HeadersDict](#headersdict) |

## HeadersDictInput
```
type: typing_extensions.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someHeader** | [**Schema**](schema.md), str |  | [optional]

## HeadersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**someHeader** | [**Schema**](schema.md), str, schemas.Unset |  | [optional]

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**someHeader** | [**Schema**](schema.md) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [HeadersDictInput](#headersdictinput), [HeadersDict](#headersdict) | [HeadersDict](#headersdict) | a constructor
