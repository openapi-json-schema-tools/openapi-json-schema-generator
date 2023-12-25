# Pet
org.openapijsonschematools.client.components.schemas.Pet.java
public class Pet

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Pet.Pet1](#pet1)<br> schema class |
| static class | [Pet.PetMapInput](#petmapinput)<br> builder for Map payloads |
| static class | [Pet.PetMap](#petmap)<br> output class for Map payloads |
| static class | [Pet.Tags](#tags)<br> schema class |
| static class | [Pet.TagsListInput](#tagslistinput)<br> builder for List payloads |
| static class | [Pet.TagsList](#tagslist)<br> output class for List payloads |
| static class | [Pet.Status](#status)<br> schema class |
| enum | [Pet.StringStatusEnums]() |
| static class | [Pet.PhotoUrls](#photourls)<br> schema class |
| static class | [Pet.PhotoUrlsListInput](#photourlslistinput)<br> builder for List payloads |
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

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
Pet.PetMap validatedPayload =
    Pet.Pet1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "name",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "photoUrls",
            Arrays.asList(
                "a"
            )
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "id",
            1L
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "category",
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "name",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "id",
                    1L
                )
            )
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "tags",
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "name",
                        "a"
                    )
                )
            )
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "status",
            "available"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("id", [Id.class](#id))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("category", [Category.Category1.class](../../components/schemas/Category.md#category1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name.class](#name))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("photoUrls", [PhotoUrls.class](#photourls))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("tags", [Tags.class](#tags))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("status", [Status.class](#status)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |
| Set<String> | &nbsp;&nbsp;&nbsp;&nbsp;required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"name",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"photoUrls"<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetMap](#petmap) | validate([Map<?, ?>](#petmapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PetMapInput
public class PetMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **name** | String |  | |
| **photoUrls** | List<String> |  | |
| **id** | long |  | [optional] value must be a 64 bit integer |
| **category** | Map<String, ? extends @Nullable Object> |  | [optional] |
| **tags** | List<Map<String, ? extends @Nullable Object>> |  | [optional] |
| **status** | String | pet status in the store | [optional] must be one of ["available", "pending", "sold"] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## PetMap
public static class PetMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetMap](#petmap) | of([Map<String, ? extends @Nullable Object>](#petmapinput) arg, SchemaConfiguration configuration) |
| String | name()<br> |
| [PhotoUrlsList](#photourlslist) | photoUrls()<br> |
| long | id()<br>[optional] value must be a 64 bit integer |
| [Category.CategoryMap](../../components/schemas/Category.md#categorymap) | category()<br>[optional] |
| [TagsList](#tagslist) | tags()<br>[optional] |
| String | status()<br>[optional] must be one of ["available", "pending", "sold"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Tags
public static class Tags<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
Pet.TagsList validatedPayload =
    Pet.Tags.validate(
    Arrays.asList(
        MapMaker.makeMap(
            new AbstractMap.SimpleEntry<String, Object>(
                "id",
                1L
            ),
            new AbstractMap.SimpleEntry<String, Object>(
                "name",
                "a"
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(List.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [Tag.Tag1.class](../../components/schemas/Tag.md#tag1)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TagsList](#tagslist) | validate([List<?>](#tagslistinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## TagsListInput
public class TagsListInput<br>
builder for `List<Map<String, ? extends @Nullable Object>>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, ? extends @Nullable Object> |  |

## TagsList
public class TagsList<br>
extends `FrozenList<Tag.TagMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TagsList](#tagslist) | of([List<Map<String, ? extends @Nullable Object>>](#tagslistinput) arg, SchemaConfiguration configuration) |

## Status
public static class Status<br>
extends JsonSchema

A schema class that validates payloads

## Description
pet status in the store

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = Pet.Status.validate(
    "available",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"available",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"pending",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"sold"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PhotoUrls
public static class PhotoUrls<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
Pet.PhotoUrlsList validatedPayload =
    Pet.PhotoUrls.validate(
    Arrays.asList(
        "a"
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(List.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [Items.class](#items)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PhotoUrlsList](#photourlslist) | validate([List<?>](#photourlslistinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PhotoUrlsListInput
public class PhotoUrlsListInput<br>
builder for `List<String>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

## PhotoUrlsList
public class PhotoUrlsList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PhotoUrlsList](#photourlslist) | of([List<String>](#photourlslistinput) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Name
public static class Name<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Id
public static class Id<br>
extends Int64JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
