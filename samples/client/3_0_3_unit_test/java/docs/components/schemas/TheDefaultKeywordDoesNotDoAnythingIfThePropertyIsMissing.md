# TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing
org.openapijsonschematools.client.components.schemas.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.java
public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1)<br> schema class |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder)<br> builder for Map payloads |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap)<br> output class for Map payloads |
| static class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.Alpha](#alpha)<br> schema class |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1
public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1<br>
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
TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap validatedPayload =
    TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<>(
            "alpha",
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("alpha", [Alpha.class](#alpha)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) | validate([Map<?, ?>](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder
public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **alpha** | Number |  | [optional] if omitted the server will use the default value of 5.0 |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap
public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) | of([Map<String, ? extends @Nullable Object>](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) arg, SchemaConfiguration configuration) |
| Number | alpha()<br>[optional] if omitted the server will use the default value of 5.0 |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Alpha
public static class Alpha<br>
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

// int validation
int validatedPayload = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.Alpha.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| Number | maximum = 3 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
