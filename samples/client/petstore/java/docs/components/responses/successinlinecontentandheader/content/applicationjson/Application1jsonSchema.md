# Application1jsonSchema
public class Application1jsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application1jsonSchema.Application1jsonSchema1Boxed](#application1jsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application1jsonSchema.Application1jsonSchema1BoxedMap](#application1jsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application1jsonSchema.Application1jsonSchema1](#application1jsonschema1)<br> schema class |
| static class | [Application1jsonSchema.Application1jsonSchemaMapBuilder](#application1jsonschemamapbuilder)<br> builder for Map payloads |
| static class | [Application1jsonSchema.Application1jsonSchemaMap](#application1jsonschemamap)<br> output class for Map payloads |
| static class | [Application1jsonSchema.Application1jsonAdditionalPropertiesBoxed](#application1jsonadditionalpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [Application1jsonSchema.Application1jsonAdditionalPropertiesBoxedNumber](#application1jsonadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application1jsonSchema.Application1jsonAdditionalProperties](#application1jsonadditionalproperties)<br> schema class |

## Application1jsonSchema1Boxed
public static abstract sealed class Application1jsonSchema1Boxed<br>
permits<br>
[Application1jsonSchema1BoxedMap](#application1jsonschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application1jsonSchema1BoxedMap
public static final class Application1jsonSchema1BoxedMap<br>
extends [Application1jsonSchema1Boxed](#application1jsonschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonSchema1BoxedMap([Application1jsonSchemaMap](#application1jsonschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Application1jsonSchemaMap](#application1jsonschemamap) | data<br>validated payload |

## Application1jsonSchema1
public static class Application1jsonSchema1<br>
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
Application1jsonSchema.Application1jsonSchemaMap validatedPayload =
    Application1jsonSchema.Application1jsonSchema1.validate(
    new Application1jsonSchema.Application1jsonSchemaMapBuilder()
        .additionalProperty("someAdditionalProperty", 1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [Application1jsonAdditionalProperties.class](#application1jsonadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1jsonSchemaMap](#application1jsonschemamap) | validate([Map&lt;?, ?&gt;](#application1jsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application1jsonSchema1BoxedMap](#application1jsonschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#application1jsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1jsonSchemaMapBuilder
public class Application1jsonSchemaMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |
| [Application1jsonSchemaMapBuilder](#application1jsonschemamapbuilder) | additionalProperty(String key, int value) |
| [Application1jsonSchemaMapBuilder](#application1jsonschemamapbuilder) | additionalProperty(String key, float value) |

## Application1jsonSchemaMap
public static class Application1jsonSchemaMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application1jsonSchemaMap](#application1jsonschemamap) | of([Map<String, Number>](#application1jsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| Number | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Application1jsonAdditionalPropertiesBoxed
public static abstract sealed class Application1jsonAdditionalPropertiesBoxed<br>
permits<br>
[Application1jsonAdditionalPropertiesBoxedNumber](#application1jsonadditionalpropertiesboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application1jsonAdditionalPropertiesBoxedNumber
public static final class Application1jsonAdditionalPropertiesBoxedNumber<br>
extends [Application1jsonAdditionalPropertiesBoxed](#application1jsonadditionalpropertiesboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonAdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application1jsonAdditionalProperties
public static class Application1jsonAdditionalProperties<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
