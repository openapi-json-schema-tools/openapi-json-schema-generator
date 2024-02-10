# NoAdditionalProperties
org.openapijsonschematools.client.components.schemas.NoAdditionalProperties.java
public class NoAdditionalProperties

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NoAdditionalProperties.NoAdditionalProperties1Boxed](#noadditionalproperties1boxed)<br> sealed validated payload class |
| static class | [NoAdditionalProperties.NoAdditionalProperties1](#noadditionalproperties1)<br> schema class |
| static class | [NoAdditionalProperties.NoAdditionalPropertiesMapBuilder](#noadditionalpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [NoAdditionalProperties.NoAdditionalPropertiesMap](#noadditionalpropertiesmap)<br> output class for Map payloads |
| static class | [NoAdditionalProperties.PetIdBoxed](#petidboxed)<br> sealed validated payload class |
| static class | [NoAdditionalProperties.PetId](#petid)<br> schema class |
| static class | [NoAdditionalProperties.IdBoxed](#idboxed)<br> sealed validated payload class |
| static class | [NoAdditionalProperties.Id](#id)<br> schema class |
| static class | [NoAdditionalProperties.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed validated payload class |
| static class | [NoAdditionalProperties.AdditionalProperties](#additionalproperties)<br> schema class |

## NoAdditionalProperties1Boxed
public static abstract sealed class NoAdditionalProperties1Boxed<br>
permits<br>
[NoAdditionalProperties1BoxedMap](#noadditionalproperties1boxedmap)

A sealed class that stores validated payloads using boxed classes

## NoAdditionalProperties1
public static class NoAdditionalProperties1<br>
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
NoAdditionalProperties.NoAdditionalPropertiesMap validatedPayload =
    NoAdditionalProperties.NoAdditionalProperties1.validate(
    new NoAdditionalProperties.NoAdditionalPropertiesMapBuilder()
        .id(1L)

        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("id", [Id.class](#id))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [PetId.class](#petid)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"id"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NoAdditionalPropertiesMap](#noadditionalpropertiesmap) | validate([Map&lt;?, ?&gt;](#noadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NoAdditionalPropertiesMap0Builder
public class NoAdditionalPropertiesMap0Builder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NoAdditionalPropertiesMap0Builder(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |
| [NoAdditionalPropertiesMap0Builder](#noadditionalpropertiesmap0builder) | petId(int value) |
| [NoAdditionalPropertiesMap0Builder](#noadditionalpropertiesmap0builder) | petId(float value) |
| [NoAdditionalPropertiesMap0Builder](#noadditionalpropertiesmap0builder) | petId(long value) |
| [NoAdditionalPropertiesMap0Builder](#noadditionalpropertiesmap0builder) | petId(double value) |

## NoAdditionalPropertiesMapBuilder
public class NoAdditionalPropertiesMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NoAdditionalPropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NoAdditionalPropertiesMap0Builder](#noadditionalpropertiesmap0builder) | id(int value) |
| [NoAdditionalPropertiesMap0Builder](#noadditionalpropertiesmap0builder) | id(float value) |
| [NoAdditionalPropertiesMap0Builder](#noadditionalpropertiesmap0builder) | id(long value) |
| [NoAdditionalPropertiesMap0Builder](#noadditionalpropertiesmap0builder) | id(double value) |

## NoAdditionalPropertiesMap
public static class NoAdditionalPropertiesMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NoAdditionalPropertiesMap](#noadditionalpropertiesmap) | of([Map<String, Number>](#noadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| Number | id()<br> value must be a 64 bit integer |
| Number | petId()<br>[optional] value must be a 64 bit integer |

## PetIdBoxed
public static abstract sealed class PetIdBoxed<br>
permits<br>
[PetIdBoxedNumber](#petidboxednumber)

A sealed class that stores validated payloads using boxed classes

## PetId
public static class PetId<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## IdBoxed
public static abstract sealed class IdBoxed<br>
permits<br>
[IdBoxedNumber](#idboxednumber)

A sealed class that stores validated payloads using boxed classes

## Id
public static class Id<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

A sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public static final class AdditionalPropertiesBoxedVoid<br>
extends AdditionalPropertiesBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

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

## AdditionalPropertiesBoxedString
public static final class AdditionalPropertiesBoxedString<br>
extends AdditionalPropertiesBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
