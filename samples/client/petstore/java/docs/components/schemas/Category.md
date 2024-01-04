# Category
org.openapijsonschematools.client.components.schemas.Category.java
public class Category

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Category.Category1](#category1)<br> schema class |
| static class | [Category.CategoryMapBuilder](#categorymapbuilder)<br> builder for Map payloads |
| static class | [Category.CategoryMap](#categorymap)<br> output class for Map payloads |
| static class | [Category.Name](#name)<br> schema class |
| static class | [Category.Id](#id)<br> schema class |

## Category1
public static class Category1<br>
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
Category.CategoryMap validatedPayload =
    Category.Category1.validate(
    new Category.CategoryMapBuilder()
        .name("a")

        .id(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("id", [Id.class](#id))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name.class](#name)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"name"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CategoryMap](#categorymap) | validate([Map&lt;?, ?&gt;](#categorymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## CategoryMap0Builder
public class CategoryMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CategoryMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [CategoryMap0Builder](#categorymap0builder) | id(int value) |
| [CategoryMap0Builder](#categorymap0builder) | id(float value) |
| [CategoryMap0Builder](#categorymap0builder) | id(long value) |
| [CategoryMap0Builder](#categorymap0builder) | id(double value) |
| [CategoryMap0Builder](#categorymap0builder) | additionalProperty(String key, Void value) |
| [CategoryMap0Builder](#categorymap0builder) | additionalProperty(String key, boolean value) |
| [CategoryMap0Builder](#categorymap0builder) | additionalProperty(String key, String value) |
| [CategoryMap0Builder](#categorymap0builder) | additionalProperty(String key, int value) |
| [CategoryMap0Builder](#categorymap0builder) | additionalProperty(String key, float value) |
| [CategoryMap0Builder](#categorymap0builder) | additionalProperty(String key, long value) |
| [CategoryMap0Builder](#categorymap0builder) | additionalProperty(String key, double value) |
| [CategoryMap0Builder](#categorymap0builder) | additionalProperty(String key, List<?> value) |
| [CategoryMap0Builder](#categorymap0builder) | additionalProperty(String key, Map<String, ?> value) |

## CategoryMapBuilder
public class CategoryMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CategoryMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CategoryMap0Builder](#categorymap0builder) | name(String value) |

## CategoryMap
public static class CategoryMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CategoryMap](#categorymap) | of([Map<String, ? extends @Nullable Object>](#categorymapbuilder) arg, SchemaConfiguration configuration) |
| String | name()<br> if omitted the server will use the default value of default-name |
| Number | id()<br>[optional] value must be a 64 bit integer |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Name
public static class Name<br>
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
String validatedPayload = Category.Name.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Id
public static class Id<br>
extends Int64JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
