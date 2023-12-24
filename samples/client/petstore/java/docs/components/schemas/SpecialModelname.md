# SpecialModelname
org.openapijsonschematools.client.components.schemas.SpecialModelname.java
public class SpecialModelname

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SpecialModelname.SpecialModelname1](#specialmodelname1)<br> schema class |
| static class | [SpecialModelname.SpecialModelnameMapInput](#specialmodelnamemapinput)<br> builder for Map payloads |
| static class | [SpecialModelname.SpecialModelnameMap](#specialmodelnamemap)<br> output class for Map payloads |
| static class | [SpecialModelname.A](#a)<br> schema class |

## SpecialModelname1
public static class SpecialModelname1<br>
extends JsonSchema

A schema class that validates payloads

## Description
model with an invalid class name for python

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
SpecialModelname.SpecialModelnameMap validatedPayload =
    SpecialModelname.SpecialModelname1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "a",
            "a"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", [A.class](#a)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SpecialModelnameMap](#specialmodelnamemap) | validate([Map<String, ?>](#specialmodelnamemapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SpecialModelnameMapInput
public class SpecialModelnameMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **a** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## SpecialModelnameMap
public static class SpecialModelnameMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SpecialModelnameMap](#specialmodelnamemap) | of([Map<String, ? extends @Nullable Object>](#specialmodelnamemapinput) arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## A
public static class A<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
