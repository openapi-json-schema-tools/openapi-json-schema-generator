# AdditionalpropertiesWithNullValuedInstanceProperties
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesWithNullValuedInstanceProperties.java
public class AdditionalpropertiesWithNullValuedInstanceProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstanceProperties1Boxed](#additionalpropertieswithnullvaluedinstanceproperties1boxed)<br> abstract sealed validated payload class |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap](#additionalpropertieswithnullvaluedinstanceproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstanceProperties1](#additionalpropertieswithnullvaluedinstanceproperties1)<br> schema class |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder](#additionalpropertieswithnullvaluedinstancepropertiesmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap)<br> output class for Map payloads |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesWithNullValuedInstanceProperties1Boxed
public static abstract sealed class AdditionalpropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap](#additionalpropertieswithnullvaluedinstanceproperties1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap
public static final class AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap<br>
extends [AdditionalpropertiesWithNullValuedInstanceProperties1Boxed](#additionalpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap([AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap) | data<br>validated payload |

## AdditionalpropertiesWithNullValuedInstanceProperties1
public static class AdditionalpropertiesWithNullValuedInstanceProperties1<br>
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
AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstancePropertiesMap validatedPayload =
    AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstanceProperties1.validate(
    new AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder()
        .additionalProperty("someAdditionalProperty", null)

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
| [AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap) | validate([Map&lt;?, ?&gt;](#additionalpropertieswithnullvaluedinstancepropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap](#additionalpropertieswithnullvaluedinstanceproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#additionalpropertieswithnullvaluedinstancepropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder
public class AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder<br>
builder for `Map<String, Void>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Void> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder](#additionalpropertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(String key, Void value) |

## AdditionalpropertiesWithNullValuedInstancePropertiesMap
public static class AdditionalpropertiesWithNullValuedInstancePropertiesMap<br>
extends FrozenMap<String, Void>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap) | of([Map<String, Void>](#additionalpropertieswithnullvaluedinstancepropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| Void | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)

abstract sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public static final class AdditionalPropertiesBoxedVoid<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
