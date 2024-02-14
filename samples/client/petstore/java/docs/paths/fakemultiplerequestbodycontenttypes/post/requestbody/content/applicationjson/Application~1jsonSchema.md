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
| static class | [Application~1jsonSchema.Application~1jsonABoxed](#application~1jsonaboxed)<br> abstract sealed validated payload class |
| static class | [Application~1jsonSchema.Application~1jsonABoxedString](#application~1jsonaboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1jsonSchema.Application~1jsonA](#application~1jsona)<br> schema class |

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
        .a("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", [Application~1jsonA.class](#application~1jsona)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1jsonSchemaMap](#application~1jsonschemamap) | validate([Map&lt;?, ?&gt;](#application~1jsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application~1jsonSchema1BoxedMap](#application~1jsonschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#application~1jsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1jsonSchemaMapBuilder
public class Application~1jsonSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | a(String value) |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | additionalProperty(String key, Void value) |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | additionalProperty(String key, boolean value) |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | additionalProperty(String key, String value) |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | additionalProperty(String key, int value) |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | additionalProperty(String key, float value) |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | additionalProperty(String key, long value) |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | additionalProperty(String key, double value) |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [Application~1jsonSchemaMapBuilder](#application~1jsonschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Application~1jsonSchemaMap
public static class Application~1jsonSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application~1jsonSchemaMap](#application~1jsonschemamap) | of([Map<String, ? extends @Nullable Object>](#application~1jsonschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Application~1jsonABoxed
public static abstract sealed class Application~1jsonABoxed<br>
permits<br>
[Application~1jsonABoxedString](#application~1jsonaboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1jsonABoxedString
public static final class Application~1jsonABoxedString<br>
extends [Application~1jsonABoxed](#application~1jsonaboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonABoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1jsonA
public static class Application~1jsonA<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
