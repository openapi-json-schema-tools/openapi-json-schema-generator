# AdditionalpropertiesWithNullValuedInstanceProperties
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesWithNullValuedInstanceProperties.java
class AdditionalpropertiesWithNullValuedInstanceProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
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
sealed interface AdditionalpropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap](#additionalpropertieswithnullvaluedinstanceproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap
data class AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap<br>
implements [AdditionalpropertiesWithNullValuedInstanceProperties1Boxed](#additionalpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap([AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesWithNullValuedInstanceProperties1
class AdditionalpropertiesWithNullValuedInstanceProperties1<br>
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
import org.openapijsonschematools.client.components.schemas.AdditionalpropertiesWithNullValuedInstanceProperties;

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
| Set<Class<?>> | type = setOf(Map::class.java) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties::class.java](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap) | validate(arg: [Map&lt;?, ?&gt;](#additionalpropertieswithnullvaluedinstancepropertiesmapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesWithNullValuedInstanceProperties1BoxedMap](#additionalpropertieswithnullvaluedinstanceproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#additionalpropertieswithnullvaluedinstancepropertiesmapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesWithNullValuedInstanceProperties1Boxed](#additionalpropertieswithnullvaluedinstanceproperties1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder
class AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder<br>
builder for `Map<String, Nothing?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Nothing?> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesWithNullValuedInstancePropertiesMapBuilder](#additionalpropertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(key: String, value: Nothing?) |

## AdditionalpropertiesWithNullValuedInstancePropertiesMap
class AdditionalpropertiesWithNullValuedInstancePropertiesMap<br>
extends FrozenMap<String, Nothing?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesWithNullValuedInstancePropertiesMap](#additionalpropertieswithnullvaluedinstancepropertiesmap) | of([Map<String, Nothing?>](#additionalpropertieswithnullvaluedinstancepropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| Nothing? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalPropertiesBoxed
sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
data class AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalProperties
class AdditionalProperties<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
