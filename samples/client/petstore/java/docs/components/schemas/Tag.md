# Tag
org.openapijsonschematools.client.components.schemas.Tag.java
public class Tag

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Tag.Tag1Boxed](#tag1boxed)<br> sealed validated payload class |
| static class | [Tag.Tag1BoxedMap](#tag1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Tag.Tag1](#tag1)<br> schema class |
| static class | [Tag.TagMapBuilder](#tagmapbuilder)<br> builder for Map payloads |
| static class | [Tag.TagMap](#tagmap)<br> output class for Map payloads |
| static class | [Tag.NameBoxed](#nameboxed)<br> sealed validated payload class |
| static class | [Tag.NameBoxedString](#nameboxedstring)<br> boxed class to store validated String payloads |
| static class | [Tag.Name](#name)<br> schema class |
| static class | [Tag.IdBoxed](#idboxed)<br> sealed validated payload class |
| static class | [Tag.IdBoxedNumber](#idboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Tag.Id](#id)<br> schema class |

## Tag1Boxed
public static abstract sealed class Tag1Boxed<br>
permits<br>
[Tag1BoxedMap](#tag1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Tag1BoxedMap
public static final class Tag1BoxedMap<br>
extends Tag1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Tag1BoxedMap(TagMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| TagMap | data<br>validated payload |

## Tag1
public static class Tag1<br>
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
Tag.TagMap validatedPayload =
    Tag.Tag1.validate(
    new Tag.TagMapBuilder()
        .id(1L)

        .name("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("id", [Id.class](#id))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name.class](#name)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [TagMap](#tagmap) | validate([Map&lt;?, ?&gt;](#tagmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## TagMapBuilder
public class TagMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TagMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [TagMapBuilder](#tagmapbuilder) | id(int value) |
| [TagMapBuilder](#tagmapbuilder) | id(float value) |
| [TagMapBuilder](#tagmapbuilder) | id(long value) |
| [TagMapBuilder](#tagmapbuilder) | id(double value) |
| [TagMapBuilder](#tagmapbuilder) | name(String value) |
| [TagMapBuilder](#tagmapbuilder) | additionalProperty(String key, Void value) |
| [TagMapBuilder](#tagmapbuilder) | additionalProperty(String key, boolean value) |
| [TagMapBuilder](#tagmapbuilder) | additionalProperty(String key, String value) |
| [TagMapBuilder](#tagmapbuilder) | additionalProperty(String key, int value) |
| [TagMapBuilder](#tagmapbuilder) | additionalProperty(String key, float value) |
| [TagMapBuilder](#tagmapbuilder) | additionalProperty(String key, long value) |
| [TagMapBuilder](#tagmapbuilder) | additionalProperty(String key, double value) |
| [TagMapBuilder](#tagmapbuilder) | additionalProperty(String key, List<?> value) |
| [TagMapBuilder](#tagmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## TagMap
public static class TagMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TagMap](#tagmap) | of([Map<String, ? extends @Nullable Object>](#tagmapbuilder) arg, SchemaConfiguration configuration) |
| Number | id()<br>[optional] value must be a 64 bit integer |
| String | name()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## NameBoxed
public static abstract sealed class NameBoxed<br>
permits<br>
[NameBoxedString](#nameboxedstring)

A sealed class that stores validated payloads using boxed classes

## NameBoxedString
public static final class NameBoxedString<br>
extends NameBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NameBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Name
public static class Name<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## IdBoxed
public static abstract sealed class IdBoxed<br>
permits<br>
[IdBoxedNumber](#idboxednumber)

A sealed class that stores validated payloads using boxed classes

## IdBoxedNumber
public static final class IdBoxedNumber<br>
extends IdBoxed

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
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
