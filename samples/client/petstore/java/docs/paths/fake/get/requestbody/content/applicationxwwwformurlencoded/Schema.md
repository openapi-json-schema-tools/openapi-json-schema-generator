# Schema1
org.openapijsonschematools.paths.fake.get.requestbody.content.applicationxwwwformurlencoded.Schema.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | SchemaMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**enum_form_string_array** |  | Form parameter enum test (string array) | [optional]
**enum_form_string** |  | Form parameter enum test (string) | [optional]
**any_string_name** | Map, List, decimal.Decimal, float, int, String, LocalDate, ZonedDateTime, UUID, boolean, null, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>

```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**enum_form_string_array** |  | Form parameter enum test (string array) | [optional]
**enum_form_string** |  | Form parameter enum test (string) | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

