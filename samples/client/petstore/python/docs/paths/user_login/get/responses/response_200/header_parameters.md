# Headers
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[HeadersDictInput](#headersdictinput), [HeadersDict](#headersdict) | [HeadersDict](#headersdict) |

## HeadersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**X-Rate-Limit** | int |  |
**int32** | int |  |
**ref-content-schema-header** | str |  |
**X-Expires-After** | str, datetime.datetime |  | [optional]
**numberHeader** | str |  | [optional]

## HeadersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**int32** | int |  |
**numberHeader** | str, schemas.Unset |  | [optional]

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**int32** | int |  |
**numberHeader** | str, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [HeadersDictInput](#headersdictinput), [HeadersDict](#headersdict) | [HeadersDict](#headersdict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | This model has invalid python names so this method is used under the hood when you access instance["X-Rate-Limit"], instance["ref-content-schema-header"], instance["X-Expires-After"], 
