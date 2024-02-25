# UnevaluatedpropertiesWithAdjacentAdditionalproperties
org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesWithAdjacentAdditionalproperties.java
public class UnevaluatedpropertiesWithAdjacentAdditionalproperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed](#unevaluatedpropertieswithadjacentadditionalproperties1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap](#unevaluatedpropertieswithadjacentadditionalproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1](#unevaluatedpropertieswithadjacentadditionalproperties1)<br> schema class |
| sealed interface | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedVoid](#unevaluatedpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedBoolean](#unevaluatedpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedNumber](#unevaluatedpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedString](#unevaluatedpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedList](#unevaluatedpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedMap](#unevaluatedpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedProperties](#unevaluatedproperties)<br> schema class |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap)<br> output class for Map payloads |
| sealed interface | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.Foo](#foo)<br> schema class |
| sealed interface | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalProperties](#additionalproperties)<br> schema class |

## UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed
public sealed interface UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed<br>
permits<br>
[UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap](#unevaluatedpropertieswithadjacentadditionalproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap
public record UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap<br>
implements [UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed](#unevaluatedpropertieswithadjacentadditionalproperties1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap([UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesWithAdjacentAdditionalproperties1
public static class UnevaluatedpropertiesWithAdjacentAdditionalproperties1<br>
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
UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap validatedPayload =
    UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1.validate(
    new UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder()
        .foo("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |
| Class<? extends JsonSchema> | unevaluatedProperties = [UnevaluatedProperties.class](#unevaluatedproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap) | validate([Map&lt;?, ?&gt;](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap](#unevaluatedpropertieswithadjacentadditionalproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed](#unevaluatedpropertieswithadjacentadditionalproperties1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UnevaluatedPropertiesBoxed
public sealed interface UnevaluatedPropertiesBoxed<br>
permits<br>
[UnevaluatedPropertiesBoxedVoid](#unevaluatedpropertiesboxedvoid),
[UnevaluatedPropertiesBoxedBoolean](#unevaluatedpropertiesboxedboolean),
[UnevaluatedPropertiesBoxedNumber](#unevaluatedpropertiesboxednumber),
[UnevaluatedPropertiesBoxedString](#unevaluatedpropertiesboxedstring),
[UnevaluatedPropertiesBoxedList](#unevaluatedpropertiesboxedlist),
[UnevaluatedPropertiesBoxedMap](#unevaluatedpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedPropertiesBoxedVoid
public record UnevaluatedPropertiesBoxedVoid<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedPropertiesBoxedBoolean
public record UnevaluatedPropertiesBoxedBoolean<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedPropertiesBoxedNumber
public record UnevaluatedPropertiesBoxedNumber<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedPropertiesBoxedString
public record UnevaluatedPropertiesBoxedString<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedPropertiesBoxedList
public record UnevaluatedPropertiesBoxedList<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedPropertiesBoxedMap
public record UnevaluatedPropertiesBoxedMap<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedProperties
public static class UnevaluatedProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder
public class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | foo(String value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, Void value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, boolean value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, String value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, int value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, float value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, long value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, double value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, List<?> value) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap
public static class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap) | of([Map<String, ? extends @Nullable Object>](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| String | foo()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FooBoxed
public sealed interface FooBoxed<br>
permits<br>
[FooBoxedString](#fooboxedstring)

sealed interface that stores validated payloads using boxed classes

## FooBoxedString
public record FooBoxedString<br>
implements [FooBoxed](#fooboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foo
public static class Foo<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

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

## AdditionalPropertiesBoxedString
public record AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
public record AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
public record AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
