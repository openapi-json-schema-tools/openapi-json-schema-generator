# Player
org.openapijsonschematools.client.components.schemas.Player.java
public class Player<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Player.Player1Boxed](#player1boxed)<br> abstract sealed validated payload class |
| record | [Player.Player1BoxedMap](#player1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Player.Player1](#player1)<br> schema class |
| static class | [Player.PlayerMapBuilder](#playermapbuilder)<br> builder for Map payloads |
| static class | [Player.PlayerMap](#playermap)<br> output class for Map payloads |
| sealed interface | [Player.NameBoxed](#nameboxed)<br> abstract sealed validated payload class |
| record | [Player.NameBoxedString](#nameboxedstring)<br> boxed class to store validated String payloads |
| static class | [Player.Name](#name)<br> schema class |

## Player1Boxed
public sealed interface Player1Boxed<br>
permits<br>
[Player1BoxedMap](#player1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Player1BoxedMap
public record Player1BoxedMap<br>
implements [Player1Boxed](#player1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Player1BoxedMap([PlayerMap](#playermap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PlayerMap](#playermap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Player1
public static class Player1<br>
extends JsonSchema

A schema class that validates payloads

## Description
a model that includes a self reference this forces properties and additionalProperties to be lazy loaded in python models because the Player class has not fully loaded when defining properties

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
Player.PlayerMap validatedPayload =
    Player.Player1.validate(
    new Player.PlayerMapBuilder()
        .name("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name.class](#name))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enemyPlayer", [Player1.class](#player1)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PlayerMap](#playermap) | validate([Map&lt;?, ?&gt;](#playermapbuilder) arg, SchemaConfiguration configuration) |
| [Player1BoxedMap](#player1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#playermapbuilder) arg, SchemaConfiguration configuration) |
| [Player1Boxed](#player1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PlayerMapBuilder
public class PlayerMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PlayerMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [PlayerMapBuilder](#playermapbuilder) | name(String value) |
| [PlayerMapBuilder](#playermapbuilder) | enemyPlayer(Map<String, @Nullable Object> value) |
| [PlayerMapBuilder](#playermapbuilder) | additionalProperty(String key, Void value) |
| [PlayerMapBuilder](#playermapbuilder) | additionalProperty(String key, boolean value) |
| [PlayerMapBuilder](#playermapbuilder) | additionalProperty(String key, String value) |
| [PlayerMapBuilder](#playermapbuilder) | additionalProperty(String key, int value) |
| [PlayerMapBuilder](#playermapbuilder) | additionalProperty(String key, float value) |
| [PlayerMapBuilder](#playermapbuilder) | additionalProperty(String key, long value) |
| [PlayerMapBuilder](#playermapbuilder) | additionalProperty(String key, double value) |
| [PlayerMapBuilder](#playermapbuilder) | additionalProperty(String key, List<?> value) |
| [PlayerMapBuilder](#playermapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## PlayerMap
public static class PlayerMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PlayerMap](#playermap) | of([Map<String, ? extends @Nullable Object>](#playermapbuilder) arg, SchemaConfiguration configuration) |
| String | name()<br>[optional] |
| [PlayerMap](#playermap) | enemyPlayer()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## NameBoxed
public sealed interface NameBoxed<br>
permits<br>
[NameBoxedString](#nameboxedstring)

sealed interface that stores validated payloads using boxed classes

## NameBoxedString
public record NameBoxedString<br>
implements [NameBoxed](#nameboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NameBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Name
public static class Name<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
