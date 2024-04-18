# AdditionalpropertiesCanExistByItself
unit_test_api.components.schemas.AdditionalpropertiesCanExistByItself.java
public class AdditionalpropertiesCanExistByItself<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1Boxed](#additionalpropertiescanexistbyitself1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1BoxedMap](#additionalpropertiescanexistbyitself1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1](#additionalpropertiescanexistbyitself1)<br> schema class |
| static class | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMapBuilder](#additionalpropertiescanexistbyitselfmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesCanExistByItself.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesCanExistByItself.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalpropertiesCanExistByItself.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesCanExistByItself1Boxed
public sealed interface AdditionalpropertiesCanExistByItself1Boxed<br>
permits<br>
[AdditionalpropertiesCanExistByItself1BoxedMap](#additionalpropertiescanexistbyitself1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesCanExistByItself1BoxedMap
public record AdditionalpropertiesCanExistByItself1BoxedMap<br>
implements [AdditionalpropertiesCanExistByItself1Boxed](#additionalpropertiescanexistbyitself1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesCanExistByItself1BoxedMap([AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesCanExistByItself1
public static class AdditionalpropertiesCanExistByItself1<br>
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
import unit_test_api.components.schemas.AdditionalpropertiesCanExistByItself;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMap validatedPayload =
    AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1.validate(
    new AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMapBuilder()
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
| [AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap) | validate([Map&lt;?, ?&gt;](#additionalpropertiescanexistbyitselfmapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesCanExistByItself1BoxedMap](#additionalpropertiescanexistbyitself1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#additionalpropertiescanexistbyitselfmapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesCanExistByItself1Boxed](#additionalpropertiescanexistbyitself1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## AdditionalpropertiesCanExistByItselfMapBuilder
public class AdditionalpropertiesCanExistByItselfMapBuilder<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesCanExistByItselfMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Boolean> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesCanExistByItselfMapBuilder](#additionalpropertiescanexistbyitselfmapbuilder) | additionalProperty(String key, boolean value) |

## AdditionalpropertiesCanExistByItselfMap
public static class AdditionalpropertiesCanExistByItselfMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap) | of([Map<String, Boolean>](#additionalpropertiescanexistbyitselfmapbuilder) arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedBoolean
public record AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
