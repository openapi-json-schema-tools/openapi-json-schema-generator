# ObjectWithInvalidNamedRefedProperties
org.openapijsonschematools.client.components.schemas.ObjectWithInvalidNamedRefedProperties.java
public class ObjectWithInvalidNamedRefedProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedProperties1](#objectwithinvalidnamedrefedproperties1)<br> schema class |
| static class | [ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedPropertiesMapInput](#objectwithinvalidnamedrefedpropertiesmapinput)<br> builder for Map payloads |
| static class | [ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedPropertiesMap](#objectwithinvalidnamedrefedpropertiesmap)<br> output class for Map payloads |

## ObjectWithInvalidNamedRefedProperties1
public static class ObjectWithInvalidNamedRefedProperties1<br>
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
ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedPropertiesMap validatedPayload =
    ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedProperties1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "!reference",
            Arrays.asList(
                1L
            )
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "from",
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "data",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "id",
                    1L
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("from", [FromSchema.FromSchema1.class](../../components/schemas/FromSchema.md#fromschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("!reference", [ArrayWithValidationsInItems.ArrayWithValidationsInItems1.class](../../components/schemas/ArrayWithValidationsInItems.md#arraywithvalidationsinitems1))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"!reference",<br>&nbsp;&nbsp;&nbsp;&nbsp;"from"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithInvalidNamedRefedPropertiesMap](#objectwithinvalidnamedrefedpropertiesmap) | validate([Map<?, ?>](#objectwithinvalidnamedrefedpropertiesmapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithInvalidNamedRefedPropertiesMapInput
public class ObjectWithInvalidNamedRefedPropertiesMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **!reference** | List<long> |  | |
| **from** | Map<String, ? extends @Nullable Object> |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ObjectWithInvalidNamedRefedPropertiesMap
public static class ObjectWithInvalidNamedRefedPropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithInvalidNamedRefedPropertiesMap](#objectwithinvalidnamedrefedpropertiesmap) | of([Map<String, ? extends @Nullable Object>](#objectwithinvalidnamedrefedpropertiesmapinput) arg, SchemaConfiguration configuration) |
| [FromSchema.FromSchemaMap](../../components/schemas/FromSchema.md#fromschemamap) | from()<br> |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["!reference"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
