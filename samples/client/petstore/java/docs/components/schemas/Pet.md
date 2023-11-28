# Pet
org.openapijsonschematools.components.schemas.Pet.java
public class Pet

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Pet.Pet1](#pet1)<br> schema class |
| static class | [Pet.PetMap](#petmap)<br> output class for Map payloads |
| static class | [Pet.Tags](#tags)<br> schema class |
| static class | [Pet.TagsList](#tagslist)<br> output class for List payloads |
| static class | [Pet.Status](#status)<br> schema class |
| static class | [Pet.PhotoUrls](#photourls)<br> schema class |
| static class | [Pet.PhotoUrlsList](#photourlslist)<br> output class for List payloads |
| static class | [Pet.Items](#items)<br> schema class |
| static class | [Pet.Name](#name)<br> schema class |
| static class | [Pet.Id](#id)<br> schema class |

## Pet1
public static class Pet1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Pet object that needs to be added to the store
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("id", Id.class),
    new PropertyEntry("category", Category.Category1.class),
    new PropertyEntry("name", Name.class),
    new PropertyEntry("photoUrls", PhotoUrls.class),
    new PropertyEntry("tags", Tags.class),
    new PropertyEntry("status", Status.class)
))),
new KeywordEntry("required", new RequiredValidator(Set.of(
    "name",
    "photoUrls"
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetMap](#petmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## PetMap
public static class PetMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetMap](#petmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | name()<br> |
| PhotoUrlsList | photoUrls()<br> |
| long | id()<br>[optional] value must be a 64 bit integer |
| Category.CategoryMap | category()<br>[optional] |
| TagsList | tags()<br>[optional] |
| String | status()<br>[optional] must be one of ["available", "pending", "sold"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **name** | String |  | |
| **photoUrls** | List<String> |  | |
| **id** | long |  | [optional] value must be a 64 bit integer |
| **category** | Map<String, Object> |  | [optional] |
| **tags** | List<Map<String, Object>> |  | [optional] |
| **status** | String | pet status in the store | [optional] must be one of ["available", "pending", "sold"] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Tags
public static class Tags<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
new KeywordEntry("items", new ItemsValidator(Tag.Tag1.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TagsList](#tagslist) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## TagsList
public class TagsList<br>
extends FrozenList<Tag.TagMap>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TagsList](#tagslist) | of(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## Status
public static class Status<br>
extends JsonSchema

A schema class that validates payloads

## Description
pet status in the store
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(
    String.class
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## PhotoUrls
public static class PhotoUrls<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
new KeywordEntry("items", new ItemsValidator(Items.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PhotoUrlsList](#photourlslist) | validate(List<String> arg, SchemaConfiguration configuration) |

## PhotoUrlsList
public class PhotoUrlsList<br>
extends FrozenList<String>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PhotoUrlsList](#photourlslist) | of(List<String> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

## Items
public static class Items<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Name
public static class Name<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Id
public static class Id<br>
extends Int64JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
