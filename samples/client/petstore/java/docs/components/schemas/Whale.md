# Whale
org.openapijsonschematools.client.components.schemas.Whale.java
public class Whale

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Whale.Whale1](#whale1)<br> schema class |
| static class | [Whale.WhaleMapBuilder](#whalemapbuilder)<br> builder for Map payloads |
| static class | [Whale.WhaleMap](#whalemap)<br> output class for Map payloads |
| static class | [Whale.ClassName](#classname)<br> schema class |
| enum | [Whale.StringClassNameEnums](#stringclassnameenums)<br>String enum |
| static class | [Whale.HasTeeth](#hasteeth)<br> schema class |
| static class | [Whale.HasBaleen](#hasbaleen)<br> schema class |

## Whale1
public static class Whale1<br>
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
Whale.WhaleMap validatedPayload =
    Whale.Whale1.validate(
    new Whale.WhaleMapBuilder()
        .className("whale")

        .hasBaleen(true)

        .hasTeeth(true)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("hasBaleen", [HasBaleen.class](#hasbaleen))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("hasTeeth", [HasTeeth.class](#hasteeth))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("className", [ClassName.class](#classname)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"className"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [WhaleMap](#whalemap) | validate([Map&lt;?, ?&gt;](#whalemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## WhaleMap0Builder
public class WhaleMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| WhaleMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [WhaleMap0Builder](#whalemap0builder) | hasBaleen(boolean value) |
| [WhaleMap0Builder](#whalemap0builder) | hasTeeth(boolean value) |
| [WhaleMap0Builder](#whalemap0builder) | additionalProperty(String key, Void value) |
| [WhaleMap0Builder](#whalemap0builder) | additionalProperty(String key, boolean value) |
| [WhaleMap0Builder](#whalemap0builder) | additionalProperty(String key, String value) |
| [WhaleMap0Builder](#whalemap0builder) | additionalProperty(String key, int value) |
| [WhaleMap0Builder](#whalemap0builder) | additionalProperty(String key, float value) |
| [WhaleMap0Builder](#whalemap0builder) | additionalProperty(String key, long value) |
| [WhaleMap0Builder](#whalemap0builder) | additionalProperty(String key, double value) |
| [WhaleMap0Builder](#whalemap0builder) | additionalProperty(String key, List<?> value) |
| [WhaleMap0Builder](#whalemap0builder) | additionalProperty(String key, Map<String, ?> value) |

## WhaleMapBuilder
public class WhaleMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| WhaleMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [WhaleMap0Builder](#whalemap0builder) | className(String value) |
| [WhaleMap0Builder](#whalemap0builder) | className([StringClassNameEnums](#stringclassnameenums) value) |

## WhaleMap
public static class WhaleMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [WhaleMap](#whalemap) | of([Map<String, ? extends @Nullable Object>](#whalemapbuilder) arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["whale"] |
| boolean | hasBaleen()<br>[optional] |
| boolean | hasTeeth()<br>[optional] |
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
String validatedPayload = Whale.ClassName.validate(
    "whale",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"whale"<br>)<br> |

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
| WHALE | value = "whale" |

## HasTeeth
public static class HasTeeth<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## HasBaleen
public static class HasBaleen<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
