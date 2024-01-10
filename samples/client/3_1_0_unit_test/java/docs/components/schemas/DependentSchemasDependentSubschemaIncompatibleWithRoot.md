# DependentSchemasDependentSubschemaIncompatibleWithRoot
org.openapijsonschematools.client.components.schemas.DependentSchemasDependentSubschemaIncompatibleWithRoot.java
public class DependentSchemasDependentSubschemaIncompatibleWithRoot

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1](#dependentschemasdependentsubschemaincompatiblewithroot1)<br> schema class |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder)<br> builder for Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap)<br> output class for Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo](#foo)<br> schema class |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo1](#foo1)<br> schema class |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMapBuilder1](#foomapbuilder1)<br> builder for Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMap](#foomap)<br> output class for Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Bar](#bar)<br> schema class |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalProperties](#additionalproperties)<br> schema class |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1
public static class DependentSchemasDependentSubschemaIncompatibleWithRoot1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap) | validate([Map&lt;?, ?&gt;](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder
public class DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(Void value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(boolean value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(String value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(int value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(float value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(long value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(double value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(List<?> value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(Map<String, ?> value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, Void value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, boolean value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, String value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, int value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, float value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, long value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, double value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, List<?> value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## DependentSchemasDependentSubschemaIncompatibleWithRootMap
public static class DependentSchemasDependentSubschemaIncompatibleWithRootMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap) | of([Map<String, ? extends @Nullable Object>](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

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
DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMap validatedPayload =
    DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo1.validate(
    new DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMapBuilder1()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooMap](#foomap) | validate([Map&lt;?, ?&gt;](#foomapbuilder1) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FooMapBuilder1
public class FooMapBuilder1<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FooMapBuilder1](#foomapbuilder1) | bar(Void value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(boolean value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(String value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(int value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(float value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(long value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(double value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(List<?> value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(Map<String, ?> value) |

## FooMap
public static class FooMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FooMap](#foomap) | of([Map<String, ? extends @Nullable Object>](#foomapbuilder1) arg, SchemaConfiguration configuration) |
| @Nullable Object | bar()<br>[optional] |

## Bar
public static class Bar<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
