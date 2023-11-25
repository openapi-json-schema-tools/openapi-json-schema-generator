# Schema
org.openapijsonschematools.paths.fake.get.requestbody.content.applicationxwwwformurlencoded.Schema.java
public class Schema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema.Items<br> schema class |
| static class | Schema.EnumFormStringArrayList<br> output class for List payloads |
| static class | Schema.EnumFormStringArray<br> schema class |
| static class | Schema.EnumFormString<br> schema class |
| static class | Schema.SchemaMap<br> output class for Map payloads |
| static class | Schema.Schema1<br> schema class |

## Schema1
public class Schema1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**enum_form_string_array** | List<String> | Form parameter enum test (string array) | [optional]
**enum_form_string** | String | Form parameter enum test (string) | [optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
public class SchemaMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| EnumFormStringArrayList | enum_form_string_array()<br>[optional] |
| String | enum_form_string()<br>[optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

