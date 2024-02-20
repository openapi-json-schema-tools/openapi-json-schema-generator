# GrandparentAnimal
org.openapijsonschematools.client.components.schemas.GrandparentAnimal.java
public class GrandparentAnimal<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [GrandparentAnimal.GrandparentAnimal1Boxed](#grandparentanimal1boxed)<br> abstract sealed validated payload class |
| record | [GrandparentAnimal.GrandparentAnimal1BoxedMap](#grandparentanimal1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [GrandparentAnimal.GrandparentAnimal1](#grandparentanimal1)<br> schema class |
| static class | [GrandparentAnimal.GrandparentAnimalMapBuilder](#grandparentanimalmapbuilder)<br> builder for Map payloads |
| static class | [GrandparentAnimal.GrandparentAnimalMap](#grandparentanimalmap)<br> output class for Map payloads |
| sealed interface | [GrandparentAnimal.PetTypeBoxed](#pettypeboxed)<br> abstract sealed validated payload class |
| record | [GrandparentAnimal.PetTypeBoxedString](#pettypeboxedstring)<br> boxed class to store validated String payloads |
| static class | [GrandparentAnimal.PetType](#pettype)<br> schema class |

## GrandparentAnimal1Boxed
public sealed interface GrandparentAnimal1Boxed<br>
permits<br>
[GrandparentAnimal1BoxedMap](#grandparentanimal1boxedmap)

sealed interface that stores validated payloads using boxed classes

## GrandparentAnimal1BoxedMap
public record GrandparentAnimal1BoxedMap<br>
implements [GrandparentAnimal1Boxed](#grandparentanimal1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GrandparentAnimal1BoxedMap([GrandparentAnimalMap](#grandparentanimalmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [GrandparentAnimalMap](#grandparentanimalmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
    new GrandparentAnimal.GrandparentAnimalMapBuilder()
        .pet_type("a")

    .build(),
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
| [GrandparentAnimal1BoxedMap](#grandparentanimal1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#grandparentanimalmapbuilder) arg, SchemaConfiguration configuration) |
| [GrandparentAnimal1Boxed](#grandparentanimal1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## GrandparentAnimalMap0Builder
public class GrandparentAnimalMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
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

### Constructor Summary
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

## PetTypeBoxed
public sealed interface PetTypeBoxed<br>
permits<br>
[PetTypeBoxedString](#pettypeboxedstring)

sealed interface that stores validated payloads using boxed classes

## PetTypeBoxedString
public record PetTypeBoxedString<br>
implements [PetTypeBoxed](#pettypeboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetTypeBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetType
public static class PetType<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
