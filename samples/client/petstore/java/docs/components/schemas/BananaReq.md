# BananaReq
org.openapijsonschematools.client.components.schemas.BananaReq.java
public class BananaReq

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [BananaReq.BananaReq1](#bananareq1)<br> schema class |
| static class | [BananaReq.BananaReqMapBuilder](#bananareqmapbuilder)<br> builder for Map payloads |
| static class | [BananaReq.BananaReqMap](#bananareqmap)<br> output class for Map payloads |
| static class | [BananaReq.Sweet](#sweet)<br> schema class |
| static class | [BananaReq.LengthCm](#lengthcm)<br> schema class |
| static class | [BananaReq.AdditionalProperties](#additionalproperties)<br> schema class |

## BananaReq1
public static class BananaReq1<br>
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
BananaReq.BananaReqMap validatedPayload =
    BananaReq.BananaReq1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "lengthCm",
            1
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "sweet",
            true
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("lengthCm", [LengthCm.class](#lengthcm))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("sweet", [Sweet.class](#sweet)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"lengthCm"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [BananaReqMap](#bananareqmap) | validate([Map&lt;?, ?&gt;](#bananareqmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BananaReqMap0Builder
public class BananaReqMap0Builder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| BananaReqMap0Builder(Map<String, Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Object> | build()<br>Returns map input that should be used with Schema.validate |
| [BananaReqMap0Builder](#bananareqmap0builder) | sweet(boolean value) |

## BananaReqMapBuilder
public class BananaReqMapBuilder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| BananaReqMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [BananaReqMap0Builder](#bananareqmap0builder) | lengthCm(int value) |
| [BananaReqMap0Builder](#bananareqmap0builder) | lengthCm(float value) |
| [BananaReqMap0Builder](#bananareqmap0builder) | lengthCm(long value) |
| [BananaReqMap0Builder](#bananareqmap0builder) | lengthCm(double value) |

## BananaReqMap
public static class BananaReqMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BananaReqMap](#bananareqmap) | of([Map<String, Object>](#bananareqmapbuilder) arg, SchemaConfiguration configuration) |
| Number | lengthCm()<br> |
| boolean | sweet()<br>[optional] |

## Sweet
public static class Sweet<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## LengthCm
public static class LengthCm<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
