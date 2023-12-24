# AnimalFarm
org.openapijsonschematools.client.components.schemas.AnimalFarm.java
public class AnimalFarm

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AnimalFarm.AnimalFarm1](#animalfarm1)<br> schema class |
| static class | [AnimalFarm.AnimalFarmListInput](#animalfarmlistinput)<br> builder for List payloads |
| static class | [AnimalFarm.AnimalFarmList](#animalfarmlist)<br> output class for List payloads |

## AnimalFarm1
public static class AnimalFarm1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
AnimalFarm.AnimalFarmList validatedPayload =
    AnimalFarm.AnimalFarm1.validate(
    Arrays.asList(
        MapMaker.makeMap(
            new AbstractMap.SimpleEntry<String, String>(
                "className",
                "a"
            ),
            new AbstractMap.SimpleEntry<String, String>(
                "color",
                "a"
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(List.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [Animal.Animal1.class](../../components/schemas/Animal.md#animal1)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnimalFarmList](#animalfarmlist) | validate([List<Map<String, ? extends @Nullable Object>>](#animalfarmlistinput) arg, SchemaConfiguration configuration) |

## AnimalFarmListInput
public class AnimalFarmListInput<br>
builder for `List<Map<String, ? extends @Nullable Object>>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, ? extends @Nullable Object> |  |

## AnimalFarmList
public class AnimalFarmList<br>
extends `FrozenList<Animal.AnimalMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnimalFarmList](#animalfarmlist) | of([List<Map<String, ? extends @Nullable Object>>](#animalfarmlistinput) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
