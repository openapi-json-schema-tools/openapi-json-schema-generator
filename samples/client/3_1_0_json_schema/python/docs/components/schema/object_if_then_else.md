# ObjectIfThenElse
json_schema_api.components.schema.object_if_then_else
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectIfThenElseDictInput](#objectifthenelsedictinput), [ObjectIfThenElseDict](#objectifthenelsedict) | [ObjectIfThenElseDict](#objectifthenelsedict) |

## ObjectIfThenElseDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**street_address** | str |  | [optional]
**country** | typing.Literal["United States of America", "Canada"] |  | [optional] must be one of ["United States of America", "Canada"] if omitted the server will use the default value of United States of America
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## ObjectIfThenElseDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**street_address** | str, schemas.Unset |  | [optional]
**country** | typing.Literal["United States of America", "Canada"], schemas.Unset |  | [optional] must be one of ["United States of America", "Canada"] if omitted the server will use the default value of United States of America
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**street_address** | str, schemas.Unset |  | [optional]
**country** | typing.Literal["United States of America", "Canada"], schemas.Unset |  | [optional] must be one of ["United States of America", "Canada"] if omitted the server will use the default value of United States of America

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjectIfThenElseDictInput](#objectifthenelsedictinput), [ObjectIfThenElseDict](#objectifthenelsedict) | [ObjectIfThenElseDict](#objectifthenelsedict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
