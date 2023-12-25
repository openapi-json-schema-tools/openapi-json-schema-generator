# Capitalization
org.openapijsonschematools.client.components.schemas.Capitalization.java
public class Capitalization

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Capitalization.Capitalization1](#capitalization1)<br> schema class |
| static class | [Capitalization.CapitalizationMapInput](#capitalizationmapinput)<br> builder for Map payloads |
| static class | [Capitalization.CapitalizationMap](#capitalizationmap)<br> output class for Map payloads |
| static class | [Capitalization.ATTNAME](#attname)<br> schema class |
| static class | [Capitalization.SCAETHFlowPoints](#scaethflowpoints)<br> schema class |
| static class | [Capitalization.CapitalSnake](#capitalsnake)<br> schema class |
| static class | [Capitalization.SmallSnake](#smallsnake)<br> schema class |
| static class | [Capitalization.CapitalCamel](#capitalcamel)<br> schema class |
| static class | [Capitalization.SmallCamel](#smallcamel)<br> schema class |

## Capitalization1
public static class Capitalization1<br>
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
Capitalization.CapitalizationMap validatedPayload =
    Capitalization.Capitalization1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, String>(
            "smallCamel",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, String>(
            "CapitalCamel",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, String>(
            "small_Snake",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, String>(
            "Capital_Snake",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, String>(
            "SCA_ETH_Flow_Points",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, String>(
            "ATT_NAME",
            "a"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("smallCamel", [SmallCamel.class](#smallcamel))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("CapitalCamel", [CapitalCamel.class](#capitalcamel))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("small_Snake", [SmallSnake.class](#smallsnake))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("Capital_Snake", [CapitalSnake.class](#capitalsnake))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("SCA_ETH_Flow_Points", [SCAETHFlowPoints.class](#scaethflowpoints))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ATT_NAME", [ATTNAME.class](#attname)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CapitalizationMap](#capitalizationmap) | validate([Map<?, ?>](#capitalizationmapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## CapitalizationMapInput
public class CapitalizationMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **smallCamel** | String |  | [optional] |
| **CapitalCamel** | String |  | [optional] |
| **small_Snake** | String |  | [optional] |
| **Capital_Snake** | String |  | [optional] |
| **SCA_ETH_Flow_Points** | String |  | [optional] |
| **ATT_NAME** | String | Name of the pet<br> | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## CapitalizationMap
public static class CapitalizationMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CapitalizationMap](#capitalizationmap) | of([Map<String, ? extends @Nullable Object>](#capitalizationmapinput) arg, SchemaConfiguration configuration) |
| String | smallCamel()<br>[optional] |
| String | CapitalCamel()<br>[optional] |
| String | small_Snake()<br>[optional] |
| String | Capital_Snake()<br>[optional] |
| String | SCA_ETH_Flow_Points()<br>[optional] |
| String | ATT_NAME()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ATTNAME
public static class ATTNAME<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
Name of the pet<br>

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## SCAETHFlowPoints
public static class SCAETHFlowPoints<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## CapitalSnake
public static class CapitalSnake<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## SmallSnake
public static class SmallSnake<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## CapitalCamel
public static class CapitalCamel<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## SmallCamel
public static class SmallCamel<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
