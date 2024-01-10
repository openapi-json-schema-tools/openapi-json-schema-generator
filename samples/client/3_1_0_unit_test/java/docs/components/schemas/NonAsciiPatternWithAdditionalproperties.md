# NonAsciiPatternWithAdditionalproperties
org.openapijsonschematools.client.components.schemas.NonAsciiPatternWithAdditionalproperties.java
public class NonAsciiPatternWithAdditionalproperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1](#nonasciipatternwithadditionalproperties1)<br> schema class |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalpropertiesMapBuilder](#nonasciipatternwithadditionalpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap)<br> output class for Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcute](#circumflexaccentlatinsmallletterawithacute)<br> schema class |
| static class | [NonAsciiPatternWithAdditionalproperties.AdditionalProperties](#additionalproperties)<br> schema class |

## NonAsciiPatternWithAdditionalproperties1
public static class NonAsciiPatternWithAdditionalproperties1<br>
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
NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalpropertiesMap validatedPayload =
    NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1.validate(
    new NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalpropertiesMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) | validate([Map&lt;?, ?&gt;](#nonasciipatternwithadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NonAsciiPatternWithAdditionalpropertiesMapBuilder
public class NonAsciiPatternWithAdditionalpropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonAsciiPatternWithAdditionalpropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## NonAsciiPatternWithAdditionalpropertiesMap
public static class NonAsciiPatternWithAdditionalpropertiesMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) | of([Map<String, Object>](#nonasciipatternwithadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |

## CircumflexAccentLatinSmallLetterAWithAcute
public static class CircumflexAccentLatinSmallLetterAWithAcute<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
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
