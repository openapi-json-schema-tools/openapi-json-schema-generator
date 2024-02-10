# Schema
public class Schema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [Schema.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaMapBuilder](#schemamapbuilder)<br> builder for Map payloads |
| static class | [Schema.SchemaMap](#schemamap)<br> output class for Map payloads |
| static class | [Schema.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [Schema.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema.AdditionalProperties](#additionalproperties)<br> schema class |

## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema1BoxedMap
public static final class Schema1BoxedMap<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap([SchemaMap](#schemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [SchemaMap](#schemamap) | data<br>validated payload |

## Schema1
public static class Schema1<br>
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
Schema.SchemaMap validatedPayload =
    Schema.Schema1.validate(
    new Schema.SchemaMapBuilder()
        .additionalProperty("someAdditionalProperty", 1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap](#schemamap) | validate([Map&lt;?, ?&gt;](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMapBuilder
public class SchemaMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, int value) |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, float value) |

## SchemaMap
public static class SchemaMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap](#schemamap) | of([Map<String, Number>](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| Number | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedNumber
public static final class AdditionalPropertiesBoxedNumber<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
