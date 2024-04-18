# DependentSchemasDependentSubschemaIncompatibleWithRoot
org.openapijsonschematools.client.components.schemas.DependentSchemasDependentSubschemaIncompatibleWithRoot.java
public class DependentSchemasDependentSubschemaIncompatibleWithRoot<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid](#dependentschemasdependentsubschemaincompatiblewithroot1boxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean](#dependentschemasdependentsubschemaincompatiblewithroot1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber](#dependentschemasdependentsubschemaincompatiblewithroot1boxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString](#dependentschemasdependentsubschemaincompatiblewithroot1boxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList](#dependentschemasdependentsubschemaincompatiblewithroot1boxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap](#dependentschemasdependentsubschemaincompatiblewithroot1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1](#dependentschemasdependentsubschemaincompatiblewithroot1)<br> schema class |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder)<br> builder for Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap)<br> output class for Map payloads |
| sealed interface | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo](#foo)<br> schema class |
| sealed interface | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo1Boxed](#foo1boxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo1BoxedMap](#foo1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo1](#foo1)<br> schema class |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMapBuilder1](#foomapbuilder1)<br> builder for Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMap](#foomap)<br> output class for Map payloads |
| sealed interface | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.Bar](#bar)<br> schema class |
| sealed interface | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependentSubschemaIncompatibleWithRoot.AdditionalProperties](#additionalproperties)<br> schema class |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed
public sealed interface DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed<br>
permits<br>
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid](#dependentschemasdependentsubschemaincompatiblewithroot1boxedvoid),
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean](#dependentschemasdependentsubschemaincompatiblewithroot1boxedboolean),
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber](#dependentschemasdependentsubschemaincompatiblewithroot1boxednumber),
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString](#dependentschemasdependentsubschemaincompatiblewithroot1boxedstring),
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList](#dependentschemasdependentsubschemaincompatiblewithroot1boxedlist),
[DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap](#dependentschemasdependentsubschemaincompatiblewithroot1boxedmap)

sealed interface that stores validated payloads using boxed classes

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid
public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean
public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber
public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString
public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList
public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap
public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap<br>
implements [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap([DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasDependentSubschemaIncompatibleWithRoot1
public static class DependentSchemasDependentSubschemaIncompatibleWithRoot1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo)))<br>)<br> |
| Map<String, Class<? extends JsonSchema>> | dependentSchemas = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo1.class](#foo1)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap) | validate([Map&lt;?, ?&gt;](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString](#dependentschemasdependentsubschemaincompatiblewithroot1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid](#dependentschemasdependentsubschemaincompatiblewithroot1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber](#dependentschemasdependentsubschemaincompatiblewithroot1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean](#dependentschemasdependentsubschemaincompatiblewithroot1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap](#dependentschemasdependentsubschemaincompatiblewithroot1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) arg, SchemaConfiguration configuration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList](#dependentschemasdependentsubschemaincompatiblewithroot1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed](#dependentschemasdependentsubschemaincompatiblewithroot1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder
public class DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(Void value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(boolean value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(String value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(int value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(float value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(long value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(double value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(List<?> value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | foo(Map<String, ?> value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, Void value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, boolean value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, String value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, int value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, float value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, long value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, double value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, List<?> value) |
| [DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## DependentSchemasDependentSubschemaIncompatibleWithRootMap
public static class DependentSchemasDependentSubschemaIncompatibleWithRootMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DependentSchemasDependentSubschemaIncompatibleWithRootMap](#dependentschemasdependentsubschemaincompatiblewithrootmap) | of([Map<String, ? extends @Nullable Object>](#dependentschemasdependentsubschemaincompatiblewithrootmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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

## Foo1Boxed
public sealed interface Foo1Boxed<br>
permits<br>
[Foo1BoxedMap](#foo1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Foo1BoxedMap
public record Foo1BoxedMap<br>
implements [Foo1Boxed](#foo1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Foo1BoxedMap([FooMap](#foomap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooMap](#foomap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foo1
public static class Foo1<br>
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
import org.openapijsonschematools.client.components.schemas.DependentSchemasDependentSubschemaIncompatibleWithRoot;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMap validatedPayload =
    DependentSchemasDependentSubschemaIncompatibleWithRoot.Foo1.validate(
    new DependentSchemasDependentSubschemaIncompatibleWithRoot.FooMapBuilder1()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooMap](#foomap) | validate([Map&lt;?, ?&gt;](#foomapbuilder1) arg, SchemaConfiguration configuration) |
| [Foo1BoxedMap](#foo1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#foomapbuilder1) arg, SchemaConfiguration configuration) |
| [Foo1Boxed](#foo1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FooMapBuilder1
public class FooMapBuilder1<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FooMapBuilder1](#foomapbuilder1) | bar(Void value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(boolean value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(String value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(int value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(float value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(long value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(double value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(List<?> value) |
| [FooMapBuilder1](#foomapbuilder1) | bar(Map<String, ?> value) |

## FooMap
public static class FooMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FooMap](#foomap) | of([Map<String, ? extends @Nullable Object>](#foomapbuilder1) arg, SchemaConfiguration configuration) |
| @Nullable Object | bar()<br>[optional] |

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
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
