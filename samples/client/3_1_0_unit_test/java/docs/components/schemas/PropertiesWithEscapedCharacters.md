# PropertiesWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.PropertiesWithEscapedCharacters.java
public class PropertiesWithEscapedCharacters

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)<br> abstract sealed validated payload class |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedVoid](#propertieswithescapedcharacters1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedBoolean](#propertieswithescapedcharacters1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedNumber](#propertieswithescapedcharacters1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedString](#propertieswithescapedcharacters1boxedstring)<br> boxed class to store validated String payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedList](#propertieswithescapedcharacters1boxedlist)<br> boxed class to store validated List payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1BoxedMap](#propertieswithescapedcharacters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1](#propertieswithescapedcharacters1)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWithEscapedCharacters.PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap)<br> output class for Map payloads |
| static class | [PropertiesWithEscapedCharacters.FoofbarBoxed](#foofbarboxed)<br> abstract sealed validated payload class |
| static class | [PropertiesWithEscapedCharacters.FoofbarBoxedNumber](#foofbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foofbar](#foofbar)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.FootbarBoxed](#footbarboxed)<br> abstract sealed validated payload class |
| static class | [PropertiesWithEscapedCharacters.FootbarBoxedNumber](#footbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Footbar](#footbar)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.FoorbarBoxed](#foorbarboxed)<br> abstract sealed validated payload class |
| static class | [PropertiesWithEscapedCharacters.FoorbarBoxedNumber](#foorbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foorbar](#foorbar)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.Foobar1Boxed](#foobar1boxed)<br> abstract sealed validated payload class |
| static class | [PropertiesWithEscapedCharacters.Foobar1BoxedNumber](#foobar1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foobar1](#foobar1)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.FoobarBoxed](#foobarboxed)<br> abstract sealed validated payload class |
| static class | [PropertiesWithEscapedCharacters.FoobarBoxedNumber](#foobarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foobar](#foobar)<br> schema class |
| static class | [PropertiesWithEscapedCharacters.FoonbarBoxed](#foonbarboxed)<br> abstract sealed validated payload class |
| static class | [PropertiesWithEscapedCharacters.FoonbarBoxedNumber](#foonbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWithEscapedCharacters.Foonbar](#foonbar)<br> schema class |

## PropertiesWithEscapedCharacters1Boxed
public static abstract sealed class PropertiesWithEscapedCharacters1Boxed<br>
permits<br>
[PropertiesWithEscapedCharacters1BoxedVoid](#propertieswithescapedcharacters1boxedvoid),
[PropertiesWithEscapedCharacters1BoxedBoolean](#propertieswithescapedcharacters1boxedboolean),
[PropertiesWithEscapedCharacters1BoxedNumber](#propertieswithescapedcharacters1boxednumber),
[PropertiesWithEscapedCharacters1BoxedString](#propertieswithescapedcharacters1boxedstring),
[PropertiesWithEscapedCharacters1BoxedList](#propertieswithescapedcharacters1boxedlist),
[PropertiesWithEscapedCharacters1BoxedMap](#propertieswithescapedcharacters1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## PropertiesWithEscapedCharacters1BoxedVoid
public static final class PropertiesWithEscapedCharacters1BoxedVoid<br>
extends [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedBoolean
public static final class PropertiesWithEscapedCharacters1BoxedBoolean<br>
extends [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedNumber
public static final class PropertiesWithEscapedCharacters1BoxedNumber<br>
extends [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedString
public static final class PropertiesWithEscapedCharacters1BoxedString<br>
extends [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedList
public static final class PropertiesWithEscapedCharacters1BoxedList<br>
extends [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## PropertiesWithEscapedCharacters1BoxedMap
public static final class PropertiesWithEscapedCharacters1BoxedMap<br>
extends [PropertiesWithEscapedCharacters1Boxed](#propertieswithescapedcharacters1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithEscapedCharacters1BoxedMap([PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [PropertiesWithEscapedCharactersMap](#propertieswithescapedcharactersmap) | data<br>validated payload |

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
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusNbar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusNbar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusNbar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusNbar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusReverseSolidusBar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusReverseSolidusBar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusReverseSolidusBar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusReverseSolidusBar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusRbar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusRbar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusRbar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusRbar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusTbar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusTbar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusTbar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusTbar(double value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusFbar(int value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusFbar(float value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusFbar(long value) |
| [PropertiesWithEscapedCharactersMapBuilder](#propertieswithescapedcharactersmapbuilder) | setFooReverseSolidusFbar(double value) |
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
public static abstract sealed class FoofbarBoxed<br>
permits<br>
[FoofbarBoxedNumber](#foofbarboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## FoofbarBoxedNumber
public static final class FoofbarBoxedNumber<br>
extends [FoofbarBoxed](#foofbarboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoofbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Foofbar
public static class Foofbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FootbarBoxed
public static abstract sealed class FootbarBoxed<br>
permits<br>
[FootbarBoxedNumber](#footbarboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## FootbarBoxedNumber
public static final class FootbarBoxedNumber<br>
extends [FootbarBoxed](#footbarboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Footbar
public static class Footbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FoorbarBoxed
public static abstract sealed class FoorbarBoxed<br>
permits<br>
[FoorbarBoxedNumber](#foorbarboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## FoorbarBoxedNumber
public static final class FoorbarBoxedNumber<br>
extends [FoorbarBoxed](#foorbarboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoorbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Foorbar
public static class Foorbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Foobar1Boxed
public static abstract sealed class Foobar1Boxed<br>
permits<br>
[Foobar1BoxedNumber](#foobar1boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Foobar1BoxedNumber
public static final class Foobar1BoxedNumber<br>
extends [Foobar1Boxed](#foobar1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Foobar1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Foobar1
public static class Foobar1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FoobarBoxed
public static abstract sealed class FoobarBoxed<br>
permits<br>
[FoobarBoxedNumber](#foobarboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## FoobarBoxedNumber
public static final class FoobarBoxedNumber<br>
extends [FoobarBoxed](#foobarboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Foobar
public static class Foobar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FoonbarBoxed
public static abstract sealed class FoonbarBoxed<br>
permits<br>
[FoonbarBoxedNumber](#foonbarboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## FoonbarBoxedNumber
public static final class FoonbarBoxedNumber<br>
extends [FoonbarBoxed](#foonbarboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoonbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Foonbar
public static class Foonbar<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
