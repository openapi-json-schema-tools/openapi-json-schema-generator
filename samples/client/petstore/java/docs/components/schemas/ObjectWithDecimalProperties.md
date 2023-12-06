# ObjectWithDecimalProperties
org.openapijsonschematools.client.components.schemas.ObjectWithDecimalProperties.java
public class ObjectWithDecimalProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to store list input interfaces, extends List

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithDecimalProperties.ObjectWithDecimalProperties1](#objectwithdecimalproperties1)<br> schema class |
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
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ObjectWithDecimalProperties.ObjectWithDecimalPropertiesMap validatedPayload =
    ObjectWithDecimalProperties.ObjectWithDecimalProperties1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "length",
            "3.14"
        ),
        new AbstractMap.SimpleEntry<>(
            "width",
            "3.14"
        ),
        new AbstractMap.SimpleEntry<>(
            "cost",
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "amount",
                    "3.14"
                ),
                new AbstractMap.SimpleEntry<>(
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("length", [DecimalPayload.DecimalPayload1.class](../../components/schemas/DecimalPayload.md#decimalpayload1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("width", [Width.class](#width))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("cost", [Money.Money1.class](../../components/schemas/Money.md#money1))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithDecimalPropertiesMap
public static class ObjectWithDecimalPropertiesMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | length()<br>[optional] |
| String | width()<br>[optional] value must be int or float numeric |
| [Money.MoneyMap](../../components/schemas/Money.md#moneymap) | cost()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **length** | String |  | [optional] |
| **width** | String |  | [optional] value must be int or float numeric |
| **cost** | Map<String, Object> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Width
public static class Width<br>
extends DecimalJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DecimalJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
