# NonAsciiPatternWithAdditionalproperties
org.openapijsonschematools.client.components.schemas.NonAsciiPatternWithAdditionalproperties.java
class NonAsciiPatternWithAdditionalproperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
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
sealed interface NonAsciiPatternWithAdditionalproperties1Boxed<br>
permits<br>
[NonAsciiPatternWithAdditionalproperties1BoxedMap](#nonasciipatternwithadditionalproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NonAsciiPatternWithAdditionalproperties1BoxedMap
data class NonAsciiPatternWithAdditionalproperties1BoxedMap<br>
implements [NonAsciiPatternWithAdditionalproperties1Boxed](#nonasciipatternwithadditionalproperties1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonAsciiPatternWithAdditionalproperties1BoxedMap([NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NonAsciiPatternWithAdditionalproperties1
class NonAsciiPatternWithAdditionalproperties1<br>
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
| Set<Class<?>> | type = setOf(Map::class.java) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties::class.java](#additionalproperties) |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.compile("^á") to [CircumflexAccentLatinSmallLetterAWithAcute::class.java](#circumflexaccentlatinsmallletterawithacute))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) | validate(arg: [Map&lt;?, ?&gt;](#nonasciipatternwithadditionalpropertiesmapbuilder), configuration: SchemaConfiguration) |
| [NonAsciiPatternWithAdditionalproperties1BoxedMap](#nonasciipatternwithadditionalproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#nonasciipatternwithadditionalpropertiesmapbuilder), configuration: SchemaConfiguration) |
| [NonAsciiPatternWithAdditionalproperties1Boxed](#nonasciipatternwithadditionalproperties1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## NonAsciiPatternWithAdditionalpropertiesMapBuilder
class NonAsciiPatternWithAdditionalpropertiesMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonAsciiPatternWithAdditionalpropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |

## NonAsciiPatternWithAdditionalpropertiesMap
class NonAsciiPatternWithAdditionalpropertiesMap<br>
extends FrozenMap<String, Any>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NonAsciiPatternWithAdditionalpropertiesMap](#nonasciipatternwithadditionalpropertiesmap) | of([Map<String, Any>](#nonasciipatternwithadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxed
sealed interface CircumflexAccentLatinSmallLetterAWithAcuteBoxed<br>
permits<br>
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid](#circumflexaccentlatinsmallletterawithacuteboxedvoid),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean](#circumflexaccentlatinsmallletterawithacuteboxedboolean),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber](#circumflexaccentlatinsmallletterawithacuteboxednumber),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedString](#circumflexaccentlatinsmallletterawithacuteboxedstring),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedList](#circumflexaccentlatinsmallletterawithacuteboxedlist),
[CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap](#circumflexaccentlatinsmallletterawithacuteboxedmap)

sealed interface that stores validated payloads using boxed classes

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid
data class CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean
data class CircumflexAccentLatinSmallLetterAWithAcuteBoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber
data class CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedString
data class CircumflexAccentLatinSmallLetterAWithAcuteBoxedString<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedList
data class CircumflexAccentLatinSmallLetterAWithAcuteBoxedList<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap
data class CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap<br>
implements [CircumflexAccentLatinSmallLetterAWithAcuteBoxed](#circumflexaccentlatinsmallletterawithacuteboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CircumflexAccentLatinSmallLetterAWithAcuteBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## CircumflexAccentLatinSmallLetterAWithAcute
class CircumflexAccentLatinSmallLetterAWithAcute<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
data class AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedBoolean
data class AdditionalPropertiesBoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedNumber
data class AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedString
data class AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
data class AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
data class AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalProperties
class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
