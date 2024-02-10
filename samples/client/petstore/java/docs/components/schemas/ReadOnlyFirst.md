# ReadOnlyFirst
org.openapijsonschematools.client.components.schemas.ReadOnlyFirst.java
public class ReadOnlyFirst

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReadOnlyFirst.ReadOnlyFirst1Boxed](#readonlyfirst1boxed)<br> sealed validated payload class |
| static class | [ReadOnlyFirst.ReadOnlyFirst1BoxedMap](#readonlyfirst1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ReadOnlyFirst.ReadOnlyFirst1](#readonlyfirst1)<br> schema class |
| static class | [ReadOnlyFirst.ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder)<br> builder for Map payloads |
| static class | [ReadOnlyFirst.ReadOnlyFirstMap](#readonlyfirstmap)<br> output class for Map payloads |
| static class | [ReadOnlyFirst.BazBoxed](#bazboxed)<br> sealed validated payload class |
| static class | [ReadOnlyFirst.BazBoxedString](#bazboxedstring)<br> boxed class to store validated String payloads |
| static class | [ReadOnlyFirst.Baz](#baz)<br> schema class |
| static class | [ReadOnlyFirst.BarBoxed](#barboxed)<br> sealed validated payload class |
| static class | [ReadOnlyFirst.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| static class | [ReadOnlyFirst.Bar](#bar)<br> schema class |

## ReadOnlyFirst1Boxed
public static abstract sealed class ReadOnlyFirst1Boxed<br>
permits<br>
[ReadOnlyFirst1BoxedMap](#readonlyfirst1boxedmap)

A sealed class that stores validated payloads using boxed classes

## ReadOnlyFirst1BoxedMap
public static final class ReadOnlyFirst1BoxedMap<br>
extends ReadOnlyFirst1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReadOnlyFirst1BoxedMap(ReadOnlyFirstMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| ReadOnlyFirstMap | data<br>validated payload |

## ReadOnlyFirst1
public static class ReadOnlyFirst1<br>
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
ReadOnlyFirst.ReadOnlyFirstMap validatedPayload =
    ReadOnlyFirst.ReadOnlyFirst1.validate(
    new ReadOnlyFirst.ReadOnlyFirstMapBuilder()
        .bar("a")

        .baz("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("baz", [Baz.class](#baz)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReadOnlyFirstMap](#readonlyfirstmap) | validate([Map&lt;?, ?&gt;](#readonlyfirstmapbuilder) arg, SchemaConfiguration configuration) |
| [ReadOnlyFirst1BoxedMap](#readonlyfirst1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#readonlyfirstmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ReadOnlyFirstMapBuilder
public class ReadOnlyFirstMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReadOnlyFirstMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | bar(String value) |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | baz(String value) |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | additionalProperty(String key, Void value) |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | additionalProperty(String key, boolean value) |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | additionalProperty(String key, String value) |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | additionalProperty(String key, int value) |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | additionalProperty(String key, float value) |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | additionalProperty(String key, long value) |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | additionalProperty(String key, double value) |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | additionalProperty(String key, List<?> value) |
| [ReadOnlyFirstMapBuilder](#readonlyfirstmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ReadOnlyFirstMap
public static class ReadOnlyFirstMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReadOnlyFirstMap](#readonlyfirstmap) | of([Map<String, ? extends @Nullable Object>](#readonlyfirstmapbuilder) arg, SchemaConfiguration configuration) |
| String | bar()<br>[optional] |
| String | baz()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BazBoxed
public static abstract sealed class BazBoxed<br>
permits<br>
[BazBoxedString](#bazboxedstring)

A sealed class that stores validated payloads using boxed classes

## BazBoxedString
public static final class BazBoxedString<br>
extends BazBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BazBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Baz
public static class Baz<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## BarBoxed
public static abstract sealed class BarBoxed<br>
permits<br>
[BarBoxedString](#barboxedstring)

A sealed class that stores validated payloads using boxed classes

## BarBoxedString
public static final class BarBoxedString<br>
extends BarBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Bar
public static class Bar<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
