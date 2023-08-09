petstore_api.paths.user_login.get.responses.response_200.headers
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
**X-Rate-Limit** | [**Schema**](schema.md), int |  |
**int32** | [**Schema**](schema.md), int |  |
**ref-content-schema-header** | [**StringWithValidation**](string_with_validation.md), str |  |
**X-Expires-After** | [**Schema**](schema.md), str, datetime.datetime |  | [optional]
**numberHeader** | [**Schema**](schema.md), str |  | [optional]

## HeadersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**int32** | [**Schema**](schema.md), int |  |
**numberHeader** | [**Schema**](schema.md), str, schemas.Unset |  | [optional]

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**int32** | [**Schema**](schema.md) |  |
**numberHeader** | [**Schema**](schema.md) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [HeadersDictInput](#headersdictinput), [HeadersDict](#headersdict) | [HeadersDict](#headersdict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.OUTPUT_BASE_TYPES | This model has invalid python names so this method is used under the hood when you access instance["X-Rate-Limit"], instance["ref-content-schema-header"], instance["X-Expires-After"], 
