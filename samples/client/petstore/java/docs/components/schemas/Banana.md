# Banana
org.openapijsonschematools.client.components.schemas.Banana.java
public class Banana

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Banana.Banana1Boxed](#banana1boxed)<br> abstract sealed validated payload class |
| static class | [Banana.Banana1BoxedMap](#banana1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Banana.Banana1](#banana1)<br> schema class |
| static class | [Banana.BananaMapBuilder](#bananamapbuilder)<br> builder for Map payloads |
| static class | [Banana.BananaMap](#bananamap)<br> output class for Map payloads |
| static class | [Banana.LengthCmBoxed](#lengthcmboxed)<br> abstract sealed validated payload class |
| static class | [Banana.LengthCmBoxedNumber](#lengthcmboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Banana.LengthCm](#lengthcm)<br> schema class |

## Banana1Boxed
public static abstract sealed class Banana1Boxed<br>
permits<br>
[Banana1BoxedMap](#banana1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Banana1BoxedMap
public static final class Banana1BoxedMap<br>
extends [Banana1Boxed](#banana1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Banana1BoxedMap([BananaMap](#bananamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [BananaMap](#bananamap) | data<br>validated payload |

## Banana1
public static class Banana1<br>
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
Banana.BananaMap validatedPayload =
    Banana.Banana1.validate(
    new Banana.BananaMapBuilder()
        .lengthCm(1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("lengthCm", [LengthCm.class](#lengthcm)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"lengthCm"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [BananaMap](#bananamap) | validate([Map&lt;?, ?&gt;](#bananamapbuilder) arg, SchemaConfiguration configuration) |
| [Banana1BoxedMap](#banana1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#bananamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BananaMap0Builder
public class BananaMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BananaMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [BananaMap0Builder](#bananamap0builder) | additionalProperty(String key, Void value) |
| [BananaMap0Builder](#bananamap0builder) | additionalProperty(String key, boolean value) |
| [BananaMap0Builder](#bananamap0builder) | additionalProperty(String key, String value) |
| [BananaMap0Builder](#bananamap0builder) | additionalProperty(String key, int value) |
| [BananaMap0Builder](#bananamap0builder) | additionalProperty(String key, float value) |
| [BananaMap0Builder](#bananamap0builder) | additionalProperty(String key, long value) |
| [BananaMap0Builder](#bananamap0builder) | additionalProperty(String key, double value) |
| [BananaMap0Builder](#bananamap0builder) | additionalProperty(String key, List<?> value) |
| [BananaMap0Builder](#bananamap0builder) | additionalProperty(String key, Map<String, ?> value) |

## BananaMapBuilder
public class BananaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BananaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [BananaMap0Builder](#bananamap0builder) | lengthCm(int value) |
| [BananaMap0Builder](#bananamap0builder) | lengthCm(float value) |
| [BananaMap0Builder](#bananamap0builder) | lengthCm(long value) |
| [BananaMap0Builder](#bananamap0builder) | lengthCm(double value) |

## BananaMap
public static class BananaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BananaMap](#bananamap) | of([Map<String, ? extends @Nullable Object>](#bananamapbuilder) arg, SchemaConfiguration configuration) |
| Number | lengthCm()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## LengthCmBoxed
public static abstract sealed class LengthCmBoxed<br>
permits<br>
[LengthCmBoxedNumber](#lengthcmboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## LengthCmBoxedNumber
public static final class LengthCmBoxedNumber<br>
extends [LengthCmBoxed](#lengthcmboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| LengthCmBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## LengthCm
public static class LengthCm<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
