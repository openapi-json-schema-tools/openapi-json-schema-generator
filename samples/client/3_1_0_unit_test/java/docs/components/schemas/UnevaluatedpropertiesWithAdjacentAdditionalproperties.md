# UnevaluatedpropertiesWithAdjacentAdditionalproperties
org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesWithAdjacentAdditionalproperties.java
public class UnevaluatedpropertiesWithAdjacentAdditionalproperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1](#unevaluatedpropertieswithadjacentadditionalproperties1)<br> schema class |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedProperties](#unevaluatedproperties)<br> schema class |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap)<br> output class for Map payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.Foo](#foo)<br> schema class |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalProperties](#additionalproperties)<br> schema class |

## UnevaluatedpropertiesWithAdjacentAdditionalproperties1
public static class UnevaluatedpropertiesWithAdjacentAdditionalproperties1<br>
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
UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap validatedPayload =
    UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1.validate(
    new UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder()
        .foo("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap) | validate([Map&lt;?, ?&gt;](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UnevaluatedProperties
public static class UnevaluatedProperties<br>
extends NotAnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder
public class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | foo(String value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, Void value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, boolean value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, String value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, int value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, float value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, long value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, double value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, List<?> value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap
public static class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap) | of([Map<String, ? extends @Nullable Object>](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| String | foo()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foo
public static class Foo<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AdditionalProperties
public static class AdditionalProperties<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
