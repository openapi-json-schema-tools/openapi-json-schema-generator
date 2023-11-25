org.openapijsonschematools.components.schema.FormatTest
```
type: JsonSchema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
 |  |

```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**byte** |  |  |
**date** |  |  |
**number** |  |  |
**password** |  |  |
**integer** |  |  | [optional]
**int32** |  |  | [optional]
**int32withValidations** |  |  | [optional]
**int64** |  |  | [optional]
**float** |  | this is a reserved python keyword | [optional]
**float32** |  |  | [optional]
**double** |  |  | [optional]
**float64** |  |  | [optional]
**arrayWithUniqueItems** |  |  | [optional]
**string** |  |  | [optional]
**binary** |  |  | [optional]
**dateTime** |  |  | [optional]
**uuid** |  |  | [optional]
**uuidNoExample** |  |  | [optional]
**pattern_with_digits** |  | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** |  | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** |  |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

```
base class: schemas.immutabledict[str, 
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**date** |  |  |
**password** |  |  |
**int32** |  |  | [optional]
**int32withValidations** |  |  | [optional]
**int64** |  |  | [optional]
**float32** |  |  | [optional]
**float64** |  |  | [optional]
**arrayWithUniqueItems** |  |  | [optional]
**binary** |  |  | [optional]
**dateTime** |  |  | [optional]
**uuidNoExample** |  |  | [optional]
**pattern_with_digits** |  | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** |  | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** |  |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**date** |  |  |
**password** |  |  |
**int32** |  |  | [optional]
**int32withValidations** |  |  | [optional]
**int64** |  |  | [optional]
**float32** |  |  | [optional]
**float64** |  |  | [optional]
**arrayWithUniqueItems** |  |  | [optional]
**binary** |  |  | [optional]
**dateTime** |  |  | [optional]
**uuidNoExample** |  |  | [optional]
**pattern_with_digits** |  | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** |  | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str |  | This model has invalid python names so this method is used under the hood when you access instance["byte"], instance["number"], instance["integer"], instance["float"], instance["double"], instance["string"], instance["uuid"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
