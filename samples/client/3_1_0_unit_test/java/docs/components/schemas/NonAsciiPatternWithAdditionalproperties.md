# NonAsciiPatternWithAdditionalproperties
org.openapijsonschematools.client.components.schemas.NonAsciiPatternWithAdditionalproperties.java
public class NonAsciiPatternWithAdditionalproperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1Boxed](#nonasciipatternwithadditionalproperties1boxed)<br> abstract sealed validated payload class |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1BoxedMap](#nonasciipatternwithadditionalproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1](#nonasciipatternwithadditionalproperties1)<br> schema class |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalpropertiesMapBuilder](#nonasciipatternwithadditionalpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap)<br> output class for Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)<br> abstract sealed validated payload class |
| static class | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid](#circumflexaccentlatinsmallletterawithacuteboxedvoid)<br> boxed class to store validated null payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean](#circumflexaccentlatinsmallletterawithacuteboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber](#circumflexaccentlatinsmallletterawithacuteboxednumber)<br> boxed class to store validated Number payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedString](#circumflexaccentlatinsmallletterawithacuteboxedstring)<br> boxed class to store validated String payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedList](#circumflexaccentlatinsmallletterawithacuteboxedlist)<br> boxed class to store validated List payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap](#circumflexaccentlatinsmallletterawithacuteboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.CircumflexAccentLatinSmallLetterAWithAcute](#circumflexaccentlatinsmallletterawithacute)<br> schema class |
| static class | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonAsciiPatternWithAdditionalproperties.AdditionalProperties](#additionalproperties)<br> schema class |

## NonAsciiPatternWithAdditionalproperties1Boxed
public static abstract sealed class NonAsciiPatternWithAdditionalproperties1Boxed<br>
permits<br>
[NonAsciiPatternWithAdditionalproperties1BoxedMap](#nonasciipatternwithadditionalproperties1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## NonAsciiPatternWithAdditionalproperties1BoxedMap
public static final class NonAsciiPatternWithAdditionalproperties1BoxedMap<br>
extends [NonAsciiPatternWithAdditionalproperties1Boxed](#nonasciipatternwithadditionalproperties1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonAsciiPatternWithAdditionalproperties1BoxedMap([NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) | data<br>validated payload |

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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

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
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) | of([Map<String, Object>](#nonasciipatternwithadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxed
public static abstract sealed class CircumflexAccentLatinSmallLetterAWithAcuteBoxed<br>
permits<br>
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid](#circumflexaccentlatinsmallletterawithacuteboxedvoid),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean](#circumflexaccentlatinsmallletterawithacuteboxedboolean),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber](#circumflexaccentlatinsmallletterawithacuteboxednumber),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedString](#circumflexaccentlatinsmallletterawithacuteboxedstring),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedList](#circumflexaccentlatinsmallletterawithacuteboxedlist),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap](#circumflexaccentlatinsmallletterawithacuteboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid
public static final class CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid<br>
extends [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean
public static final class CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean<br>
extends [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber
public static final class CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber<br>
extends [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedString
public static final class CircumflexAccentLatinSmallLetterAWithAcuteBoxedString<br>
extends [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedList
public static final class CircumflexAccentLatinSmallLetterAWithAcuteBoxedList<br>
extends [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap
public static final class CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap<br>
extends [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcute
public static class CircumflexAccentLatinSmallLetterAWithAcute<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
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

abstract sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public static final class AdditionalPropertiesBoxedVoid<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

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
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AdditionalPropertiesBoxedNumber
public static final class AdditionalPropertiesBoxedNumber<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AdditionalPropertiesBoxedString
public static final class AdditionalPropertiesBoxedString<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalPropertiesBoxedList
public static final class AdditionalPropertiesBoxedList<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AdditionalPropertiesBoxedMap
public static final class AdditionalPropertiesBoxedMap<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
