# GrandparentAnimal
org.openapijsonschematools.client.components.schemas.GrandparentAnimal.java
public class GrandparentAnimal

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [GrandparentAnimal.GrandparentAnimal1](#grandparentanimal1)<br> schema class |
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
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
GrandparentAnimal.GrandparentAnimalMap validatedPayload =
    GrandparentAnimal.GrandparentAnimal1.validate(
    MapMaker.makeMap(
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pet_type", [PetType.class](#pettype)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"pet_type"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [GrandparentAnimalMap](#grandparentanimalmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## GrandparentAnimalMap
public static class GrandparentAnimalMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [GrandparentAnimalMap](#grandparentanimalmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | pet_type()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **pet_type** | String |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## PetType
public static class PetType<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
