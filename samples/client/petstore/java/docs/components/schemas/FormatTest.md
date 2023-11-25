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
**date** | String |  | value must conform to RFC-3339 full-date YYYY-MM-DD
**number** | Number |  |
**password** | String |  |
**integer** | long |  | [optional]
**int32** | int |  | [optional] value must be a 32 bit integer
**int32withValidations** | int |  | [optional] value must be a 32 bit integer
**int64** | long |  | [optional] value must be a 64 bit integer
**float** | float | this is a reserved python keyword | [optional] value must be a 32 bit float
**float32** | float |  | [optional] value must be a 32 bit float
**double** | double |  | [optional] value must be a 64 bit float
**float64** | double |  | [optional] value must be a 64 bit float
**arrayWithUniqueItems** | List<Number> |  | [optional]
**string** | String |  | [optional]
**binary** | String |  | [optional]
**dateTime** | String |  | [optional] value must conform to RFC-3339 date-time
**uuid** | String |  | [optional] value must be a uuid
**uuidNoExample** | String |  | [optional] value must be a uuid
**pattern_with_digits** | String | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** | String | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** | Void |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## FormatTestMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | FormatTestMap | a constructor
**date** | | String | value must conform to RFC-3339 full-date YYYY-MM-DD
**password** | | String |
**int32** | | int | [optional] value must be a 32 bit integer
**int32withValidations** | | int | [optional] value must be a 32 bit integer
**int64** | | long | [optional] value must be a 64 bit integer
**float32** | | float | [optional] value must be a 32 bit float
**float64** | | double | [optional] value must be a 64 bit float
**arrayWithUniqueItems** | | ArrayWithUniqueItemsList | [optional]
**binary** | | String | [optional]
**dateTime** | | String | [optional] value must conform to RFC-3339 date-time
**uuidNoExample** | | String | [optional] value must be a uuid
**pattern_with_digits** | | String | [optional]
**pattern_with_digits_and_delimiter** | | String | [optional]
**noneProp** | | Void | [optional]
get | String | Object | This model has invalid python names so this method is used under the hood when you access instance["byte"], instance["number"], instance["integer"], instance["float"], instance["double"], instance["string"], instance["uuid"], 
getAdditionalProperty | String | Object | provides type safety for additional properties


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
