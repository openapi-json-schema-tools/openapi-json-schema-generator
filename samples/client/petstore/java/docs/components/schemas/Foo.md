# Foo
org.openapijsonschematools.client.components.schemas.Foo.java
public class Foo

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Foo.Foo1Boxed](#foo1boxed)<br> sealed validated payload class |
| static class | [Foo.Foo1](#foo1)<br> schema class |
| static class | [Foo.FooMapBuilder](#foomapbuilder)<br> builder for Map payloads |
| static class | [Foo.FooMap](#foomap)<br> output class for Map payloads |

## Foo1Boxed
public static abstract sealed class Foo1Boxed<br>
permits<br>
[Foo1BoxedMap](#foo1boxedmap)

## Foo1
public static class Foo1<br>
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
Foo.FooMap validatedPayload =
    Foo.Foo1.validate(
    new Foo.FooMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.Bar1.class](../../components/schemas/Bar.md#bar1))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooMap](#foomap) | validate([Map&lt;?, ?&gt;](#foomapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FooMapBuilder
public class FooMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FooMapBuilder](#foomapbuilder) | bar(String value) |
| [FooMapBuilder](#foomapbuilder) | additionalProperty(String key, Void value) |
| [FooMapBuilder](#foomapbuilder) | additionalProperty(String key, boolean value) |
| [FooMapBuilder](#foomapbuilder) | additionalProperty(String key, String value) |
| [FooMapBuilder](#foomapbuilder) | additionalProperty(String key, int value) |
| [FooMapBuilder](#foomapbuilder) | additionalProperty(String key, float value) |
| [FooMapBuilder](#foomapbuilder) | additionalProperty(String key, long value) |
| [FooMapBuilder](#foomapbuilder) | additionalProperty(String key, double value) |
| [FooMapBuilder](#foomapbuilder) | additionalProperty(String key, List<?> value) |
| [FooMapBuilder](#foomapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## FooMap
public static class FooMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FooMap](#foomap) | of([Map<String, ? extends @Nullable Object>](#foomapbuilder) arg, SchemaConfiguration configuration) |
| String | bar()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
