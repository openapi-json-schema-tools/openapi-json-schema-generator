# AdditionalpropertiesWithSchema
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesWithSchema.java
public class AdditionalpropertiesWithSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1Boxed](#additionalpropertieswithschema1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1BoxedMap](#additionalpropertieswithschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1](#additionalpropertieswithschema1)<br> schema class |
| static class | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesWithSchema.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesWithSchema.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesWithSchema.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesWithSchema.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesWithSchema.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesWithSchema.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesWithSchema.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesWithSchema.Bar](#bar)<br> schema class |
| sealed interface | [AdditionalpropertiesWithSchema.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesWithSchema.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesWithSchema.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesWithSchema.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesWithSchema.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesWithSchema.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesWithSchema.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesWithSchema.Foo](#foo)<br> schema class |
| sealed interface | [AdditionalpropertiesWithSchema.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesWithSchema.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalpropertiesWithSchema.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesWithSchema1Boxed
public sealed interface AdditionalpropertiesWithSchema1Boxed<br>
permits<br>
[AdditionalpropertiesWithSchema1BoxedMap](#additionalpropertieswithschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesWithSchema1BoxedMap
public record AdditionalpropertiesWithSchema1BoxedMap<br>
implements [AdditionalpropertiesWithSchema1Boxed](#additionalpropertieswithschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesWithSchema1BoxedMap([AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesWithSchema1
public static class AdditionalpropertiesWithSchema1<br>
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
import org.openapijsonschematools.client.components.schemas.AdditionalpropertiesWithSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMap validatedPayload =
    AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1.validate(
    new AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMapBuilder()
        .additionalProperty("someAdditionalProperty", true)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap) | validate([Map&lt;?, ?&gt;](#additionalpropertieswithschemamapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesWithSchema1BoxedMap](#additionalpropertieswithschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#additionalpropertieswithschemamapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesWithSchema1Boxed](#additionalpropertieswithschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## AdditionalpropertiesWithSchemaMapBuilder
public class AdditionalpropertiesWithSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesWithSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(Void value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(boolean value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(String value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(int value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(float value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(long value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(double value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(List<?> value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(Map<String, ?> value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(Void value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(boolean value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(String value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(int value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(float value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(long value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(double value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(List<?> value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(Map<String, ?> value) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | additionalProperty(String key, boolean value) |

## AdditionalpropertiesWithSchemaMap
public static class AdditionalpropertiesWithSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap) | of([Map<String, ? extends @Nullable Object>](#additionalpropertieswithschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| @Nullable Object | bar()<br>[optional] |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BarBoxed
public sealed interface BarBoxed<br>
permits<br>
[BarBoxedVoid](#barboxedvoid),
[BarBoxedBoolean](#barboxedboolean),
[BarBoxedNumber](#barboxednumber),
[BarBoxedString](#barboxedstring),
[BarBoxedList](#barboxedlist),
[BarBoxedMap](#barboxedmap)

sealed interface that stores validated payloads using boxed classes

## BarBoxedVoid
public record BarBoxedVoid<br>
implements [BarBoxed](#barboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BarBoxedBoolean
public record BarBoxedBoolean<br>
implements [BarBoxed](#barboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BarBoxedNumber
public record BarBoxedNumber<br>
implements [BarBoxed](#barboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BarBoxedString
public record BarBoxedString<br>
implements [BarBoxed](#barboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BarBoxedList
public record BarBoxedList<br>
implements [BarBoxed](#barboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BarBoxedMap
public record BarBoxedMap<br>
implements [BarBoxed](#barboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Bar
public static class Bar<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FooBoxed
public sealed interface FooBoxed<br>
permits<br>
[FooBoxedVoid](#fooboxedvoid),
[FooBoxedBoolean](#fooboxedboolean),
[FooBoxedNumber](#fooboxednumber),
[FooBoxedString](#fooboxedstring),
[FooBoxedList](#fooboxedlist),
[FooBoxedMap](#fooboxedmap)

sealed interface that stores validated payloads using boxed classes

## FooBoxedVoid
public record FooBoxedVoid<br>
implements [FooBoxed](#fooboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooBoxedBoolean
public record FooBoxedBoolean<br>
implements [FooBoxed](#fooboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooBoxedNumber
public record FooBoxedNumber<br>
implements [FooBoxed](#fooboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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

## FooBoxedList
public record FooBoxedList<br>
implements [FooBoxed](#fooboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooBoxedMap
public record FooBoxedMap<br>
implements [FooBoxed](#fooboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

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

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
