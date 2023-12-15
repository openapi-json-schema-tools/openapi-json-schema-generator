# Schema0
org.openapijsonschematools.client.paths.fakeobjinquery.get.parameters.parameter0.Schema0.java
public class Schema0

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema0.Schema01](#schema01)<br> schema class |
| static class | [Schema0.SchemaMapInput0](#schemamapinput0)<br> builder for Map payloads |
| static class | [Schema0.SchemaMap0](#schemamap0)<br> output class for Map payloads |
| static class | [Schema0.Keyword0](#keyword0)<br> schema class |

## Schema01
public static class Schema01<br>
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

// Map validation
Schema0.SchemaMap0 validatedPayload =
    Schema0.Schema01.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "keyword",
            "a"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(FrozenMap.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("keyword", [Keyword0.class](#keyword0)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap0](#schemamap0) | validate([Map<String, Object>](#schemamapinput0) arg, SchemaConfiguration configuration) |

## SchemaMapInput0
public class SchemaMapInput0<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **keyword** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## SchemaMap0
public static class SchemaMap0<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap0](#schemamap0) | of([Map<String, Object>](#schemamapinput0) arg, SchemaConfiguration configuration) |
| String | keyword()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Keyword0
public static class Keyword0<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |
