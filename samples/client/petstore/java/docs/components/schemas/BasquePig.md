# BasquePig
org.openapijsonschematools.client.components.schemas.BasquePig.java
public class BasquePig

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [BasquePig.BasquePig1Boxed](#basquepig1boxed)<br> abstract sealed validated payload class |
| static class | [BasquePig.BasquePig1BoxedMap](#basquepig1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [BasquePig.BasquePig1](#basquepig1)<br> schema class |
| static class | [BasquePig.BasquePigMapBuilder](#basquepigmapbuilder)<br> builder for Map payloads |
| static class | [BasquePig.BasquePigMap](#basquepigmap)<br> output class for Map payloads |
| static class | [BasquePig.ClassNameBoxed](#classnameboxed)<br> abstract sealed validated payload class |
| static class | [BasquePig.ClassNameBoxedString](#classnameboxedstring)<br> boxed class to store validated String payloads |
| static class | [BasquePig.ClassName](#classname)<br> schema class |
| enum | [BasquePig.StringClassNameEnums](#stringclassnameenums)<br>String enum |

## BasquePig1Boxed
public static abstract sealed class BasquePig1Boxed<br>
permits<br>
[BasquePig1BoxedMap](#basquepig1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## BasquePig1BoxedMap
public static final class BasquePig1BoxedMap<br>
extends [BasquePig1Boxed](#basquepig1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BasquePig1BoxedMap([BasquePigMap](#basquepigmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [BasquePigMap](#basquepigmap) | data<br>validated payload |

## BasquePig1
public static class BasquePig1<br>
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
BasquePig.BasquePigMap validatedPayload =
    BasquePig.BasquePig1.validate(
    new BasquePig.BasquePigMapBuilder()
        .className("BasquePig")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("className", [ClassName.class](#classname)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"className"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [BasquePigMap](#basquepigmap) | validate([Map&lt;?, ?&gt;](#basquepigmapbuilder) arg, SchemaConfiguration configuration) |
| [BasquePig1BoxedMap](#basquepig1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#basquepigmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BasquePigMap0Builder
public class BasquePigMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BasquePigMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [BasquePigMap0Builder](#basquepigmap0builder) | additionalProperty(String key, Void value) |
| [BasquePigMap0Builder](#basquepigmap0builder) | additionalProperty(String key, boolean value) |
| [BasquePigMap0Builder](#basquepigmap0builder) | additionalProperty(String key, String value) |
| [BasquePigMap0Builder](#basquepigmap0builder) | additionalProperty(String key, int value) |
| [BasquePigMap0Builder](#basquepigmap0builder) | additionalProperty(String key, float value) |
| [BasquePigMap0Builder](#basquepigmap0builder) | additionalProperty(String key, long value) |
| [BasquePigMap0Builder](#basquepigmap0builder) | additionalProperty(String key, double value) |
| [BasquePigMap0Builder](#basquepigmap0builder) | additionalProperty(String key, List<?> value) |
| [BasquePigMap0Builder](#basquepigmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## BasquePigMapBuilder
public class BasquePigMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BasquePigMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [BasquePigMap0Builder](#basquepigmap0builder) | className(String value) |
| [BasquePigMap0Builder](#basquepigmap0builder) | className([StringClassNameEnums](#stringclassnameenums) value) |

## BasquePigMap
public static class BasquePigMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BasquePigMap](#basquepigmap) | of([Map<String, ? extends @Nullable Object>](#basquepigmapbuilder) arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["BasquePig"] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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
String validatedPayload = BasquePig.ClassName.validate(
    "BasquePig",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"BasquePig"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringClassNameEnums](#stringclassnameenums) arg, SchemaConfiguration configuration) |
| [ClassNameBoxedString](#classnameboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringClassNameEnums
public enum StringClassNameEnums<br>
extends `Enum<StringClassNameEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| BASQUE_PIG | value = "BasquePig" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
