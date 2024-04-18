# PropertiesWithEscapedCharacters
openapi_client.components.schema.properties_with_escaped_characters
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PropertiesWithEscapedCharactersDictInput](#propertieswithescapedcharactersdictinput), [PropertiesWithEscapedCharactersDict](#propertieswithescapedcharactersdict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [PropertiesWithEscapedCharactersDict](#propertieswithescapedcharactersdict), str, float, int, bool, None, tuple, bytes, io.FileIO |

## PropertiesWithEscapedCharactersDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**foo\nbar** | float, int |  | [optional]
**foo\&quot;bar** | float, int |  | [optional]
**foo\\bar** | float, int |  | [optional]
**foo\rbar** | float, int |  | [optional]
**foo\tbar** | float, int |  | [optional]
**foo\fbar** | float, int |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## PropertiesWithEscapedCharactersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PropertiesWithEscapedCharactersDictInput](#propertieswithescapedcharactersdictinput), [PropertiesWithEscapedCharactersDict](#propertieswithescapedcharactersdict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [PropertiesWithEscapedCharactersDict](#propertieswithescapedcharactersdict), str, float, int, bool, None, tuple, bytes, io.FileIO | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | This model has invalid python names so this method is used under the hood when you access instance["foo\nbar"], instance["foo\&quot;bar"], instance["foo\\bar"], instance["foo\rbar"], instance["foo\tbar"], instance["foo\fbar"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
