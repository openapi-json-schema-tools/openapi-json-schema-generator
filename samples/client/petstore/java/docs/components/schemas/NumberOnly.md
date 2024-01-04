# NumberOnly
org.openapijsonschematools.client.components.schemas.NumberOnly.java
public class NumberOnly

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NumberOnly.NumberOnly1](#numberonly1)<br> schema class |
| static class | [NumberOnly.NumberOnlyMapBuilder](#numberonlymapbuilder)<br> builder for Map payloads |
| static class | [NumberOnly.NumberOnlyMap](#numberonlymap)<br> output class for Map payloads |
| static class | [NumberOnly.JustNumber](#justnumber)<br> schema class |

## NumberOnly1
public static class NumberOnly1<br>
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
NumberOnly.NumberOnlyMap validatedPayload =
    NumberOnly.NumberOnly1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<>(
            "JustNumber",
            1
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("JustNumber", [JustNumber.class](#justnumber)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NumberOnlyMap](#numberonlymap) | validate([Map&lt;?, ?&gt;](#numberonlymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NumberOnlyMapBuilder
public class NumberOnlyMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberOnlyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [NumberOnlyMapBuilder](#numberonlymapbuilder) | JustNumber(int value) |
| [NumberOnlyMapBuilder](#numberonlymapbuilder) | JustNumber(float value) |
| [NumberOnlyMapBuilder](#numberonlymapbuilder) | JustNumber(long value) |
| [NumberOnlyMapBuilder](#numberonlymapbuilder) | JustNumber(double value) |

## NumberOnlyMap
public static class NumberOnlyMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NumberOnlyMap](#numberonlymap) | of([Map<String, ? extends @Nullable Object>](#numberonlymapbuilder) arg, SchemaConfiguration configuration) |
| Number | JustNumber()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## JustNumber
public static class JustNumber<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
