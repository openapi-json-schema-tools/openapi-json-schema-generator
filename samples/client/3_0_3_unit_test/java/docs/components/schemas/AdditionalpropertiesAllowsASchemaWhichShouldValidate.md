# AdditionalpropertiesAllowsASchemaWhichShouldValidate
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesAllowsASchemaWhichShouldValidate.java
public class AdditionalpropertiesAllowsASchemaWhichShouldValidate

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1](#additionalpropertiesallowsaschemawhichshouldvalidate1)<br> schema class |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap)<br> output class for Map payloads |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.Bar](#bar)<br> schema class |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.Foo](#foo)<br> schema class |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesAllowsASchemaWhichShouldValidate1
public static class AdditionalpropertiesAllowsASchemaWhichShouldValidate1<br>
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
AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidateMap validatedPayload =
    AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1.validate(
    MapUtils.makeMap(
    ),
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
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap) | validate([Map<?, ?>](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder
public class AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder()<br>Creates a builder that contains an empty map |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build() |


## AdditionalpropertiesAllowsASchemaWhichShouldValidateMap
public static class AdditionalpropertiesAllowsASchemaWhichShouldValidateMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap) | of([Map<String, ? extends @Nullable Object>](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) arg, SchemaConfiguration configuration) |
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
