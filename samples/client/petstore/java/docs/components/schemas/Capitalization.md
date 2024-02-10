# Capitalization
org.openapijsonschematools.client.components.schemas.Capitalization.java
public class Capitalization

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Capitalization.Capitalization1Boxed](#capitalization1boxed)<br> sealed validated payload class |
| static class | [Capitalization.Capitalization1](#capitalization1)<br> schema class |
| static class | [Capitalization.CapitalizationMapBuilder](#capitalizationmapbuilder)<br> builder for Map payloads |
| static class | [Capitalization.CapitalizationMap](#capitalizationmap)<br> output class for Map payloads |
| static class | [Capitalization.ATTNAMEBoxed](#attnameboxed)<br> sealed validated payload class |
| static class | [Capitalization.ATTNAME](#attname)<br> schema class |
| static class | [Capitalization.SCAETHFlowPointsBoxed](#scaethflowpointsboxed)<br> sealed validated payload class |
| static class | [Capitalization.SCAETHFlowPoints](#scaethflowpoints)<br> schema class |
| static class | [Capitalization.CapitalSnakeBoxed](#capitalsnakeboxed)<br> sealed validated payload class |
| static class | [Capitalization.CapitalSnake](#capitalsnake)<br> schema class |
| static class | [Capitalization.SmallSnakeBoxed](#smallsnakeboxed)<br> sealed validated payload class |
| static class | [Capitalization.SmallSnake](#smallsnake)<br> schema class |
| static class | [Capitalization.CapitalCamelBoxed](#capitalcamelboxed)<br> sealed validated payload class |
| static class | [Capitalization.CapitalCamel](#capitalcamel)<br> schema class |
| static class | [Capitalization.SmallCamelBoxed](#smallcamelboxed)<br> sealed validated payload class |
| static class | [Capitalization.SmallCamel](#smallcamel)<br> schema class |

## Capitalization1Boxed
public static abstract sealed class Capitalization1Boxed<br>
permits<br>
[Capitalization1BoxedMap](#capitalization1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Capitalization1
public static class Capitalization1<br>
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
Capitalization.CapitalizationMap validatedPayload =
    Capitalization.Capitalization1.validate(
    new Capitalization.CapitalizationMapBuilder()
        .smallCamel("a")

        .CapitalCamel("a")

        .small_Snake("a")

        .Capital_Snake("a")

        .SCA_ETH_Flow_Points("a")

        .ATT_NAME("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("smallCamel", [SmallCamel.class](#smallcamel))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("CapitalCamel", [CapitalCamel.class](#capitalcamel))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("small_Snake", [SmallSnake.class](#smallsnake))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("Capital_Snake", [CapitalSnake.class](#capitalsnake))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("SCA_ETH_Flow_Points", [SCAETHFlowPoints.class](#scaethflowpoints))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ATT_NAME", [ATTNAME.class](#attname)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CapitalizationMap](#capitalizationmap) | validate([Map&lt;?, ?&gt;](#capitalizationmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## CapitalizationMapBuilder
public class CapitalizationMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CapitalizationMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | smallCamel(String value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | CapitalCamel(String value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | small_Snake(String value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | Capital_Snake(String value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | SCA_ETH_Flow_Points(String value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | ATT_NAME(String value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | additionalProperty(String key, Void value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | additionalProperty(String key, boolean value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | additionalProperty(String key, String value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | additionalProperty(String key, int value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | additionalProperty(String key, float value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | additionalProperty(String key, long value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | additionalProperty(String key, double value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | additionalProperty(String key, List<?> value) |
| [CapitalizationMapBuilder](#capitalizationmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## CapitalizationMap
public static class CapitalizationMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CapitalizationMap](#capitalizationmap) | of([Map<String, ? extends @Nullable Object>](#capitalizationmapbuilder) arg, SchemaConfiguration configuration) |
| String | smallCamel()<br>[optional] |
| String | CapitalCamel()<br>[optional] |
| String | small_Snake()<br>[optional] |
| String | Capital_Snake()<br>[optional] |
| String | SCA_ETH_Flow_Points()<br>[optional] |
| String | ATT_NAME()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ATTNAMEBoxed
public static abstract sealed class ATTNAMEBoxed<br>
permits<br>
[ATTNAMEBoxedString](#attnameboxedstring)

A sealed class that stores validated payloads using boxed classes

## ATTNAME
public static class ATTNAME<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
Name of the pet<br>

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## SCAETHFlowPointsBoxed
public static abstract sealed class SCAETHFlowPointsBoxed<br>
permits<br>
[SCAETHFlowPointsBoxedString](#scaethflowpointsboxedstring)

A sealed class that stores validated payloads using boxed classes

## SCAETHFlowPoints
public static class SCAETHFlowPoints<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## CapitalSnakeBoxed
public static abstract sealed class CapitalSnakeBoxed<br>
permits<br>
[CapitalSnakeBoxedString](#capitalsnakeboxedstring)

A sealed class that stores validated payloads using boxed classes

## CapitalSnake
public static class CapitalSnake<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## SmallSnakeBoxed
public static abstract sealed class SmallSnakeBoxed<br>
permits<br>
[SmallSnakeBoxedString](#smallsnakeboxedstring)

A sealed class that stores validated payloads using boxed classes

## SmallSnake
public static class SmallSnake<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## CapitalCamelBoxed
public static abstract sealed class CapitalCamelBoxed<br>
permits<br>
[CapitalCamelBoxedString](#capitalcamelboxedstring)

A sealed class that stores validated payloads using boxed classes

## CapitalCamel
public static class CapitalCamel<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## SmallCamelBoxed
public static abstract sealed class SmallCamelBoxed<br>
permits<br>
[SmallCamelBoxedString](#smallcamelboxedstring)

A sealed class that stores validated payloads using boxed classes

## SmallCamel
public static class SmallCamel<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
