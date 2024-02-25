# ObjectWithDecimalProperties
org.openapijsonschematools.client.components.schemas.ObjectWithDecimalProperties.java
public class ObjectWithDecimalProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectWithDecimalProperties.ObjectWithDecimalProperties1Boxed](#objectwithdecimalproperties1boxed)<br> sealed interface for validated payloads |
| record | [ObjectWithDecimalProperties.ObjectWithDecimalProperties1BoxedMap](#objectwithdecimalproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithDecimalProperties.ObjectWithDecimalProperties1](#objectwithdecimalproperties1)<br> schema class |
| static class | [ObjectWithDecimalProperties.ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithDecimalProperties.ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap)<br> output class for Map payloads |
| sealed interface | [ObjectWithDecimalProperties.WidthBoxed](#widthboxed)<br> sealed interface for validated payloads |
| record | [ObjectWithDecimalProperties.WidthBoxedString](#widthboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithDecimalProperties.Width](#width)<br> schema class |

## ObjectWithDecimalProperties1Boxed
public sealed interface ObjectWithDecimalProperties1Boxed<br>
permits<br>
[ObjectWithDecimalProperties1BoxedMap](#objectwithdecimalproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectWithDecimalProperties1BoxedMap
public record ObjectWithDecimalProperties1BoxedMap<br>
implements [ObjectWithDecimalProperties1Boxed](#objectwithdecimalproperties1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithDecimalProperties1BoxedMap([ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
    new ObjectWithDecimalProperties.ObjectWithDecimalPropertiesMapBuilder()
        .length("3.14")

        .width("3.14")

        .cost(
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
    .build(),
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
| [ObjectWithDecimalProperties1BoxedMap](#objectwithdecimalproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objectwithdecimalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectWithDecimalProperties1Boxed](#objectwithdecimalproperties1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ObjectWithDecimalPropertiesMapBuilder
public class ObjectWithDecimalPropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithDecimalPropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | length(String value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | width(String value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | cost(Map<String, @Nullable Object> value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | additionalProperty(String key, Void value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | additionalProperty(String key, boolean value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | additionalProperty(String key, String value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | additionalProperty(String key, int value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | additionalProperty(String key, float value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | additionalProperty(String key, long value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | additionalProperty(String key, double value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | additionalProperty(String key, List<?> value) |
| [ObjectWithDecimalPropertiesMapBuilder](#objectwithdecimalpropertiesmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

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
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## WidthBoxed
public sealed interface WidthBoxed<br>
permits<br>
[WidthBoxedString](#widthboxedstring)

sealed interface that stores validated payloads using boxed classes

## WidthBoxedString
public record WidthBoxedString<br>
implements [WidthBoxed](#widthboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| WidthBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Width
public static class Width<br>
extends DecimalJsonSchema.DecimalJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DecimalJsonSchema.DecimalJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
