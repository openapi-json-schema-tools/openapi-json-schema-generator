# Player
org.openapijsonschematools.client.components.schemas.Player.java
public class Player

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Player.Player1Boxed](#player1boxed)<br> sealed validated payload class |
| static class | [Player.Player1](#player1)<br> schema class |
| static class | [Player.PlayerMapBuilder](#playermapbuilder)<br> builder for Map payloads |
| static class | [Player.PlayerMap](#playermap)<br> output class for Map payloads |
| static class | [Player.NameBoxed](#nameboxed)<br> sealed validated payload class |
| static class | [Player.Name](#name)<br> schema class |

## Player1Boxed
public static abstract sealed class Player1Boxed<br>
permits<br>
[Player1BoxedMap](#player1boxedmap)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class NameBoxed<br>
permits<br>
[NameBoxedString](#nameboxedstring)

A sealed class that stores validated payloads using boxed classes

## Name
public static class Name<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
