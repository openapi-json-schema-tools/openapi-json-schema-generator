# EnumsInProperties
org.openapijsonschematools.client.components.schemas.EnumsInProperties.java
public class EnumsInProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EnumsInProperties.EnumsInProperties1Boxed](#enumsinproperties1boxed)<br> sealed interface for validated payloads |
| record | [EnumsInProperties.EnumsInProperties1BoxedMap](#enumsinproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [EnumsInProperties.EnumsInProperties1](#enumsinproperties1)<br> schema class |
| static class | [EnumsInProperties.EnumsInPropertiesMapBuilder](#enumsinpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [EnumsInProperties.EnumsInPropertiesMap](#enumsinpropertiesmap)<br> output class for Map payloads |
| sealed interface | [EnumsInProperties.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [EnumsInProperties.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| static class | [EnumsInProperties.Bar](#bar)<br> schema class |
| enum | [EnumsInProperties.StringBarEnums](#stringbarenums)<br>String enum |
| sealed interface | [EnumsInProperties.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [EnumsInProperties.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| static class | [EnumsInProperties.Foo](#foo)<br> schema class |
| enum | [EnumsInProperties.StringFooEnums](#stringfooenums)<br>String enum |

## EnumsInProperties1Boxed
public sealed interface EnumsInProperties1Boxed<br>
permits<br>
[EnumsInProperties1BoxedMap](#enumsinproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## EnumsInProperties1BoxedMap
public record EnumsInProperties1BoxedMap<br>
implements [EnumsInProperties1Boxed](#enumsinproperties1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumsInProperties1BoxedMap([EnumsInPropertiesMap](#enumsinpropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EnumsInPropertiesMap](#enumsinpropertiesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EnumsInProperties1
public static class EnumsInProperties1<br>
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
import org.openapijsonschematools.client.components.schemas.EnumsInProperties;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
EnumsInProperties.EnumsInPropertiesMap validatedPayload =
    EnumsInProperties.EnumsInProperties1.validate(
    new EnumsInProperties.EnumsInPropertiesMapBuilder()
        .bar("bar")

        .foo("foo")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EnumsInPropertiesMap](#enumsinpropertiesmap) | validate([Map&lt;?, ?&gt;](#enumsinpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [EnumsInProperties1BoxedMap](#enumsinproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#enumsinpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [EnumsInProperties1Boxed](#enumsinproperties1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## EnumsInPropertiesMap0Builder
public class EnumsInPropertiesMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumsInPropertiesMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | foo(String value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | foo([StringFooEnums](#stringfooenums) value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(String key, Void value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(String key, boolean value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(String key, String value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(String key, int value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(String key, float value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(String key, long value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(String key, double value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(String key, List<?> value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## EnumsInPropertiesMapBuilder
public class EnumsInPropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumsInPropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | bar(String value) |
| [EnumsInPropertiesMap0Builder](#enumsinpropertiesmap0builder) | bar([StringBarEnums](#stringbarenums) value) |

## EnumsInPropertiesMap
public static class EnumsInPropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumsInPropertiesMap](#enumsinpropertiesmap) | of([Map<String, ? extends @Nullable Object>](#enumsinpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| String | bar()<br> must be one of ["bar"] |
| String | foo()<br>[optional] must be one of ["foo"] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BarBoxed
public sealed interface BarBoxed<br>
permits<br>
[BarBoxedString](#barboxedstring)

sealed interface that stores validated payloads using boxed classes

## BarBoxedString
public record BarBoxedString<br>
implements [BarBoxed](#barboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Bar
public static class Bar<br>
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
import org.openapijsonschematools.client.components.schemas.EnumsInProperties;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = EnumsInProperties.Bar.validate(
    "bar",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringBarEnums](#stringbarenums) arg, SchemaConfiguration configuration) |
| [BarBoxedString](#barboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [BarBoxed](#barboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringBarEnums
public enum StringBarEnums<br>
extends `Enum<StringBarEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| BAR | value = "bar" |

## FooBoxed
public sealed interface FooBoxed<br>
permits<br>
[FooBoxedString](#fooboxedstring)

sealed interface that stores validated payloads using boxed classes

## FooBoxedString
public record FooBoxedString<br>
implements [FooBoxed](#fooboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foo
public static class Foo<br>
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
import org.openapijsonschematools.client.components.schemas.EnumsInProperties;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = EnumsInProperties.Foo.validate(
    "foo",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringFooEnums](#stringfooenums) arg, SchemaConfiguration configuration) |
| [FooBoxedString](#fooboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [FooBoxed](#fooboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringFooEnums
public enum StringFooEnums<br>
extends `Enum<StringFooEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| FOO | value = "foo" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
