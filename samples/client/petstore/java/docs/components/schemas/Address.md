# Address
org.openapijsonschematools.client.components.schemas.Address.java
public class Address<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Address.Address1Boxed](#address1boxed)<br> abstract sealed validated payload class |
| record | [Address.Address1BoxedMap](#address1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Address.Address1](#address1)<br> schema class |
| static class | [Address.AddressMapBuilder](#addressmapbuilder)<br> builder for Map payloads |
| static class | [Address.AddressMap](#addressmap)<br> output class for Map payloads |
| sealed interface | [Address.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> abstract sealed validated payload class |
| record | [Address.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Address.AdditionalProperties](#additionalproperties)<br> schema class |

## Address1Boxed
public sealed interface Address1Boxed<br>
permits<br>
[Address1BoxedMap](#address1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Address1BoxedMap
public record Address1BoxedMap<br>
implements [Address1Boxed](#address1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Address1BoxedMap([AddressMap](#addressmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AddressMap](#addressmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Address1
public static class Address1<br>
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
Address.AddressMap validatedPayload =
    Address.Address1.validate(
    new Address.AddressMapBuilder()
        .additionalProperty("someAdditionalProperty", 1)

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
| [AddressMap](#addressmap) | validate([Map&lt;?, ?&gt;](#addressmapbuilder) arg, SchemaConfiguration configuration) |
| [Address1BoxedMap](#address1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#addressmapbuilder) arg, SchemaConfiguration configuration) |
| [Address1Boxed](#address1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## AddressMapBuilder
public class AddressMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AddressMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |
| [AddressMapBuilder](#addressmapbuilder) | additionalProperty(String key, int value) |
| [AddressMapBuilder](#addressmapbuilder) | additionalProperty(String key, float value) |
| [AddressMapBuilder](#addressmapbuilder) | additionalProperty(String key, long value) |
| [AddressMapBuilder](#addressmapbuilder) | additionalProperty(String key, double value) |

## AddressMap
public static class AddressMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AddressMap](#addressmap) | of([Map<String, Number>](#addressmapbuilder) arg, SchemaConfiguration configuration) |
| Number | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedNumber
public record AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
