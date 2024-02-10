# FromSchema
org.openapijsonschematools.client.components.schemas.FromSchema.java
public class FromSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [FromSchema.FromSchema1Boxed](#fromschema1boxed)<br> abstract sealed validated payload class |
| static class | [FromSchema.FromSchema1BoxedMap](#fromschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FromSchema.FromSchema1](#fromschema1)<br> schema class |
| static class | [FromSchema.FromSchemaMapBuilder](#fromschemamapbuilder)<br> builder for Map payloads |
| static class | [FromSchema.FromSchemaMap](#fromschemamap)<br> output class for Map payloads |
| static class | [FromSchema.IdBoxed](#idboxed)<br> abstract sealed validated payload class |
| static class | [FromSchema.IdBoxedNumber](#idboxednumber)<br> boxed class to store validated Number payloads |
| static class | [FromSchema.Id](#id)<br> schema class |
| static class | [FromSchema.DataBoxed](#databoxed)<br> abstract sealed validated payload class |
| static class | [FromSchema.DataBoxedString](#databoxedstring)<br> boxed class to store validated String payloads |
| static class | [FromSchema.Data](#data)<br> schema class |

## FromSchema1Boxed
public static abstract sealed class FromSchema1Boxed<br>
permits<br>
[FromSchema1BoxedMap](#fromschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## FromSchema1BoxedMap
public static final class FromSchema1BoxedMap<br>
extends [FromSchema1Boxed](#fromschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FromSchema1BoxedMap([FromSchemaMap](#fromschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [FromSchemaMap](#fromschemamap) | data<br>validated payload |

## FromSchema1
public static class FromSchema1<br>
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
FromSchema.FromSchemaMap validatedPayload =
    FromSchema.FromSchema1.validate(
    new FromSchema.FromSchemaMapBuilder()
        .data("a")

        .id(1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("data", [Data.class](#data))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("id", [Id.class](#id)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FromSchemaMap](#fromschemamap) | validate([Map&lt;?, ?&gt;](#fromschemamapbuilder) arg, SchemaConfiguration configuration) |
| [FromSchema1BoxedMap](#fromschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fromschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FromSchemaMapBuilder
public class FromSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FromSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | data(String value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | id(int value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | id(float value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | id(long value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | id(double value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | additionalProperty(String key, Void value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | additionalProperty(String key, boolean value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | additionalProperty(String key, String value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | additionalProperty(String key, int value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | additionalProperty(String key, float value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | additionalProperty(String key, long value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | additionalProperty(String key, double value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [FromSchemaMapBuilder](#fromschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## FromSchemaMap
public static class FromSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FromSchemaMap](#fromschemamap) | of([Map<String, ? extends @Nullable Object>](#fromschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | data()<br>[optional] |
| Number | id()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## IdBoxed
public static abstract sealed class IdBoxed<br>
permits<br>
[IdBoxedNumber](#idboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## IdBoxedNumber
public static final class IdBoxedNumber<br>
extends [IdBoxed](#idboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Id
public static class Id<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## DataBoxed
public static abstract sealed class DataBoxed<br>
permits<br>
[DataBoxedString](#databoxedstring)

abstract sealed class that stores validated payloads using boxed classes

## DataBoxedString
public static final class DataBoxedString<br>
extends [DataBoxed](#databoxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DataBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Data
public static class Data<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
