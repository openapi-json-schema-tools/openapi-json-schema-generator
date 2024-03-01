# PropertiesPatternpropertiesAdditionalpropertiesInteraction
org.openapijsonschematools.client.components.schemas.PropertiesPatternpropertiesAdditionalpropertiesInteraction.java
public class PropertiesPatternpropertiesAdditionalpropertiesInteraction<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed](#propertiespatternpropertiesadditionalpropertiesinteraction1boxed)<br> sealed interface for validated payloads |
| record | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap](#propertiespatternpropertiesadditionalpropertiesinteraction1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1](#propertiespatternpropertiesadditionalpropertiesinteraction1)<br> schema class |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap)<br> output class for Map payloads |
| sealed interface | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.Bar](#bar)<br> schema class |
| sealed interface | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.Foo](#foo)<br> schema class |
| sealed interface | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxed](#foboxed)<br> sealed interface for validated payloads |
| record | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedVoid](#foboxedvoid)<br> boxed class to store validated null payloads |
| record | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedBoolean](#foboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedNumber](#foboxednumber)<br> boxed class to store validated Number payloads |
| record | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedString](#foboxedstring)<br> boxed class to store validated String payloads |
| record | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedList](#foboxedlist)<br> boxed class to store validated List payloads |
| record | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedMap](#foboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.Fo](#fo)<br> schema class |
| sealed interface | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.AdditionalProperties](#additionalproperties)<br> schema class |

## PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed
public sealed interface PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed<br>
permits<br>
[PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap](#propertiespatternpropertiesadditionalpropertiesinteraction1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap
public record PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap<br>
implements [PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed](#propertiespatternpropertiesadditionalpropertiesinteraction1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap([PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesPatternpropertiesAdditionalpropertiesInteraction1
public static class PropertiesPatternpropertiesAdditionalpropertiesInteraction1<br>
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
import org.openapijsonschematools.client.components.schemas.PropertiesPatternpropertiesAdditionalpropertiesInteraction;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMap validatedPayload =
    PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.validate(
    new PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder()
        .additionalProperty("someAdditionalProperty", 1)

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
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("f.o"), [Fo.class](#fo)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap) | validate([Map&lt;?, ?&gt;](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) arg, SchemaConfiguration configuration) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap](#propertiespatternpropertiesadditionalpropertiesinteraction1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) arg, SchemaConfiguration configuration) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed](#propertiespatternpropertiesadditionalpropertiesinteraction1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder
public class PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Object> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | foo(List<@Nullable Object> value) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | bar(List<@Nullable Object> value) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(String key, int value) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(String key, float value) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(String key, long value) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(String key, double value) |

## PropertiesPatternpropertiesAdditionalpropertiesInteractionMap
public static class PropertiesPatternpropertiesAdditionalpropertiesInteractionMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap) | of([Map<String, Object>](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<?> | foo()<br>[optional] |
| FrozenList<?> | bar()<br>[optional] |
| Number | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BarBoxed
public sealed interface BarBoxed<br>
permits<br>
[BarBoxedList](#barboxedlist)

sealed interface that stores validated payloads using boxed classes

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

## Bar
public static class Bar<br>
extends ListJsonSchema.ListJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.ListJsonSchema.ListJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FooBoxed
public sealed interface FooBoxed<br>
permits<br>
[FooBoxedList](#fooboxedlist)

sealed interface that stores validated payloads using boxed classes

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

## Foo
public static class Foo<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Integer | maxItems = 3 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [FooBoxedList](#fooboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [FooBoxed](#fooboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FoBoxed
public sealed interface FoBoxed<br>
permits<br>
[FoBoxedVoid](#foboxedvoid),
[FoBoxedBoolean](#foboxedboolean),
[FoBoxedNumber](#foboxednumber),
[FoBoxedString](#foboxedstring),
[FoBoxedList](#foboxedlist),
[FoBoxedMap](#foboxedmap)

sealed interface that stores validated payloads using boxed classes

## FoBoxedVoid
public record FoBoxedVoid<br>
implements [FoBoxed](#foboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FoBoxedBoolean
public record FoBoxedBoolean<br>
implements [FoBoxed](#foboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FoBoxedNumber
public record FoBoxedNumber<br>
implements [FoBoxed](#foboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FoBoxedString
public record FoBoxedString<br>
implements [FoBoxed](#foboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FoBoxedList
public record FoBoxedList<br>
implements [FoBoxed](#foboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FoBoxedMap
public record FoBoxedMap<br>
implements [FoBoxed](#foboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fo
public static class Fo<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minItems = 2 |

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
| [FoBoxedString](#foboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [FoBoxedVoid](#foboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [FoBoxedNumber](#foboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [FoBoxedBoolean](#foboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [FoBoxedMap](#foboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [FoBoxedList](#foboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [FoBoxed](#foboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

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
