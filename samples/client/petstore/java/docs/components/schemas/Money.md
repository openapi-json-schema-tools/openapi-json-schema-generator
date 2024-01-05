# Money
org.openapijsonschematools.client.components.schemas.Money.java
public class Money

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Money.Money1](#money1)<br> schema class |
| static class | [Money.MoneyMapBuilder](#moneymapbuilder)<br> builder for Map payloads |
| static class | [Money.MoneyMap](#moneymap)<br> output class for Map payloads |
| static class | [Money.Amount](#amount)<br> schema class |
| static class | [Money.AdditionalProperties](#additionalproperties)<br> schema class |

## Money1
public static class Money1<br>
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
Money.MoneyMap validatedPayload =
    Money.Money1.validate(
    new Money.MoneyMapBuilder()
        .amount("3.14")

        .currency("eur")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("amount", [Amount.class](#amount))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("currency", [Currency.Currency1.class](../../components/schemas/Currency.md#currency1))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"amount",<br>&nbsp;&nbsp;&nbsp;&nbsp;"currency"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MoneyMap](#moneymap) | validate([Map&lt;?, ?&gt;](#moneymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MoneyMap00Builder
public class MoneyMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MoneyMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## MoneyMap01Builder
public class MoneyMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MoneyMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MoneyMap00Builder](#moneymap00builder) | currency(String value) |
| [MoneyMap00Builder](#moneymap00builder) | currency([Currency.StringCurrencyEnums](../../components/schemas/Currency.md#stringcurrencyenums) value) |

## MoneyMap10Builder
public class MoneyMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MoneyMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MoneyMap00Builder](#moneymap00builder) | amount(String value) |

## MoneyMapBuilder
public class MoneyMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MoneyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MoneyMap01Builder](#moneymap01builder) | amount(String value) |
| [MoneyMap10Builder](#moneymap10builder) | currency(String value) |
| [MoneyMap10Builder](#moneymap10builder) | currency([Currency.StringCurrencyEnums](../../components/schemas/Currency.md#stringcurrencyenums) value) |

## MoneyMap
public static class MoneyMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MoneyMap](#moneymap) | of([Map<String, ? extends @Nullable Object>](#moneymapbuilder) arg, SchemaConfiguration configuration) |
| String | amount()<br> value must be int or float numeric |
| String | currency()<br> |

## Amount
public static class Amount<br>
extends DecimalJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DecimalJsonSchema |
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
