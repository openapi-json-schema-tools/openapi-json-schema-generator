# FromSchema
org.openapijsonschematools.client.components.schemas.FromSchema.java
public class FromSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FromSchema.FromSchema1Boxed](#fromschema1boxed)<br> sealed interface for validated payloads |
| record | [FromSchema.FromSchema1BoxedMap](#fromschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FromSchema.FromSchema1](#fromschema1)<br> schema class |
| static class | [FromSchema.FromSchemaMapBuilder](#fromschemamapbuilder)<br> builder for Map payloads |
| static class | [FromSchema.FromSchemaMap](#fromschemamap)<br> output class for Map payloads |
| sealed interface | [FromSchema.IdBoxed](#idboxed)<br> sealed interface for validated payloads |
| record | [FromSchema.IdBoxedNumber](#idboxednumber)<br> boxed class to store validated Number payloads |
| static class | [FromSchema.Id](#id)<br> schema class |
| sealed interface | [FromSchema.DataBoxed](#databoxed)<br> sealed interface for validated payloads |
| record | [FromSchema.DataBoxedString](#databoxedstring)<br> boxed class to store validated String payloads |
| static class | [FromSchema.Data](#data)<br> schema class |

## FromSchema1Boxed
public sealed interface FromSchema1Boxed<br>
permits<br>
[FromSchema1BoxedMap](#fromschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FromSchema1BoxedMap
public record FromSchema1BoxedMap<br>
implements [FromSchema1Boxed](#fromschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FromSchema1BoxedMap([FromSchemaMap](#fromschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FromSchemaMap](#fromschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.FromSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [FromSchema1Boxed](#fromschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| [FromSchemaMapBuilder](#fromschemamapbuilder) | additionalProperty(String key, Nothing? value) |
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
public sealed interface IdBoxed<br>
permits<br>
[IdBoxedNumber](#idboxednumber)

sealed interface that stores validated payloads using boxed classes

## IdBoxedNumber
public record IdBoxedNumber<br>
implements [IdBoxed](#idboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Id
public static class Id<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## DataBoxed
public sealed interface DataBoxed<br>
permits<br>
[DataBoxedString](#databoxedstring)

sealed interface that stores validated payloads using boxed classes

## DataBoxedString
public record DataBoxedString<br>
implements [DataBoxed](#databoxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DataBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Data
public static class Data<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
