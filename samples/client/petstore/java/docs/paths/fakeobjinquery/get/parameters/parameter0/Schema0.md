# Schema0
public class Schema0

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema0.Schema01Boxed](#schema01boxed)<br> sealed validated payload class |
| static class | [Schema0.Schema01](#schema01)<br> schema class |
| static class | [Schema0.SchemaMapBuilder0](#schemamapbuilder0)<br> builder for Map payloads |
| static class | [Schema0.SchemaMap0](#schemamap0)<br> output class for Map payloads |
| static class | [Schema0.Keyword0Boxed](#keyword0boxed)<br> sealed validated payload class |
| static class | [Schema0.Keyword0](#keyword0)<br> schema class |

## Schema01Boxed
public static abstract sealed class Schema01Boxed<br>

## Schema01
public static class Schema01<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
Schema0.SchemaMap0 validatedPayload =
    Schema0.Schema01.validate(
    new Schema0.SchemaMapBuilder0()
        .keyword("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("keyword", [Keyword0.class](#keyword0)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0](#schemamap0) | validate([Map&lt;?, ?&gt;](#schemamapbuilder0) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMapBuilder0
public class SchemaMapBuilder0<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilder0()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMapBuilder0](#schemamapbuilder0) | keyword(String value) |
| [SchemaMapBuilder0](#schemamapbuilder0) | additionalProperty(String key, Void value) |
| [SchemaMapBuilder0](#schemamapbuilder0) | additionalProperty(String key, boolean value) |
| [SchemaMapBuilder0](#schemamapbuilder0) | additionalProperty(String key, String value) |
| [SchemaMapBuilder0](#schemamapbuilder0) | additionalProperty(String key, int value) |
| [SchemaMapBuilder0](#schemamapbuilder0) | additionalProperty(String key, float value) |
| [SchemaMapBuilder0](#schemamapbuilder0) | additionalProperty(String key, long value) |
| [SchemaMapBuilder0](#schemamapbuilder0) | additionalProperty(String key, double value) |
| [SchemaMapBuilder0](#schemamapbuilder0) | additionalProperty(String key, List<?> value) |
| [SchemaMapBuilder0](#schemamapbuilder0) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMap0
public static class SchemaMap0<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap0](#schemamap0) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilder0) arg, SchemaConfiguration configuration) |
| String | keyword()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Keyword0Boxed
public static abstract sealed class Keyword0Boxed<br>

## Keyword0
public static class Keyword0<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
