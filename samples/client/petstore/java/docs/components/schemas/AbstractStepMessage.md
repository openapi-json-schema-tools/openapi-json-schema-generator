# AbstractStepMessage
org.openapijsonschematools.client.components.schemas.AbstractStepMessage.java
public class AbstractStepMessage

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AbstractStepMessage.AbstractStepMessage1](#abstractstepmessage1)<br> schema class |
| static class | [AbstractStepMessage.AbstractStepMessageMapInput](#abstractstepmessagemapinput)<br> builder for Map payloads |
| static class | [AbstractStepMessage.AbstractStepMessageMap](#abstractstepmessagemap)<br> output class for Map payloads |
| static class | [AbstractStepMessage.Discriminator](#discriminator)<br> schema class |

## AbstractStepMessage1
public static class AbstractStepMessage1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Abstract Step

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
AbstractStepMessage.AbstractStepMessageMap validatedPayload =
    AbstractStepMessage.AbstractStepMessage1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "discriminator",
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("discriminator", [Discriminator.class](#discriminator)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"description",<br>&nbsp;&nbsp;&nbsp;&nbsp;"discriminator",<br>&nbsp;&nbsp;&nbsp;&nbsp;"sequenceNumber"<br>)<br> |
| List<Class<? extends JsonSchema>> | anyOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[AbstractStepMessage1.class](#abstractstepmessage1)<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AbstractStepMessageMap](#abstractstepmessagemap) | validate([Map<?, ?>](#abstractstepmessagemapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AbstractStepMessageMapInput
public class AbstractStepMessageMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **description** | ? extends @Nullable Object |  | |
| **discriminator** | String |  | |
| **sequenceNumber** | ? extends @Nullable Object |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## AbstractStepMessageMap
public static class AbstractStepMessageMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AbstractStepMessageMap](#abstractstepmessagemap) | of([Map<String, ? extends @Nullable Object>](#abstractstepmessagemapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | description()<br> |
| String | discriminator()<br> |
| @Nullable Object | sequenceNumber()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Discriminator
public static class Discriminator<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
