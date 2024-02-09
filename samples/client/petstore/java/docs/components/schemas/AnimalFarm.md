# AnimalFarm
org.openapijsonschematools.client.components.schemas.AnimalFarm.java
public class AnimalFarm

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AnimalFarm.AnimalFarm1Boxed](#animalfarm1boxed)<br> sealed validated payload class |
| static class | [AnimalFarm.AnimalFarm1](#animalfarm1)<br> schema class |
| static class | [AnimalFarm.AnimalFarmListBuilder](#animalfarmlistbuilder)<br> builder for List payloads |
| static class | [AnimalFarm.AnimalFarmList](#animalfarmlist)<br> output class for List payloads |

## AnimalFarm1Boxed
public static abstract sealed class AnimalFarm1Boxed<br>

## AnimalFarm1
public static class AnimalFarm1<br>
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

// List validation
AnimalFarm.AnimalFarmList validatedPayload =
    AnimalFarm.AnimalFarm1.validate(
    new AnimalFarm.AnimalFarmListBuilder()
        .add(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "className",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, String>(
                    "color",
                    "a"
                )
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Animal.Animal1.class](../../components/schemas/Animal.md#animal1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AnimalFarmList](#animalfarmlist) | validate([List<?>](#animalfarmlistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AnimalFarmListBuilder
public class AnimalFarmListBuilder<br>
builder for `List<Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnimalFarmListBuilder()<br>Creates an empty list |
| AnimalFarmListBuilder(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| AnimalFarmListBuilder | add(Map<String, @Nullable Object> item) |
| List<Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## AnimalFarmList
public class AnimalFarmList<br>
extends `FrozenList<Animal.AnimalMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnimalFarmList](#animalfarmlist) | of([List<Map<String, ? extends @Nullable Object>>](#animalfarmlistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
