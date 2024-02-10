# Schema
public class Schema

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1Boxed](#schema1boxed)<br> sealed validated payload class |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaMapBuilder](#schemamapbuilder)<br> builder for Map payloads |
| static class | [Schema.SchemaMap](#schemamap)<br> output class for Map payloads |
| static class | [Schema.Param2Boxed](#param2boxed)<br> sealed validated payload class |
| static class | [Schema.Param2](#param2)<br> schema class |
| static class | [Schema.ParamBoxed](#paramboxed)<br> sealed validated payload class |
| static class | [Schema.Param](#param)<br> schema class |

## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

A sealed class that stores validated payloads using boxed classes

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
        .param("a")

        .param2("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("param", [Param.class](#param))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("param2", [Param2.class](#param2)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"param",<br>&nbsp;&nbsp;&nbsp;&nbsp;"param2"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap](#schemamap) | validate([Map&lt;?, ?&gt;](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMap00Builder
public class SchemaMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMap00Builder](#schemamap00builder) | additionalProperty(String key, Void value) |
| [SchemaMap00Builder](#schemamap00builder) | additionalProperty(String key, boolean value) |
| [SchemaMap00Builder](#schemamap00builder) | additionalProperty(String key, String value) |
| [SchemaMap00Builder](#schemamap00builder) | additionalProperty(String key, int value) |
| [SchemaMap00Builder](#schemamap00builder) | additionalProperty(String key, float value) |
| [SchemaMap00Builder](#schemamap00builder) | additionalProperty(String key, long value) |
| [SchemaMap00Builder](#schemamap00builder) | additionalProperty(String key, double value) |
| [SchemaMap00Builder](#schemamap00builder) | additionalProperty(String key, List<?> value) |
| [SchemaMap00Builder](#schemamap00builder) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMap01Builder
public class SchemaMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap00Builder](#schemamap00builder) | param2(String value) |

## SchemaMap10Builder
public class SchemaMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap00Builder](#schemamap00builder) | param(String value) |

## SchemaMapBuilder
public class SchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap01Builder](#schemamap01builder) | param(String value) |
| [SchemaMap10Builder](#schemamap10builder) | param2(String value) |

## SchemaMap
public static class SchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap](#schemamap) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| String | param()<br> |
| String | param2()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Param2Boxed
public static abstract sealed class Param2Boxed<br>
permits<br>
[Param2BoxedString](#param2boxedstring)

A sealed class that stores validated payloads using boxed classes

## Param2
public static class Param2<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
field2

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ParamBoxed
public static abstract sealed class ParamBoxed<br>
permits<br>
[ParamBoxedString](#paramboxedstring)

A sealed class that stores validated payloads using boxed classes

## Param
public static class Param<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
field1

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
