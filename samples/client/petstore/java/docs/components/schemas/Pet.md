# Pet
org.openapijsonschematools.components.schemas.Pet.java
public class Pet

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Pet.Pet1<br> schema class |
| static class | Pet.PetMap<br> output class for Map payloads |
| static class | Pet.Tags<br> schema class |
| static class | Pet.TagsList<br> output class for List payloads |
| static class | Pet.Status<br> schema class |
| static class | Pet.PhotoUrls<br> schema class |
| static class | Pet.PhotoUrlsList<br> output class for List payloads |
| static class | Pet.Items<br> schema class |
| static class | Pet.Name<br> schema class |
| static class | Pet.Id<br> schema class |

## Pet1
public class Pet1
extends JsonSchema

A schema class that validates payloads

## Description
Pet object that needs to be added to the store
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PetMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | String |  |
**photoUrls** | List<String> |  |
**id** | long |  | [optional] value must be a 64 bit integer
**category** | Map<String, Object> |  | [optional]
**tags** | List<Map<String, Object>> |  | [optional]
**status** | String | pet status in the store | [optional] must be one of ["available", "pending", "sold"]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## PetMap
public class PetMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PetMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | name()<br> |
| PhotoUrlsList | photoUrls()<br> |
| long | id()<br>[optional] value must be a 64 bit integer |
| Category.CategoryMap | category()<br>[optional] |
| TagsList | tags()<br>[optional] |
| String | status()<br>[optional] must be one of ["available", "pending", "sold"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Tags
public class Tags
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static TagsList | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## TagsList
public class TagsList
extends FrozenList<Tag.TagMap>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## Status
public class Status
extends JsonSchema

A schema class that validates payloads

## Description
pet status in the store
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## PhotoUrls
public class PhotoUrls
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PhotoUrlsList | validate(List<String> arg, SchemaConfiguration configuration) |

## PhotoUrlsList
public class PhotoUrlsList
extends FrozenList<String>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

## Items
public class Items
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Name
public class Name
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Id
public class Id
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
