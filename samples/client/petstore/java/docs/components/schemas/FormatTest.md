# FormatTest1
org.openapijsonschematools.components.schemas.FormatTest.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | FormatTestMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**byte** | String |  |
**date** | String |  |
**number** | Number |  |
**password** | String |  |
**integer** | long |  | [optional]
**int32** | int |  | [optional]
**int32withValidations** | int |  | [optional]
**int64** | long |  | [optional]
**float** | float | this is a reserved python keyword | [optional]
**float32** | float |  | [optional]
**double** | double |  | [optional]
**float64** | double |  | [optional]
**arrayWithUniqueItems** | List<Number> |  | [optional]
**string** | String |  | [optional]
**binary** | String |  | [optional]
**dateTime** | String |  | [optional]
**uuid** | String |  | [optional]
**uuidNoExample** | String |  | [optional]
**pattern_with_digits** | String | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** | String | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** | Void |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## FormatTestMap
```
base class: FrozenMap<String, Object>
```

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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | String |  | This model has invalid python names so this method is used under the hood when you access instance["byte"], instance["number"], instance["integer"], instance["float"], instance["double"], instance["string"], instance["uuid"], 
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
