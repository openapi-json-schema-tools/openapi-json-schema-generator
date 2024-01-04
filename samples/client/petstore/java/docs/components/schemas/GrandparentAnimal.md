# GrandparentAnimal
org.openapijsonschematools.client.components.schemas.GrandparentAnimal.java
public class GrandparentAnimal

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [GrandparentAnimal.GrandparentAnimal1](#grandparentanimal1)<br> schema class |
| static class | [GrandparentAnimal.GrandparentAnimalMapBuilder](#grandparentanimalmapbuilder)<br> builder for Map payloads |
| static class | [GrandparentAnimal.GrandparentAnimalMap](#grandparentanimalmap)<br> output class for Map payloads |
| static class | [GrandparentAnimal.PetType](#pettype)<br> schema class |

## GrandparentAnimal1
public static class GrandparentAnimal1<br>
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
GrandparentAnimal.GrandparentAnimalMap validatedPayload =
    GrandparentAnimal.GrandparentAnimal1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<>(
            "pet_type",
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pet_type", [PetType.class](#pettype)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"pet_type"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [GrandparentAnimalMap](#grandparentanimalmap) | validate([Map&lt;?, ?&gt;](#grandparentanimalmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## GrandparentAnimalMap0Builder
public class GrandparentAnimalMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| GrandparentAnimalMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [GrandparentAnimalMap0Builder](#grandparentanimalmap0builder) | additionalProperty(String key, Void value) |
| [GrandparentAnimalMap0Builder](#grandparentanimalmap0builder) | additionalProperty(String key, boolean value) |
| [GrandparentAnimalMap0Builder](#grandparentanimalmap0builder) | additionalProperty(String key, String value) |
| [GrandparentAnimalMap0Builder](#grandparentanimalmap0builder) | additionalProperty(String key, int value) |
| [GrandparentAnimalMap0Builder](#grandparentanimalmap0builder) | additionalProperty(String key, float value) |
| [GrandparentAnimalMap0Builder](#grandparentanimalmap0builder) | additionalProperty(String key, long value) |
| [GrandparentAnimalMap0Builder](#grandparentanimalmap0builder) | additionalProperty(String key, double value) |
| [GrandparentAnimalMap0Builder](#grandparentanimalmap0builder) | additionalProperty(String key, List<?> value) |
| [GrandparentAnimalMap0Builder](#grandparentanimalmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## GrandparentAnimalMapBuilder
public class GrandparentAnimalMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| GrandparentAnimalMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [GrandparentAnimalMap0Builder](#grandparentanimalmap0builder) | pet_type(String value) |

## GrandparentAnimalMap
public static class GrandparentAnimalMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [GrandparentAnimalMap](#grandparentanimalmap) | of([Map<String, ? extends @Nullable Object>](#grandparentanimalmapbuilder) arg, SchemaConfiguration configuration) |
| String | pet_type()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## PetType
public static class PetType<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
