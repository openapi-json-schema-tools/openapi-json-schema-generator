# AdditionalpropertiesCanExistByItself
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesCanExistByItself.java
public class AdditionalpropertiesCanExistByItself

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1](#additionalpropertiescanexistbyitself1)<br> schema class |
| static class | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMapInput](#additionalpropertiescanexistbyitselfmapinput)<br> builder for Map payloads |
| static class | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap)<br> output class for Map payloads |
| static class | [AdditionalpropertiesCanExistByItself.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesCanExistByItself1
public static class AdditionalpropertiesCanExistByItself1<br>
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
AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMap validatedPayload =
    AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1.validate(
    MapMaker.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(FrozenMap.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties.class](#additionalproperties)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap) | validate([Map<String, Boolean>](#additionalpropertiescanexistbyitselfmapinput) arg, SchemaConfiguration configuration) |

## AdditionalpropertiesCanExistByItselfMapInput
public class AdditionalpropertiesCanExistByItselfMapInput<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | boolean | any string name can be used but the value must be the correct type | [optional] |

## AdditionalpropertiesCanExistByItselfMap
public static class AdditionalpropertiesCanExistByItselfMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap) | of([Map<String, Boolean>](#additionalpropertiescanexistbyitselfmapinput) arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties
public static class AdditionalProperties<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
