# Application~1jsonSchema
public class Application~1jsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application~1jsonSchema.Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedMap](#application~1jsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1](#application~1jsonschema1)<br> schema class |
| static class | [Application~1jsonSchema.Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder)<br> builder for Map payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchemaMap](#application~1jsonschemamap)<br> output class for Map payloads |
| static class | [Application~1jsonSchema.Application~1jsonAdditionalPropertiesBoxed](#application~1jsonadditionalpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [Application~1jsonSchema.Application~1jsonAdditionalPropertiesBoxedString](#application~1jsonadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1jsonSchema.Application~1jsonAdditionalProperties](#application~1jsonadditionalproperties)<br> schema class |

## Application~1jsonSchema1Boxed
public static abstract sealed class Application~1jsonSchema1Boxed<br>
permits<br>
[Application~1jsonSchema1BoxedMap](#application~1jsonschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application~1jsonSchema1BoxedMap
public static final class Application~1jsonSchema1BoxedMap<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedMap([Application~1jsonSchemaMap](#application~1jsonschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Application~1jsonSchemaMap](#application~1jsonschemamap) | data<br>validated payload |

## Application~1jsonSchema1
public static class Application~1jsonSchema1<br>
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
Application~1jsonSchema.Application~1jsonSchemaMap validatedPayload =
    Application~1jsonSchema.Application~1jsonSchema1.validate(
    new Application~1jsonSchema.Application~1jsonSchemaMapBuilder()
        .additionalProperty("someAdditionalProperty", "a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [Application~1jsonAdditionalProperties.class](#application~1jsonadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1jsonSchemaMap](#application~1jsonschemamap) | validate([Map&lt;?, ?&gt;](#application~1jsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application~1jsonSchema1BoxedMap](#application~1jsonschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#application~1jsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1jsonSchemaMapBuilder
public class Application~1jsonSchemaMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | additionalProperty(String key, String value) |

## Application~1jsonSchemaMap
public static class Application~1jsonSchemaMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application~1jsonSchemaMap](#application~1jsonschemamap) | of([Map<String, String>](#application~1jsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Application~1jsonAdditionalPropertiesBoxed
public static abstract sealed class Application~1jsonAdditionalPropertiesBoxed<br>
permits<br>
[Application~1jsonAdditionalPropertiesBoxedString](#application~1jsonadditionalpropertiesboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1jsonAdditionalPropertiesBoxedString
public static final class Application~1jsonAdditionalPropertiesBoxedString<br>
extends [Application~1jsonAdditionalPropertiesBoxed](#application~1jsonadditionalpropertiesboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonAdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1jsonAdditionalProperties
public static class Application~1jsonAdditionalProperties<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
