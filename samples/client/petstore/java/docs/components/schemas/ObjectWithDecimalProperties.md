# ObjectWithDecimalProperties
org.openapijsonschematools.client.components.schemas.ObjectWithDecimalProperties.java
public class ObjectWithDecimalProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithDecimalProperties.ObjectWithDecimalProperties1](#objectwithdecimalproperties1)<br> schema class |
| static class | [ObjectWithDecimalProperties.ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithDecimalProperties.ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap)<br> output class for Map payloads |
| static class | [ObjectWithDecimalProperties.Width](#width)<br> schema class |

## ObjectWithDecimalProperties1
public static class ObjectWithDecimalProperties1<br>
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
ObjectWithDecimalProperties.ObjectWithDecimalPropertiesMap validatedPayload =
    ObjectWithDecimalProperties.ObjectWithDecimalProperties1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "length",
            "3.14"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "width",
            "3.14"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "cost",
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "amount",
                    "3.14"
                ),
                new AbstractMap.SimpleEntry<String, String>(
                    "currency",
                    "eur"
                )
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("length", [DecimalPayload.DecimalPayload1.class](../../components/schemas/DecimalPayload.md#decimalpayload1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("width", [Width.class](#width))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("cost", [Money.Money1.class](../../components/schemas/Money.md#money1))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap) | validate([Map&lt;?, ?&gt;](#objectwithdecimalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithDecimalPropertiesMapBuilder
public class ObjectWithDecimalPropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithDecimalPropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | length(Void value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | length(boolean value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | length(String value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | length(int value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | length(float value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | length(long value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | length(double value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | length(List<?> value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | length(Map<String, ?> value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | width(String value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | cost(Void value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | cost(boolean value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | cost(String value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | cost(int value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | cost(float value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | cost(long value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | cost(double value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | cost(List<?> value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | cost(Map<String, ?> value) |

## ObjectWithDecimalPropertiesMap
public static class ObjectWithDecimalPropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap) | of([Map<String, ? extends @Nullable Object>](#objectwithdecimalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| String | length()<br>[optional] |
| String | width()<br>[optional] value must be int or float numeric |
| [Money.MoneyMap](../../components/schemas/Money.md#moneymap) | cost()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Width
public static class Width<br>
extends DecimalJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DecimalJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
