# StringBooleanMap
org.openapijsonschematools.client.components.schemas.StringBooleanMap.java
public class StringBooleanMap

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [StringBooleanMap.StringBooleanMap1Boxed](#stringbooleanmap1boxed)<br> sealed validated payload class |
| static class | [StringBooleanMap.StringBooleanMap1BoxedMap](#stringbooleanmap1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [StringBooleanMap.StringBooleanMap1](#stringbooleanmap1)<br> schema class |
| static class | [StringBooleanMap.StringBooleanMapMapBuilder](#stringbooleanmapmapbuilder)<br> builder for Map payloads |
| static class | [StringBooleanMap.StringBooleanMapMap](#stringbooleanmapmap)<br> output class for Map payloads |
| static class | [StringBooleanMap.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed validated payload class |
| static class | [StringBooleanMap.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [StringBooleanMap.AdditionalProperties](#additionalproperties)<br> schema class |

## StringBooleanMap1Boxed
public static abstract sealed class StringBooleanMap1Boxed<br>
permits<br>
[StringBooleanMap1BoxedMap](#stringbooleanmap1boxedmap)

A sealed class that stores validated payloads using boxed classes

## StringBooleanMap1BoxedMap
public static final class StringBooleanMap1BoxedMap<br>
extends StringBooleanMap1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringBooleanMap1BoxedMap(StringBooleanMapMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| StringBooleanMapMap | data<br>validated payload |

## StringBooleanMap1
public static class StringBooleanMap1<br>
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
StringBooleanMap.StringBooleanMapMap validatedPayload =
    StringBooleanMap.StringBooleanMap1.validate(
    new StringBooleanMap.StringBooleanMapMapBuilder()
        .additionalProperty("someAdditionalProperty", true)

    .build(),
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
| [StringBooleanMapMap](#stringbooleanmapmap) | validate([Map&lt;?, ?&gt;](#stringbooleanmapmapbuilder) arg, SchemaConfiguration configuration) |
| [StringBooleanMap1BoxedMap](#stringbooleanmap1boxedmap) | validateAndBox([StringBooleanMapMap](#stringbooleanmapmap) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringBooleanMapMapBuilder
public class StringBooleanMapMapBuilder<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringBooleanMapMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Boolean> | build()<br>Returns map input that should be used with Schema.validate |
| [StringBooleanMapMapBuilder](#stringbooleanmapmapbuilder) | additionalProperty(String key, boolean value) |

## StringBooleanMapMap
public static class StringBooleanMapMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [StringBooleanMapMap](#stringbooleanmapmap) | of([Map<String, Boolean>](#stringbooleanmapmapbuilder) arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)

A sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedBoolean
public static final class AdditionalPropertiesBoxedBoolean<br>
extends AdditionalPropertiesBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
