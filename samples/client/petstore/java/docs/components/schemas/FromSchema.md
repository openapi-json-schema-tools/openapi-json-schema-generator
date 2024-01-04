# FromSchema
org.openapijsonschematools.client.components.schemas.FromSchema.java
public class FromSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [FromSchema.FromSchema1](#fromschema1)<br> schema class |
| static class | [FromSchema.FromSchemaMapBuilder](#fromschemamapbuilder)<br> builder for Map payloads |
| static class | [FromSchema.FromSchemaMap](#fromschemamap)<br> output class for Map payloads |
| static class | [FromSchema.Id](#id)<br> schema class |
| static class | [FromSchema.Data](#data)<br> schema class |

## FromSchema1
public static class FromSchema1<br>
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
FromSchema.FromSchemaMap validatedPayload =
    FromSchema.FromSchema1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "data",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "id",
            1L
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("data", [Data.class](#data))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("id", [Id.class](#id)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FromSchemaMap](#fromschemamap) | validate([Map&lt;?, ?&gt;](#fromschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FromSchemaMapBuilder
public class FromSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| FromSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | data(String value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | id(int value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | id(float value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | id(long value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | id(double value) |

## FromSchemaMap
public static class FromSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FromSchemaMap](#fromschemamap) | of([Map<String, ? extends @Nullable Object>](#fromschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | data()<br>[optional] |
| Number | id()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Id
public static class Id<br>
extends IntJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Data
public static class Data<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
