# Client
org.openapijsonschematools.client.components.schemas.Client.java
public class Client<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Client.Client1Boxed](#client1boxed)<br> sealed interface for validated payloads |
| record | [Client.Client1BoxedMap](#client1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Client.Client1](#client1)<br> schema class |
| static class | [Client.ClientMapBuilder1](#clientmapbuilder1)<br> builder for Map payloads |
| static class | [Client.ClientMap](#clientmap)<br> output class for Map payloads |
| sealed interface | [Client.Client2Boxed](#client2boxed)<br> sealed interface for validated payloads |
| record | [Client.Client2BoxedString](#client2boxedstring)<br> boxed class to store validated String payloads |
| static class | [Client.Client2](#client2)<br> schema class |

## Client1Boxed
public sealed interface Client1Boxed<br>
permits<br>
[Client1BoxedMap](#client1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Client1BoxedMap
public record Client1BoxedMap<br>
implements [Client1Boxed](#client1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Client1BoxedMap([ClientMap](#clientmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ClientMap](#clientmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.Client;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
Client.ClientMap validatedPayload =
    Client.Client1.validate(
    new Client.ClientMapBuilder1()
        .client("a")

    .build(),
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
| [ClientMap](#clientmap) | validate([Map&lt;?, ?&gt;](#clientmapbuilder1) arg, SchemaConfiguration configuration) |
| [Client1BoxedMap](#client1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#clientmapbuilder1) arg, SchemaConfiguration configuration) |
| [Client1Boxed](#client1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ClientMapBuilder1
public class ClientMapBuilder1<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClientMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ClientMapBuilder1](#clientmapbuilder1) | client(String value) |
| [ClientMapBuilder1](#clientmapbuilder1) | additionalProperty(String key, Void value) |
| [ClientMapBuilder1](#clientmapbuilder1) | additionalProperty(String key, boolean value) |
| [ClientMapBuilder1](#clientmapbuilder1) | additionalProperty(String key, String value) |
| [ClientMapBuilder1](#clientmapbuilder1) | additionalProperty(String key, int value) |
| [ClientMapBuilder1](#clientmapbuilder1) | additionalProperty(String key, float value) |
| [ClientMapBuilder1](#clientmapbuilder1) | additionalProperty(String key, long value) |
| [ClientMapBuilder1](#clientmapbuilder1) | additionalProperty(String key, double value) |
| [ClientMapBuilder1](#clientmapbuilder1) | additionalProperty(String key, List<?> value) |
| [ClientMapBuilder1](#clientmapbuilder1) | additionalProperty(String key, Map<String, ?> value) |

## ClientMap
public static class ClientMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ClientMap](#clientmap) | of([Map<String, ? extends @Nullable Object>](#clientmapbuilder1) arg, SchemaConfiguration configuration) |
| String | client()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Client2Boxed
public sealed interface Client2Boxed<br>
permits<br>
[Client2BoxedString](#client2boxedstring)

sealed interface that stores validated payloads using boxed classes

## Client2BoxedString
public record Client2BoxedString<br>
implements [Client2Boxed](#client2boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Client2BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Client2
public static class Client2<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
