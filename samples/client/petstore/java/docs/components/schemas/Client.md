# Client
org.openapijsonschematools.client.components.schemas.Client.java
public class Client

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Client.Client1](#client1)<br> schema class |
| static class | [Client.ClientMapBuilder1](#clientmapbuilder1)<br> builder for Map payloads |
| static class | [Client.ClientMap](#clientmap)<br> output class for Map payloads |
| static class | [Client.Client2](#client2)<br> schema class |

## Client1
public static class Client1<br>
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
Client.ClientMap validatedPayload =
    Client.Client1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<>(
            "client",
            "a"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("client", [Client2.class](#client2)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ClientMap](#clientmap) | validate([Map&lt;?, ?&gt;>](#clientmapbuilder1) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ClientMapBuilder1
public class ClientMapBuilder1<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClientMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ClientMapBuilder1](#clientmapbuilder1) | client(String value) |

## ClientMap
public static class ClientMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ClientMap](#clientmap) | of([Map<String, ? extends @Nullable Object>](#clientmapbuilder1) arg, SchemaConfiguration configuration) |
| String | client()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Client2
public static class Client2<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
