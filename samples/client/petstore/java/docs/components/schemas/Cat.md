# Cat
org.openapijsonschematools.client.components.schemas.Cat.java
public class Cat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Cat.Cat1Boxed](#cat1boxed)<br> abstract sealed validated payload class |
| record | [Cat.Cat1BoxedVoid](#cat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Cat.Cat1BoxedBoolean](#cat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Cat.Cat1BoxedNumber](#cat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Cat.Cat1BoxedString](#cat1boxedstring)<br> boxed class to store validated String payloads |
| record | [Cat.Cat1BoxedList](#cat1boxedlist)<br> boxed class to store validated List payloads |
| record | [Cat.Cat1BoxedMap](#cat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Cat.Cat1](#cat1)<br> schema class |
| sealed interface | [Cat.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| record | [Cat.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Cat.Schema1](#schema1)<br> schema class |
| static class | [Cat.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [Cat.Schema1Map](#schema1map)<br> output class for Map payloads |
| sealed interface | [Cat.DeclawedBoxed](#declawedboxed)<br> abstract sealed validated payload class |
| record | [Cat.DeclawedBoxedBoolean](#declawedboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Cat.Declawed](#declawed)<br> schema class |

## Cat1Boxed
public sealed interface Cat1Boxed<br>
permits<br>
[Cat1BoxedVoid](#cat1boxedvoid),
[Cat1BoxedBoolean](#cat1boxedboolean),
[Cat1BoxedNumber](#cat1boxednumber),
[Cat1BoxedString](#cat1boxedstring),
[Cat1BoxedList](#cat1boxedlist),
[Cat1BoxedMap](#cat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Cat1BoxedVoid
public record Cat1BoxedVoid<br>
implements [Cat1Boxed](#cat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Cat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Cat1BoxedBoolean
public record Cat1BoxedBoolean<br>
implements [Cat1Boxed](#cat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Cat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Cat1BoxedNumber
public record Cat1BoxedNumber<br>
implements [Cat1Boxed](#cat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Cat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Cat1BoxedString
public record Cat1BoxedString<br>
implements [Cat1Boxed](#cat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Cat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Cat1BoxedList
public record Cat1BoxedList<br>
implements [Cat1Boxed](#cat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Cat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Cat1BoxedMap
public record Cat1BoxedMap<br>
implements [Cat1Boxed](#cat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Cat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Cat1
public static class Cat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Animal.Animal1.class](../../components/schemas/Animal.md#animal1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>;)<br> |

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
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Cat1BoxedString](#cat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Cat1BoxedVoid](#cat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Cat1BoxedNumber](#cat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Cat1BoxedBoolean](#cat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Cat1BoxedMap](#cat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Cat1BoxedList](#cat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Cat1Boxed](#cat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedMap
public record Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap([Schema1Map](#schema1map) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1
public static class Schema1<br>
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
Cat.Schema1Map validatedPayload =
    Cat.Schema1.validate(
    new Cat.Schema1MapBuilder()
        .declawed(true)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("declawed", [Declawed.class](#declawed)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | validate([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1MapBuilder
public class Schema1MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema1MapBuilder](#schema1mapbuilder) | declawed(boolean value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, Void value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, boolean value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, String value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, int value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, float value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, long value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, double value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, List<?> value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Schema1Map
public static class Schema1Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema1Map](#schema1map) | of([Map<String, ? extends @Nullable Object>](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| boolean | declawed()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## DeclawedBoxed
public sealed interface DeclawedBoxed<br>
permits<br>
[DeclawedBoxedBoolean](#declawedboxedboolean)

sealed interface that stores validated payloads using boxed classes

## DeclawedBoxedBoolean
public record DeclawedBoxedBoolean<br>
implements [DeclawedBoxed](#declawedboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DeclawedBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Declawed
public static class Declawed<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
