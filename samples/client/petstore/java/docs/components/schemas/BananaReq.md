# BananaReq
org.openapijsonschematools.client.components.schemas.BananaReq.java
public class BananaReq

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [BananaReq.BananaReq1](#bananareq1)<br> schema class |
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
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
BananaReq.BananaReqMap validatedPayload =
    BananaReq.BananaReq1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "lengthCm",
            1
        ),
        new AbstractMap.SimpleEntry<>(
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("lengthCm", [LengthCm.class](#lengthcm))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("sweet", [Sweet.class](#sweet)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"lengthCm"<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties.class](#additionalproperties)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BananaReqMap](#bananareqmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## BananaReqMap
public static class BananaReqMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BananaReqMap](#bananareqmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | lengthCm()<br> |
| boolean | sweet()<br>[optional] |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **lengthCm** | Number |  | |
| **sweet** | boolean |  | [optional] |

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
