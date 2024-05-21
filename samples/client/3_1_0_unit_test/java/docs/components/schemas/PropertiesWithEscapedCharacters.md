# PropertiesWithEscapedCharacters
unit_test_api.components.schemas.PropertiesWithEscapedCharacters.java
public class PropertiesWithEscapedCharacters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedVoid](#propertieswithescapedcharacters1boxedvoid)<br> boxed class to store validated null payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedBoolean](#propertieswithescapedcharacters1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedNumber](#propertieswithescapedcharacters1boxednumber)<br> boxed class to store validated Number payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedString](#propertieswithescapedcharacters1boxedstring)<br> boxed class to store validated String payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedList](#propertieswithescapedcharacters1boxedlist)<br> boxed class to store validated List payloads |
| record | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedMap](#propertieswithescapedcharacters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1](#propertieswithescapedcharacters1)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap)<br> output class for Map payloads |
| sealed interface | [PropertiesWithEscapedCharacters.FoofbarBoxed](#foofbarboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.FoofbarBoxedNumber](#foofbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foofbar](#foofbar)<br> schema class |
| sealed interface | [PropertiesWithEscapedCharacters.FootbarBoxed](#footbarboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.FootbarBoxedNumber](#footbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Footbar](#footbar)<br> schema class |
| sealed interface | [PropertiesWithEscapedCharacters.FoorbarBoxed](#foorbarboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.FoorbarBoxedNumber](#foorbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foorbar](#foorbar)<br> schema class |
| sealed interface | [PropertiesWithEscapedCharacters.Foobar1Boxed](#foobar1boxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.Foobar1BoxedNumber](#foobar1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foobar1](#foobar1)<br> schema class |
| sealed interface | [PropertiesWithEscapedCharacters.FoobarBoxed](#foobarboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.FoobarBoxedNumber](#foobarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foobar](#foobar)<br> schema class |
| sealed interface | [PropertiesWithEscapedCharacters.FoonbarBoxed](#foonbarboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithEscapedCharacters.FoonbarBoxedNumber](#foonbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foonbar](#foonbar)<br> schema class |

## PropertiesWithEscapedCharacters1Boxed
public sealed interface PropertiesWithEscapedCharacters1Boxed<br>
permits<br>
[PropertiesWithEscapedCharacters1BoxedVoid](#propertieswithescapedcharacters1boxedvoid),
[PropertiesWithEscapedCharacters1BoxedBoolean](#propertieswithescapedcharacters1boxedboolean),
[PropertiesWithEscapedCharacters1BoxedNumber](#propertieswithescapedcharacters1boxednumber),
[PropertiesWithEscapedCharacters1BoxedString](#propertieswithescapedcharacters1boxedstring),
[PropertiesWithEscapedCharacters1BoxedList](#propertieswithescapedcharacters1boxedlist),
[PropertiesWithEscapedCharacters1BoxedMap](#propertieswithescapedcharacters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PropertiesWithEscapedCharacters1BoxedVoid
public record PropertiesWithEscapedCharacters1BoxedVoid<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedBoolean
public record PropertiesWithEscapedCharacters1BoxedBoolean<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedNumber
public record PropertiesWithEscapedCharacters1BoxedNumber<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedString
public record PropertiesWithEscapedCharacters1BoxedString<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedList
public record PropertiesWithEscapedCharacters1BoxedList<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedMap
public record PropertiesWithEscapedCharacters1BoxedMap<br>
implements [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedMap([PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWithEscapedCharacters1
public static class PropertiesWithEscapedCharacters1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\nbar", [Foonbar.class](#foonbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\"bar", [Foobar.class](#foobar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\\bar", [Foobar1.class](#foobar1))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\rbar", [Foorbar.class](#foorbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\tbar", [Footbar.class](#footbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\fbar", [Foofbar.class](#foofbar)))<br>)<br> |

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
| [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | validate([Map&lt;?, ?&gt;](#propertieswithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [PropertiesWithEscapedCharacters1BoxedString](#propertieswithescapedcharacters1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PropertiesWithEscapedCharacters1BoxedVoid](#propertieswithescapedcharacters1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [PropertiesWithEscapedCharacters1BoxedNumber](#propertieswithescapedcharacters1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [PropertiesWithEscapedCharacters1BoxedBoolean](#propertieswithescapedcharacters1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [PropertiesWithEscapedCharacters1BoxedMap](#propertieswithescapedcharacters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#propertieswithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| [PropertiesWithEscapedCharacters1BoxedList](#propertieswithescapedcharacters1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PropertiesWithEscapedCharactersMapBuilder
public class PropertiesWithEscapedCharactersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharactersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusNbar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusNbar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusNbar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusNbar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusQuotationMarkBar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusQuotationMarkBar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusQuotationMarkBar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusQuotationMarkBar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusReverseSolidusBar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusReverseSolidusBar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusReverseSolidusBar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusReverseSolidusBar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusRbar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusRbar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusRbar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusRbar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusTbar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusTbar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusTbar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusTbar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusFbar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusFbar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusFbar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | fooReverseSolidusFbar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(String key, Void value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(String key, boolean value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(String key, String value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(String key, int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(String key, float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(String key, long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(String key, double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(String key, List<?> value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## PropertiesWithEscapedCharactersMap
public static class PropertiesWithEscapedCharactersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | of([Map<String, ? extends @Nullable Object>](#propertieswithescapedcharactersmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["foo\nbar"], instance["foo\&quot;bar"], instance["foo\\bar"], instance["foo\rbar"], instance["foo\tbar"], instance["foo\fbar"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FoofbarBoxed
public sealed interface FoofbarBoxed<br>
permits<br>
[FoofbarBoxedNumber](#foofbarboxednumber)

sealed interface that stores validated payloads using boxed classes

## FoofbarBoxedNumber
public record FoofbarBoxedNumber<br>
implements [FoofbarBoxed](#foofbarboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoofbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foofbar
public static class Foofbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FootbarBoxed
public sealed interface FootbarBoxed<br>
permits<br>
[FootbarBoxedNumber](#footbarboxednumber)

sealed interface that stores validated payloads using boxed classes

## FootbarBoxedNumber
public record FootbarBoxedNumber<br>
implements [FootbarBoxed](#footbarboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Footbar
public static class Footbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FoorbarBoxed
public sealed interface FoorbarBoxed<br>
permits<br>
[FoorbarBoxedNumber](#foorbarboxednumber)

sealed interface that stores validated payloads using boxed classes

## FoorbarBoxedNumber
public record FoorbarBoxedNumber<br>
implements [FoorbarBoxed](#foorbarboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoorbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foorbar
public static class Foorbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Foobar1Boxed
public sealed interface Foobar1Boxed<br>
permits<br>
[Foobar1BoxedNumber](#foobar1boxednumber)

sealed interface that stores validated payloads using boxed classes

## Foobar1BoxedNumber
public record Foobar1BoxedNumber<br>
implements [Foobar1Boxed](#foobar1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Foobar1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foobar1
public static class Foobar1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FoobarBoxed
public sealed interface FoobarBoxed<br>
permits<br>
[FoobarBoxedNumber](#foobarboxednumber)

sealed interface that stores validated payloads using boxed classes

## FoobarBoxedNumber
public record FoobarBoxedNumber<br>
implements [FoobarBoxed](#foobarboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foobar
public static class Foobar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FoonbarBoxed
public sealed interface FoonbarBoxed<br>
permits<br>
[FoonbarBoxedNumber](#foonbarboxednumber)

sealed interface that stores validated payloads using boxed classes

## FoonbarBoxedNumber
public record FoonbarBoxedNumber<br>
implements [FoonbarBoxed](#foonbarboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoonbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foonbar
public static class Foonbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
