# AdditionalpropertiesWithNullValuedInstanceProperties
unit_test_api.components.schemas.AdditionalpropertiesWithNullValuedInstanceProperties.java
public class AdditionalpropertiesWithNullValuedInstanceProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstanceProperties1Boxed](#additionalpropertieswithnullvaluedinstanceproperties1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap](#additionalpropertieswithnullvaluedinstanceproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstanceProperties1](#additionalpropertieswithnullvaluedinstanceproperties1)<br> schema class |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder](#additionalpropertieswithnullvaluedinstancepropertiesmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| static class | [AdditionalpropertiesWithNullValuedInstanceProperties.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesWithNullValuedInstanceProperties1Boxed
public sealed interface AdditionalpropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap](#additionalpropertieswithnullvaluedinstanceproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap
public record AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap<br>
implements [AdditionalpropertiesWithNullValuedInstanceProperties1Boxed](#additionalpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap([AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesWithNullValuedInstanceProperties1
public static class AdditionalpropertiesWithNullValuedInstanceProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import unit_test_api.schemas.validation.FrozenList;
import unit_test_api.schemas.validation.FrozenMap;
import unit_test_api.components.schemas.AdditionalpropertiesWithNullValuedInstanceProperties;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [AdditionalpropertiesWithNullValuedInstanceProperties1Boxed](#additionalpropertieswithnullvaluedinstanceproperties1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public record AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
