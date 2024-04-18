# PropertiesWhoseNamesAreJavascriptObjectPropertyNames
unit_test_api.components.schema.properties_whose_names_are_javascript_object_property_names
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PropertiesWhoseNamesAreJavascriptObjectPropertyNamesDictInput](#propertieswhosenamesarejavascriptobjectpropertynamesdictinput), [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesDict](#propertieswhosenamesarejavascriptobjectpropertynamesdict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesDict](#propertieswhosenamesarejavascriptobjectpropertynamesdict), str, float, int, bool, None, tuple, bytes, io.FileIO |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNamesDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**__proto__** | float, int |  | [optional]
**toString** | [ToStringDictInput](#tostringdictinput), [ToStringDict](#tostringdict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**constructor** | float, int |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## PropertiesWhoseNamesAreJavascriptObjectPropertyNamesDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**__proto__** | float, int, schemas.Unset |  | [optional]
**toString** | [ToStringDictInput](#tostringdictinput), [ToStringDict](#tostringdict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**constructor** | float, int, schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**__proto__** | float, int, schemas.Unset |  | [optional]
**toString** | [ToStringDict](#tostringdict), str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset |  | [optional]
**constructor** | float, int, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesDictInput](#propertieswhosenamesarejavascriptobjectpropertynamesdictinput), [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesDict](#propertieswhosenamesarejavascriptobjectpropertynamesdict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesDict](#propertieswhosenamesarejavascriptobjectpropertynamesdict), str, float, int, bool, None, tuple, bytes, io.FileIO | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
