# Apple
org.openapijsonschematools.client.components.schemas.Apple.java
public class Apple

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Apple.Apple1](#apple1)<br> schema class |
| static class | [Apple.AppleMapBuilder](#applemapbuilder)<br> builder for Map payloads |
| static class | [Apple.AppleMap](#applemap)<br> output class for Map payloads |
| static class | [Apple.Origin](#origin)<br> schema class |
| static class | [Apple.Cultivar](#cultivar)<br> schema class |

## Apple1
public static class Apple1<br>
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

// null validation
Void validatedPayload = Apple.Apple1.validate(
    (Void) null,
    configuration
);

// Map validation
Apple.AppleMap validatedPayload =
    Apple.Apple1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<String, String>(
            "cultivar",
            "IaQnEaqioxT	oASzjxaSH"
        ),
        new AbstractMap.SimpleEntry<String, String>(
            "origin",
            "IaQnEaqioxT	oASzjxaSH"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map.class<br/>)<br/> |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("cultivar", [Cultivar.class](#cultivar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("origin", [Origin.class](#origin)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"cultivar"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| [AppleMap](#applemap) | validate([Map&lt;?, ?&gt;](#applemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AppleMap0Builder
public class AppleMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AppleMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AppleMap0Builder](#applemap0builder) | origin(String value) |
## AppleMapBuilder
public class AppleMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AppleMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AppleMap0Builder](#applemap0builder) | cultivar(String value) |

## AppleMap
public static class AppleMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AppleMap](#applemap) | of([Map<String, ? extends @Nullable Object>](#applemapbuilder) arg, SchemaConfiguration configuration) |
| String | cultivar()<br> |
| String | origin()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Origin
public static class Origin<br>
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

// String validation
String validatedPayload = Apple.Origin.validate(
    "IaQnEaqioxT	oASzjxaSH",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern =<br>&nbsp;&nbsp;&nbsp;&nbsp;"^[A-Z\\s]*$",<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.CASE_INSENSITIVE<br>)))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Cultivar
public static class Cultivar<br>
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

// String validation
String validatedPayload = Apple.Cultivar.validate(
    "IaQnEaqioxT	oASzjxaSH",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern =<br>&nbsp;&nbsp;&nbsp;&nbsp;"^[a-zA-Z\\s]*$"<br>)))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
