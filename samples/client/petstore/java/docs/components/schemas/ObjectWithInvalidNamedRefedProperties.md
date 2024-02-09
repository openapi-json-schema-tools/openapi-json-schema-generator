# ObjectWithInvalidNamedRefedProperties
org.openapijsonschematools.client.components.schemas.ObjectWithInvalidNamedRefedProperties.java
public class ObjectWithInvalidNamedRefedProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedProperties1](#objectwithinvalidnamedrefedproperties1)<br> schema class |
| static class | [ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedPropertiesMapBuilder](#objectwithinvalidnamedrefedpropertiesmapbuilder)<br> builder for Map payloads |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedPropertiesMap validatedPayload =
    ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedProperties1.validate(
    new ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedPropertiesMapBuilder()
        .setExclamationMarkReference(
            Arrays.asList(
                1L
            )
        )
        .from(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "data",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "id",
                    1
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("from", [FromSchema.FromSchema1.class](../../components/schemas/FromSchema.md#fromschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("!reference", [ArrayWithValidationsInItems.ArrayWithValidationsInItems1.class](../../components/schemas/ArrayWithValidationsInItems.md#arraywithvalidationsinitems1))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"!reference",<br>&nbsp;&nbsp;&nbsp;&nbsp;"from"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithInvalidNamedRefedPropertiesMap](#objectwithinvalidnamedrefedpropertiesmap) | validate([Map&lt;?, ?&gt;](#objectwithinvalidnamedrefedpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithInvalidNamedRefedPropertiesMap00Builder
public class ObjectWithInvalidNamedRefedPropertiesMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithInvalidNamedRefedPropertiesMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | additionalProperty(String key, Void value) |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | additionalProperty(String key, boolean value) |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | additionalProperty(String key, String value) |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | additionalProperty(String key, int value) |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | additionalProperty(String key, float value) |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | additionalProperty(String key, long value) |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | additionalProperty(String key, double value) |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | additionalProperty(String key, List<?> value) |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | additionalProperty(String key, Map<String, ?> value) |

## ObjectWithInvalidNamedRefedPropertiesMap01Builder
public class ObjectWithInvalidNamedRefedPropertiesMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithInvalidNamedRefedPropertiesMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | from(Map<String, @Nullable Object> value) |

## ObjectWithInvalidNamedRefedPropertiesMap10Builder
public class ObjectWithInvalidNamedRefedPropertiesMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithInvalidNamedRefedPropertiesMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithInvalidNamedRefedPropertiesMap00Builder](#objectwithinvalidnamedrefedpropertiesmap00builder) | setExclamationMarkReference(List<Number> value) |

## ObjectWithInvalidNamedRefedPropertiesMapBuilder
public class ObjectWithInvalidNamedRefedPropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithInvalidNamedRefedPropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithInvalidNamedRefedPropertiesMap01Builder](#objectwithinvalidnamedrefedpropertiesmap01builder) | setExclamationMarkReference(List<Number> value) |
| [ObjectWithInvalidNamedRefedPropertiesMap10Builder](#objectwithinvalidnamedrefedpropertiesmap10builder) | from(Map<String, @Nullable Object> value) |

## ObjectWithInvalidNamedRefedPropertiesMap
public static class ObjectWithInvalidNamedRefedPropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithInvalidNamedRefedPropertiesMap](#objectwithinvalidnamedrefedpropertiesmap) | of([Map<String, ? extends @Nullable Object>](#objectwithinvalidnamedrefedpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [FromSchema.FromSchemaMap](../../components/schemas/FromSchema.md#fromschemamap) | from()<br> |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["!reference"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
