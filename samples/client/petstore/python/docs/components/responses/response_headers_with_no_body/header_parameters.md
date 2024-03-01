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
**location** | str |  | [optional]

## HeadersDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**location** | str, schemas.Unset |  | [optional]

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**location** | str, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [HeadersDictInput](#headersdictinput), [HeadersDict](#headersdict) | [HeadersDict](#headersdict) | a constructor
