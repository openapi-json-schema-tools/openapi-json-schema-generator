# NonAsciiPatternWithAdditionalproperties
org.openapijsonschematools.client.components.schemas.NonAsciiPatternWithAdditionalproperties.java
public class NonAsciiPatternWithAdditionalproperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1Boxed](#nonasciipatternwithadditionalproperties1boxed)<br> sealed interface for validated payloads |
| record | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1BoxedMap](#nonasciipatternwithadditionalproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1](#nonasciipatternwithadditionalproperties1)<br> schema class |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalpropertiesMapBuilder](#nonasciipatternwithadditionalpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap)<br> output class for Map payloads |
| sealed interface | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)<br> sealed interface for validated payloads |
| record | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid](#circumflexaccentlatinsmallletterawithacuteboxedvoid)<br> boxed class to store validated null payloads |
| record | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean](#circumflexaccentlatinsmallletterawithacuteboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber](#circumflexaccentlatinsmallletterawithacuteboxednumber)<br> boxed class to store validated Number payloads |
| record | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedString](#circumflexaccentlatinsmallletterawithacuteboxedstring)<br> boxed class to store validated String payloads |
| record | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedList](#circumflexaccentlatinsmallletterawithacuteboxedlist)<br> boxed class to store validated List payloads |
| record | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap](#circumflexaccentlatinsmallletterawithacuteboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcute](#circumflexaccentlatinsmallletterawithacute)<br> schema class |
| sealed interface | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.AdditionalProperties](#additionalproperties)<br> schema class |

## NonAsciiPatternWithAdditionalproperties1Boxed
public sealed interface NonAsciiPatternWithAdditionalproperties1Boxed<br>
permits<br>
[NonAsciiPatternWithAdditionalproperties1BoxedMap](#nonasciipatternwithadditionalproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NonAsciiPatternWithAdditionalproperties1BoxedMap
public record NonAsciiPatternWithAdditionalproperties1BoxedMap<br>
implements [NonAsciiPatternWithAdditionalproperties1Boxed](#nonasciipatternwithadditionalproperties1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonAsciiPatternWithAdditionalproperties1BoxedMap([NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NonAsciiPatternWithAdditionalproperties1
public static class NonAsciiPatternWithAdditionalproperties1<br>
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
import org.openapijsonschematools.client.components.schemas.NonAsciiPatternWithAdditionalproperties;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalpropertiesMap validatedPayload =
    NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1.validate(
    new NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalpropertiesMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("^á"), [CircumflexAccentLatinSmallLetterAWithAcute.class](#circumflexaccentlatinsmallletterawithacute)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) | validate([Map&lt;?, ?&gt;](#nonasciipatternwithadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [NonAsciiPatternWithAdditionalproperties1BoxedMap](#nonasciipatternwithadditionalproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#nonasciipatternwithadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [NonAsciiPatternWithAdditionalproperties1Boxed](#nonasciipatternwithadditionalproperties1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## NonAsciiPatternWithAdditionalpropertiesMapBuilder
public class NonAsciiPatternWithAdditionalpropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonAsciiPatternWithAdditionalpropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## NonAsciiPatternWithAdditionalpropertiesMap
public static class NonAsciiPatternWithAdditionalpropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) | of([Map<String, ? extends @Nullable Object>](#nonasciipatternwithadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxed
public sealed interface CircumflexAccentLatinSmallLetterAWithAcuteBoxed<br>
permits<br>
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid](#circumflexaccentlatinsmallletterawithacuteboxedvoid),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean](#circumflexaccentlatinsmallletterawithacuteboxedboolean),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber](#circumflexaccentlatinsmallletterawithacuteboxednumber),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedString](#circumflexaccentlatinsmallletterawithacuteboxedstring),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedList](#circumflexaccentlatinsmallletterawithacuteboxedlist),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap](#circumflexaccentlatinsmallletterawithacuteboxedmap)

sealed interface that stores validated payloads using boxed classes

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid
public record CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean
public record CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber
public record CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedString
public record CircumflexAccentLatinSmallLetterAWithAcuteBoxedString<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedList
public record CircumflexAccentLatinSmallLetterAWithAcuteBoxedList<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap
public record CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcute
public static class CircumflexAccentLatinSmallLetterAWithAcute<br>
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
