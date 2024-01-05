# DanishPig
org.openapijsonschematools.client.components.schemas.DanishPig.java
public class DanishPig

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [DanishPig.DanishPig1](#danishpig1)<br> schema class |
| static class | [DanishPig.DanishPigMapBuilder](#danishpigmapbuilder)<br> builder for Map payloads |
| static class | [DanishPig.DanishPigMap](#danishpigmap)<br> output class for Map payloads |
| static class | [DanishPig.ClassName](#classname)<br> schema class |
| enum | [DanishPig.StringClassNameEnums](#stringclassnameenums)<br>String enum |

## DanishPig1
public static class DanishPig1<br>
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
DanishPig.DanishPigMap validatedPayload =
    DanishPig.DanishPig1.validate(
    new DanishPig.DanishPigMapBuilder()
        .className("DanishPig")

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
| [DanishPigMap](#danishpigmap) | validate([Map&lt;?, ?&gt;](#danishpigmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DanishPigMap0Builder
public class DanishPigMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DanishPigMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [DanishPigMap0Builder](#danishpigmap0builder) | additionalProperty(String key, Void value) |
| [DanishPigMap0Builder](#danishpigmap0builder) | additionalProperty(String key, boolean value) |
| [DanishPigMap0Builder](#danishpigmap0builder) | additionalProperty(String key, String value) |
| [DanishPigMap0Builder](#danishpigmap0builder) | additionalProperty(String key, int value) |
| [DanishPigMap0Builder](#danishpigmap0builder) | additionalProperty(String key, float value) |
| [DanishPigMap0Builder](#danishpigmap0builder) | additionalProperty(String key, long value) |
| [DanishPigMap0Builder](#danishpigmap0builder) | additionalProperty(String key, double value) |
| [DanishPigMap0Builder](#danishpigmap0builder) | additionalProperty(String key, List<?> value) |
| [DanishPigMap0Builder](#danishpigmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## DanishPigMapBuilder
public class DanishPigMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DanishPigMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [DanishPigMap0Builder](#danishpigmap0builder) | className(String value) |
| [DanishPigMap0Builder](#danishpigmap0builder) | className([StringClassNameEnums](#stringclassnameenums) value) |

## DanishPigMap
public static class DanishPigMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DanishPigMap](#danishpigmap) | of([Map<String, ? extends @Nullable Object>](#danishpigmapbuilder) arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["DanishPig"] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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
String validatedPayload = DanishPig.ClassName.validate(
    "DanishPig",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"DanishPig"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringClassNameEnums](#stringclassnameenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringClassNameEnums
public enum StringClassNameEnums<br>
extends `Enum<StringClassNameEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| DANISH_PIG | value = "DanishPig" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
