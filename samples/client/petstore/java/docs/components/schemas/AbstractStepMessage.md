# AbstractStepMessage
org.openapijsonschematools.client.components.schemas.AbstractStepMessage.java
public class AbstractStepMessage

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AbstractStepMessage.AbstractStepMessage1Boxed](#abstractstepmessage1boxed)<br> sealed validated payload class |
| static class | [AbstractStepMessage.AbstractStepMessage1](#abstractstepmessage1)<br> schema class |
| static class | [AbstractStepMessage.AbstractStepMessageMapBuilder](#abstractstepmessagemapbuilder)<br> builder for Map payloads |
| static class | [AbstractStepMessage.AbstractStepMessageMap](#abstractstepmessagemap)<br> output class for Map payloads |
| static class | [AbstractStepMessage.DiscriminatorBoxed](#discriminatorboxed)<br> sealed validated payload class |
| static class | [AbstractStepMessage.Discriminator](#discriminator)<br> schema class |

## AbstractStepMessage1Boxed
public static abstract sealed class AbstractStepMessage1Boxed<br>

## AbstractStepMessage1
public static class AbstractStepMessage1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Abstract Step

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
AbstractStepMessage.AbstractStepMessageMap validatedPayload =
    AbstractStepMessage.AbstractStepMessage1.validate(
    new AbstractStepMessage.AbstractStepMessageMapBuilder()
        .discriminator("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("discriminator", [Discriminator.class](#discriminator)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"description",<br>&nbsp;&nbsp;&nbsp;&nbsp;"discriminator",<br>&nbsp;&nbsp;&nbsp;&nbsp;"sequenceNumber"<br>)<br> |
| List<Class<? extends JsonSchema>> | anyOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[AbstractStepMessage1.class](#abstractstepmessage1)<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AbstractStepMessageMap](#abstractstepmessagemap) | validate([Map&lt;?, ?&gt;](#abstractstepmessagemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AbstractStepMessageMap000Builder
public class AbstractStepMessageMap000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AbstractStepMessageMap000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | additionalProperty(String key, Void value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | additionalProperty(String key, boolean value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | additionalProperty(String key, String value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | additionalProperty(String key, int value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | additionalProperty(String key, float value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | additionalProperty(String key, long value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | additionalProperty(String key, double value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | additionalProperty(String key, List<?> value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | additionalProperty(String key, Map<String, ?> value) |

## AbstractStepMessageMap001Builder
public class AbstractStepMessageMap001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AbstractStepMessageMap001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | sequenceNumber(Void value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | sequenceNumber(boolean value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | sequenceNumber(String value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | sequenceNumber(int value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | sequenceNumber(float value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | sequenceNumber(long value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | sequenceNumber(double value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | sequenceNumber(List<?> value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | sequenceNumber(Map<String, ?> value) |

## AbstractStepMessageMap010Builder
public class AbstractStepMessageMap010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AbstractStepMessageMap010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | discriminator(String value) |

## AbstractStepMessageMap011Builder
public class AbstractStepMessageMap011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AbstractStepMessageMap011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AbstractStepMessageMap001Builder](#abstractstepmessagemap001builder) | discriminator(String value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | sequenceNumber(Void value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | sequenceNumber(boolean value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | sequenceNumber(String value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | sequenceNumber(int value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | sequenceNumber(float value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | sequenceNumber(long value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | sequenceNumber(double value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | sequenceNumber(List<?> value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | sequenceNumber(Map<String, ?> value) |

## AbstractStepMessageMap100Builder
public class AbstractStepMessageMap100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AbstractStepMessageMap100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | description(Void value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | description(boolean value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | description(String value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | description(int value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | description(float value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | description(long value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | description(double value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | description(List<?> value) |
| [AbstractStepMessageMap000Builder](#abstractstepmessagemap000builder) | description(Map<String, ?> value) |

## AbstractStepMessageMap101Builder
public class AbstractStepMessageMap101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AbstractStepMessageMap101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AbstractStepMessageMap001Builder](#abstractstepmessagemap001builder) | description(Void value) |
| [AbstractStepMessageMap001Builder](#abstractstepmessagemap001builder) | description(boolean value) |
| [AbstractStepMessageMap001Builder](#abstractstepmessagemap001builder) | description(String value) |
| [AbstractStepMessageMap001Builder](#abstractstepmessagemap001builder) | description(int value) |
| [AbstractStepMessageMap001Builder](#abstractstepmessagemap001builder) | description(float value) |
| [AbstractStepMessageMap001Builder](#abstractstepmessagemap001builder) | description(long value) |
| [AbstractStepMessageMap001Builder](#abstractstepmessagemap001builder) | description(double value) |
| [AbstractStepMessageMap001Builder](#abstractstepmessagemap001builder) | description(List<?> value) |
| [AbstractStepMessageMap001Builder](#abstractstepmessagemap001builder) | description(Map<String, ?> value) |
| [AbstractStepMessageMap100Builder](#abstractstepmessagemap100builder) | sequenceNumber(Void value) |
| [AbstractStepMessageMap100Builder](#abstractstepmessagemap100builder) | sequenceNumber(boolean value) |
| [AbstractStepMessageMap100Builder](#abstractstepmessagemap100builder) | sequenceNumber(String value) |
| [AbstractStepMessageMap100Builder](#abstractstepmessagemap100builder) | sequenceNumber(int value) |
| [AbstractStepMessageMap100Builder](#abstractstepmessagemap100builder) | sequenceNumber(float value) |
| [AbstractStepMessageMap100Builder](#abstractstepmessagemap100builder) | sequenceNumber(long value) |
| [AbstractStepMessageMap100Builder](#abstractstepmessagemap100builder) | sequenceNumber(double value) |
| [AbstractStepMessageMap100Builder](#abstractstepmessagemap100builder) | sequenceNumber(List<?> value) |
| [AbstractStepMessageMap100Builder](#abstractstepmessagemap100builder) | sequenceNumber(Map<String, ?> value) |

## AbstractStepMessageMap110Builder
public class AbstractStepMessageMap110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AbstractStepMessageMap110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | description(Void value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | description(boolean value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | description(String value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | description(int value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | description(float value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | description(long value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | description(double value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | description(List<?> value) |
| [AbstractStepMessageMap010Builder](#abstractstepmessagemap010builder) | description(Map<String, ?> value) |
| [AbstractStepMessageMap100Builder](#abstractstepmessagemap100builder) | discriminator(String value) |

## AbstractStepMessageMapBuilder
public class AbstractStepMessageMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AbstractStepMessageMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AbstractStepMessageMap011Builder](#abstractstepmessagemap011builder) | description(Void value) |
| [AbstractStepMessageMap011Builder](#abstractstepmessagemap011builder) | description(boolean value) |
| [AbstractStepMessageMap011Builder](#abstractstepmessagemap011builder) | description(String value) |
| [AbstractStepMessageMap011Builder](#abstractstepmessagemap011builder) | description(int value) |
| [AbstractStepMessageMap011Builder](#abstractstepmessagemap011builder) | description(float value) |
| [AbstractStepMessageMap011Builder](#abstractstepmessagemap011builder) | description(long value) |
| [AbstractStepMessageMap011Builder](#abstractstepmessagemap011builder) | description(double value) |
| [AbstractStepMessageMap011Builder](#abstractstepmessagemap011builder) | description(List<?> value) |
| [AbstractStepMessageMap011Builder](#abstractstepmessagemap011builder) | description(Map<String, ?> value) |
| [AbstractStepMessageMap101Builder](#abstractstepmessagemap101builder) | discriminator(String value) |
| [AbstractStepMessageMap110Builder](#abstractstepmessagemap110builder) | sequenceNumber(Void value) |
| [AbstractStepMessageMap110Builder](#abstractstepmessagemap110builder) | sequenceNumber(boolean value) |
| [AbstractStepMessageMap110Builder](#abstractstepmessagemap110builder) | sequenceNumber(String value) |
| [AbstractStepMessageMap110Builder](#abstractstepmessagemap110builder) | sequenceNumber(int value) |
| [AbstractStepMessageMap110Builder](#abstractstepmessagemap110builder) | sequenceNumber(float value) |
| [AbstractStepMessageMap110Builder](#abstractstepmessagemap110builder) | sequenceNumber(long value) |
| [AbstractStepMessageMap110Builder](#abstractstepmessagemap110builder) | sequenceNumber(double value) |
| [AbstractStepMessageMap110Builder](#abstractstepmessagemap110builder) | sequenceNumber(List<?> value) |
| [AbstractStepMessageMap110Builder](#abstractstepmessagemap110builder) | sequenceNumber(Map<String, ?> value) |

## AbstractStepMessageMap
public static class AbstractStepMessageMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AbstractStepMessageMap](#abstractstepmessagemap) | of([Map<String, ? extends @Nullable Object>](#abstractstepmessagemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | description()<br> |
| String | discriminator()<br> |
| @Nullable Object | sequenceNumber()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## DiscriminatorBoxed
public static abstract sealed class DiscriminatorBoxed<br>

## Discriminator
public static class Discriminator<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
