# Schema1
org.openapijsonschematools.paths.fakeinlinecomposition.post.parameters.parameter1.Schema1.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema1.Schema01<br> schema class |
| static class | Schema1.SomeProp1<br> schema class |
| static class | Schema1.SchemaMap1<br> output class for Map payloads |
| static class | Schema1.Schema11<br> schema class |

## Schema11
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap1 | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someProp** | Object |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap1
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap1 | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | someProp()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

