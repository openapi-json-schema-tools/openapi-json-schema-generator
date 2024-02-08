# AppleReq
org.openapijsonschematools.client.components.schemas.AppleReq.java
public class AppleReq

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AppleReq.AppleReq1](#applereq1)<br> schema class |
| static class | [AppleReq.AppleReqMapBuilder](#applereqmapbuilder)<br> builder for Map payloads |
| static class | [AppleReq.AppleReqMap](#applereqmap)<br> output class for Map payloads |
| static class | [AppleReq.Mealy](#mealy)<br> schema class |
| static class | [AppleReq.Cultivar](#cultivar)<br> schema class |
| static class | [AppleReq.AdditionalProperties](#additionalproperties)<br> schema class |

## AppleReq1
public static class AppleReq1<br>
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
AppleReq.AppleReqMap validatedPayload =
    AppleReq.AppleReq1.validate(
    new AppleReq.AppleReqMapBuilder()
        .cultivar("a")

        .mealy(true)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("cultivar", [Cultivar.class](#cultivar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("mealy", [Mealy.class](#mealy)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"cultivar"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AppleReqMap](#applereqmap) | validate([Map&lt;?, ?&gt;](#applereqmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AppleReqMap0Builder
public class AppleReqMap0Builder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AppleReqMap0Builder(Map<String, Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AppleReqMap0Builder](#applereqmap0builder) | mealy(boolean value) |

## AppleReqMapBuilder
public class AppleReqMapBuilder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AppleReqMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AppleReqMap0Builder](#applereqmap0builder) | cultivar(String value) |

## AppleReqMap
public static class AppleReqMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AppleReqMap](#applereqmap) | of([Map<String, Object>](#applereqmapbuilder) arg, SchemaConfiguration configuration) |
| String | cultivar()<br> |
| boolean | mealy()<br>[optional] |

## Mealy
public static class Mealy<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |

## Cultivar
public static class Cultivar<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
