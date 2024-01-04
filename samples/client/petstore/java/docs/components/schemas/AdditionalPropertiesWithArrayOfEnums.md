# AdditionalPropertiesWithArrayOfEnums
org.openapijsonschematools.client.components.schemas.AdditionalPropertiesWithArrayOfEnums.java
public class AdditionalPropertiesWithArrayOfEnums

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnums1](#additionalpropertieswitharrayofenums1)<br> schema class |
| static class | [AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnumsMapBuilder](#additionalpropertieswitharrayofenumsmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnumsMap](#additionalpropertieswitharrayofenumsmap)<br> output class for Map payloads |
| static class | [AdditionalPropertiesWithArrayOfEnums.AdditionalProperties](#additionalproperties)<br> schema class |
| static class | [AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesListBuilder](#additionalpropertieslistbuilder)<br> builder for List payloads |
| static class | [AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesList](#additionalpropertieslist)<br> output class for List payloads |

## AdditionalPropertiesWithArrayOfEnums1
public static class AdditionalPropertiesWithArrayOfEnums1<br>
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
AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnumsMap validatedPayload =
    AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnums1.validate(
    MapUtils.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalPropertiesWithArrayOfEnumsMap](#additionalpropertieswitharrayofenumsmap) | validate([Map<?, ?>](#additionalpropertieswitharrayofenumsmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalPropertiesWithArrayOfEnumsMapBuilder
public class AdditionalPropertiesWithArrayOfEnumsMapBuilder<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesWithArrayOfEnumsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, List<String>> | build()<br>Returns map input that should be used with Schema.validate |

## AdditionalPropertiesWithArrayOfEnumsMap
public static class AdditionalPropertiesWithArrayOfEnumsMap<br>
extends FrozenMap<String, AdditionalPropertiesList>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesWithArrayOfEnumsMap](#additionalpropertieswitharrayofenumsmap) | of([Map<String, List<String>>](#additionalpropertieswitharrayofenumsmapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalPropertiesList](#additionalpropertieslist) | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties
public static class AdditionalProperties<br>
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

// List validation
AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesList validatedPayload =
    AdditionalPropertiesWithArrayOfEnums.AdditionalProperties.validate(
    new AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesListBuilder(
        Arrays.asList(
            "_abc"
        )
    ).build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [EnumClass.EnumClass1.class](../../components/schemas/EnumClass.md#enumclass1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalPropertiesList](#additionalpropertieslist) | validate([List<?>](#additionalpropertieslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalPropertiesListBuilder
public class AdditionalPropertiesListBuilder<br>
builder for `List<String>`

A class that builds the List input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesListBuilder()<br>Creates an empty list |
| AdditionalPropertiesListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| AdditionalPropertiesListBuilder | add(String item) |
| AdditionalPropertiesListBuilder | add([EnumClass.StringEnumClassEnums](../../components/schemas/EnumClass.md#stringenumclassenums) item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## AdditionalPropertiesList
public class AdditionalPropertiesList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalPropertiesList](#additionalpropertieslist) | of([List<String>](#additionalpropertieslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
