# AdditionalpropertiesWithSchema
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesWithSchema.java
public class AdditionalpropertiesWithSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1](#additionalpropertieswithschema1)<br> schema class |
| static class | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap)<br> output class for Map payloads |
| static class | [AdditionalpropertiesWithSchema.Bar](#bar)<br> schema class |
| static class | [AdditionalpropertiesWithSchema.Foo](#foo)<br> schema class |
| static class | [AdditionalpropertiesWithSchema.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesWithSchema1
public static class AdditionalpropertiesWithSchema1<br>
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
AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMap validatedPayload =
    AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1.validate(
    new AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMapBuilder()
        .additionalProperty("someAdditionalProperty", true)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap) | validate([Map&lt;?, ?&gt;](#additionalpropertieswithschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalpropertiesWithSchemaMapBuilder
public class AdditionalpropertiesWithSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesWithSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(Void value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(boolean value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(String value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(int value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(float value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(long value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(double value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(List<?> value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(Map<String, ?> value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(Void value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(boolean value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(String value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(int value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(float value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(long value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(double value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(List<?> value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(Map<String, ?> value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | additionalProperty(String key, boolean value) |

## AdditionalpropertiesWithSchemaMap
public static class AdditionalpropertiesWithSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap) | of([Map<String, ? extends @Nullable Object>](#additionalpropertieswithschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| @Nullable Object | bar()<br>[optional] |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Bar
public static class Bar<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AdditionalProperties
public static class AdditionalProperties<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
