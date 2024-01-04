# PublicKey
org.openapijsonschematools.client.components.schemas.PublicKey.java
public class PublicKey

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PublicKey.PublicKey1](#publickey1)<br> schema class |
| static class | [PublicKey.PublicKeyMapBuilder](#publickeymapbuilder)<br> builder for Map payloads |
| static class | [PublicKey.PublicKeyMap](#publickeymap)<br> output class for Map payloads |
| static class | [PublicKey.Key](#key)<br> schema class |

## PublicKey1
public static class PublicKey1<br>
extends JsonSchema

A schema class that validates payloads

## Description
schema that contains a property named key

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
PublicKey.PublicKeyMap validatedPayload =
    PublicKey.PublicKey1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<>(
            "key",
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("key", [Key.class](#key)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PublicKeyMap](#publickeymap) | validate([Map&lt;?, ?&gt;](#publickeymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PublicKeyMapBuilder
public class PublicKeyMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| PublicKeyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [PublicKeyMapBuilder](#publickeymapbuilder) | key(String value) |
| [PublicKeyMapBuilder](#publickeymapbuilder) | additionalProperty(String key, Void value) |
| [PublicKeyMapBuilder](#publickeymapbuilder) | additionalProperty(String key, boolean value) |
| [PublicKeyMapBuilder](#publickeymapbuilder) | additionalProperty(String key, String value) |
| [PublicKeyMapBuilder](#publickeymapbuilder) | additionalProperty(String key, int value) |
| [PublicKeyMapBuilder](#publickeymapbuilder) | additionalProperty(String key, float value) |
| [PublicKeyMapBuilder](#publickeymapbuilder) | additionalProperty(String key, long value) |
| [PublicKeyMapBuilder](#publickeymapbuilder) | additionalProperty(String key, double value) |
| [PublicKeyMapBuilder](#publickeymapbuilder) | additionalProperty(String key, List<?> value) |
| [PublicKeyMapBuilder](#publickeymapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## PublicKeyMap
public static class PublicKeyMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PublicKeyMap](#publickeymap) | of([Map<String, ? extends @Nullable Object>](#publickeymapbuilder) arg, SchemaConfiguration configuration) |
| String | key()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Key
public static class Key<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
