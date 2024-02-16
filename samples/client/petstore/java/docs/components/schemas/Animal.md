# Animal
org.openapijsonschematools.client.components.schemas.Animal.java
public class Animal<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Animal.Animal1Boxed](#animal1boxed)<br> abstract sealed validated payload class |
| static class | [Animal.Animal1BoxedMap](#animal1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Animal.Animal1](#animal1)<br> schema class |
| static class | [Animal.AnimalMapBuilder](#animalmapbuilder)<br> builder for Map payloads |
| static class | [Animal.AnimalMap](#animalmap)<br> output class for Map payloads |
| static class | [Animal.ColorBoxed](#colorboxed)<br> abstract sealed validated payload class |
| static class | [Animal.ColorBoxedString](#colorboxedstring)<br> boxed class to store validated String payloads |
| static class | [Animal.Color](#color)<br> schema class |
| static class | [Animal.ClassNameBoxed](#classnameboxed)<br> abstract sealed validated payload class |
| static class | [Animal.ClassNameBoxedString](#classnameboxedstring)<br> boxed class to store validated String payloads |
| static class | [Animal.ClassName](#classname)<br> schema class |

## Animal1Boxed
public static abstract sealed class Animal1Boxed<br>
permits<br>
[Animal1BoxedMap](#animal1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Animal1BoxedMap
public static final class Animal1BoxedMap<br>
extends [Animal1Boxed](#animal1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Animal1BoxedMap([AnimalMap](#animalmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [AnimalMap](#animalmap) | data<br>validated payload |

## Animal1
public static class Animal1<br>
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
Animal.AnimalMap validatedPayload =
    Animal.Animal1.validate(
    new Animal.AnimalMapBuilder()
        .className("a")

        .color("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("className", [ClassName.class](#classname))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("color", [Color.class](#color)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"className"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AnimalMap](#animalmap) | validate([Map&lt;?, ?&gt;](#animalmapbuilder) arg, SchemaConfiguration configuration) |
| [Animal1BoxedMap](#animal1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#animalmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AnimalMap0Builder
public class AnimalMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnimalMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AnimalMap0Builder](#animalmap0builder) | color(String value) |
| [AnimalMap0Builder](#animalmap0builder) | additionalProperty(String key, Void value) |
| [AnimalMap0Builder](#animalmap0builder) | additionalProperty(String key, boolean value) |
| [AnimalMap0Builder](#animalmap0builder) | additionalProperty(String key, String value) |
| [AnimalMap0Builder](#animalmap0builder) | additionalProperty(String key, int value) |
| [AnimalMap0Builder](#animalmap0builder) | additionalProperty(String key, float value) |
| [AnimalMap0Builder](#animalmap0builder) | additionalProperty(String key, long value) |
| [AnimalMap0Builder](#animalmap0builder) | additionalProperty(String key, double value) |
| [AnimalMap0Builder](#animalmap0builder) | additionalProperty(String key, List<?> value) |
| [AnimalMap0Builder](#animalmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## AnimalMapBuilder
public class AnimalMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnimalMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AnimalMap0Builder](#animalmap0builder) | className(String value) |

## AnimalMap
public static class AnimalMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnimalMap](#animalmap) | of([Map<String, ? extends @Nullable Object>](#animalmapbuilder) arg, SchemaConfiguration configuration) |
| String | className()<br> |
| String | color()<br>[optional] if omitted the server will use the default value of red |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ColorBoxed
public static abstract sealed class ColorBoxed<br>
permits<br>
[ColorBoxedString](#colorboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## ColorBoxedString
public static final class ColorBoxedString<br>
extends [ColorBoxed](#colorboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ColorBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Color
public static class Color<br>
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

// String validation
String validatedPayload = Animal.Color.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| @Nullable Object | defaultValue = "red" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [ColorBoxedString](#colorboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ClassNameBoxed
public static abstract sealed class ClassNameBoxed<br>
permits<br>
[ClassNameBoxedString](#classnameboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## ClassNameBoxedString
public static final class ClassNameBoxedString<br>
extends [ClassNameBoxed](#classnameboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClassNameBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ClassName
public static class ClassName<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
