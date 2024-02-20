# Capitalization
org.openapijsonschematools.client.components.schemas.Capitalization.java
public class Capitalization<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Capitalization.Capitalization1Boxed](#capitalization1boxed)<br> abstract sealed validated payload class |
| record | [Capitalization.Capitalization1BoxedMap](#capitalization1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Capitalization.Capitalization1](#capitalization1)<br> schema class |
| static class | [Capitalization.CapitalizationMapBuilder](#capitalizationmapbuilder)<br> builder for Map payloads |
| static class | [Capitalization.CapitalizationMap](#capitalizationmap)<br> output class for Map payloads |
| sealed interface | [Capitalization.ATTNAMEBoxed](#attnameboxed)<br> abstract sealed validated payload class |
| record | [Capitalization.ATTNAMEBoxedString](#attnameboxedstring)<br> boxed class to store validated String payloads |
| static class | [Capitalization.ATTNAME](#attname)<br> schema class |
| sealed interface | [Capitalization.SCAETHFlowPointsBoxed](#scaethflowpointsboxed)<br> abstract sealed validated payload class |
| record | [Capitalization.SCAETHFlowPointsBoxedString](#scaethflowpointsboxedstring)<br> boxed class to store validated String payloads |
| static class | [Capitalization.SCAETHFlowPoints](#scaethflowpoints)<br> schema class |
| sealed interface | [Capitalization.CapitalSnakeBoxed](#capitalsnakeboxed)<br> abstract sealed validated payload class |
| record | [Capitalization.CapitalSnakeBoxedString](#capitalsnakeboxedstring)<br> boxed class to store validated String payloads |
| static class | [Capitalization.CapitalSnake](#capitalsnake)<br> schema class |
| sealed interface | [Capitalization.SmallSnakeBoxed](#smallsnakeboxed)<br> abstract sealed validated payload class |
| record | [Capitalization.SmallSnakeBoxedString](#smallsnakeboxedstring)<br> boxed class to store validated String payloads |
| static class | [Capitalization.SmallSnake](#smallsnake)<br> schema class |
| sealed interface | [Capitalization.CapitalCamelBoxed](#capitalcamelboxed)<br> abstract sealed validated payload class |
| record | [Capitalization.CapitalCamelBoxedString](#capitalcamelboxedstring)<br> boxed class to store validated String payloads |
| static class | [Capitalization.CapitalCamel](#capitalcamel)<br> schema class |
| sealed interface | [Capitalization.SmallCamelBoxed](#smallcamelboxed)<br> abstract sealed validated payload class |
| record | [Capitalization.SmallCamelBoxedString](#smallcamelboxedstring)<br> boxed class to store validated String payloads |
| static class | [Capitalization.SmallCamel](#smallcamel)<br> schema class |

## Capitalization1Boxed
public sealed interface Capitalization1Boxed<br>
permits<br>
[Capitalization1BoxedMap](#capitalization1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Capitalization1BoxedMap
public record Capitalization1BoxedMap<br>
implements [Capitalization1Boxed](#capitalization1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Capitalization1BoxedMap([CapitalizationMap](#capitalizationmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CapitalizationMap](#capitalizationmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [Capitalization1BoxedMap](#capitalization1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#capitalizationmapbuilder) arg, SchemaConfiguration configuration) |
| [Capitalization1Boxed](#capitalization1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface ATTNAMEBoxed<br>
permits<br>
[ATTNAMEBoxedString](#attnameboxedstring)

sealed interface that stores validated payloads using boxed classes

## ATTNAMEBoxedString
public record ATTNAMEBoxedString<br>
implements [ATTNAMEBoxed](#attnameboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ATTNAMEBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public sealed interface SCAETHFlowPointsBoxed<br>
permits<br>
[SCAETHFlowPointsBoxedString](#scaethflowpointsboxedstring)

sealed interface that stores validated payloads using boxed classes

## SCAETHFlowPointsBoxedString
public record SCAETHFlowPointsBoxedString<br>
implements [SCAETHFlowPointsBoxed](#scaethflowpointsboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SCAETHFlowPointsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SCAETHFlowPoints
public static class SCAETHFlowPoints<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## CapitalSnakeBoxed
public sealed interface CapitalSnakeBoxed<br>
permits<br>
[CapitalSnakeBoxedString](#capitalsnakeboxedstring)

sealed interface that stores validated payloads using boxed classes

## CapitalSnakeBoxedString
public record CapitalSnakeBoxedString<br>
implements [CapitalSnakeBoxed](#capitalsnakeboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CapitalSnakeBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CapitalSnake
public static class CapitalSnake<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## SmallSnakeBoxed
public sealed interface SmallSnakeBoxed<br>
permits<br>
[SmallSnakeBoxedString](#smallsnakeboxedstring)

sealed interface that stores validated payloads using boxed classes

## SmallSnakeBoxedString
public record SmallSnakeBoxedString<br>
implements [SmallSnakeBoxed](#smallsnakeboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SmallSnakeBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SmallSnake
public static class SmallSnake<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## CapitalCamelBoxed
public sealed interface CapitalCamelBoxed<br>
permits<br>
[CapitalCamelBoxedString](#capitalcamelboxedstring)

sealed interface that stores validated payloads using boxed classes

## CapitalCamelBoxedString
public record CapitalCamelBoxedString<br>
implements [CapitalCamelBoxed](#capitalcamelboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CapitalCamelBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CapitalCamel
public static class CapitalCamel<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## SmallCamelBoxed
public sealed interface SmallCamelBoxed<br>
permits<br>
[SmallCamelBoxedString](#smallcamelboxedstring)

sealed interface that stores validated payloads using boxed classes

## SmallCamelBoxedString
public record SmallCamelBoxedString<br>
implements [SmallCamelBoxed](#smallcamelboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SmallCamelBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SmallCamel
public static class SmallCamel<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
